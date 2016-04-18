package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class AdminUpdateCustomerRequest   {
  
  private String providerCustomerNumber = null;
  private Integer quota = null;
  private Integer numberOfUsers = null;
  private Boolean transformIntoPayCustomer = null;

  
  /**
   * Provider customer number value, relevant only for type 'pay'.
   **/
  public AdminUpdateCustomerRequest providerCustomerNumber(String providerCustomerNumber) {
    this.providerCustomerNumber = providerCustomerNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Provider customer number value, relevant only for type 'pay'.")
  @JsonProperty("providerCustomerNumber")
  public String getProviderCustomerNumber() {
    return providerCustomerNumber;
  }
  public void setProviderCustomerNumber(String providerCustomerNumber) {
    this.providerCustomerNumber = providerCustomerNumber;
  }


  /**
   * Maximal disc space which can be allocated by customer in GB
   **/
  public AdminUpdateCustomerRequest quota(Integer quota) {
    this.quota = quota;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximal disc space which can be allocated by customer in GB")
  @JsonProperty("quota")
  public Integer getQuota() {
    return quota;
  }
  public void setQuota(Integer quota) {
    this.quota = quota;
  }


  /**
   * Maximal number of users, positive integer
   **/
  public AdminUpdateCustomerRequest numberOfUsers(Integer numberOfUsers) {
    this.numberOfUsers = numberOfUsers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximal number of users, positive integer")
  @JsonProperty("numberOfUsers")
  public Integer getNumberOfUsers() {
    return numberOfUsers;
  }
  public void setNumberOfUsers(Integer numberOfUsers) {
    this.numberOfUsers = numberOfUsers;
  }


  /**
   * Has meaning only for demo or free accounts: if set to true accounts are transformed into pay account. Otherwise has no effect on already pay account 
   **/
  public AdminUpdateCustomerRequest transformIntoPayCustomer(Boolean transformIntoPayCustomer) {
    this.transformIntoPayCustomer = transformIntoPayCustomer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Has meaning only for demo or free accounts: if set to true accounts are transformed into pay account. Otherwise has no effect on already pay account ")
  @JsonProperty("transformIntoPayCustomer")
  public Boolean getTransformIntoPayCustomer() {
    return transformIntoPayCustomer;
  }
  public void setTransformIntoPayCustomer(Boolean transformIntoPayCustomer) {
    this.transformIntoPayCustomer = transformIntoPayCustomer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminUpdateCustomerRequest adminUpdateCustomerRequest = (AdminUpdateCustomerRequest) o;
    return Objects.equals(this.providerCustomerNumber, adminUpdateCustomerRequest.providerCustomerNumber) &&
        Objects.equals(this.quota, adminUpdateCustomerRequest.quota) &&
        Objects.equals(this.numberOfUsers, adminUpdateCustomerRequest.numberOfUsers) &&
        Objects.equals(this.transformIntoPayCustomer, adminUpdateCustomerRequest.transformIntoPayCustomer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerCustomerNumber, quota, numberOfUsers, transformIntoPayCustomer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminUpdateCustomerRequest {\n");
    
    sb.append("    providerCustomerNumber: ").append(toIndentedString(providerCustomerNumber)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    numberOfUsers: ").append(toIndentedString(numberOfUsers)).append("\n");
    sb.append("    transformIntoPayCustomer: ").append(toIndentedString(transformIntoPayCustomer)).append("\n");
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

