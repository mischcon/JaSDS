package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class ResetPasswordTokenValidateResponse   {
  
  private String title = null;
  private String salutation = null;
  private String firstName = null;
  private String gender = null;
  private String lastName = null;
  private Boolean allowSystemGlobalWeakPassword = null;

  
  /**
   * Job title
   **/
  public ResetPasswordTokenValidateResponse title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Job title")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Salutation
   **/
  public ResetPasswordTokenValidateResponse salutation(String salutation) {
    this.salutation = salutation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Salutation")
  @JsonProperty("salutation")
  public String getSalutation() {
    return salutation;
  }
  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }


  /**
   * First name
   **/
  public ResetPasswordTokenValidateResponse firstName(String firstName) {
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
   * Gender key, one of [m|f|n]
   **/
  public ResetPasswordTokenValidateResponse gender(String gender) {
    this.gender = gender;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Gender key, one of [m|f|n]")
  @JsonProperty("gender")
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }


  /**
   * Last name
   **/
  public ResetPasswordTokenValidateResponse lastName(String lastName) {
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
   * Allow weak password
   **/
  public ResetPasswordTokenValidateResponse allowSystemGlobalWeakPassword(Boolean allowSystemGlobalWeakPassword) {
    this.allowSystemGlobalWeakPassword = allowSystemGlobalWeakPassword;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Allow weak password")
  @JsonProperty("allowSystemGlobalWeakPassword")
  public Boolean getAllowSystemGlobalWeakPassword() {
    return allowSystemGlobalWeakPassword;
  }
  public void setAllowSystemGlobalWeakPassword(Boolean allowSystemGlobalWeakPassword) {
    this.allowSystemGlobalWeakPassword = allowSystemGlobalWeakPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResetPasswordTokenValidateResponse resetPasswordTokenValidateResponse = (ResetPasswordTokenValidateResponse) o;
    return Objects.equals(this.title, resetPasswordTokenValidateResponse.title) &&
        Objects.equals(this.salutation, resetPasswordTokenValidateResponse.salutation) &&
        Objects.equals(this.firstName, resetPasswordTokenValidateResponse.firstName) &&
        Objects.equals(this.gender, resetPasswordTokenValidateResponse.gender) &&
        Objects.equals(this.lastName, resetPasswordTokenValidateResponse.lastName) &&
        Objects.equals(this.allowSystemGlobalWeakPassword, resetPasswordTokenValidateResponse.allowSystemGlobalWeakPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, salutation, firstName, gender, lastName, allowSystemGlobalWeakPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetPasswordTokenValidateResponse {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    allowSystemGlobalWeakPassword: ").append(toIndentedString(allowSystemGlobalWeakPassword)).append("\n");
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

