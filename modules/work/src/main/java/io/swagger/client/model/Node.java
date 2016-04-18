package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.EncryptionInfo;
import io.swagger.client.model.Node;
import io.swagger.client.model.RoomPermissions;
import io.swagger.client.model.UserInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class Node   {
  
  private Long id = null;


  public enum TypeEnum {
    ROOM("room"),
    FOLDER("folder"),
    FILE("file");

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
  private String parentPath = null;
  private Date createdAt = null;
  private UserInfo createdBy = null;
  private Date updatedAt = null;
  private UserInfo updatedBy = null;
  private Date expireAt = null;
  private String name = null;
  private String hash = null;
  private String fileType = null;
  private Integer cntShares = null;
  private Integer cntAdmins = null;
  private Integer cntUsers = null;
  private Long size = null;
  private Integer classification = null;
  private String notes = null;
  private RoomPermissions permissions = null;
  private Boolean isEncrypted = null;
  private Integer cntChildren = null;
  private Boolean hasRecycleBin = null;
  private Integer recycleBinRetentionPeriod = null;
  private Long quota = null;
  private Integer cntDownloadShares = null;
  private Integer cntUploadShares = null;
  private Boolean isFavorite = null;
  private EncryptionInfo encryptionInfo = null;
  private List<Node> children = new ArrayList<Node>();

  
  /**
   * Node ID
   **/
  public Node id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Node ID")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * Node Type
   **/
  public Node type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Node Type")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Parent Node ID
   **/
  public Node parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Parent Node ID")
  @JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }
  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }


  /**
   * Parent Node path. '/' if node is a Root node (Room)
   **/
  public Node parentPath(String parentPath) {
    this.parentPath = parentPath;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Parent Node path. '/' if node is a Root node (Room)")
  @JsonProperty("parentPath")
  public String getParentPath() {
    return parentPath;
  }
  public void setParentPath(String parentPath) {
    this.parentPath = parentPath;
  }


  /**
   * Creation date (2015-12-31T23:59:00)
   **/
  public Node createdAt(Date createdAt) {
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
  public Node createdBy(UserInfo createdBy) {
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
  public Node updatedAt(Date updatedAt) {
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
  public Node updatedBy(UserInfo updatedBy) {
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
   * Expiration date (2015-12-31T23:59:00)
   **/
  public Node expireAt(Date expireAt) {
    this.expireAt = expireAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Expiration date (2015-12-31T23:59:00)")
  @JsonProperty("expireAt")
  public Date getExpireAt() {
    return expireAt;
  }
  public void setExpireAt(Date expireAt) {
    this.expireAt = expireAt;
  }


  /**
   * Name
   **/
  public Node name(String name) {
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
   * MD5 hash of file
   **/
  public Node hash(String hash) {
    this.hash = hash;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "MD5 hash of file")
  @JsonProperty("hash")
  public String getHash() {
    return hash;
  }
  public void setHash(String hash) {
    this.hash = hash;
  }


  /**
   * For files only: File type (extension).
   **/
  public Node fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "For files only: File type (extension).")
  @JsonProperty("fileType")
  public String getFileType() {
    return fileType;
  }
  public void setFileType(String fileType) {
    this.fileType = fileType;
  }


  /**
   * Returns the number of upload shares if node type is room or folder. Returns number of download shares for files. <span style=\"color: red; font-weight: bold;\">[DEPRECATED]</span>
   **/
  public Node cntShares(Integer cntShares) {
    this.cntShares = cntShares;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Returns the number of upload shares if node type is room or folder. Returns number of download shares for files. <span style=\"color: red; font-weight: bold;\">[DEPRECATED]</span>")
  @JsonProperty("cntShares")
  public Integer getCntShares() {
    return cntShares;
  }
  public void setCntShares(Integer cntShares) {
    this.cntShares = cntShares;
  }


  /**
   * For rooms only: Number of admins.
   **/
  public Node cntAdmins(Integer cntAdmins) {
    this.cntAdmins = cntAdmins;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "For rooms only: Number of admins.")
  @JsonProperty("cntAdmins")
  public Integer getCntAdmins() {
    return cntAdmins;
  }
  public void setCntAdmins(Integer cntAdmins) {
    this.cntAdmins = cntAdmins;
  }


  /**
   * For rooms only: Number of users.
   **/
  public Node cntUsers(Integer cntUsers) {
    this.cntUsers = cntUsers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "For rooms only: Number of users.")
  @JsonProperty("cntUsers")
  public Integer getCntUsers() {
    return cntUsers;
  }
  public void setCntUsers(Integer cntUsers) {
    this.cntUsers = cntUsers;
  }


  /**
   * Node size
   **/
  public Node size(Long size) {
    this.size = size;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Node size")
  @JsonProperty("size")
  public Long getSize() {
    return size;
  }
  public void setSize(Long size) {
    this.size = size;
  }


  /**
   * For files only: Classification ID, the string description will be provided with resources.
   **/
  public Node classification(Integer classification) {
    this.classification = classification;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "For files only: Classification ID, the string description will be provided with resources.")
  @JsonProperty("classification")
  public Integer getClassification() {
    return classification;
  }
  public void setClassification(Integer classification) {
    this.classification = classification;
  }


  /**
   * User notes
   **/
  public Node notes(String notes) {
    this.notes = notes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User notes")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }


  /**
   * User permissions: Aggregated user permissions (all group and directly granted permissions)
   **/
  public Node permissions(RoomPermissions permissions) {
    this.permissions = permissions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User permissions: Aggregated user permissions (all group and directly granted permissions)")
  @JsonProperty("permissions")
  public RoomPermissions getPermissions() {
    return permissions;
  }
  public void setPermissions(RoomPermissions permissions) {
    this.permissions = permissions;
  }


  /**
   * For rooms: encryption state.
   **/
  public Node isEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "For rooms: encryption state.")
  @JsonProperty("isEncrypted")
  public Boolean getIsEncrypted() {
    return isEncrypted;
  }
  public void setIsEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
  }


  /**
   * For rooms/folders only: Number of direct children (no recursion).
   **/
  public Node cntChildren(Integer cntChildren) {
    this.cntChildren = cntChildren;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "For rooms/folders only: Number of direct children (no recursion).")
  @JsonProperty("cntChildren")
  public Integer getCntChildren() {
    return cntChildren;
  }
  public void setCntChildren(Integer cntChildren) {
    this.cntChildren = cntChildren;
  }


  /**
   * Is Recycle Bin activ
   **/
  public Node hasRecycleBin(Boolean hasRecycleBin) {
    this.hasRecycleBin = hasRecycleBin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Is Recycle Bin activ")
  @JsonProperty("hasRecycleBin")
  public Boolean getHasRecycleBin() {
    return hasRecycleBin;
  }
  public void setHasRecycleBin(Boolean hasRecycleBin) {
    this.hasRecycleBin = hasRecycleBin;
  }


  /**
   * Retention period for deleted nodes in days. Integer between 1 and 9999
   **/
  public Node recycleBinRetentionPeriod(Integer recycleBinRetentionPeriod) {
    this.recycleBinRetentionPeriod = recycleBinRetentionPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Retention period for deleted nodes in days. Integer between 1 and 9999")
  @JsonProperty("recycleBinRetentionPeriod")
  public Integer getRecycleBinRetentionPeriod() {
    return recycleBinRetentionPeriod;
  }
  public void setRecycleBinRetentionPeriod(Integer recycleBinRetentionPeriod) {
    this.recycleBinRetentionPeriod = recycleBinRetentionPeriod;
  }


  /**
   * Quota in Byte
   **/
  public Node quota(Long quota) {
    this.quota = quota;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quota in Byte")
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
  public Node cntDownloadShares(Integer cntDownloadShares) {
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
  public Node cntUploadShares(Integer cntUploadShares) {
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
  public Node isFavorite(Boolean isFavorite) {
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
  public Node encryptionInfo(EncryptionInfo encryptionInfo) {
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


  /**
   * For rooms and folders: child nodes list (if requested).
   **/
  public Node children(List<Node> children) {
    this.children = children;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "For rooms and folders: child nodes list (if requested).")
  @JsonProperty("children")
  public List<Node> getChildren() {
    return children;
  }
  public void setChildren(List<Node> children) {
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
    Node node = (Node) o;
    return Objects.equals(this.id, node.id) &&
        Objects.equals(this.type, node.type) &&
        Objects.equals(this.parentId, node.parentId) &&
        Objects.equals(this.parentPath, node.parentPath) &&
        Objects.equals(this.createdAt, node.createdAt) &&
        Objects.equals(this.createdBy, node.createdBy) &&
        Objects.equals(this.updatedAt, node.updatedAt) &&
        Objects.equals(this.updatedBy, node.updatedBy) &&
        Objects.equals(this.expireAt, node.expireAt) &&
        Objects.equals(this.name, node.name) &&
        Objects.equals(this.hash, node.hash) &&
        Objects.equals(this.fileType, node.fileType) &&
        Objects.equals(this.cntShares, node.cntShares) &&
        Objects.equals(this.cntAdmins, node.cntAdmins) &&
        Objects.equals(this.cntUsers, node.cntUsers) &&
        Objects.equals(this.size, node.size) &&
        Objects.equals(this.classification, node.classification) &&
        Objects.equals(this.notes, node.notes) &&
        Objects.equals(this.permissions, node.permissions) &&
        Objects.equals(this.isEncrypted, node.isEncrypted) &&
        Objects.equals(this.cntChildren, node.cntChildren) &&
        Objects.equals(this.hasRecycleBin, node.hasRecycleBin) &&
        Objects.equals(this.recycleBinRetentionPeriod, node.recycleBinRetentionPeriod) &&
        Objects.equals(this.quota, node.quota) &&
        Objects.equals(this.cntDownloadShares, node.cntDownloadShares) &&
        Objects.equals(this.cntUploadShares, node.cntUploadShares) &&
        Objects.equals(this.isFavorite, node.isFavorite) &&
        Objects.equals(this.encryptionInfo, node.encryptionInfo) &&
        Objects.equals(this.children, node.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, parentId, parentPath, createdAt, createdBy, updatedAt, updatedBy, expireAt, name, hash, fileType, cntShares, cntAdmins, cntUsers, size, classification, notes, permissions, isEncrypted, cntChildren, hasRecycleBin, recycleBinRetentionPeriod, quota, cntDownloadShares, cntUploadShares, isFavorite, encryptionInfo, children);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Node {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentPath: ").append(toIndentedString(parentPath)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    cntShares: ").append(toIndentedString(cntShares)).append("\n");
    sb.append("    cntAdmins: ").append(toIndentedString(cntAdmins)).append("\n");
    sb.append("    cntUsers: ").append(toIndentedString(cntUsers)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    isEncrypted: ").append(toIndentedString(isEncrypted)).append("\n");
    sb.append("    cntChildren: ").append(toIndentedString(cntChildren)).append("\n");
    sb.append("    hasRecycleBin: ").append(toIndentedString(hasRecycleBin)).append("\n");
    sb.append("    recycleBinRetentionPeriod: ").append(toIndentedString(recycleBinRetentionPeriod)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    cntDownloadShares: ").append(toIndentedString(cntDownloadShares)).append("\n");
    sb.append("    cntUploadShares: ").append(toIndentedString(cntUploadShares)).append("\n");
    sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
    sb.append("    encryptionInfo: ").append(toIndentedString(encryptionInfo)).append("\n");
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

