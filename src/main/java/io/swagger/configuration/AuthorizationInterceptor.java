package io.swagger.configuration;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import io.swagger.util.CommonUtil;

@Component
public class AuthorizationInterceptor implements HandlerInterceptor {
	
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String key = request.getHeader(CommonUtil.KEY_NAME);
        
        if (CommonUtil.KEY_VAL.equals(key)) {
        	return true;
        }
        
        response.setStatus(403);
        PrintWriter writer = response.getWriter();
        writer.write("incorrect key");
        
        return false;
    }
}