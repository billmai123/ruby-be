package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CouponItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-11-11T06:35:50.814Z")

public class CouponItem   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("couponItemCode")
  private String couponItemCode = null;

  /**
   * Gets or Sets couponType
   */
  public enum CouponTypeEnum {
    CASH("CASH"),
    
    GIFT("GIFT"),
    
    FREE_SERVICE("FREE_SERVICE"),
    
    LOYALTY_POINT("LOYALTY_POINT");

    private String value;

    CouponTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CouponTypeEnum fromValue(String text) {
      for (CouponTypeEnum b : CouponTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("couponType")
  private CouponTypeEnum couponType = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("imageUrl")
  private String imageUrl = null;

  @JsonProperty("glAccount")
  private String glAccount = null;

  @JsonProperty("issueBu")
  private String issueBu = null;

  @JsonProperty("issueBrand")
  private String issueBrand = null;

  @JsonProperty("tnc")
  private String tnc = null;

  @JsonProperty("appliedBrand")
  private Object appliedBrand = null;

  @JsonProperty("defaultExpiryDate")
  private OffsetDateTime defaultExpiryDate = null;

  @JsonProperty("validPeriodOffset")
  private BigDecimal validPeriodOffset = null;

  @JsonProperty("validPeriodLength")
  private BigDecimal validPeriodLength = null;

  @JsonProperty("applyRuleSet")
  private String applyRuleSet = null;

  @JsonProperty("instanceLimit")
  private BigDecimal instanceLimit = null;

  @JsonProperty("minOrderAmount")
  private Float minOrderAmount = null;

  @JsonProperty("productPurchased")
  private String productPurchased = null;

  @JsonProperty("isMultipleUse")
  private Boolean isMultipleUse = null;

  @JsonProperty("redemptionQuota")
  private BigDecimal redemptionQuota = null;

  @JsonProperty("initBalance")
  private Float initBalance = null;

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

  public CouponItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "a0T1s000001DeGJEA0", required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CouponItem couponItemCode(String couponItemCode) {
    this.couponItemCode = couponItemCode;
    return this;
  }

  /**
   * Get couponItemCode
   * @return couponItemCode
  **/
  @ApiModelProperty(example = "CLS0001", value = "")


  public String getCouponItemCode() {
    return couponItemCode;
  }

  public void setCouponItemCode(String couponItemCode) {
    this.couponItemCode = couponItemCode;
  }

  public CouponItem couponType(CouponTypeEnum couponType) {
    this.couponType = couponType;
    return this;
  }

  /**
   * Get couponType
   * @return couponType
  **/
  @ApiModelProperty(value = "")


  public CouponTypeEnum getCouponType() {
    return couponType;
  }

  public void setCouponType(CouponTypeEnum couponType) {
    this.couponType = couponType;
  }

  public CouponItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "General Cash Coupon", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CouponItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Description content", value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CouponItem imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
  **/
  @ApiModelProperty(example = "https://image.shutterstock.com/image-vector/vector-gift-voucher-coupon-code-260nw-1285774657.jpg", value = "")


  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public CouponItem glAccount(String glAccount) {
    this.glAccount = glAccount;
    return this;
  }

  /**
   * Get glAccount
   * @return glAccount
  **/
  @ApiModelProperty(example = "GI-0001", value = "")


  public String getGlAccount() {
    return glAccount;
  }

  public void setGlAccount(String glAccount) {
    this.glAccount = glAccount;
  }

  public CouponItem issueBu(String issueBu) {
    this.issueBu = issueBu;
    return this;
  }

  /**
   * Get issueBu
   * @return issueBu
  **/
  @ApiModelProperty(example = "Mobile", value = "")


  public String getIssueBu() {
    return issueBu;
  }

  public void setIssueBu(String issueBu) {
    this.issueBu = issueBu;
  }

  public CouponItem issueBrand(String issueBrand) {
    this.issueBrand = issueBrand;
    return this;
  }

  /**
   * Get issueBrand
   * @return issueBrand
  **/
  @ApiModelProperty(example = "CSL", value = "")


  public String getIssueBrand() {
    return issueBrand;
  }

  public void setIssueBrand(String issueBrand) {
    this.issueBrand = issueBrand;
  }

  public CouponItem tnc(String tnc) {
    this.tnc = tnc;
    return this;
  }

  /**
   * Get tnc
   * @return tnc
  **/
  @ApiModelProperty(example = "T & C Content", value = "")


  public String getTnc() {
    return tnc;
  }

  public void setTnc(String tnc) {
    this.tnc = tnc;
  }

  public CouponItem appliedBrand(Object appliedBrand) {
    this.appliedBrand = appliedBrand;
    return this;
  }

  /**
   * Get appliedBrand
   * @return appliedBrand
  **/
  @ApiModelProperty(value = "")


  public Object getAppliedBrand() {
    return appliedBrand;
  }

  public void setAppliedBrand(Object appliedBrand) {
    this.appliedBrand = appliedBrand;
  }

  public CouponItem defaultExpiryDate(OffsetDateTime defaultExpiryDate) {
    this.defaultExpiryDate = defaultExpiryDate;
    return this;
  }

  /**
   * Get defaultExpiryDate
   * @return defaultExpiryDate
  **/
  @ApiModelProperty(example = "2020-11-30T23:59:59.999Z", value = "")

  @Valid

  public OffsetDateTime getDefaultExpiryDate() {
    return defaultExpiryDate;
  }

  public void setDefaultExpiryDate(OffsetDateTime defaultExpiryDate) {
    this.defaultExpiryDate = defaultExpiryDate;
  }

  public CouponItem validPeriodOffset(BigDecimal validPeriodOffset) {
    this.validPeriodOffset = validPeriodOffset;
    return this;
  }

  /**
   * Get validPeriodOffset
   * @return validPeriodOffset
  **/
  @ApiModelProperty(example = "0.0", value = "")

  @Valid

  public BigDecimal getValidPeriodOffset() {
    return validPeriodOffset;
  }

  public void setValidPeriodOffset(BigDecimal validPeriodOffset) {
    this.validPeriodOffset = validPeriodOffset;
  }

  public CouponItem validPeriodLength(BigDecimal validPeriodLength) {
    this.validPeriodLength = validPeriodLength;
    return this;
  }

  /**
   * Get validPeriodLength
   * @return validPeriodLength
  **/
  @ApiModelProperty(example = "30.0", value = "")

  @Valid

  public BigDecimal getValidPeriodLength() {
    return validPeriodLength;
  }

  public void setValidPeriodLength(BigDecimal validPeriodLength) {
    this.validPeriodLength = validPeriodLength;
  }

  public CouponItem applyRuleSet(String applyRuleSet) {
    this.applyRuleSet = applyRuleSet;
    return this;
  }

  /**
   * Get applyRuleSet
   * @return applyRuleSet
  **/
  @ApiModelProperty(example = "RS-0001", value = "")


  public String getApplyRuleSet() {
    return applyRuleSet;
  }

  public void setApplyRuleSet(String applyRuleSet) {
    this.applyRuleSet = applyRuleSet;
  }

  public CouponItem instanceLimit(BigDecimal instanceLimit) {
    this.instanceLimit = instanceLimit;
    return this;
  }

  /**
   * Get instanceLimit
   * @return instanceLimit
  **/
  @ApiModelProperty(example = "10000.0", value = "")

  @Valid

  public BigDecimal getInstanceLimit() {
    return instanceLimit;
  }

  public void setInstanceLimit(BigDecimal instanceLimit) {
    this.instanceLimit = instanceLimit;
  }

  public CouponItem minOrderAmount(Float minOrderAmount) {
    this.minOrderAmount = minOrderAmount;
    return this;
  }

  /**
   * Get minOrderAmount
   * @return minOrderAmount
  **/
  @ApiModelProperty(example = "1000.0", value = "")


  public Float getMinOrderAmount() {
    return minOrderAmount;
  }

  public void setMinOrderAmount(Float minOrderAmount) {
    this.minOrderAmount = minOrderAmount;
  }

  public CouponItem productPurchased(String productPurchased) {
    this.productPurchased = productPurchased;
    return this;
  }

  /**
   * Get productPurchased
   * @return productPurchased
  **/
  @ApiModelProperty(example = "SamsungS20", value = "")


  public String getProductPurchased() {
    return productPurchased;
  }

  public void setProductPurchased(String productPurchased) {
    this.productPurchased = productPurchased;
  }

  public CouponItem isMultipleUse(Boolean isMultipleUse) {
    this.isMultipleUse = isMultipleUse;
    return this;
  }

  /**
   * Get isMultipleUse
   * @return isMultipleUse
  **/
  @ApiModelProperty(example = "true", value = "")


  public Boolean isIsMultipleUse() {
    return isMultipleUse;
  }

  public void setIsMultipleUse(Boolean isMultipleUse) {
    this.isMultipleUse = isMultipleUse;
  }

  public CouponItem redemptionQuota(BigDecimal redemptionQuota) {
    this.redemptionQuota = redemptionQuota;
    return this;
  }

  /**
   * Get redemptionQuota
   * @return redemptionQuota
  **/
  @ApiModelProperty(example = "20.0", value = "")

  @Valid

  public BigDecimal getRedemptionQuota() {
    return redemptionQuota;
  }

  public void setRedemptionQuota(BigDecimal redemptionQuota) {
    this.redemptionQuota = redemptionQuota;
  }

  public CouponItem initBalance(Float initBalance) {
    this.initBalance = initBalance;
    return this;
  }

  /**
   * Currency is in HKD
   * @return initBalance
  **/
  @ApiModelProperty(example = "200.0", value = "Currency is in HKD")


  public Float getInitBalance() {
    return initBalance;
  }

  public void setInitBalance(Float initBalance) {
    this.initBalance = initBalance;
  }

  public CouponItem giftProduct(String giftProduct) {
    this.giftProduct = giftProduct;
    return this;
  }

  /**
   * Get giftProduct
   * @return giftProduct
  **/
  @ApiModelProperty(example = "3 months free Moov service", value = "")


  public String getGiftProduct() {
    return giftProduct;
  }

  public void setGiftProduct(String giftProduct) {
    this.giftProduct = giftProduct;
  }

  public CouponItem nonProductService(String nonProductService) {
    this.nonProductService = nonProductService;
    return this;
  }

  /**
   * Get nonProductService
   * @return nonProductService
  **/
  @ApiModelProperty(example = "Shippment fee", value = "")


  public String getNonProductService() {
    return nonProductService;
  }

  public void setNonProductService(String nonProductService) {
    this.nonProductService = nonProductService;
  }

  public CouponItem discountedPrice(Float discountedPrice) {
    this.discountedPrice = discountedPrice;
    return this;
  }

  /**
   * Get discountedPrice
   * @return discountedPrice
  **/
  @ApiModelProperty(example = "500.0", value = "")


  public Float getDiscountedPrice() {
    return discountedPrice;
  }

  public void setDiscountedPrice(Float discountedPrice) {
    this.discountedPrice = discountedPrice;
  }

  public CouponItem discountRate(BigDecimal discountRate) {
    this.discountRate = discountRate;
    return this;
  }

  /**
   * Get discountRate
   * @return discountRate
  **/
  @ApiModelProperty(example = "80.0", value = "")

  @Valid

  public BigDecimal getDiscountRate() {
    return discountRate;
  }

  public void setDiscountRate(BigDecimal discountRate) {
    this.discountRate = discountRate;
  }

  public CouponItem loyaltyPointMultiplier(Float loyaltyPointMultiplier) {
    this.loyaltyPointMultiplier = loyaltyPointMultiplier;
    return this;
  }

  /**
   * Get loyaltyPointMultiplier
   * @return loyaltyPointMultiplier
  **/
  @ApiModelProperty(example = "1.5", value = "")


  public Float getLoyaltyPointMultiplier() {
    return loyaltyPointMultiplier;
  }

  public void setLoyaltyPointMultiplier(Float loyaltyPointMultiplier) {
    this.loyaltyPointMultiplier = loyaltyPointMultiplier;
  }

  public CouponItem loyaltyPointEarn(BigDecimal loyaltyPointEarn) {
    this.loyaltyPointEarn = loyaltyPointEarn;
    return this;
  }

  /**
   * Get loyaltyPointEarn
   * @return loyaltyPointEarn
  **/
  @ApiModelProperty(example = "20.0", value = "")

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
    CouponItem couponItem = (CouponItem) o;
    return Objects.equals(this.id, couponItem.id) &&
        Objects.equals(this.couponItemCode, couponItem.couponItemCode) &&
        Objects.equals(this.couponType, couponItem.couponType) &&
        Objects.equals(this.name, couponItem.name) &&
        Objects.equals(this.description, couponItem.description) &&
        Objects.equals(this.imageUrl, couponItem.imageUrl) &&
        Objects.equals(this.glAccount, couponItem.glAccount) &&
        Objects.equals(this.issueBu, couponItem.issueBu) &&
        Objects.equals(this.issueBrand, couponItem.issueBrand) &&
        Objects.equals(this.tnc, couponItem.tnc) &&
        Objects.equals(this.appliedBrand, couponItem.appliedBrand) &&
        Objects.equals(this.defaultExpiryDate, couponItem.defaultExpiryDate) &&
        Objects.equals(this.validPeriodOffset, couponItem.validPeriodOffset) &&
        Objects.equals(this.validPeriodLength, couponItem.validPeriodLength) &&
        Objects.equals(this.applyRuleSet, couponItem.applyRuleSet) &&
        Objects.equals(this.instanceLimit, couponItem.instanceLimit) &&
        Objects.equals(this.minOrderAmount, couponItem.minOrderAmount) &&
        Objects.equals(this.productPurchased, couponItem.productPurchased) &&
        Objects.equals(this.isMultipleUse, couponItem.isMultipleUse) &&
        Objects.equals(this.redemptionQuota, couponItem.redemptionQuota) &&
        Objects.equals(this.initBalance, couponItem.initBalance) &&
        Objects.equals(this.giftProduct, couponItem.giftProduct) &&
        Objects.equals(this.nonProductService, couponItem.nonProductService) &&
        Objects.equals(this.discountedPrice, couponItem.discountedPrice) &&
        Objects.equals(this.discountRate, couponItem.discountRate) &&
        Objects.equals(this.loyaltyPointMultiplier, couponItem.loyaltyPointMultiplier) &&
        Objects.equals(this.loyaltyPointEarn, couponItem.loyaltyPointEarn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, couponItemCode, couponType, name, description, imageUrl, glAccount, issueBu, issueBrand, tnc, appliedBrand, defaultExpiryDate, validPeriodOffset, validPeriodLength, applyRuleSet, instanceLimit, minOrderAmount, productPurchased, isMultipleUse, redemptionQuota, initBalance, giftProduct, nonProductService, discountedPrice, discountRate, loyaltyPointMultiplier, loyaltyPointEarn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    couponItemCode: ").append(toIndentedString(couponItemCode)).append("\n");
    sb.append("    couponType: ").append(toIndentedString(couponType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    glAccount: ").append(toIndentedString(glAccount)).append("\n");
    sb.append("    issueBu: ").append(toIndentedString(issueBu)).append("\n");
    sb.append("    issueBrand: ").append(toIndentedString(issueBrand)).append("\n");
    sb.append("    tnc: ").append(toIndentedString(tnc)).append("\n");
    sb.append("    appliedBrand: ").append(toIndentedString(appliedBrand)).append("\n");
    sb.append("    defaultExpiryDate: ").append(toIndentedString(defaultExpiryDate)).append("\n");
    sb.append("    validPeriodOffset: ").append(toIndentedString(validPeriodOffset)).append("\n");
    sb.append("    validPeriodLength: ").append(toIndentedString(validPeriodLength)).append("\n");
    sb.append("    applyRuleSet: ").append(toIndentedString(applyRuleSet)).append("\n");
    sb.append("    instanceLimit: ").append(toIndentedString(instanceLimit)).append("\n");
    sb.append("    minOrderAmount: ").append(toIndentedString(minOrderAmount)).append("\n");
    sb.append("    productPurchased: ").append(toIndentedString(productPurchased)).append("\n");
    sb.append("    isMultipleUse: ").append(toIndentedString(isMultipleUse)).append("\n");
    sb.append("    redemptionQuota: ").append(toIndentedString(redemptionQuota)).append("\n");
    sb.append("    initBalance: ").append(toIndentedString(initBalance)).append("\n");
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

