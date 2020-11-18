/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.13).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import java.io.IOException;
import io.swagger.model.CouponInstance;
import io.swagger.util.CommonUtil;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-11-11T06:35:50.814Z")

@Api(value = "coupon", description = "the coupon API")
@RequestMapping(value = CommonUtil.PATH)
public interface CouponApi {
	Logger log = LoggerFactory.getLogger(CouponApi.class);
	
    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }
    

    @ApiOperation(value = "Enquire coupon instance by coupon code", nickname = "couponInstanceCouponCodeGet", notes = "", response = CouponInstance.class, tags={ "Coupon Instance", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CouponInstance.class),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 404, message = "Coupon Instance not found") })
    @RequestMapping(value = "/coupon/instance/{couponCode}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<CouponInstance> couponInstanceCouponCodeGet(@NotNull @RequestHeader(value = CommonUtil.KEY_NAME, required = true) String key, @ApiParam(value = "coupon code of coupon instance to return",required=true) @PathVariable("couponCode") String couponCode) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"couponItem\" : {    \"issueBrand\" : \"CSL\",    \"appliedBrand\" : \"\",    \"discountRate\" : 80.0,    \"redemptionQuota\" : 20.0,    \"description\" : \"Description content\",    \"minOrderAmount\" : 1000.0,    \"couponType\" : \"CASH\",    \"imageUrl\" : \"https://image.shutterstock.com/image-vector/vector-gift-voucher-coupon-code-260nw-1285774657.jpg\",    \"defaultExpiryDate\" : \"2020-11-30T23:59:59.999Z\",    \"initBalance\" : 200.0,    \"id\" : \"a0T1s000001DeGJEA0\",    \"glAccount\" : \"GI-0001\",    \"loyaltyPointMultiplier\" : 1.5,    \"productPurchased\" : \"SamsungS20\",    \"nonProductService\" : \"Shippment fee\",    \"tnc\" : \"T & C Content\",    \"giftProduct\" : \"3 months free Moov service\",    \"validPeriodOffset\" : 0.0,    \"applyRuleSet\" : \"RS-0001\",    \"instanceLimit\" : 10000.0,    \"validPeriodLength\" : 30.0,    \"couponItemCode\" : \"CLS0001\",    \"discountedPrice\" : 500.0,    \"isMultipleUse\" : true,    \"name\" : \"General Cash Coupon\",    \"loyaltyPointEarn\" : 20.0,    \"issueBu\" : \"Mobile\"  },  \"remainingBalance\" : 200.0,  \"id\" : \"a0U1s000000zjiIEAQ\",  \"validFrom\" : \"2020-11-01T00:00:00.000Z\",  \"remainingUse\" : 2.0,  \"couponCode\" : \"CI-0001\",  \"validTo\" : \"2020-11-30T23:59:59.999Z\",  \"status\" : \"REDEEMABLE\",  \"customer\" : {    \"name\" : \"Chan Tai Man\",    \"id\" : \"0011s00000O2cTOAAZ\"  }}", CouponInstance.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default CouponApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation(value = "Enquire coupon instances by customer id", nickname = "couponInstanceGet", notes = "", response = CouponInstance.class, responseContainer = "List", tags={ "Coupon Instance", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CouponInstance.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 404, message = "Customer not found") })
    @RequestMapping(value = "/coupon/instance",
        produces = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<List<CouponInstance>> couponInstanceGet(@NotNull @RequestHeader(value = CommonUtil.KEY_NAME, required = true) String key, @NotNull @ApiParam(value = "customer id of the customer which the coupon instance belongs", required = true) @Valid @RequestParam(value = "customerId", required = true) String customerId,@NotNull @ApiParam(value = "Default value is 'ALL'", required = true, allowableValues = "ALL, PENDING, REDEEMABLE, REDEEMED, EXPIRED") @Valid @RequestParam(value = "statusIncluded", required = true) String statusIncluded) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {  \"couponItem\" : {    \"issueBrand\" : \"CSL\",    \"appliedBrand\" : \"\",    \"discountRate\" : 80.0,    \"redemptionQuota\" : 20.0,    \"description\" : \"Description content\",    \"minOrderAmount\" : 1000.0,    \"couponType\" : \"CASH\",    \"imageUrl\" : \"https://image.shutterstock.com/image-vector/vector-gift-voucher-coupon-code-260nw-1285774657.jpg\",    \"defaultExpiryDate\" : \"2020-11-30T23:59:59.999Z\",    \"initBalance\" : 200.0,    \"id\" : \"a0T1s000001DeGJEA0\",    \"glAccount\" : \"GI-0001\",    \"loyaltyPointMultiplier\" : 1.5,    \"productPurchased\" : \"SamsungS20\",    \"nonProductService\" : \"Shippment fee\",    \"tnc\" : \"T & C Content\",    \"giftProduct\" : \"3 months free Moov service\",    \"validPeriodOffset\" : 0.0,    \"applyRuleSet\" : \"RS-0001\",    \"instanceLimit\" : 10000.0,    \"validPeriodLength\" : 30.0,    \"couponItemCode\" : \"CLS0001\",    \"discountedPrice\" : 500.0,    \"isMultipleUse\" : true,    \"name\" : \"General Cash Coupon\",    \"loyaltyPointEarn\" : 20.0,    \"issueBu\" : \"Mobile\"  },  \"remainingBalance\" : 200.0,  \"id\" : \"a0U1s000000zjiIEAQ\",  \"validFrom\" : \"2020-11-01T00:00:00.000Z\",  \"remainingUse\" : 2.0,  \"couponCode\" : \"CI-0001\",  \"validTo\" : \"2020-11-30T23:59:59.999Z\",  \"status\" : \"REDEEMABLE\",  \"customer\" : {    \"name\" : \"Chan Tai Man\",    \"id\" : \"0011s00000O2cTOAAZ\"  }}, {  \"couponItem\" : {    \"issueBrand\" : \"CSL\",    \"appliedBrand\" : \"\",    \"discountRate\" : 80.0,    \"redemptionQuota\" : 20.0,    \"description\" : \"Description content\",    \"minOrderAmount\" : 1000.0,    \"couponType\" : \"CASH\",    \"imageUrl\" : \"https://image.shutterstock.com/image-vector/vector-gift-voucher-coupon-code-260nw-1285774657.jpg\",    \"defaultExpiryDate\" : \"2020-11-30T23:59:59.999Z\",    \"initBalance\" : 200.0,    \"id\" : \"a0T1s000001DeGJEA0\",    \"glAccount\" : \"GI-0001\",    \"loyaltyPointMultiplier\" : 1.5,    \"productPurchased\" : \"SamsungS20\",    \"nonProductService\" : \"Shippment fee\",    \"tnc\" : \"T & C Content\",    \"giftProduct\" : \"3 months free Moov service\",    \"validPeriodOffset\" : 0.0,    \"applyRuleSet\" : \"RS-0001\",    \"instanceLimit\" : 10000.0,    \"validPeriodLength\" : 30.0,    \"couponItemCode\" : \"CLS0001\",    \"discountedPrice\" : 500.0,    \"isMultipleUse\" : true,    \"name\" : \"General Cash Coupon\",    \"loyaltyPointEarn\" : 20.0,    \"issueBu\" : \"Mobile\"  },  \"remainingBalance\" : 200.0,  \"id\" : \"a0U1s000000zjiIEAQ\",  \"validFrom\" : \"2020-11-01T00:00:00.000Z\",  \"remainingUse\" : 2.0,  \"couponCode\" : \"CI-0001\",  \"validTo\" : \"2020-11-30T23:59:59.999Z\",  \"status\" : \"REDEEMABLE\",  \"customer\" : {    \"name\" : \"Chan Tai Man\",    \"id\" : \"0011s00000O2cTOAAZ\"  }} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default CouponApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/dbTest", method = RequestMethod.GET)
    @ResponseBody
    default Object dataTest(@NotNull @RequestHeader(value = CommonUtil.KEY_NAME, required = true) String key){
        List<String> list = new ArrayList<String>();
		/*
		 * try { Connection conn = DButill.getConnection(); PreparedStatement pstmt =
		 * conn.prepareStatement("select * from person"); ResultSet res =
		 * pstmt.executeQuery();
		 * 
		 * while (res.next()) { String s = res.getString(1); System.err.println(s); s =
		 * res.getString(2); System.err.println(s); s = res.getString(3);
		 * System.err.println(s); list.add(s);
		 * 
		 * } conn.close(); } catch (Exception e) { e.printStackTrace(); }
		 */
        return list;
        
    }
}