package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AdminDSAdmin;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class AdminCustomerItem   {
  
  private Long id = null;
  private String customerContractType = null;
  private String providerCustomerNumber = null;
  private String company = null;
  private AdminDSAdmin adminUser = null;
  private Integer quota = null;
  private String quotaUsed = null;
  private Integer numberOfUsers = null;
  private Integer currentNumberOfUsers = null;
  private Date creationDate = null;
  private Date lastActionDate = null;
  private String activationCode = null;
  private Integer trialDaysLeft = null;

  
  /**
   * Customer id
   **/
  public AdminCustomerItem id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Customer id")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * One of  [ pay | demo | free ] 
   **/
  public AdminCustomerItem customerContractType(String customerContractType) {
    this.customerContractType = customerContractType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "One of  [ pay | demo | free ] ")
  @JsonProperty("customerContractType")
  public String getCustomerContractType() {
    return customerContractType;
  }
  public void setCustomerContractType(String customerContractType) {
    this.customerContractType = customerContractType;
  }


  /**
   * Provider customer number
   **/
  public AdminCustomerItem providerCustomerNumber(String providerCustomerNumber) {
    this.providerCustomerNumber = providerCustomerNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Provider customer number")
  @JsonProperty("providerCustomerNumber")
  public String getProviderCustomerNumber() {
    return providerCustomerNumber;
  }
  public void setProviderCustomerNumber(String providerCustomerNumber) {
    this.providerCustomerNumber = providerCustomerNumber;
  }


  /**
   * Company name
   **/
  public AdminCustomerItem company(String company) {
    this.company = company;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Company name")
  @JsonProperty("company")
  public String getCompany() {
    return company;
  }
  public void setCompany(String company) {
    this.company = company;
  }


  /**
   * Administrative user data
   **/
  public AdminCustomerItem adminUser(AdminDSAdmin adminUser) {
    this.adminUser = adminUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Administrative user data")
  @JsonProperty("adminUser")
  public AdminDSAdmin getAdminUser() {
    return adminUser;
  }
  public void setAdminUser(AdminDSAdmin adminUser) {
    this.adminUser = adminUser;
  }


  /**
   * Maximal disc space which can be allocated by customer in GB
   **/
  public AdminCustomerItem quota(Integer quota) {
    this.quota = quota;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximal disc space which can be allocated by customer in GB")
  @JsonProperty("quota")
  public Integer getQuota() {
    return quota;
  }
  public void setQuota(Integer quota) {
    this.quota = quota;
  }


  /**
   * Used amount of disc space in GB, has two digits after decimal point (x.xx)
   **/
  public AdminCustomerItem quotaUsed(String quotaUsed) {
    this.quotaUsed = quotaUsed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Used amount of disc space in GB, has two digits after decimal point (x.xx)")
  @JsonProperty("quotaUsed")
  public String getQuotaUsed() {
    return quotaUsed;
  }
  public void setQuotaUsed(String quotaUsed) {
    this.quotaUsed = quotaUsed;
  }


  /**
   * Maximal number of users, positive integer
   **/
  public AdminCustomerItem numberOfUsers(Integer numberOfUsers) {
    this.numberOfUsers = numberOfUsers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximal number of users, positive integer")
  @JsonProperty("numberOfUsers")
  public Integer getNumberOfUsers() {
    return numberOfUsers;
  }
  public void setNumberOfUsers(Integer numberOfUsers) {
    this.numberOfUsers = numberOfUsers;
  }


  /**
   * Number of users which are already allocated, positive integer.
   **/
  public AdminCustomerItem currentNumberOfUsers(Integer currentNumberOfUsers) {
    this.currentNumberOfUsers = currentNumberOfUsers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of users which are already allocated, positive integer.")
  @JsonProperty("currentNumberOfUsers")
  public Integer getCurrentNumberOfUsers() {
    return currentNumberOfUsers;
  }
  public void setCurrentNumberOfUsers(Integer currentNumberOfUsers) {
    this.currentNumberOfUsers = currentNumberOfUsers;
  }


  /**
   * Creation date.
   **/
  public AdminCustomerItem creationDate(Date creationDate) {
    this.creationDate = creationDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Creation date.")
  @JsonProperty("creationDate")
  public Date getCreationDate() {
    return creationDate;
  }
  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }


  /**
   * The date of the last action seen it the DataSpace.
   **/
  public AdminCustomerItem lastActionDate(Date lastActionDate) {
    this.lastActionDate = lastActionDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date of the last action seen it the DataSpace.")
  @JsonProperty("lastActionDate")
  public Date getLastActionDate() {
    return lastActionDate;
  }
  public void setLastActionDate(Date lastActionDate) {
    this.lastActionDate = lastActionDate;
  }


  /**
   * Customer activation code string, valid only for types free and demo, for pay customers it is empty.
   **/
  public AdminCustomerItem activationCode(String activationCode) {
    this.activationCode = activationCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Customer activation code string, valid only for types free and demo, for pay customers it is empty.")
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
  public AdminCustomerItem trialDaysLeft(Integer trialDaysLeft) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminCustomerItem adminCustomerItem = (AdminCustomerItem) o;
    return Objects.equals(this.id, adminCustomerItem.id) &&
        Objects.equals(this.customerContractType, adminCustomerItem.customerContractType) &&
        Objects.equals(this.providerCustomerNumber, adminCustomerItem.providerCustomerNumber) &&
        Objects.equals(this.company, adminCustomerItem.company) &&
        Objects.equals(this.adminUser, adminCustomerItem.adminUser) &&
        Objects.equals(this.quota, adminCustomerItem.quota) &&
        Objects.equals(this.quotaUsed, adminCustomerItem.quotaUsed) &&
        Objects.equals(this.numberOfUsers, adminCustomerItem.numberOfUsers) &&
        Objects.equals(this.currentNumberOfUsers, adminCustomerItem.currentNumberOfUsers) &&
        Objects.equals(this.creationDate, adminCustomerItem.creationDate) &&
        Objects.equals(this.lastActionDate, adminCustomerItem.lastActionDate) &&
        Objects.equals(this.activationCode, adminCustomerItem.activationCode) &&
        Objects.equals(this.trialDaysLeft, adminCustomerItem.trialDaysLeft);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customerContractType, providerCustomerNumber, company, adminUser, quota, quotaUsed, numberOfUsers, currentNumberOfUsers, creationDate, lastActionDate, activationCode, trialDaysLeft);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminCustomerItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerContractType: ").append(toIndentedString(customerContractType)).append("\n");
    sb.append("    providerCustomerNumber: ").append(toIndentedString(providerCustomerNumber)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    adminUser: ").append(toIndentedString(adminUser)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    quotaUsed: ").append(toIndentedString(quotaUsed)).append("\n");
    sb.append("    numberOfUsers: ").append(toIndentedString(numberOfUsers)).append("\n");
    sb.append("    currentNumberOfUsers: ").append(toIndentedString(currentNumberOfUsers)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    lastActionDate: ").append(toIndentedString(lastActionDate)).append("\n");
    sb.append("    activationCode: ").append(toIndentedString(activationCode)).append("\n");
    sb.append("    trialDaysLeft: ").append(toIndentedString(trialDaysLeft)).append("\n");
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

