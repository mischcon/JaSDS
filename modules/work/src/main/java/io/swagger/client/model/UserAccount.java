package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CustomerData;
import io.swagger.client.model.UserAttributes;
import io.swagger.client.model.UserAuthMethod;
import io.swagger.client.model.UserGlobalPermissions;
import io.swagger.client.model.UserGroup;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class UserAccount   {
  
  private Long id = null;
  private CustomerData customer = null;
  private Boolean isEncryptionEnabled = null;
  private Boolean isInitialPasswordChanged = null;
  private Boolean needsToChangePassword = null;
  private Boolean needsToAcceptEULA = null;
  private Boolean needsToChangeUserName = null;
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
  private Date lastLoginSuccessAt = null;
  private String lastLoginSuccessIp = null;
  private Date lastLoginFailAt = null;
  private String lastLoginFailIp = null;
  private UserAttributes userAttributes = null;
  private List<UserGroup> userGroups = new ArrayList<UserGroup>();

  
  /**
   * Unique identifier for the user
   **/
  public UserAccount id(Long id) {
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
   * Customer data
   **/
  public UserAccount customer(CustomerData customer) {
    this.customer = customer;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Customer data")
  @JsonProperty("customer")
  public CustomerData getCustomer() {
    return customer;
  }
  public void setCustomer(CustomerData customer) {
    this.customer = customer;
  }


  /**
   * User has generated private key. Possible if <b>Triple-Crypt&trade; Technology</b> is active for this customer
   **/
  public UserAccount isEncryptionEnabled(Boolean isEncryptionEnabled) {
    this.isEncryptionEnabled = isEncryptionEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User has generated private key. Possible if <b>Triple-Crypt&trade; Technology</b> is active for this customer")
  @JsonProperty("isEncryptionEnabled")
  public Boolean getIsEncryptionEnabled() {
    return isEncryptionEnabled;
  }
  public void setIsEncryptionEnabled(Boolean isEncryptionEnabled) {
    this.isEncryptionEnabled = isEncryptionEnabled;
  }


  /**
   * User has changed the initial password [DEPRECATED] WILL BE REMOVED IN THE NEXT VERSION
   **/
  public UserAccount isInitialPasswordChanged(Boolean isInitialPasswordChanged) {
    this.isInitialPasswordChanged = isInitialPasswordChanged;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User has changed the initial password [DEPRECATED] WILL BE REMOVED IN THE NEXT VERSION")
  @JsonProperty("isInitialPasswordChanged")
  public Boolean getIsInitialPasswordChanged() {
    return isInitialPasswordChanged;
  }
  public void setIsInitialPasswordChanged(Boolean isInitialPasswordChanged) {
    this.isInitialPasswordChanged = isInitialPasswordChanged;
  }


  /**
   * User has changed the password
   **/
  public UserAccount needsToChangePassword(Boolean needsToChangePassword) {
    this.needsToChangePassword = needsToChangePassword;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User has changed the password")
  @JsonProperty("needsToChangePassword")
  public Boolean getNeedsToChangePassword() {
    return needsToChangePassword;
  }
  public void setNeedsToChangePassword(Boolean needsToChangePassword) {
    this.needsToChangePassword = needsToChangePassword;
  }


  /**
   * User has accepted EULA. Present, if EULA is system global active. See: Get system settings -> eula_active
   **/
  public UserAccount needsToAcceptEULA(Boolean needsToAcceptEULA) {
    this.needsToAcceptEULA = needsToAcceptEULA;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User has accepted EULA. Present, if EULA is system global active. See: Get system settings -> eula_active")
  @JsonProperty("needsToAcceptEULA")
  public Boolean getNeedsToAcceptEULA() {
    return needsToAcceptEULA;
  }
  public void setNeedsToAcceptEULA(Boolean needsToAcceptEULA) {
    this.needsToAcceptEULA = needsToAcceptEULA;
  }


  /**
   * User must change the user login name
   **/
  public UserAccount needsToChangeUserName(Boolean needsToChangeUserName) {
    this.needsToChangeUserName = needsToChangeUserName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User must change the user login name")
  @JsonProperty("needsToChangeUserName")
  public Boolean getNeedsToChangeUserName() {
    return needsToChangeUserName;
  }
  public void setNeedsToChangeUserName(Boolean needsToChangeUserName) {
    this.needsToChangeUserName = needsToChangeUserName;
  }


  /**
   * User has manageable rooms
   **/
  public UserAccount hasManageableRooms(Boolean hasManageableRooms) {
    this.hasManageableRooms = hasManageableRooms;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User has manageable rooms")
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
  public UserAccount globalPermissions(UserGlobalPermissions globalPermissions) {
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
  public UserAccount authMethods(List<UserAuthMethod> authMethods) {
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
  public UserAccount lockStatus(Integer lockStatus) {
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
  public UserAccount expireAt(Date expireAt) {
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
  public UserAccount login(String login) {
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
   * Email [NOT USED]
   **/
  public UserAccount email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email [NOT USED]")
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
  public UserAccount title(String title) {
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
  public UserAccount salutation(String salutation) {
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
  public UserAccount gender(GenderEnum gender) {
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
  public UserAccount firstName(String firstName) {
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
  public UserAccount lastName(String lastName) {
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
   * Last successful logon date (2015-12-31T23:59:00)
   **/
  public UserAccount lastLoginSuccessAt(Date lastLoginSuccessAt) {
    this.lastLoginSuccessAt = lastLoginSuccessAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Last successful logon date (2015-12-31T23:59:00)")
  @JsonProperty("lastLoginSuccessAt")
  public Date getLastLoginSuccessAt() {
    return lastLoginSuccessAt;
  }
  public void setLastLoginSuccessAt(Date lastLoginSuccessAt) {
    this.lastLoginSuccessAt = lastLoginSuccessAt;
  }


  /**
   * Last successful logon IP address
   **/
  public UserAccount lastLoginSuccessIp(String lastLoginSuccessIp) {
    this.lastLoginSuccessIp = lastLoginSuccessIp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Last successful logon IP address")
  @JsonProperty("lastLoginSuccessIp")
  public String getLastLoginSuccessIp() {
    return lastLoginSuccessIp;
  }
  public void setLastLoginSuccessIp(String lastLoginSuccessIp) {
    this.lastLoginSuccessIp = lastLoginSuccessIp;
  }


  /**
   * Last failed logon date (2015-12-31T23:59:00)
   **/
  public UserAccount lastLoginFailAt(Date lastLoginFailAt) {
    this.lastLoginFailAt = lastLoginFailAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Last failed logon date (2015-12-31T23:59:00)")
  @JsonProperty("lastLoginFailAt")
  public Date getLastLoginFailAt() {
    return lastLoginFailAt;
  }
  public void setLastLoginFailAt(Date lastLoginFailAt) {
    this.lastLoginFailAt = lastLoginFailAt;
  }


  /**
   * Last failed logon IP address
   **/
  public UserAccount lastLoginFailIp(String lastLoginFailIp) {
    this.lastLoginFailIp = lastLoginFailIp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Last failed logon IP address")
  @JsonProperty("lastLoginFailIp")
  public String getLastLoginFailIp() {
    return lastLoginFailIp;
  }
  public void setLastLoginFailIp(String lastLoginFailIp) {
    this.lastLoginFailIp = lastLoginFailIp;
  }


  /**
   * Custom user attributes; visible if more_info = true
   **/
  public UserAccount userAttributes(UserAttributes userAttributes) {
    this.userAttributes = userAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Custom user attributes; visible if more_info = true")
  @JsonProperty("userAttributes")
  public UserAttributes getUserAttributes() {
    return userAttributes;
  }
  public void setUserAttributes(UserAttributes userAttributes) {
    this.userAttributes = userAttributes;
  }


  /**
   * All groups the user is member of.
   **/
  public UserAccount userGroups(List<UserGroup> userGroups) {
    this.userGroups = userGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "All groups the user is member of.")
  @JsonProperty("userGroups")
  public List<UserGroup> getUserGroups() {
    return userGroups;
  }
  public void setUserGroups(List<UserGroup> userGroups) {
    this.userGroups = userGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAccount userAccount = (UserAccount) o;
    return Objects.equals(this.id, userAccount.id) &&
        Objects.equals(this.customer, userAccount.customer) &&
        Objects.equals(this.isEncryptionEnabled, userAccount.isEncryptionEnabled) &&
        Objects.equals(this.isInitialPasswordChanged, userAccount.isInitialPasswordChanged) &&
        Objects.equals(this.needsToChangePassword, userAccount.needsToChangePassword) &&
        Objects.equals(this.needsToAcceptEULA, userAccount.needsToAcceptEULA) &&
        Objects.equals(this.needsToChangeUserName, userAccount.needsToChangeUserName) &&
        Objects.equals(this.hasManageableRooms, userAccount.hasManageableRooms) &&
        Objects.equals(this.globalPermissions, userAccount.globalPermissions) &&
        Objects.equals(this.authMethods, userAccount.authMethods) &&
        Objects.equals(this.lockStatus, userAccount.lockStatus) &&
        Objects.equals(this.expireAt, userAccount.expireAt) &&
        Objects.equals(this.login, userAccount.login) &&
        Objects.equals(this.email, userAccount.email) &&
        Objects.equals(this.title, userAccount.title) &&
        Objects.equals(this.salutation, userAccount.salutation) &&
        Objects.equals(this.gender, userAccount.gender) &&
        Objects.equals(this.firstName, userAccount.firstName) &&
        Objects.equals(this.lastName, userAccount.lastName) &&
        Objects.equals(this.lastLoginSuccessAt, userAccount.lastLoginSuccessAt) &&
        Objects.equals(this.lastLoginSuccessIp, userAccount.lastLoginSuccessIp) &&
        Objects.equals(this.lastLoginFailAt, userAccount.lastLoginFailAt) &&
        Objects.equals(this.lastLoginFailIp, userAccount.lastLoginFailIp) &&
        Objects.equals(this.userAttributes, userAccount.userAttributes) &&
        Objects.equals(this.userGroups, userAccount.userGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customer, isEncryptionEnabled, isInitialPasswordChanged, needsToChangePassword, needsToAcceptEULA, needsToChangeUserName, hasManageableRooms, globalPermissions, authMethods, lockStatus, expireAt, login, email, title, salutation, gender, firstName, lastName, lastLoginSuccessAt, lastLoginSuccessIp, lastLoginFailAt, lastLoginFailIp, userAttributes, userGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAccount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    isEncryptionEnabled: ").append(toIndentedString(isEncryptionEnabled)).append("\n");
    sb.append("    isInitialPasswordChanged: ").append(toIndentedString(isInitialPasswordChanged)).append("\n");
    sb.append("    needsToChangePassword: ").append(toIndentedString(needsToChangePassword)).append("\n");
    sb.append("    needsToAcceptEULA: ").append(toIndentedString(needsToAcceptEULA)).append("\n");
    sb.append("    needsToChangeUserName: ").append(toIndentedString(needsToChangeUserName)).append("\n");
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
    sb.append("    lastLoginSuccessAt: ").append(toIndentedString(lastLoginSuccessAt)).append("\n");
    sb.append("    lastLoginSuccessIp: ").append(toIndentedString(lastLoginSuccessIp)).append("\n");
    sb.append("    lastLoginFailAt: ").append(toIndentedString(lastLoginFailAt)).append("\n");
    sb.append("    lastLoginFailIp: ").append(toIndentedString(lastLoginFailIp)).append("\n");
    sb.append("    userAttributes: ").append(toIndentedString(userAttributes)).append("\n");
    sb.append("    userGroups: ").append(toIndentedString(userGroups)).append("\n");
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

