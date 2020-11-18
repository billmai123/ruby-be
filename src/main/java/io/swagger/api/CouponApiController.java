package io.swagger.api;

import io.swagger.model.CouponInstance;
import io.swagger.model.DbTestObject;
import io.swagger.util.CommonUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-11-11T06:35:50.814Z")

@Controller
@CrossOrigin
public class CouponApiController implements CouponApi {

    private static final Logger log = LoggerFactory.getLogger(CouponApiController.class);

	@Autowired public DataSource dataSource;
	
    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CouponApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<CouponInstance> couponInstanceCouponCodeGet(@NotNull @RequestHeader(value = CommonUtil.KEY_NAME, required = true) String key, @ApiParam(value = "coupon code of coupon instance to return",required=true) @PathVariable("couponCode") String couponCode) {
    	String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
    		try {
	        	if("CI-0001".equals(couponCode)) {
	        		return new ResponseEntity<CouponInstance>(objectMapper.readValue("{\"id\":\"a0U1s000000zjiIEAQ\",\"couponCode\":\"CI-0001\",\"validFrom\":\"2020-11-01T00:00:00.000Z\",\"validTo\":\"2020-12-31T23:59:59.999Z\",\"status\":\"REDEEMABLE\",\"remainingUse\":1,\"remainingBalance\":null,\"customer\":{\"id\":\"0011s00000O2cTOAAZ\",\"name\":\"ChanTaiMan\"},\"couponItem\":{\"id\":\"a6W1s0000008RQ2EAM\",\"couponItemCode\":\"CLS0007\",\"couponType\":\"GIFT\",\"name\":\"FreeSamsungS20case\",\"description\":\"FreeSamsungS20caseasfreegift\",\"imageUrl\":\"https://image.freepik.com/free-vector/discount-coupon-templates_23-2147499410.jpg\",\"glAccount\":\"GL-0001\",\"issueBu\":\"Mobile\",\"issueBrand\":\"CSL\",\"tnc\":\"T&CContent\",\"appliedBrand\":[\"CSL\",\"1010\"],\"defaultExpiryDate\":\"2020-12-31T23:59:59.999Z\",\"validPeriodOffset\":0,\"validPeriodLength\":30,\"applyRuleSet\":\"RS-0001\",\"instanceLimit\":10000,\"minOrderAmount\":1000.0,\"productPurchased\":null,\"isMultipleUse\":false,\"redemptionQuota\":1,\"initBalance\":null,\"giftProduct\":\"SamsungS20Case\",\"nonProductService\":null,\"discountedPrice\":0.0,\"discountRate\":null}}", CouponInstance.class), HttpStatus.OK);
	        	}
	        	if("CI-0002".equals(couponCode)) {
	        		return new ResponseEntity<CouponInstance>(objectMapper.readValue("{\"id\":\"a0U1s000000zjiIPAD\",\"couponCode\":\"CI-0002\",\"validFrom\":\"2020-11-01T00:00:00.000Z\",\"validTo\":\"2020-12-31T23:59:59.999Z\",\"status\":\"REDEEMABLE\",\"remainingUse\":null,\"remainingBalance\":1000.0,\"customer\":{\"id\":\"0011s00000O2cTOAAZ\",\"name\":\"ChanTaiMan\"},\"couponItem\":{\"id\":\"a6W1s0000008RPnEAM\",\"couponItemCode\":\"CLS0004\",\"couponType\":\"CASH\",\"name\":\"MobileHandset$1000CashCoupon\",\"description\":\"MobileHandset$1000CashCoupon\",\"imageUrl\":\"https://image.freepik.com/free-vector/discount-coupon-templates_23-2147499410.jpg\",\"glAccount\":\"GL-0001\",\"issueBu\":\"Mobile\",\"issueBrand\":\"CSL\",\"tnc\":\"T&CContent\",\"appliedBrand\":[\"CSL\",\"1010\"],\"defaultExpiryDate\":\"2020-12-31T23:59:59.999Z\",\"validPeriodOffset\":0,\"validPeriodLength\":180,\"applyRuleSet\":\"RS-0001\",\"instanceLimit\":10000,\"minOrderAmount\":0.0,\"productPurchased\":\"SamsungS20\",\"isMultipleUse\":false,\"redemptionQuota\":null,\"initBalance\":1000.0,\"giftProduct\":null,\"nonProductService\":null,\"discountedPrice\":null,\"discountRate\":null}}", CouponInstance.class), HttpStatus.OK);
	        	}
	        	if("CI-0003".equals(couponCode)) {
	        		return new ResponseEntity<CouponInstance>(objectMapper.readValue("{\"id\":\"a0U1s000000zjiIGAG\",\"couponCode\":\"CI-0003\",\"validFrom\":\"2020-11-01T00:00:00.000Z\",\"validTo\":\"2020-12-31T23:59:59.999Z\",\"status\":\"REDEEMED\",\"remainingUse\":null,\"remainingBalance\":0.0,\"customer\":{\"id\":\"0011s00000O2cTOAAZ\",\"name\":\"ChanTaiMan\"},\"couponItem\":{\"id\":\"a6W1s0000008RPnEAM\",\"couponItemCode\":\"CLS0004\",\"couponType\":\"CASH\",\"name\":\"MobileHandset$1000CashCoupon\",\"description\":\"MobileHandset$1000CashCoupon\",\"imageUrl\":\"https://image.freepik.com/free-vector/discount-coupon-templates_23-2147499410.jpg\",\"glAccount\":\"GL-0001\",\"issueBu\":\"Mobile\",\"issueBrand\":\"CSL\",\"tnc\":\"T&CContent\",\"appliedBrand\":[\"CSL\",\"1010\"],\"defaultExpiryDate\":\"2020-12-31T23:59:59.999Z\",\"validPeriodOffset\":0,\"validPeriodLength\":180,\"applyRuleSet\":\"RS-0001\",\"instanceLimit\":10000,\"minOrderAmount\":0.0,\"productPurchased\":\"SamsungS20\",\"isMultipleUse\":false,\"redemptionQuota\":null,\"initBalance\":1000.0,\"giftProduct\":null,\"nonProductService\":null,\"discountedPrice\":null,\"discountRate\":null}}", CouponInstance.class), HttpStatus.OK);
	        	}
	        	else {
	        		 return new ResponseEntity<CouponInstance>(HttpStatus.NOT_FOUND);
	        	}
	          //return new ResponseEntity<CouponInstance>(objectMapper.readValue("{  \"couponItem\" : {    \"issueBrand\" : \"CSL\",    \"appliedBrand\" : \"\",    \"discountRate\" : 80.0,    \"redemptionQuota\" : 20.0,    \"description\" : \"Description content\",    \"minOrderAmount\" : 1000.0,    \"couponType\" : \"CASH\",    \"imageUrl\" : \"https://image.shutterstock.com/image-vector/vector-gift-voucher-coupon-code-260nw-1285774657.jpg\",    \"defaultExpiryDate\" : \"2020-11-30T23:59:59.999Z\",    \"initBalance\" : 200.0,    \"id\" : \"a0T1s000001DeGJEA0\",    \"glAccount\" : \"GI-0001\",    \"loyaltyPointMultiplier\" : 1.5,    \"productPurchased\" : \"SamsungS20\",    \"nonProductService\" : \"Shippment fee\",    \"tnc\" : \"T & C Content\",    \"giftProduct\" : \"3 months free Moov service\",    \"validPeriodOffset\" : 0.0,    \"applyRuleSet\" : \"RS-0001\",    \"instanceLimit\" : 10000.0,    \"validPeriodLength\" : 30.0,    \"couponItemCode\" : \"CLS0001\",    \"discountedPrice\" : 500.0,    \"isMultipleUse\" : true,    \"name\" : \"General Cash Coupon\",    \"loyaltyPointEarn\" : 20.0,    \"issueBu\" : \"Mobile\"  },  \"remainingBalance\" : 200.0,  \"id\" : \"a0U1s000000zjiIEAQ\",  \"validFrom\" : \"2020-11-01T00:00:00.000Z\",  \"remainingUse\" : 2.0,  \"couponCode\" : \"CI-0001\",  \"validTo\" : \"2020-11-30T23:59:59.999Z\",  \"status\" : \"REDEEMABLE\",  \"customer\" : {    \"name\" : \"Chan Tai Man\",    \"id\" : \"0011s00000O2cTOAAZ\"  }}", CouponInstance.class), HttpStatus.NOT_IMPLEMENTED);
	        } catch (IOException e) {
	            log.error("Couldn't serialize response for content type application/json", e);
	            return new ResponseEntity<CouponInstance>(HttpStatus.INTERNAL_SERVER_ERROR);
	        }
        }

