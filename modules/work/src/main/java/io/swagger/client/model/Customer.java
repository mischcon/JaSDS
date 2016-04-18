package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class Customer   {
  
  private Long id = null;


  public enum CustomerContractTypeEnum {
    PAY("pay"),
    FREE("free"),
    DEMO("demo");

    private String value;

    CustomerContractTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CustomerContractTypeEnum customerContractType = null;
  private String companyName = null;
  private Long quotaMax = null;
  private Long quotaUsed = null;
  private Integer userMax = null;
  private Integer userUsed = null;
  private Date createdAt = null;
  private Date updatedAt = null;
  private Date lastLoginAt = null;
  private String activationCode = null;
  private Integer trialDaysLeft = null;
  private Boolean lockStatus = null;
  private String providerCustomerId = null;

  
  /**
   * Unique identifier for the customer
   **/
  public Customer id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique identifier for the customer")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * Customer contract type.
   **/
  public Customer customerContractType(CustomerContractTypeEnum customerContractType) {
    this.customerContractType = customerContractType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Customer contract type.")
  @JsonProperty("customerContractType")
  public CustomerContractTypeEnum getCustomerContractType() {
    return customerContractType;
  }
  public void setCustomerContractType(CustomerContractTypeEnum customerContractType) {
    this.customerContractType = customerContractType;
  }


  /**
   * Company name
   **/
  public Customer companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Company name")
  @JsonProperty("companyName")
  public String getCompanyName() {
    return companyName;
  }
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  /**
   * Maximal disc space which can be allocated by customer in bytes
   **/
  public Customer quotaMax(Long quotaMax) {
    this.quotaMax = quotaMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximal disc space which can be allocated by customer in bytes")
  @JsonProperty("quotaMax")
  public Long getQuotaMax() {
    return quotaMax;
  }
  public void setQuotaMax(Long quotaMax) {
    this.quotaMax = quotaMax;
  }


  /**
   * Used amount of disc space in bytes
   **/
  public Customer quotaUsed(Long quotaUsed) {
    this.quotaUsed = quotaUsed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Used amount of disc space in bytes")
  @JsonProperty("quotaUsed")
  public Long getQuotaUsed() {
    return quotaUsed;
  }
  public void setQuotaUsed(Long quotaUsed) {
    this.quotaUsed = quotaUsed;
  }


  /**
   * Maximal number of users
   **/
  public Customer userMax(Integer userMax) {
    this.userMax = userMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximal number of users")
  @JsonProperty("userMax")
  public Integer getUserMax() {
    return userMax;
  }
  public void setUserMax(Integer userMax) {
    this.userMax = userMax;
  }


  /**
   * Number of users which are already allocated
   **/
  public Customer userUsed(Integer userUsed) {
    this.userUsed = userUsed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of users which are already allocated")
  @JsonProperty("userUsed")
  public Integer getUserUsed() {
    return userUsed;
  }
  public void setUserUsed(Integer userUsed) {
    this.userUsed = userUsed;
  }


  /**
   * Creation date (2015-12-31T23:59:00)
   **/
  public Customer createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Creation date (2015-12-31T23:59:00)")
  @JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * Modification date (2015-12-31T23:59:00)
   **/
  public Customer updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Modification date (2015-12-31T23:59:00)")
  @JsonProperty("updatedAt")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }


  /**
   * The date of the last login seen in the customer (2015-12-31T23:59:00)
   **/
  public Customer lastLoginAt(Date lastLoginAt) {
    this.lastLoginAt = lastLoginAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date of the last login seen in the customer (2015-12-31T23:59:00)")
  @JsonProperty("lastLoginAt")
  public Date getLastLoginAt() {
    return lastLoginAt;
  }
  public void setLastLoginAt(Date lastLoginAt) {
    this.lastLoginAt = lastLoginAt;
  }


  /**
   * Customer activation code string, valid only for types free and demo, for pay customers it is empty
   **/
  public Customer activationCode(String activationCode) {
    this.activationCode = activationCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Customer activation code string, valid only for types free and demo, for pay customers it is empty")
  @JsonProperty("activationCode")
  public String getActivationCode() {
    return activationCode;
  }
  public void setActivationCode(String activationCode) {
    this.activationCode = activationCode;
  }


  /**
   * Number of days, left for the trial period. Relevant only for type demo.
   **/
  public Customer trialDaysLeft(Integer trialDaysLeft) {
    this.trialDaysLeft = trialDaysLeft;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of days, left for the trial period. Relevant only for type demo.")
  @JsonProperty("trialDaysLeft")
  public Integer getTrialDaysLeft() {
    return trialDaysLeft;
  }
  public void setTrialDaysLeft(Integer trialDaysLeft) {
    this.trialDaysLeft = trialDaysLeft;
  }


  /**
   * Lock status: false - Unlocked, true - Locked. All users of this customer will be blocked and can not login anymore
   **/
  public Customer lockStatus(Boolean lockStatus) {
    this.lockStatus = lockStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Lock status: false - Unlocked, true - Locked. All users of this customer will be blocked and can not login anymore")
  @JsonProperty("lockStatus")
  public Boolean getLockStatus() {
    return lockStatus;
  }
  public void setLockStatus(Boolean lockStatus) {
    this.lockStatus = lockStatus;
  }


  /**
   * Provider customer ID value, relevant only for type 'pay'
   **/
  public Customer providerCustomerId(String providerCustomerId) {
    this.providerCustomerId = providerCustomerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Provider customer ID value, relevant only for type 'pay'")
  @JsonProperty("providerCustomerId")
  public String getProviderCustomerId() {
    return providerCustomerId;
  }
  public void setProviderCustomerId(String providerCustomerId) {
    this.providerCustomerId = providerCustomerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.id, customer.id) &&
        Objects.equals(this.customerContractType, customer.customerContractType) &&
        Objects.equals(this.companyName, customer.companyName) &&
        Objects.equals(this.quotaMax, customer.quotaMax) &&
        Objects.equals(this.quotaUsed, customer.quotaUsed) &&
        Objects.equals(this.userMax, customer.userMax) &&
        Objects.equals(this.userUsed, customer.userUsed) &&
        Objects.equals(this.createdAt, customer.createdAt) &&
        Objects.equals(this.updatedAt, customer.updatedAt) &&
        Objects.equals(this.lastLoginAt, customer.lastLoginAt) &&
        Objects.equals(this.activationCode, customer.activationCode) &&
        Objects.equals(this.trialDaysLeft, customer.trialDaysLeft) &&
        Objects.equals(this.lockStatus, customer.lockStatus) &&
        Objects.equals(this.providerCustomerId, customer.providerCustomerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customerContractType, companyName, quotaMax, quotaUsed, userMax, userUsed, createdAt, updatedAt, lastLoginAt, activationCode, trialDaysLeft, lockStatus, providerCustomerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerContractType: ").append(toIndentedString(customerContractType)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    quotaMax: ").append(toIndentedString(quotaMax)).append("\n");
    sb.append("    quotaUsed: ").append(toIndentedString(quotaUsed)).append("\n");
    sb.append("    userMax: ").append(toIndentedString(userMax)).append("\n");
    sb.append("    userUsed: ").append(toIndentedString(userUsed)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    lastLoginAt: ").append(toIndentedString(lastLoginAt)).append("\n");
    sb.append("    activationCode: ").append(toIndentedString(activationCode)).append("\n");
    sb.append("    trialDaysLeft: ").append(toIndentedString(trialDaysLeft)).append("\n");
    sb.append("    lockStatus: ").append(toIndentedString(lockStatus)).append("\n");
    sb.append("    providerCustomerId: ").append(toIndentedString(providerCustomerId)).append("\n");
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

