package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class RoomPermissions   {
  
  private Boolean read = null;
  private Boolean create = null;
  private Boolean change = null;
  private Boolean manage = null;
  private Boolean encrypt = null;
  private Boolean share = null;

  
  /**
   * User can read room
   **/
  public RoomPermissions read(Boolean read) {
    this.read = read;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User can read room")
  @JsonProperty("read")
  public Boolean getRead() {
    return read;
  }
  public void setRead(Boolean read) {
    this.read = read;
  }


  /**
   * [read] + User can create folders and upload files
   **/
  public RoomPermissions create(Boolean create) {
    this.create = create;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "[read] + User can create folders and upload files")
  @JsonProperty("create")
  public Boolean getCreate() {
    return create;
  }
  public void setCreate(Boolean create) {
    this.create = create;
  }


  /**
   * [read][create] + User can modify and delete folders and files
   **/
  public RoomPermissions change(Boolean change) {
    this.change = change;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "[read][create] + User can modify and delete folders and files")
  @JsonProperty("change")
  public Boolean getChange() {
    return change;
  }
  public void setChange(Boolean change) {
    this.change = change;
  }


  /**
   * [read][create][change] + User can manage room users and subrooms
   **/
  public RoomPermissions manage(Boolean manage) {
    this.manage = manage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "[read][create][change] + User can manage room users and subrooms")
  @JsonProperty("manage")
  public Boolean getManage() {
    return manage;
  }
  public void setManage(Boolean manage) {
    this.manage = manage;
  }


  /**
   *  [DEPRECATED] User can encrypt dataroom (for top-level rooms only)
   **/
  public RoomPermissions encrypt(Boolean encrypt) {
    this.encrypt = encrypt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = " [DEPRECATED] User can encrypt dataroom (for top-level rooms only)")
  @JsonProperty("encrypt")
  public Boolean getEncrypt() {
    return encrypt;
  }
  public void setEncrypt(Boolean encrypt) {
    this.encrypt = encrypt;
  }


  /**
   * User can create public shares
   **/
  public RoomPermissions share(Boolean share) {
    this.share = share;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User can create public shares")
  @JsonProperty("share")
  public Boolean getShare() {
    return share;
  }
  public void setShare(Boolean share) {
    this.share = share;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomPermissions roomPermissions = (RoomPermissions) o;
    return Objects.equals(this.read, roomPermissions.read) &&
        Objects.equals(this.create, roomPermissions.create) &&
        Objects.equals(this.change, roomPermissions.change) &&
        Objects.equals(this.manage, roomPermissions.manage) &&
        Objects.equals(this.encrypt, roomPermissions.encrypt) &&
        Objects.equals(this.share, roomPermissions.share);
  }

  @Override
  public int hashCode() {
    return Objects.hash(read, create, change, manage, encrypt, share);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomPermissions {\n");
    
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    manage: ").append(toIndentedString(manage)).append("\n");
    sb.append("    encrypt: ").append(toIndentedString(encrypt)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
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

