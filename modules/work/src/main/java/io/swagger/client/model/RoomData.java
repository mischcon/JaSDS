package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.RoomData;
import io.swagger.client.model.RoomPermissions;
import io.swagger.client.model.UserInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class RoomData   {
  
  private Long id = null;
  private Boolean isGranted = null;


  public enum TypeEnum {
    ROOM("room");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type = null;
  private Long parentId = null;
  private String name = null;
  private Long size = null;
  private RoomPermissions permissions = null;
  private Integer cntAdmins = null;
  private Integer cntUsers = null;
  private Date createdAt = null;
  private UserInfo createdBy = null;
  private Date updatedAt = null;
  private UserInfo updatedBy = null;
  private Boolean isEncrypted = null;
  private Boolean hasRecycleBin = null;
  private Long quota = null;
  private Integer cntDownloadShares = null;
  private Integer cntUploadShares = null;
  private Boolean isFavorite = null;
  private List<RoomData> children = new ArrayList<RoomData>();

  
  /**
   * Room Id
   **/
  public RoomData id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Room Id")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * Is group granted room permissions
   **/
  public RoomData isGranted(Boolean isGranted) {
    this.isGranted = isGranted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Is group granted room permissions")
  @JsonProperty("is_granted")
  public Boolean getIsGranted() {
    return isGranted;
  }
  public void setIsGranted(Boolean isGranted) {
    this.isGranted = isGranted;
  }


  /**
   * Type is always 'room'
   **/
  public RoomData type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type is always 'room'")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Parent Room Id
   **/
  public RoomData parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Parent Room Id")
  @JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }
  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }


  /**
   * Name
   **/
  public RoomData name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Room size
   **/
  public RoomData size(Long size) {
    this.size = size;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Room size")
  @JsonProperty("size")
  public Long getSize() {
    return size;
  }
  public void setSize(Long size) {
    this.size = size;
  }


  /**
   * Group permissions
   **/
  public RoomData permissions(RoomPermissions permissions) {
    this.permissions = permissions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Group permissions")
  @JsonProperty("permissions")
  public RoomPermissions getPermissions() {
    return permissions;
  }
  public void setPermissions(RoomPermissions permissions) {
    this.permissions = permissions;
  }


  /**
   * Amount of admins
   **/
  public RoomData cntAdmins(Integer cntAdmins) {
    this.cntAdmins = cntAdmins;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Amount of admins")
  @JsonProperty("cntAdmins")
  public Integer getCntAdmins() {
    return cntAdmins;
  }
  public void setCntAdmins(Integer cntAdmins) {
    this.cntAdmins = cntAdmins;
  }


  /**
   * Amount of users
   **/
  public RoomData cntUsers(Integer cntUsers) {
    this.cntUsers = cntUsers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Amount of users")
  @JsonProperty("cntUsers")
  public Integer getCntUsers() {
    return cntUsers;
  }
  public void setCntUsers(Integer cntUsers) {
    this.cntUsers = cntUsers;
  }


  /**
   * Creation date (2015-12-31T23:59:00)
   **/
  public RoomData createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Creation date (2015-12-31T23:59:00)")
  @JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * Created by user info
   **/
  public RoomData createdBy(UserInfo createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Created by user info")
  @JsonProperty("createdBy")
  public UserInfo getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(UserInfo createdBy) {
    this.createdBy = createdBy;
  }


  /**
   * Modification date (2015-12-31T23:59:00)
   **/
  public RoomData updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Modification date (2015-12-31T23:59:00)")
  @JsonProperty("updatedAt")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }


  /**
   * Modified by user info
   **/
  public RoomData updatedBy(UserInfo updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Modified by user info")
  @JsonProperty("updatedBy")
  public UserInfo getUpdatedBy() {
    return updatedBy;
  }
  public void setUpdatedBy(UserInfo updatedBy) {
    this.updatedBy = updatedBy;
  }


  /**
   * Is encrypted
   **/
  public RoomData isEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Is encrypted")
  @JsonProperty("isEncrypted")
  public Boolean getIsEncrypted() {
    return isEncrypted;
  }
  public void setIsEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
  }


  /**
   * Is Recycle Bin activ
   **/
  public RoomData hasRecycleBin(Boolean hasRecycleBin) {
    this.hasRecycleBin = hasRecycleBin;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Is Recycle Bin activ")
  @JsonProperty("hasRecycleBin")
  public Boolean getHasRecycleBin() {
    return hasRecycleBin;
  }
  public void setHasRecycleBin(Boolean hasRecycleBin) {
    this.hasRecycleBin = hasRecycleBin;
  }


  /**
   * Quota in MB
   **/
  public RoomData quota(Long quota) {
    this.quota = quota;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quota in MB")
  @JsonProperty("quota")
  public Long getQuota() {
    return quota;
  }
  public void setQuota(Long quota) {
    this.quota = quota;
  }


  /**
   * Returns the number of download shares of this Node
   **/
  public RoomData cntDownloadShares(Integer cntDownloadShares) {
    this.cntDownloadShares = cntDownloadShares;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Returns the number of download shares of this Node")
  @JsonProperty("cntDownloadShares")
  public Integer getCntDownloadShares() {
    return cntDownloadShares;
  }
  public void setCntDownloadShares(Integer cntDownloadShares) {
    this.cntDownloadShares = cntDownloadShares;
  }


  /**
   * Returns the number of upload shares of this Node
   **/
  public RoomData cntUploadShares(Integer cntUploadShares) {
    this.cntUploadShares = cntUploadShares;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Returns the number of upload shares of this Node")
  @JsonProperty("cntUploadShares")
  public Integer getCntUploadShares() {
    return cntUploadShares;
  }
  public void setCntUploadShares(Integer cntUploadShares) {
    this.cntUploadShares = cntUploadShares;
  }


  /**
   * For Rooms and Folders: Node is marked as favorite
   **/
  public RoomData isFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "For Rooms and Folders: Node is marked as favorite")
  @JsonProperty("isFavorite")
  public Boolean getIsFavorite() {
    return isFavorite;
  }
  public void setIsFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
  }


  /**
   * List of Subrooms if exist.
   **/
  public RoomData children(List<RoomData> children) {
    this.children = children;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of Subrooms if exist.")
  @JsonProperty("children")
  public List<RoomData> getChildren() {
    return children;
  }
  public void setChildren(List<RoomData> children) {
    this.children = children;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomData roomData = (RoomData) o;
    return Objects.equals(this.id, roomData.id) &&
        Objects.equals(this.isGranted, roomData.isGranted) &&
        Objects.equals(this.type, roomData.type) &&
        Objects.equals(this.parentId, roomData.parentId) &&
        Objects.equals(this.name, roomData.name) &&
        Objects.equals(this.size, roomData.size) &&
        Objects.equals(this.permissions, roomData.permissions) &&
        Objects.equals(this.cntAdmins, roomData.cntAdmins) &&
        Objects.equals(this.cntUsers, roomData.cntUsers) &&
        Objects.equals(this.createdAt, roomData.createdAt) &&
        Objects.equals(this.createdBy, roomData.createdBy) &&
        Objects.equals(this.updatedAt, roomData.updatedAt) &&
        Objects.equals(this.updatedBy, roomData.updatedBy) &&
        Objects.equals(this.isEncrypted, roomData.isEncrypted) &&
        Objects.equals(this.hasRecycleBin, roomData.hasRecycleBin) &&
        Objects.equals(this.quota, roomData.quota) &&
        Objects.equals(this.cntDownloadShares, roomData.cntDownloadShares) &&
        Objects.equals(this.cntUploadShares, roomData.cntUploadShares) &&
        Objects.equals(this.isFavorite, roomData.isFavorite) &&
        Objects.equals(this.children, roomData.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isGranted, type, parentId, name, size, permissions, cntAdmins, cntUsers, createdAt, createdBy, updatedAt, updatedBy, isEncrypted, hasRecycleBin, quota, cntDownloadShares, cntUploadShares, isFavorite, children);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isGranted: ").append(toIndentedString(isGranted)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    cntAdmins: ").append(toIndentedString(cntAdmins)).append("\n");
    sb.append("    cntUsers: ").append(toIndentedString(cntUsers)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    isEncrypted: ").append(toIndentedString(isEncrypted)).append("\n");
    sb.append("    hasRecycleBin: ").append(toIndentedString(hasRecycleBin)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    cntDownloadShares: ").append(toIndentedString(cntDownloadShares)).append("\n");
    sb.append("    cntUploadShares: ").append(toIndentedString(cntUploadShares)).append("\n");
    sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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

