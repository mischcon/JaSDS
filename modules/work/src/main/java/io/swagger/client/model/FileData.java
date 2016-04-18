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
public class FileData   {
  
  private NodeId parent = null;
  private Long id = null;


  public enum TypeEnum {
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
  private Date createdAt = null;
  private UserInfo createdBy = null;
  private Date updatedAt = null;
  private UserInfo updatedBy = null;
  private Date expireAt = null;
  private String fileType = null;
  private Integer cntShares = null;
  private String name = null;
  private String path = null;
  private Long size = null;
  private RoomPermissions permissions = null;
  private Integer classification = null;
  private String notes = null;
  private Boolean isEncrypted = null;
  private EncryptionInfo encryptionInfo = null;
  private String hash = null;
  private Integer cntDownloadShares = null;

  
  /**
   * Parent node Id
   **/
  public FileData parent(NodeId parent) {
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
   * Node Id
   **/
  public FileData id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Node Id")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * Type is always 'file'
   **/
  public FileData type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type is always 'file'")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Creation date (2015-12-31T23:59:00)
   **/
  public FileData createdAt(Date createdAt) {
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
  public FileData createdBy(UserInfo createdBy) {
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
  public FileData updatedAt(Date updatedAt) {
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
  public FileData updatedBy(UserInfo updatedBy) {
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
  public FileData expireAt(Date expireAt) {
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
   * File type (extension)
   **/
  public FileData fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "File type (extension)")
  @JsonProperty("fileType")
  public String getFileType() {
    return fileType;
  }
  public void setFileType(String fileType) {
    this.fileType = fileType;
  }


  /**
   * Amount of shares <span style=\"color: red; font-weight: bold;\">[DEPRECATED]</span>
   **/
  public FileData cntShares(Integer cntShares) {
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
   * File name
   **/
  public FileData name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "File name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The full path starting from the dataspace root
   **/
  public FileData path(String path) {
    this.path = path;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The full path starting from the dataspace root")
  @JsonProperty("path")
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }


  /**
   * File size
   **/
  public FileData size(Long size) {
    this.size = size;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "File size")
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
  public FileData permissions(RoomPermissions permissions) {
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
   * Classification ID, the string description will be provided with resources
   **/
  public FileData classification(Integer classification) {
    this.classification = classification;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Classification ID, the string description will be provided with resources")
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
  public FileData notes(String notes) {
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
   * Is encrypted
   **/
  public FileData isEncrypted(Boolean isEncrypted) {
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
   * encryption info
   **/
  public FileData encryptionInfo(EncryptionInfo encryptionInfo) {
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
   * MD5 hash
   **/
  public FileData hash(String hash) {
    this.hash = hash;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "MD5 hash")
  @JsonProperty("hash")
  public String getHash() {
    return hash;
  }
  public void setHash(String hash) {
    this.hash = hash;
  }


  /**
   * Returns the number of download shares of this Node
   **/
  public FileData cntDownloadShares(Integer cntDownloadShares) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileData fileData = (FileData) o;
    return Objects.equals(this.parent, fileData.parent) &&
        Objects.equals(this.id, fileData.id) &&
        Objects.equals(this.type, fileData.type) &&
        Objects.equals(this.createdAt, fileData.createdAt) &&
        Objects.equals(this.createdBy, fileData.createdBy) &&
        Objects.equals(this.updatedAt, fileData.updatedAt) &&
        Objects.equals(this.updatedBy, fileData.updatedBy) &&
        Objects.equals(this.expireAt, fileData.expireAt) &&
        Objects.equals(this.fileType, fileData.fileType) &&
        Objects.equals(this.cntShares, fileData.cntShares) &&
        Objects.equals(this.name, fileData.name) &&
        Objects.equals(this.path, fileData.path) &&
        Objects.equals(this.size, fileData.size) &&
        Objects.equals(this.permissions, fileData.permissions) &&
        Objects.equals(this.classification, fileData.classification) &&
        Objects.equals(this.notes, fileData.notes) &&
        Objects.equals(this.isEncrypted, fileData.isEncrypted) &&
        Objects.equals(this.encryptionInfo, fileData.encryptionInfo) &&
        Objects.equals(this.hash, fileData.hash) &&
        Objects.equals(this.cntDownloadShares, fileData.cntDownloadShares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, id, type, createdAt, createdBy, updatedAt, updatedBy, expireAt, fileType, cntShares, name, path, size, permissions, classification, notes, isEncrypted, encryptionInfo, hash, cntDownloadShares);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileData {\n");
    
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    cntShares: ").append(toIndentedString(cntShares)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    isEncrypted: ").append(toIndentedString(isEncrypted)).append("\n");
    sb.append("    encryptionInfo: ").append(toIndentedString(encryptionInfo)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    cntDownloadShares: ").append(toIndentedString(cntDownloadShares)).append("\n");
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

