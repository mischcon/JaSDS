package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class LoginRequest   {
  
  private String login = null;
  private String password = null;
  private String token = null;
  private String language = null;
  private String authType = null;

  
  /**
   * User login name
   **/
  public LoginRequest login(String login) {
    this.login = login;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User login name")
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }


  /**
   * Password
   **/
  public LoginRequest password(String password) {
    this.password = password;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Password")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }


  /**
   * Token
   **/
  public LoginRequest token(String token) {
    this.token = token;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Token")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }


  /**
   * Language ID or ISO 639-1 code
   **/
  public LoginRequest language(String language) {
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
   * Authentication type code
   **/
  public LoginRequest authType(String authType) {
    this.authType = authType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Authentication type code")
  @JsonProperty("authType")
  public String getAuthType() {
    return authType;
  }
  public void setAuthType(String authType) {
    this.authType = authType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginRequest loginRequest = (LoginRequest) o;
    return Objects.equals(this.login, loginRequest.login) &&
        Objects.equals(this.password, loginRequest.password) &&
        Objects.equals(this.token, loginRequest.token) &&
        Objects.equals(this.language, loginRequest.language) &&
        Objects.equals(this.authType, loginRequest.authType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(login, password, token, language, authType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginRequest {\n");
    
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
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

