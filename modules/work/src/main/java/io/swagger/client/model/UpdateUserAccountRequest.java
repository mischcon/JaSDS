package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.UserAuthMethod;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class UpdateUserAccountRequest   {
  
  private List<UserAuthMethod> authMethods = new ArrayList<UserAuthMethod>();
  private String email = null;
  private String login = null;
  private String title = null;
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
  private String firstName = null;
  private String lastName = null;
  private Boolean acceptEULA = null;

  
  /**
   * Authentication methods
   **/
  public UpdateUserAccountRequest authMethods(List<UserAuthMethod> authMethods) {
    this.authMethods = authMethods;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Authentication methods")
  @JsonProperty("authMethods")
  public List<UserAuthMethod> getAuthMethods() {
    return authMethods;
  }
  public void setAuthMethods(List<UserAuthMethod> authMethods) {
    this.authMethods = authMethods;
  }


  /**
   * Email [NOT USED] 
   **/
  public UpdateUserAccountRequest email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email [NOT USED] ")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * User Login Name
   **/
  public UpdateUserAccountRequest login(String login) {
    this.login = login;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User Login Name")
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }


  /**
   * Job title
   **/
  public UpdateUserAccountRequest title(String title) {
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
   * Salutation <span style=\"color: red; font-weight: bold;\">[DEPRECATED]</span>, please use gender instead!
   **/
  public UpdateUserAccountRequest salutation(String salutation) {
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
  public UpdateUserAccountRequest gender(GenderEnum gender) {
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
   * First name
   **/
  public UpdateUserAccountRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "First name")
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
  public UpdateUserAccountRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Last name")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  /**
   * Accept EULA. Present, if EULA is system global active. See: Get system settings -> eula_active. If accepted can not be undone.
   **/
  public UpdateUserAccountRequest acceptEULA(Boolean acceptEULA) {
    this.acceptEULA = acceptEULA;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Accept EULA. Present, if EULA is system global active. See: Get system settings -> eula_active. If accepted can not be undone.")
  @JsonProperty("acceptEULA")
  public Boolean getAcceptEULA() {
    return acceptEULA;
  }
  public void setAcceptEULA(Boolean acceptEULA) {
    this.acceptEULA = acceptEULA;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserAccountRequest updateUserAccountRequest = (UpdateUserAccountRequest) o;
    return Objects.equals(this.authMethods, updateUserAccountRequest.authMethods) &&
        Objects.equals(this.email, updateUserAccountRequest.email) &&
        Objects.equals(this.login, updateUserAccountRequest.login) &&
        Objects.equals(this.title, updateUserAccountRequest.title) &&
        Objects.equals(this.salutation, updateUserAccountRequest.salutation) &&
        Objects.equals(this.gender, updateUserAccountRequest.gender) &&
        Objects.equals(this.firstName, updateUserAccountRequest.firstName) &&
        Objects.equals(this.lastName, updateUserAccountRequest.lastName) &&
        Objects.equals(this.acceptEULA, updateUserAccountRequest.acceptEULA);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authMethods, email, login, title, salutation, gender, firstName, lastName, acceptEULA);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserAccountRequest {\n");
    
    sb.append("    authMethods: ").append(toIndentedString(authMethods)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    acceptEULA: ").append(toIndentedString(acceptEULA)).append("\n");
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

