package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.EncryptionInfo;
import io.swagger.client.model.NodeId;
import io.swagger.client.model.RoomPermissions;
import io.swagger.client.model.UserInfo;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class FolderData   {
  
  private Long id = null;


  public enum TypeEnum {
    FOLDER("folder");

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
  private NodeId parent = null;
  private String name = null;
  private Long size = null;
  private RoomPermissions permissions = null;
  private Date createdAt = null;
  private UserInfo createdBy = null;
  private Date updatedAt = null;
  private UserInfo updatedBy = null;
  private Integer cntShares = null;
  private Integer cntChildren = null;
  private Boolean isEncrypted = null;
  private Integer cntDownloadShares = null;
  private Integer cntUploadShares = null;
  private Boolean isFavorite = null;
  private EncryptionInfo encryptionInfo = null;

  
  /**
   * Folder ID.
   **/
  public FolderData id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Folder ID.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * Type is always 'folder'
   **/
  public FolderData type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type is always 'folder'")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Parent node Id
   **/
  public FolderData parent(NodeId parent) {
    this.parent = parent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Parent node Id")
  @JsonProperty("parent")
  public NodeId getParent() {
    return parent;
  }
  public void setParent(NodeId parent) {
    this.parent = parent;
  }


  /**
   * Name
   **/
  public FolderData name(String name) {
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
   * Folder size
   **/
  public FolderData size(Long size) {
    this.size = size;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Folder size")
  @JsonProperty("size")
  public Long getSize() {
    return size;
  }
  public void setSize(Long size) {
    this.size = size;
  }


  /**
   * User permissions: Aggregated user permissions (all group and directly granted permissions)
   **/
  public FolderData permissions(RoomPermissions permissions) {
    this.permissions = permissions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User permissions: Aggregated user permissions (all group and directly granted permissions)")
  @JsonProperty("permissions")
  public RoomPermissions getPermissions() {
    return permissions;
  }
  public void setPermissions(RoomPermissions permissions) {
    this.permissions = permissions;
  }


  /**
   * Creation date (2015-12-31T23:59:00)
   **/
  public FolderData createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Creation date (2015-12-31T23:59:00)")
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
  public FolderData createdBy(UserInfo createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Created by user info")
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
  public FolderData updatedAt(Date updatedAt) {
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
  public FolderData updatedBy(UserInfo updatedBy) {
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
   * Amount of shares <span style=\"color: red; font-weight: bold;\">[DEPRECATED]</span>
   **/
  public FolderData cntShares(Integer cntShares) {
    this.cntShares = cntShares;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Amount of shares <span style=\"color: red; font-weight: bold;\">[DEPRECATED]</span>")
  @JsonProperty("cntShares")
  public Integer getCntShares() {
    return cntShares;
  }
  public void setCntShares(Integer cntShares) {
    this.cntShares = cntShares;
  }


  /**
   * Amount of direct children
   **/
  public FolderData cntChildren(Integer cntChildren) {
    this.cntChildren = cntChildren;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Amount of direct children")
  @JsonProperty("cntChildren")
  public Integer getCntChildren() {
    return cntChildren;
  }
  public void setCntChildren(Integer cntChildren) {
    this.cntChildren = cntChildren;
  }


  /**
   * Is encrypted
   **/
  public FolderData isEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Is encrypted")
  @JsonProperty("isEncrypted")
  public Boolean getIsEncrypted() {
    return isEncrypted;
  }
  public void setIsEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
  }


  /**
   * Returns the number of download shares of this Node
   **/
  public FolderData cntDownloadShares(Integer cntDownloadShares) {
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
  public FolderData cntUploadShares(Integer cntUploadShares) {
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
  public FolderData isFavorite(Boolean isFavorite) {
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
   * encryption info
   **/
  public FolderData encryptionInfo(EncryptionInfo encryptionInfo) {
    this.encryptionInfo = encryptionInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "encryption info")
  @JsonProperty("encryptionInfo")
  public EncryptionInfo getEncryptionInfo() {
    return encryptionInfo;
  }
  public void setEncryptionInfo(EncryptionInfo encryptionInfo) {
    this.encryptionInfo = encryptionInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FolderData folderData = (FolderData) o;
    return Objects.equals(this.id, folderData.id) &&
        Objects.equals(this.type, folderData.type) &&
        Objects.equals(this.parent, folderData.parent) &&
        Objects.equals(this.name, folderData.name) &&
        Objects.equals(this.size, folderData.size) &&
        Objects.equals(this.permissions, folderData.permissions) &&
        Objects.equals(this.createdAt, folderData.createdAt) &&
        Objects.equals(this.createdBy, folderData.createdBy) &&
        Objects.equals(this.updatedAt, folderData.updatedAt) &&
        Objects.equals(this.updatedBy, folderData.updatedBy) &&
        Objects.equals(this.cntShares, folderData.cntShares) &&
        Objects.equals(this.cntChildren, folderData.cntChildren) &&
        Objects.equals(this.isEncrypted, folderData.isEncrypted) &&
        Objects.equals(this.cntDownloadShares, folderData.cntDownloadShares) &&
        Objects.equals(this.cntUploadShares, folderData.cntUploadShares) &&
        Objects.equals(this.isFavorite, folderData.isFavorite) &&
        Objects.equals(this.encryptionInfo, folderData.encryptionInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, parent, name, size, permissions, createdAt, createdBy, updatedAt, updatedBy, cntShares, cntChildren, isEncrypted, cntDownloadShares, cntUploadShares, isFavorite, encryptionInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FolderData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    cntShares: ").append(toIndentedString(cntShares)).append("\n");
    sb.append("    cntChildren: ").append(toIndentedString(cntChildren)).append("\n");
    sb.append("    isEncrypted: ").append(toIndentedString(isEncrypted)).append("\n");
    sb.append("    cntDownloadShares: ").append(toIndentedString(cntDownloadShares)).append("\n");
    sb.append("    cntUploadShares: ").append(toIndentedString(cntUploadShares)).append("\n");
    sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
    sb.append("    encryptionInfo: ").append(toIndentedString(encryptionInfo)).append("\n");
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

