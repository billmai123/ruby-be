package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CouponItem;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Rule
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-11-11T06:35:50.814Z")

public class Rule   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("couponItem")
  private CouponItem couponItem = null;

  @JsonProperty("minOrderAmount")
  private Float minOrderAmount = null;

  @JsonProperty("productPurchased")
  private String productPurchased = null;

  @JsonProperty("giftProduct")
  private String giftProduct = null;

  @JsonProperty("nonProductService")
  private String nonProductService = null;

  @JsonProperty("discountedPrice")
  private Float discountedPrice = null;

  @JsonProperty("discountRate")
  private BigDecimal discountRate = null;

  @JsonProperty("loyaltyPointMultiplier")
  private Float loyaltyPointMultiplier = null;

  @JsonProperty("loyaltyPointEarn")
  private BigDecimal loyaltyPointEarn = null;

  public Rule id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Rule id
   * @return id
  **/
  @ApiModelProperty(example = "RU-0001", required = true, value = "Rule id")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Rule couponItem(CouponItem couponItem) {
    this.couponItem = couponItem;
    return this;
  }

  /**
   * Get couponItem
   * @return couponItem
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CouponItem getCouponItem() {
    return couponItem;
  }

  public void setCouponItem(CouponItem couponItem) {
    this.couponItem = couponItem;
  }

  public Rule minOrderAmount(Float minOrderAmount) {
    this.minOrderAmount = minOrderAmount;
    return this;
  }

  /**
   * Min order amount to use coupon instance
   * @return minOrderAmount
  **/
  @ApiModelProperty(example = "1000.0", value = "Min order amount to use coupon instance")


  public Float getMinOrderAmount() {
    return minOrderAmount;
  }

  public void setMinOrderAmount(Float minOrderAmount) {
    this.minOrderAmount = minOrderAmount;
  }

  public Rule productPurchased(String productPurchased) {
    this.productPurchased = productPurchased;
    return this;
  }

  /**
   * Product must be purchased when using the coupon
   * @return productPurchased
  **/
  @ApiModelProperty(example = "SamsungS20", value = "Product must be purchased when using the coupon")


  public String getProductPurchased() {
    return productPurchased;
  }

  public void setProductPurchased(String productPurchased) {
    this.productPurchased = productPurchased;
  }

  public Rule giftProduct(String giftProduct) {
    this.giftProduct = giftProduct;
    return this;
  }

  /**
   * Tangible or non-tangible Product(e.g. 3 months free Moov service)
   * @return giftProduct
  **/
  @ApiModelProperty(example = "3 months free Moov service", value = "Tangible or non-tangible Product(e.g. 3 months free Moov service)")


  public String getGiftProduct() {
    return giftProduct;
  }

  public void setGiftProduct(String giftProduct) {
    this.giftProduct = giftProduct;
  }

  public Rule nonProductService(String nonProductService) {
    this.nonProductService = nonProductService;
    return this;
  }

  /**
   * Non Product Service(e.g. Shippment fee)
   * @return nonProductService
  **/
  @ApiModelProperty(example = "Shippment fee", value = "Non Product Service(e.g. Shippment fee)")


  public String getNonProductService() {
    return nonProductService;
  }

  public void setNonProductService(String nonProductService) {
    this.nonProductService = nonProductService;
  }

  public Rule discountedPrice(Float discountedPrice) {
    this.discountedPrice = discountedPrice;
    return this;
  }

  /**
   * Assigned special price (e.g. $20 for gift)
   * @return discountedPrice
  **/
  @ApiModelProperty(example = "500.0", value = "Assigned special price (e.g. $20 for gift)")


  public Float getDiscountedPrice() {
    return discountedPrice;
  }

  public void setDiscountedPrice(Float discountedPrice) {
    this.discountedPrice = discountedPrice;
  }

  public Rule discountRate(BigDecimal discountRate) {
    this.discountRate = discountRate;
    return this;
  }

  /**
   * Assigned special discount rate (e.g. 50% off for gif)
   * @return discountRate
  **/
  @ApiModelProperty(example = "80.0", value = "Assigned special discount rate (e.g. 50% off for gif)")

  @Valid

  public BigDecimal getDiscountRate() {
    return discountRate;
  }

  public void setDiscountRate(BigDecimal discountRate) {
    this.discountRate = discountRate;
  }

  public Rule loyaltyPointMultiplier(Float loyaltyPointMultiplier) {
    this.loyaltyPointMultiplier = loyaltyPointMultiplier;
    return this;
  }

  /**
   * For example : Get 3 X loyalty points after use coupon
   * @return loyaltyPointMultiplier
  **/
  @ApiModelProperty(example = "1.5", value = "For example : Get 3 X loyalty points after use coupon")


  public Float getLoyaltyPointMultiplier() {
    return loyaltyPointMultiplier;
  }

  public void setLoyaltyPointMultiplier(Float loyaltyPointMultiplier) {
    this.loyaltyPointMultiplier = loyaltyPointMultiplier;
  }

  public Rule loyaltyPointEarn(BigDecimal loyaltyPointEarn) {
    this.loyaltyPointEarn = loyaltyPointEarn;
    return this;
  }

  /**
   * Extra amount of loyalty point
   * @return loyaltyPointEarn
  **/
  @ApiModelProperty(example = "20.0", value = "Extra amount of loyalty point")

  @Valid

  public BigDecimal getLoyaltyPointEarn() {
    return loyaltyPointEarn;
  }

  public void setLoyaltyPointEarn(BigDecimal loyaltyPointEarn) {
    this.loyaltyPointEarn = loyaltyPointEarn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rule rule = (Rule) o;
    return Objects.equals(this.id, rule.id) &&
        Objects.equals(this.couponItem, rule.couponItem) &&
        Objects.equals(this.minOrderAmount, rule.minOrderAmount) &&
        Objects.equals(this.productPurchased, rule.productPurchased) &&
        Objects.equals(this.giftProduct, rule.giftProduct) &&
        Objects.equals(this.nonProductService, rule.nonProductService) &&
        Objects.equals(this.discountedPrice, rule.discountedPrice) &&
        Objects.equals(this.discountRate, rule.discountRate) &&
        Objects.equals(this.loyaltyPointMultiplier, rule.loyaltyPointMultiplier) &&
        Objects.equals(this.loyaltyPointEarn, rule.loyaltyPointEarn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, couponItem, minOrderAmount, productPurchased, giftProduct, nonProductService, discountedPrice, discountRate, loyaltyPointMultiplier, loyaltyPointEarn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    couponItem: ").append(toIndentedString(couponItem)).append("\n");
    sb.append("    minOrderAmount: ").append(toIndentedString(minOrderAmount)).append("\n");
    sb.append("    productPurchased: ").append(toIndentedString(productPurchased)).append("\n");
    sb.append("    giftProduct: ").append(toIndentedString(giftProduct)).append("\n");
    sb.append("    nonProductService: ").append(toIndentedString(nonProductService)).append("\n");
    sb.append("    discountedPrice: ").append(toIndentedString(discountedPrice)).append("\n");
    sb.append("    discountRate: ").append(toIndentedString(discountRate)).append("\n");
    sb.append("    loyaltyPointMultiplier: ").append(toIndentedString(loyaltyPointMultiplier)).append("\n");
    sb.append("    loyaltyPointEarn: ").append(toIndentedString(loyaltyPointEarn)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

