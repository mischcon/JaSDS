package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class UpdateCustomerResponse   {
  
  private Long id = null;
  private String providerCustomerId = null;


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
  private Integer userMax = null;
  private Date createdAt = null;
  private String activationCode = null;
  private Integer trialDays = null;
  private Boolean lockStatus = null;

  
  /**
   * Unique identifier for the customer
   **/
  public UpdateCustomerResponse id(Long id) {
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
   * Provider customer ID value, relevant only for type 'pay'
   **/
  public UpdateCustomerResponse providerCustomerId(String providerCustomerId) {
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


  /**
   * Customer contract type.
   **/
  public UpdateCustomerResponse customerContractType(CustomerContractTypeEnum customerContractType) {
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
  public UpdateCustomerResponse companyName(String companyName) {
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
  public UpdateCustomerResponse quotaMax(Long quotaMax) {
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
   * Maximal number of users
   **/
  public UpdateCustomerResponse userMax(Integer userMax) {
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
   * Creation date (2015-12-31T23:59:00)
   **/
  public UpdateCustomerResponse createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Creation date (2015-12-31T23:59:00)")
  @JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * Customer activation code string, valid only for types free and demo, for pay customers it is empty
   **/
  public UpdateCustomerResponse activationCode(String activationCode) {
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
   * Number of trial days (relevant only for demo contact type, for all other types will be reset to 0)
   **/
  public UpdateCustomerResponse trialDays(Integer trialDays) {
    this.trialDays = trialDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of trial days (relevant only for demo contact type, for all other types will be reset to 0)")
  @JsonProperty("trialDays")
  public Integer getTrialDays() {
    return trialDays;
  }
  public void setTrialDays(Integer trialDays) {
    this.trialDays = trialDays;
  }


  /**
   * Lock status: false - Unlocked, true - Locked. All users of this customer will be blocked and can not login anymore
   **/
  public UpdateCustomerResponse lockStatus(Boolean lockStatus) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomerResponse updateCustomerResponse = (UpdateCustomerResponse) o;
    return Objects.equals(this.id, updateCustomerResponse.id) &&
        Objects.equals(this.providerCustomerId, updateCustomerResponse.providerCustomerId) &&
        Objects.equals(this.customerContractType, updateCustomerResponse.customerContractType) &&
        Objects.equals(this.companyName, updateCustomerResponse.companyName) &&
        Objects.equals(this.quotaMax, updateCustomerResponse.quotaMax) &&
        Objects.equals(this.userMax, updateCustomerResponse.userMax) &&
        Objects.equals(this.createdAt, updateCustomerResponse.createdAt) &&
        Objects.equals(this.activationCode, updateCustomerResponse.activationCode) &&
        Objects.equals(this.trialDays, updateCustomerResponse.trialDays) &&
        Objects.equals(this.lockStatus, updateCustomerResponse.lockStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, providerCustomerId, customerContractType, companyName, quotaMax, userMax, createdAt, activationCode, trialDays, lockStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomerResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    providerCustomerId: ").append(toIndentedString(providerCustomerId)).append("\n");
    sb.append("    customerContractType: ").append(toIndentedString(customerContractType)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    quotaMax: ").append(toIndentedString(quotaMax)).append("\n");
    sb.append("    userMax: ").append(toIndentedString(userMax)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    activationCode: ").append(toIndentedString(activationCode)).append("\n");
    sb.append("    trialDays: ").append(toIndentedString(trialDays)).append("\n");
    sb.append("    lockStatus: ").append(toIndentedString(lockStatus)).append("\n");
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

