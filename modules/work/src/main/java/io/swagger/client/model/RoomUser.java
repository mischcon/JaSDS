package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.PublicKeyContainer;
import io.swagger.client.model.RoomPermissions;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class RoomUser   {
  
  private Long id = null;
  private Boolean isGranted = null;
  private String login = null;
  private String email = null;
  private String displayName = null;
  private RoomPermissions permissions = null;
  private PublicKeyContainer publicKeyContainer = null;

  
  /**
   * User Id
   **/
  public RoomUser id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User Id")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * Is user granted room permissions
   **/
  public RoomUser isGranted(Boolean isGranted) {
    this.isGranted = isGranted;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Is user granted room permissions")
  @JsonProperty("is_granted")
  public Boolean getIsGranted() {
    return isGranted;
  }
  public void setIsGranted(Boolean isGranted) {
    this.isGranted = isGranted;
  }


  /**
   * Login name
   **/
  public RoomUser login(String login) {
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
  public RoomUser email(String email) {
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
   * User display name
   **/
  public RoomUser displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User display name")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  /**
   * User permissions. Empty for not granted users
   **/
  public RoomUser permissions(RoomPermissions permissions) {
    this.permissions = permissions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User permissions. Empty for not granted users")
  @JsonProperty("permissions")
  public RoomPermissions getPermissions() {
    return permissions;
  }
  public void setPermissions(RoomPermissions permissions) {
    this.permissions = permissions;
  }


  /**
   * User Public Key. Only if Room is encrypted
   **/
  public RoomUser publicKeyContainer(PublicKeyContainer publicKeyContainer) {
    this.publicKeyContainer = publicKeyContainer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User Public Key. Only if Room is encrypted")
  @JsonProperty("publicKeyContainer")
  public PublicKeyContainer getPublicKeyContainer() {
    return publicKeyContainer;
  }
  public void setPublicKeyContainer(PublicKeyContainer publicKeyContainer) {
    this.publicKeyContainer = publicKeyContainer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomUser roomUser = (RoomUser) o;
    return Objects.equals(this.id, roomUser.id) &&
        Objects.equals(this.isGranted, roomUser.isGranted) &&
        Objects.equals(this.login, roomUser.login) &&
        Objects.equals(this.email, roomUser.email) &&
        Objects.equals(this.displayName, roomUser.displayName) &&
        Objects.equals(this.permissions, roomUser.permissions) &&
        Objects.equals(this.publicKeyContainer, roomUser.publicKeyContainer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isGranted, login, email, displayName, permissions, publicKeyContainer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomUser {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isGranted: ").append(toIndentedString(isGranted)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    publicKeyContainer: ").append(toIndentedString(publicKeyContainer)).append("\n");
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

