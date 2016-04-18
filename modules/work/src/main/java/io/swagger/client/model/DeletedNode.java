package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.RoomPermissions;
import io.swagger.client.model.UserInfo;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class DeletedNode   {
  
  private Long id = null;
  private Long parentId = null;
  private String parentPath = null;


  public enum TypeEnum {
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
  private String name = null;
  private Date expireAt = null;
  private Date accessedAt = null;
  private Boolean isEncrypted = null;
  private String notes = null;
  private Long size = null;
  private Integer classification = null;
  private RoomPermissions permissions = null;
  private Date createdAt = null;
  private UserInfo createdBy = null;
  private Date updatedAt = null;
  private UserInfo updatedBy = null;
  private Date deletedAt = null;
  private UserInfo deletedBy = null;

  
  /**
   * Node ID
   **/
  public DeletedNode id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Node ID")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * ID of parent node
   **/
  public DeletedNode parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ID of parent node")
  @JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }
  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }


  /**
   * Path to parent node
   **/
  public DeletedNode parentPath(String parentPath) {
    this.parentPath = parentPath;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Path to parent node")
  @JsonProperty("parentPath")
  public String getParentPath() {
    return parentPath;
  }
  public void setParentPath(String parentPath) {
    this.parentPath = parentPath;
  }


  /**
   * Node type
   **/
  public DeletedNode type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Node type")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Node name
   **/
  public DeletedNode name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Node name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Expiration date (2015-12-31T23:59:00)
   **/
  public DeletedNode expireAt(Date expireAt) {
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
   * Last access date (2015-12-31T23:59:00)
   **/
  public DeletedNode accessedAt(Date accessedAt) {
    this.accessedAt = accessedAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Last access date (2015-12-31T23:59:00)")
  @JsonProperty("accessedAt")
  public Date getAccessedAt() {
    return accessedAt;
  }
  public void setAccessedAt(Date accessedAt) {
    this.accessedAt = accessedAt;
  }


  /**
   * Auth parent node: encryption state
   **/
  public DeletedNode isEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Auth parent node: encryption state")
  @JsonProperty("isEncrypted")
  public Boolean getIsEncrypted() {
    return isEncrypted;
  }
  public void setIsEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
  }


  /**
   * User notes
   **/
  public DeletedNode notes(String notes) {
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
   * Node size
   **/
  public DeletedNode size(Long size) {
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
   * Classification ID. File only.
   **/
  public DeletedNode classification(Integer classification) {
    this.classification = classification;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Classification ID. File only.")
  @JsonProperty("classification")
  public Integer getClassification() {
    return classification;
  }
  public void setClassification(Integer classification) {
    this.classification = classification;
  }


  /**
   * Aggregated user permissions (all permissions granted by groups and directly)
   **/
  public DeletedNode permissions(RoomPermissions permissions) {
    this.permissions = permissions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Aggregated user permissions (all permissions granted by groups and directly)")
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
  public DeletedNode createdAt(Date createdAt) {
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
   * Node created by user
   **/
  public DeletedNode createdBy(UserInfo createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Node created by user")
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
  public DeletedNode updatedAt(Date updatedAt) {
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
   * Node modified by user
   **/
  public DeletedNode updatedBy(UserInfo updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Node modified by user")
  @JsonProperty("updatedBy")
  public UserInfo getUpdatedBy() {
    return updatedBy;
  }
  public void setUpdatedBy(UserInfo updatedBy) {
    this.updatedBy = updatedBy;
  }


  /**
   * Deleted date (2015-12-31T23:59:00)
   **/
  public DeletedNode deletedAt(Date deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Deleted date (2015-12-31T23:59:00)")
  @JsonProperty("deletedAt")
  public Date getDeletedAt() {
    return deletedAt;
  }
  public void setDeletedAt(Date deletedAt) {
    this.deletedAt = deletedAt;
  }


  /**
   * Node deleted by user
   **/
  public DeletedNode deletedBy(UserInfo deletedBy) {
    this.deletedBy = deletedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Node deleted by user")
  @JsonProperty("deletedBy")
  public UserInfo getDeletedBy() {
    return deletedBy;
  }
  public void setDeletedBy(UserInfo deletedBy) {
    this.deletedBy = deletedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletedNode deletedNode = (DeletedNode) o;
    return Objects.equals(this.id, deletedNode.id) &&
        Objects.equals(this.parentId, deletedNode.parentId) &&
        Objects.equals(this.parentPath, deletedNode.parentPath) &&
        Objects.equals(this.type, deletedNode.type) &&
        Objects.equals(this.name, deletedNode.name) &&
        Objects.equals(this.expireAt, deletedNode.expireAt) &&
        Objects.equals(this.accessedAt, deletedNode.accessedAt) &&
        Objects.equals(this.isEncrypted, deletedNode.isEncrypted) &&
        Objects.equals(this.notes, deletedNode.notes) &&
        Objects.equals(this.size, deletedNode.size) &&
        Objects.equals(this.classification, deletedNode.classification) &&
        Objects.equals(this.permissions, deletedNode.permissions) &&
        Objects.equals(this.createdAt, deletedNode.createdAt) &&
        Objects.equals(this.createdBy, deletedNode.createdBy) &&
        Objects.equals(this.updatedAt, deletedNode.updatedAt) &&
        Objects.equals(this.updatedBy, deletedNode.updatedBy) &&
        Objects.equals(this.deletedAt, deletedNode.deletedAt) &&
        Objects.equals(this.deletedBy, deletedNode.deletedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, parentPath, type, name, expireAt, accessedAt, isEncrypted, notes, size, classification, permissions, createdAt, createdBy, updatedAt, updatedBy, deletedAt, deletedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletedNode {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentPath: ").append(toIndentedString(parentPath)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    accessedAt: ").append(toIndentedString(accessedAt)).append("\n");
    sb.append("    isEncrypted: ").append(toIndentedString(isEncrypted)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    deletedBy: ").append(toIndentedString(deletedBy)).append("\n");
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

