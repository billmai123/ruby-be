package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CouponItem;
import io.swagger.model.Customer;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CouponInstance
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-11-11T06:35:50.814Z")

public class CouponInstance   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("couponCode")
  private String couponCode = null;

  @JsonProperty("validFrom")
  private OffsetDateTime validFrom = null;

  @JsonProperty("validTo")
  private OffsetDateTime validTo = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    REDEEMABLE("REDEEMABLE"),
    
    REDEEMED("REDEEMED"),
    
    EXPIRED("EXPIRED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("remainingUse")
  private BigDecimal remainingUse = null;

  @JsonProperty("remainingBalance")
  private Float remainingBalance = null;

  @JsonProperty("customer")
  private Customer customer = null;

  @JsonProperty("couponItem")
  private CouponItem couponItem = null;

  public CouponInstance id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "a0U1s000000zjiIEAQ", required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CouponInstance couponCode(String couponCode) {
    this.couponCode = couponCode;
    return this;
  }

  /**
   * Get couponCode
   * @return couponCode
  **/
  @ApiModelProperty(example = "CI-0001", value = "")


  public String getCouponCode() {
    return couponCode;
  }

  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }

  public CouponInstance validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  /**
   * Get validFrom
   * @return validFrom
  **/
  @ApiModelProperty(example = "2020-11-01T00:00:00.000Z", value = "")

  @Valid

  public OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  public CouponInstance validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

  /**
   * Get validTo
   * @return validTo
  **/
  @ApiModelProperty(example = "2020-11-30T23:59:59.999Z", value = "")

  @Valid

  public OffsetDateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
  }

  public CouponInstance status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "REDEEMABLE", value = "")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public CouponInstance remainingUse(BigDecimal remainingUse) {
    this.remainingUse = remainingUse;
    return this;
  }

  /**
   * Get remainingUse
   * @return remainingUse
  **/
  @ApiModelProperty(example = "2.0", value = "")

  @Valid

  public BigDecimal getRemainingUse() {
    return remainingUse;
  }

  public void setRemainingUse(BigDecimal remainingUse) {
    this.remainingUse = remainingUse;
  }

  public CouponInstance remainingBalance(Float remainingBalance) {
    this.remainingBalance = remainingBalance;
    return this;
  }

  /**
   * Currency is in HKD
   * @return remainingBalance
  **/
  @ApiModelProperty(example = "200.0", value = "Currency is in HKD")


  public Float getRemainingBalance() {
    return remainingBalance;
  }

  public void setRemainingBalance(Float remainingBalance) {
    this.remainingBalance = remainingBalance;
  }

  public CouponInstance customer(Customer customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public CouponInstance couponItem(CouponItem couponItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponInstance couponInstance = (CouponInstance) o;
    return Objects.equals(this.id, couponInstance.id) &&
        Objects.equals(this.couponCode, couponInstance.couponCode) &&
        Objects.equals(this.validFrom, couponInstance.validFrom) &&
        Objects.equals(this.validTo, couponInstance.validTo) &&
        Objects.equals(this.status, couponInstance.status) &&
        Objects.equals(this.remainingUse, couponInstance.remainingUse) &&
        Objects.equals(this.remainingBalance, couponInstance.remainingBalance) &&
        Objects.equals(this.customer, couponInstance.customer) &&
        Objects.equals(this.couponItem, couponInstance.couponItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, couponCode, validFrom, validTo, status, remainingUse, remainingBalance, customer, couponItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponInstance {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    remainingUse: ").append(toIndentedString(remainingUse)).append("\n");
    sb.append("    remainingBalance: ").append(toIndentedString(remainingBalance)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    couponItem: ").append(toIndentedString(couponItem)).append("\n");
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

