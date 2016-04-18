package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class UpdateCustomerRequest   {
  


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
  private Boolean lockStatus = null;
  private String providerCustomerId = null;

  
  /**
   * Customer contract type.
   **/
  public UpdateCustomerRequest customerContractType(CustomerContractTypeEnum customerContractType) {
    this.customerContractType = customerContractType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Customer contract type.")
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
  public UpdateCustomerRequest companyName(String companyName) {
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
  public UpdateCustomerRequest quotaMax(Long quotaMax) {
    this.quotaMax = quotaMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximal disc space which can be allocated by customer in bytes")
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
  public UpdateCustomerRequest userMax(Integer userMax) {
    this.userMax = userMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximal number of users")
  @JsonProperty("userMax")
  public Integer getUserMax() {
    return userMax;
  }
  public void setUserMax(Integer userMax) {
    this.userMax = userMax;
  }


  /**
   * Lock status: false - Unlocked, true - Locked. All users of this customer will be blocked and can not login anymore
   **/
  public UpdateCustomerRequest lockStatus(Boolean lockStatus) {
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
  public UpdateCustomerRequest providerCustomerId(String providerCustomerId) {
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
    UpdateCustomerRequest updateCustomerRequest = (UpdateCustomerRequest) o;
    return Objects.equals(this.customerContractType, updateCustomerRequest.customerContractType) &&
        Objects.equals(this.companyName, updateCustomerRequest.companyName) &&
        Objects.equals(this.quotaMax, updateCustomerRequest.quotaMax) &&
        Objects.equals(this.userMax, updateCustomerRequest.userMax) &&
        Objects.equals(this.lockStatus, updateCustomerRequest.lockStatus) &&
        Objects.equals(this.providerCustomerId, updateCustomerRequest.providerCustomerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContractType, companyName, quotaMax, userMax, lockStatus, providerCustomerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomerRequest {\n");
    
    sb.append("    customerContractType: ").append(toIndentedString(customerContractType)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    quotaMax: ").append(toIndentedString(quotaMax)).append("\n");
    sb.append("    userMax: ").append(toIndentedString(userMax)).append("\n");
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

