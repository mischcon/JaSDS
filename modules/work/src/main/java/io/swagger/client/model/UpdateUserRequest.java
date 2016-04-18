package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.UserAuthMethod;
import io.swagger.client.model.UserGlobalPermissions;
import io.swagger.client.model.UserRoom;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class UpdateUserRequest   {
  
  private UserGlobalPermissions globalPermissions = null;
  private List<UserAuthMethod> authMethods = new ArrayList<UserAuthMethod>();
  private Integer lockStatus = null;
  private Date expireAt = null;
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
  private List<Long> groups = new ArrayList<Long>();
  private List<UserRoom> rooms = new ArrayList<UserRoom>();

  
  /**
   * User global permissions
   **/
  public UpdateUserRequest globalPermissions(UserGlobalPermissions globalPermissions) {
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
  public UpdateUserRequest authMethods(List<UserAuthMethod> authMethods) {
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
   * Lock status: 0 - Locked, 1 - Web access allowed, 2 - Web and mobile access allowed
   **/
  public UpdateUserRequest lockStatus(Integer lockStatus) {
    this.lockStatus = lockStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lock status: 0 - Locked, 1 - Web access allowed, 2 - Web and mobile access allowed")
  @JsonProperty("lockStatus")
  public Integer getLockStatus() {
    return lockStatus;
  }
  public void setLockStatus(Integer lockStatus) {
    this.lockStatus = lockStatus;
  }


  /**
   * Account expiration date (2015-12-31T23:59:00). Max year is limited to 9999. <b>For a user with Manage Dataspace right, no expire date can be set</b>
   **/
  public UpdateUserRequest expireAt(Date expireAt) {
    this.expireAt = expireAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Account expiration date (2015-12-31T23:59:00). Max year is limited to 9999. <b>For a user with Manage Dataspace right, no expire date can be set</b>")
  @JsonProperty("expireAt")
  public Date getExpireAt() {
    return expireAt;
  }
  public void setExpireAt(Date expireAt) {
    this.expireAt = expireAt;
  }


  /**
   * Email [NOT USED]
   **/
  public UpdateUserRequest email(String email) {
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
  public UpdateUserRequest title(String title) {
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
  public UpdateUserRequest salutation(String salutation) {
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
  public UpdateUserRequest gender(GenderEnum gender) {
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
  public UpdateUserRequest firstName(String firstName) {
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
  public UpdateUserRequest lastName(String lastName) {
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
   * Assigned group Ids. If set to null, the current user groups will not be affected.
   **/
  public UpdateUserRequest groups(List<Long> groups) {
    this.groups = groups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Assigned group Ids. If set to null, the current user groups will not be affected.")
  @JsonProperty("groups")
  public List<Long> getGroups() {
    return groups;
  }
  public void setGroups(List<Long> groups) {
    this.groups = groups;
  }


  /**
   * Assigned rooms. If set to null, the current user teams will not be affected.
   **/
  public UpdateUserRequest rooms(List<UserRoom> rooms) {
    this.rooms = rooms;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Assigned rooms. If set to null, the current user teams will not be affected.")
  @JsonProperty("rooms")
  public List<UserRoom> getRooms() {
    return rooms;
  }
  public void setRooms(List<UserRoom> rooms) {
    this.rooms = rooms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserRequest updateUserRequest = (UpdateUserRequest) o;
    return Objects.equals(this.globalPermissions, updateUserRequest.globalPermissions) &&
        Objects.equals(this.authMethods, updateUserRequest.authMethods) &&
        Objects.equals(this.lockStatus, updateUserRequest.lockStatus) &&
        Objects.equals(this.expireAt, updateUserRequest.expireAt) &&
        Objects.equals(this.email, updateUserRequest.email) &&
        Objects.equals(this.title, updateUserRequest.title) &&
        Objects.equals(this.salutation, updateUserRequest.salutation) &&
        Objects.equals(this.gender, updateUserRequest.gender) &&
        Objects.equals(this.firstName, updateUserRequest.firstName) &&
        Objects.equals(this.lastName, updateUserRequest.lastName) &&
        Objects.equals(this.groups, updateUserRequest.groups) &&
        Objects.equals(this.rooms, updateUserRequest.rooms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(globalPermissions, authMethods, lockStatus, expireAt, email, title, salutation, gender, firstName, lastName, groups, rooms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserRequest {\n");
    
    sb.append("    globalPermissions: ").append(toIndentedString(globalPermissions)).append("\n");
    sb.append("    authMethods: ").append(toIndentedString(authMethods)).append("\n");
    sb.append("    lockStatus: ").append(toIndentedString(lockStatus)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    rooms: ").append(toIndentedString(rooms)).append("\n");
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