        return new ResponseEntity<CouponInstance>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<CouponInstance>> couponInstanceGet(@NotNull @RequestHeader(value = CommonUtil.KEY_NAME, required = true) String key, @NotNull @ApiParam(value = "customer id of the customer which the coupon instance belongs", required = true) @Valid @RequestParam(value = "customerId", required = true) String customerId,@NotNull @ApiParam(value = "Default value is 'ALL'", required = true, allowableValues = "ALL, PENDING, REDEEMABLE, REDEEMED, EXPIRED") @Valid @RequestParam(value = "statusIncluded", required = true) String statusIncluded) {
    	String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {   
    		try {
	            return new ResponseEntity<List<CouponInstance>>(objectMapper.readValue("[{\"id\":\"a0U1s000000zjiIGAG\",\"couponCode\":\"CI-0003\",\"validFrom\":\"2020-11-01T00:00:00.000Z\",\"validTo\":\"2020-12-31T23:59:59.999Z\",\"status\":\"REDEEMED\",\"remainingUse\":null,\"remainingBalance\":0.0,\"customer\":{\"id\":\"0011s00000O2cTOAAZ\",\"name\":\"Chan Tai Man\"},\"couponItem\":{\"id\":\"a6W1s0000008RPnEAM\",\"couponItemCode\":\"CLS0004\",\"couponType\":\"CASH\",\"name\":\"Mobile Handset $1000 Cash Coupon\",\"description\":\"Mobile Handset $1000 Cash Coupon\",\"imageUrl\":\"https://image.freepik.com/free-vector/discount-coupon-templates_23-2147499410.jpg\",\"glAccount\":\"GL-0001\",\"issueBu\":\"Mobile\",\"issueBrand\":\"CSL\",\"tnc\":\"T & C Content\",\"appliedBrand\":[\"CSL\",\"1010\"],\"defaultExpiryDate\":\"2020-12-31T23:59:59.999Z\",\"validPeriodOffset\":0,\"validPeriodLength\":180,\"applyRuleSet\":\"RS-0001\",\"instanceLimit\":10000,\"minOrderAmount\":0.0,\"productPurchased\":\"SamsungS20\",\"isMultipleUse\":false,\"redemptionQuota\":null,\"initBalance\":1000.0,\"giftProduct\":null,\"nonProductService\":null,\"discountedPrice\":null,\"discountRate\":null}},{\"id\":\"a0U1s000000zjiIPAD\",\"couponCode\":\"CI-0002\",\"validFrom\":\"2020-11-01T00:00:00.000Z\",\"validTo\":\"2020-12-31T23:59:59.999Z\",\"status\":\"REDEEMABLE\",\"remainingUse\":null,\"remainingBalance\":1000.0,\"customer\":{\"id\":\"0011s00000O2cTOAAZ\",\"name\":\"Chan Tai Man\"},\"couponItem\":{\"id\":\"a6W1s0000008RPnEAM\",\"couponItemCode\":\"CLS0004\",\"couponType\":\"CASH\",\"name\":\"Mobile Handset $1000 Cash Coupon\",\"description\":\"Mobile Handset $1000 Cash Coupon\",\"imageUrl\":\"https://image.freepik.com/free-vector/discount-coupon-templates_23-2147499410.jpg\",\"glAccount\":\"GL-0001\",\"issueBu\":\"Mobile\",\"issueBrand\":\"CSL\",\"tnc\":\"T & C Content\",\"appliedBrand\":[\"CSL\",\"1010\"],\"defaultExpiryDate\":\"2020-12-31T23:59:59.999Z\",\"validPeriodOffset\":0,\"validPeriodLength\":180,\"applyRuleSet\":\"RS-0001\",\"instanceLimit\":10000,\"minOrderAmount\":0.0,\"productPurchased\":\"SamsungS20\",\"isMultipleUse\":false,\"redemptionQuota\":null,\"initBalance\":1000.0,\"giftProduct\":null,\"nonProductService\":null,\"discountedPrice\":null,\"discountRate\":null}},{\"id\":\"a0U1s000000zjiIEAQ\",\"couponCode\":\"CI-0001\",\"validFrom\":\"2020-11-01T00:00:00.000Z\",\"validTo\":\"2020-12-31T23:59:59.999Z\",\"status\":\"REDEEMABLE\",\"remainingUse\":1,\"remainingBalance\":null,\"customer\":{\"id\":\"0011s00000O2cTOAAZ\",\"name\":\"Chan Tai Man\"},\"couponItem\":{\"id\":\"a6W1s0000008RQ2EAM\",\"couponItemCode\":\"CLS0007\",\"couponType\":\"CASH\",\"name\":\"Free SamsungS20 case\",\"description\":\"Free SamsungS20 case as free gift\",\"imageUrl\":\"https://image.freepik.com/free-vector/discount-coupon-templates_23-2147499410.jpg\",\"glAccount\":\"GL-0001\",\"issueBu\":\"Mobile\",\"issueBrand\":\"CSL\",\"tnc\":\"T & C Content\",\"appliedBrand\":[\"CSL\",\"1010\"],\"defaultExpiryDate\":\"2020-12-31T23:59:59.999Z\",\"validPeriodOffset\":0,\"validPeriodLength\":30,\"applyRuleSet\":\"RS-0001\",\"instanceLimit\":10000,\"minOrderAmount\":1000.0,\"productPurchased\":null,\"isMultipleUse\":false,\"redemptionQuota\":1,\"initBalance\":null,\"giftProduct\":\"SamsungS20Case\",\"nonProductService\":null,\"discountedPrice\":0.0,\"discountRate\":null}}]", List.class), HttpStatus.OK);
	        } catch (IOException e) {
	            log.error("Couldn't serialize response for content type application/json", e);
	            return new ResponseEntity<List<CouponInstance>>(HttpStatus.INTERNAL_SERVER_ERROR);
	        }
    	}

        return new ResponseEntity<List<CouponInstance>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DbTestObject> dataTest(@NotNull @RequestHeader(value = CommonUtil.KEY_NAME, required = true) String key){
        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("select * from COMPANY");
            ResultSet res = pstmt.executeQuery();
            
            while (res.next()) {
            	return new ResponseEntity<DbTestObject>(objectMapper.readValue("{\"id\":" + res.getString(1) + ",\"name\":\"" + res.getString(2) + "\"}", DbTestObject.class), HttpStatus.OK);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<DbTestObject>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    

        return new ResponseEntity<DbTestObject>(HttpStatus.NOT_IMPLEMENTED);
    }
}
