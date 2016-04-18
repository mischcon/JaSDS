package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class CreateCustomerRequest   {
  


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
  private Integer trialDays = null;
  private String salutation = null;


  public enum GenderEnum {
    M("m"),
    F("f"),
    N("n");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private GenderEnum gender = null;
  private String title = null;
  private String firstName = null;
  private String lastName = null;
  private String company = null;
  private String email = null;
  private String language = null;
  private String providerCustomerNumber = null;
  private Integer quota = null;
  private Integer numberOfUsers = null;
  private Boolean mustChangeUserName = null;

  
  /**
   * Customer contract type.
   **/
  public CreateCustomerRequest customerContractType(CustomerContractTypeEnum customerContractType) {
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
   * Number of trial days (relevant only for demo contact type, for all other types will be reset to 0)
   **/
  public CreateCustomerRequest trialDays(Integer trialDays) {
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
   * Salutation <span style=\"color: red; font-weight: bold;\">[DEPRECATED]</span>, please use gender instead!
   **/
  public CreateCustomerRequest salutation(String salutation) {
    this.salutation = salutation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Salutation <span style=\"color: red; font-weight: bold;\">[DEPRECATED]</span>, please use gender instead!")
  @JsonProperty("salutation")
  public String getSalutation() {
    return salutation;
  }
  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }


  /**
   * Gender key, one of [m|f|n]
   **/
  public CreateCustomerRequest gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Gender key, one of [m|f|n]")
  @JsonProperty("gender")
  public GenderEnum getGender() {
    return gender;
  }
  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }


  /**
   * Title
   **/
  public CreateCustomerRequest title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Title")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * First name
   **/
  public CreateCustomerRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "First name")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  /**
   * Last name
   **/
  public CreateCustomerRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Last name")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  /**
   * Company name
   **/
  public CreateCustomerRequest company(String company) {
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
   * Email of the DataSpace administrator
   **/
  public CreateCustomerRequest email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Email of the DataSpace administrator")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * Language ID or ISO 639-1 code
   **/
  public CreateCustomerRequest language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Language ID or ISO 639-1 code")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   * provider customer number
   **/
  public CreateCustomerRequest providerCustomerNumber(String providerCustomerNumber) {
    this.providerCustomerNumber = providerCustomerNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "provider customer number")
  @JsonProperty("providerCustomerNumber")
  public String getProviderCustomerNumber() {
    return providerCustomerNumber;
  }
  public void setProviderCustomerNumber(String providerCustomerNumber) {
    this.providerCustomerNumber = providerCustomerNumber;
  }


  /**
   * Customer quota, positive integer for the number of Gigabytes
   **/
  public CreateCustomerRequest quota(Integer quota) {
    this.quota = quota;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Customer quota, positive integer for the number of Gigabytes")
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
  public CreateCustomerRequest numberOfUsers(Integer numberOfUsers) {
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
   * If true, the user must change the userName at the first login
   **/
  public CreateCustomerRequest mustChangeUserName(Boolean mustChangeUserName) {
    this.mustChangeUserName = mustChangeUserName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, the user must change the userName at the first login")
  @JsonProperty("mustChangeUserName")
  public Boolean getMustChangeUserName() {
    return mustChangeUserName;
  }
  public void setMustChangeUserName(Boolean mustChangeUserName) {
    this.mustChangeUserName = mustChangeUserName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCustomerRequest createCustomerRequest = (CreateCustomerRequest) o;
    return Objects.equals(this.customerContractType, createCustomerRequest.customerContractType) &&
        Objects.equals(this.trialDays, createCustomerRequest.trialDays) &&
        Objects.equals(this.salutation, createCustomerRequest.salutation) &&
        Objects.equals(this.gender, createCustomerRequest.gender) &&
        Objects.equals(this.title, createCustomerRequest.title) &&
        Objects.equals(this.firstName, createCustomerRequest.firstName) &&
        Objects.equals(this.lastName, createCustomerRequest.lastName) &&
        Objects.equals(this.company, createCustomerRequest.company) &&
        Objects.equals(this.email, createCustomerRequest.email) &&
        Objects.equals(this.language, createCustomerRequest.language) &&
        Objects.equals(this.providerCustomerNumber, createCustomerRequest.providerCustomerNumber) &&
        Objects.equals(this.quota, createCustomerRequest.quota) &&
        Objects.equals(this.numberOfUsers, createCustomerRequest.numberOfUsers) &&
        Objects.equals(this.mustChangeUserName, createCustomerRequest.mustChangeUserName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContractType, trialDays, salutation, gender, title, firstName, lastName, company, email, language, providerCustomerNumber, quota, numberOfUsers, mustChangeUserName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCustomerRequest {\n");
    
    sb.append("    customerContractType: ").append(toIndentedString(customerContractType)).append("\n");
    sb.append("    trialDays: ").append(toIndentedString(trialDays)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    providerCustomerNumber: ").append(toIndentedString(providerCustomerNumber)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    numberOfUsers: ").append(toIndentedString(numberOfUsers)).append("\n");
    sb.append("    mustChangeUserName: ").append(toIndentedString(mustChangeUserName)).append("\n");
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

