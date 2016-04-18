package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.FirstAdminUser;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class NewCustomerRequest   {
  


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
  private Boolean doNotNotify = null;
  private String activationCode = null;
  private Integer trialDays = null;
  private Boolean lockStatus = null;
  private String providerCustomerId = null;
  private FirstAdminUser firstAdminUser = null;

  
  /**
   * Customer contract type.
   **/
  public NewCustomerRequest customerContractType(CustomerContractTypeEnum customerContractType) {
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
  public NewCustomerRequest companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Company name")
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
  public NewCustomerRequest quotaMax(Long quotaMax) {
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
  public NewCustomerRequest userMax(Integer userMax) {
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
   * If true, the SDS Server does not send a welcome email to the newly created Dataspace Administrator <span style=\"color: red; font-weight: bold;\">[DEPRECATED]</span>
   **/
  public NewCustomerRequest doNotNotify(Boolean doNotNotify) {
    this.doNotNotify = doNotNotify;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, the SDS Server does not send a welcome email to the newly created Dataspace Administrator <span style=\"color: red; font-weight: bold;\">[DEPRECATED]</span>")
  @JsonProperty("doNotNotify")
  public Boolean getDoNotNotify() {
    return doNotNotify;
  }
  public void setDoNotNotify(Boolean doNotNotify) {
    this.doNotNotify = doNotNotify;
  }


  /**
   * Customer activation code string, valid only for types free and demo, for pay customers it is empty
   **/
  public NewCustomerRequest activationCode(String activationCode) {
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
  public NewCustomerRequest trialDays(Integer trialDays) {
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
  public NewCustomerRequest lockStatus(Boolean lockStatus) {
    this.lockStatus = lockStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lock status: false - Unlocked, true - Locked. All users of this customer will be blocked and can not login anymore")
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
  public NewCustomerRequest providerCustomerId(String providerCustomerId) {
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
   * Dataspace admin user data
   **/
  public NewCustomerRequest firstAdminUser(FirstAdminUser firstAdminUser) {
    this.firstAdminUser = firstAdminUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Dataspace admin user data")
  @JsonProperty("firstAdminUser")
  public FirstAdminUser getFirstAdminUser() {
    return firstAdminUser;
  }
  public void setFirstAdminUser(FirstAdminUser firstAdminUser) {
    this.firstAdminUser = firstAdminUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewCustomerRequest newCustomerRequest = (NewCustomerRequest) o;
    return Objects.equals(this.customerContractType, newCustomerRequest.customerContractType) &&
        Objects.equals(this.companyName, newCustomerRequest.companyName) &&
        Objects.equals(this.quotaMax, newCustomerRequest.quotaMax) &&
        Objects.equals(this.userMax, newCustomerRequest.userMax) &&
        Objects.equals(this.doNotNotify, newCustomerRequest.doNotNotify) &&
        Objects.equals(this.activationCode, newCustomerRequest.activationCode) &&
        Objects.equals(this.trialDays, newCustomerRequest.trialDays) &&
        Objects.equals(this.lockStatus, newCustomerRequest.lockStatus) &&
        Objects.equals(this.providerCustomerId, newCustomerRequest.providerCustomerId) &&
        Objects.equals(this.firstAdminUser, newCustomerRequest.firstAdminUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContractType, companyName, quotaMax, userMax, doNotNotify, activationCode, trialDays, lockStatus, providerCustomerId, firstAdminUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewCustomerRequest {\n");
    
    sb.append("    customerContractType: ").append(toIndentedString(customerContractType)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    quotaMax: ").append(toIndentedString(quotaMax)).append("\n");
    sb.append("    userMax: ").append(toIndentedString(userMax)).append("\n");
    sb.append("    doNotNotify: ").append(toIndentedString(doNotNotify)).append("\n");
    sb.append("    activationCode: ").append(toIndentedString(activationCode)).append("\n");
    sb.append("    trialDays: ").append(toIndentedString(trialDays)).append("\n");
    sb.append("    lockStatus: ").append(toIndentedString(lockStatus)).append("\n");
    sb.append("    providerCustomerId: ").append(toIndentedString(providerCustomerId)).append("\n");
    sb.append("    firstAdminUser: ").append(toIndentedString(firstAdminUser)).append("\n");
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

