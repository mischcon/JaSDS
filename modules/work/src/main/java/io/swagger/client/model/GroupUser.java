package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class GroupUser   {
  
  private Long id = null;
  private Boolean isMember = null;
  private String login = null;
  private String email = null;
  private String displayName = null;

  
  /**
   * User ID
   **/
  public GroupUser id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User ID")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * Is member
   **/
  public GroupUser isMember(Boolean isMember) {
    this.isMember = isMember;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Is member")
  @JsonProperty("isMember")
  public Boolean getIsMember() {
    return isMember;
  }
  public void setIsMember(Boolean isMember) {
    this.isMember = isMember;
  }


  /**
   * Login name
   **/
  public GroupUser login(String login) {
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
  public GroupUser email(String email) {
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
   * Display name
   **/
  public GroupUser displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Display name")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupUser groupUser = (GroupUser) o;
    return Objects.equals(this.id, groupUser.id) &&
        Objects.equals(this.isMember, groupUser.isMember) &&
        Objects.equals(this.login, groupUser.login) &&
        Objects.equals(this.email, groupUser.email) &&
        Objects.equals(this.displayName, groupUser.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isMember, login, email, displayName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupUser {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isMember: ").append(toIndentedString(isMember)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

