package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.PublicKeyContainer;
import io.swagger.client.model.UserAttributes;
import io.swagger.client.model.UserAuthMethod;
import io.swagger.client.model.UserGlobalPermissions;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class UserData   {
  
  private Long id = null;
  private Boolean isEncryptionEnabled = null;
  private Boolean hasManageableRooms = null;
  private UserGlobalPermissions globalPermissions = null;
  private List<UserAuthMethod> authMethods = new ArrayList<UserAuthMethod>();
  private Integer lockStatus = null;
  private Date expireAt = null;
  private String login = null;
  private String email = null;
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
  private PublicKeyContainer publicKeyContainer = null;
  private UserAttributes userAttributes = null;

  
  /**
   * Unique identifier for the user
   **/
  public UserData id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique identifier for the user")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * User has generated private key. Possible if <b>Triple-Crypt&trade; Technology</b> is active.
   **/
  public UserData isEncryptionEnabled(Boolean isEncryptionEnabled) {
    this.isEncryptionEnabled = isEncryptionEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User has generated private key. Possible if <b>Triple-Crypt&trade; Technology</b> is active.")
  @JsonProperty("isEncryptionEnabled")
  public Boolean getIsEncryptionEnabled() {
    return isEncryptionEnabled;
  }
  public void setIsEncryptionEnabled(Boolean isEncryptionEnabled) {
    this.isEncryptionEnabled = isEncryptionEnabled;
  }


  /**
   * User has manageable rooms
   **/
  public UserData hasManageableRooms(Boolean hasManageableRooms) {
    this.hasManageableRooms = hasManageableRooms;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User has manageable rooms")
  @JsonProperty("hasManageableRooms")
  public Boolean getHasManageableRooms() {
    return hasManageableRooms;
  }
  public void setHasManageableRooms(Boolean hasManageableRooms) {
    this.hasManageableRooms = hasManageableRooms;
  }


  /**
   * User global permissions
   **/
  public UserData globalPermissions(UserGlobalPermissions globalPermissions) {
    this.globalPermissions = globalPermissions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User global permissions")
  @JsonProperty("globalPermissions")
  public UserGlobalPermissions getGlobalPermissions() {
    return globalPermissions;
  }
  public void setGlobalPermissions(UserGlobalPermissions globalPermissions) {
    this.globalPermissions = globalPermissions;
  }


  /**
   * Authentication methods
   **/
  public UserData authMethods(List<UserAuthMethod> authMethods) {
    this.authMethods = authMethods;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Authentication methods")
  @JsonProperty("authMethods")
  public List<UserAuthMethod> getAuthMethods() {
    return authMethods;
  }
  public void setAuthMethods(List<UserAuthMethod> authMethods) {
    this.authMethods = authMethods;
  }


  /**
   * Lock status: 0 - Locked, 1 - Web access allowed, 2 - Web and mobile access allowed
   **/
  public UserData lockStatus(Integer lockStatus) {
    this.lockStatus = lockStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Lock status: 0 - Locked, 1 - Web access allowed, 2 - Web and mobile access allowed")
  @JsonProperty("lockStatus")
  public Integer getLockStatus() {
    return lockStatus;
  }
  public void setLockStatus(Integer lockStatus) {
    this.lockStatus = lockStatus;
  }


  /**
   * Account expiration date (2015-12-31T23:59:00)
   **/
  public UserData expireAt(Date expireAt) {
    this.expireAt = expireAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Account expiration date (2015-12-31T23:59:00)")
  @JsonProperty("expireAt")
  public Date getExpireAt() {
    return expireAt;
  }
  public void setExpireAt(Date expireAt) {
    this.expireAt = expireAt;
  }


  /**
   * Login name
   **/
  public UserData login(String login) {
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
   * Email
   **/
  public UserData email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Email")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * Job title
   **/
  public UserData title(String title) {
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
  public UserData salutation(String salutation) {
    this.salutation = salutation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Salutation")
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
  public UserData gender(GenderEnum gender) {
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
  public UserData firstName(String firstName) {
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
  public UserData lastName(String lastName) {
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
   **/
  public UserData publicKeyContainer(PublicKeyContainer publicKeyContainer) {
    this.publicKeyContainer = publicKeyContainer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("publicKeyContainer")
  public PublicKeyContainer getPublicKeyContainer() {
    return publicKeyContainer;
  }
  public void setPublicKeyContainer(PublicKeyContainer publicKeyContainer) {
    this.publicKeyContainer = publicKeyContainer;
  }


  /**
   * Custom user attributes; visible with user manage right
   **/
  public UserData userAttributes(UserAttributes userAttributes) {
    this.userAttributes = userAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Custom user attributes; visible with user manage right")
  @JsonProperty("userAttributes")
  public UserAttributes getUserAttributes() {
    return userAttributes;
  }
  public void setUserAttributes(UserAttributes userAttributes) {
    this.userAttributes = userAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserData userData = (UserData) o;
    return Objects.equals(this.id, userData.id) &&
        Objects.equals(this.isEncryptionEnabled, userData.isEncryptionEnabled) &&
        Objects.equals(this.hasManageableRooms, userData.hasManageableRooms) &&
        Objects.equals(this.globalPermissions, userData.globalPermissions) &&
        Objects.equals(this.authMethods, userData.authMethods) &&
        Objects.equals(this.lockStatus, userData.lockStatus) &&
        Objects.equals(this.expireAt, userData.expireAt) &&
        Objects.equals(this.login, userData.login) &&
        Objects.equals(this.email, userData.email) &&
        Objects.equals(this.title, userData.title) &&
        Objects.equals(this.salutation, userData.salutation) &&
        Objects.equals(this.gender, userData.gender) &&
        Objects.equals(this.firstName, userData.firstName) &&
        Objects.equals(this.lastName, userData.lastName) &&
        Objects.equals(this.publicKeyContainer, userData.publicKeyContainer) &&
        Objects.equals(this.userAttributes, userData.userAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isEncryptionEnabled, hasManageableRooms, globalPermissions, authMethods, lockStatus, expireAt, login, email, title, salutation, gender, firstName, lastName, publicKeyContainer, userAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isEncryptionEnabled: ").append(toIndentedString(isEncryptionEnabled)).append("\n");
    sb.append("    hasManageableRooms: ").append(toIndentedString(hasManageableRooms)).append("\n");
    sb.append("    globalPermissions: ").append(toIndentedString(globalPermissions)).append("\n");
    sb.append("    authMethods: ").append(toIndentedString(authMethods)).append("\n");
    sb.append("    lockStatus: ").append(toIndentedString(lockStatus)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    publicKeyContainer: ").append(toIndentedString(publicKeyContainer)).append("\n");
    sb.append("    userAttributes: ").append(toIndentedString(userAttributes)).append("\n");
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

