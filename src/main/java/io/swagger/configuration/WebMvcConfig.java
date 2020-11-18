package io.swagger.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import io.swagger.util.CommonUtil;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	
	  @Autowired private AuthorizationInterceptor authorizationInterceptor;
	 
    /**
     	* 拦截器配置
     * @param registry
     */
	
	  @Override 
	  public void addInterceptors(InterceptorRegistry registry) {
		  registry.addInterceptor(authorizationInterceptor).addPathPatterns(CommonUtil.PATH + "/**"); 
	  }
	 

    /**
     	* 跨域支持配置
     * @param registry
     */
	
	/*
	 * @Override public void addCorsMappings(CorsRegistry registry) { //设置允许跨域的路径
	 * registry.addMapping("/**") //设置允许跨域请求的域名 .allowedOrigins("*") //是否允许证书 不再默认开启
	 * .allowCredentials(true) //设置允许的方法 .allowedMethods("HEAD", "GET", "POST",
	 * "PUT", "DELETE", "PATCH", "OPTIONS") .exposedHeaders("Content-Type",
	 * "X-Requested-With", "accept", "Origin", "Access-Control-Request-Method",
	 * "Access-Control-Request-Headers") //跨域允许时间 .maxAge(3600); }
	 */
	/*
	 * @Override public void addCorsMappings(CorsRegistry registry) {
	 * registry.addMapping("/**").allowCredentials(true).allowedOrigins("*").
	 * allowedHeaders("*"). allowedMethods("GET", "PUT", "DELETE", "POST",
	 * "OPTIONS").maxAge(3600); }
	 */

    /**
     	* 参数解析配置
     * @param resolvers
     */
	/*
	 * @Override public void
	 * addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
	 * resolvers.add(loginUserHandlerMethodArgumentResolver); } }
	 */
}
