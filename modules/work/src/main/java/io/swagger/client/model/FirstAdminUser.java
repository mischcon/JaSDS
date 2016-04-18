package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class FirstAdminUser   {
  
  private String login = null;
  private Boolean needsToChangeUserName = null;
  private String password = null;
  private String title = null;
  private String firstName = null;
  private String lastName = null;


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
  private String language = null;
  private Boolean notifyUser = null;

  
  /**
   * Login name
   **/
  public FirstAdminUser login(String login) {
    this.login = login;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Login name")
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }


  /**
   * If true, the user must change the userName at the first login
   **/
  public FirstAdminUser needsToChangeUserName(Boolean needsToChangeUserName) {
    this.needsToChangeUserName = needsToChangeUserName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, the user must change the userName at the first login")
  @JsonProperty("needsToChangeUserName")
  public Boolean getNeedsToChangeUserName() {
    return needsToChangeUserName;
  }
  public void setNeedsToChangeUserName(Boolean needsToChangeUserName) {
    this.needsToChangeUserName = needsToChangeUserName;
  }


  /**
   * An initial password may be preset
   **/
  public FirstAdminUser password(String password) {
    this.password = password;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An initial password may be preset")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }


  /**
   * Job title
   **/
  public FirstAdminUser title(String title) {
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
   * First name
   **/
  public FirstAdminUser firstName(String firstName) {
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
  public FirstAdminUser lastName(String lastName) {
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
   * Gender key, one of [m|f|n]
   **/
  public FirstAdminUser gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Gender key, one of [m|f|n]")
  @JsonProperty("gender")
  public GenderEnum getGender() {
    return gender;
  }
  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }


  /**
   * Language ID or ISO 639-1 code
   **/
  public FirstAdminUser language(String language) {
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
   * Notify user about his new account. (default: true)
   **/
  public FirstAdminUser notifyUser(Boolean notifyUser) {
    this.notifyUser = notifyUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Notify user about his new account. (default: true)")
  @JsonProperty("notifyUser")
  public Boolean getNotifyUser() {
    return notifyUser;
  }
  public void setNotifyUser(Boolean notifyUser) {
    this.notifyUser = notifyUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirstAdminUser firstAdminUser = (FirstAdminUser) o;
    return Objects.equals(this.login, firstAdminUser.login) &&
        Objects.equals(this.needsToChangeUserName, firstAdminUser.needsToChangeUserName) &&
        Objects.equals(this.password, firstAdminUser.password) &&
        Objects.equals(this.title, firstAdminUser.title) &&
        Objects.equals(this.firstName, firstAdminUser.firstName) &&
        Objects.equals(this.lastName, firstAdminUser.lastName) &&
        Objects.equals(this.gender, firstAdminUser.gender) &&
        Objects.equals(this.language, firstAdminUser.language) &&
        Objects.equals(this.notifyUser, firstAdminUser.notifyUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(login, needsToChangeUserName, password, title, firstName, lastName, gender, language, notifyUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirstAdminUser {\n");
    
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    needsToChangeUserName: ").append(toIndentedString(needsToChangeUserName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    notifyUser: ").append(toIndentedString(notifyUser)).append("\n");
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

