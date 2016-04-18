package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class DeletedNodeSummary   {
  
  private Long parentId = null;
  private String parentPath = null;
  private String name = null;


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
  private Integer cntVersions = null;
  private Date firstDeletedAt = null;
  private Date lastDeletedAt = null;
  private Long lastDeletedNodeId = null;

  
  /**
   * Parent Node ID
   **/
  public DeletedNodeSummary parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Parent Node ID")
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
  public DeletedNodeSummary parentPath(String parentPath) {
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
   * Node name
   **/
  public DeletedNodeSummary name(String name) {
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
   * Node type
   **/
  public DeletedNodeSummary type(TypeEnum type) {
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
   * Number of deleted versions of this file
   **/
  public DeletedNodeSummary cntVersions(Integer cntVersions) {
    this.cntVersions = cntVersions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of deleted versions of this file")
  @JsonProperty("cntVersions")
  public Integer getCntVersions() {
    return cntVersions;
  }
  public void setCntVersions(Integer cntVersions) {
    this.cntVersions = cntVersions;
  }


  /**
   * First deleted version (2015-12-31T23:59:00)
   **/
  public DeletedNodeSummary firstDeletedAt(Date firstDeletedAt) {
    this.firstDeletedAt = firstDeletedAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "First deleted version (2015-12-31T23:59:00)")
  @JsonProperty("firstDeletedAt")
  public Date getFirstDeletedAt() {
    return firstDeletedAt;
  }
  public void setFirstDeletedAt(Date firstDeletedAt) {
    this.firstDeletedAt = firstDeletedAt;
  }


  /**
   * Last deleted version (2015-12-31T23:59:00)
   **/
  public DeletedNodeSummary lastDeletedAt(Date lastDeletedAt) {
    this.lastDeletedAt = lastDeletedAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Last deleted version (2015-12-31T23:59:00)")
  @JsonProperty("lastDeletedAt")
  public Date getLastDeletedAt() {
    return lastDeletedAt;
  }
  public void setLastDeletedAt(Date lastDeletedAt) {
    this.lastDeletedAt = lastDeletedAt;
  }


  /**
   * Node ID of last deleted version
   **/
  public DeletedNodeSummary lastDeletedNodeId(Long lastDeletedNodeId) {
    this.lastDeletedNodeId = lastDeletedNodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Node ID of last deleted version")
  @JsonProperty("lastDeletedNodeId")
  public Long getLastDeletedNodeId() {
    return lastDeletedNodeId;
  }
  public void setLastDeletedNodeId(Long lastDeletedNodeId) {
    this.lastDeletedNodeId = lastDeletedNodeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletedNodeSummary deletedNodeSummary = (DeletedNodeSummary) o;
    return Objects.equals(this.parentId, deletedNodeSummary.parentId) &&
        Objects.equals(this.parentPath, deletedNodeSummary.parentPath) &&
        Objects.equals(this.name, deletedNodeSummary.name) &&
        Objects.equals(this.type, deletedNodeSummary.type) &&
        Objects.equals(this.cntVersions, deletedNodeSummary.cntVersions) &&
        Objects.equals(this.firstDeletedAt, deletedNodeSummary.firstDeletedAt) &&
        Objects.equals(this.lastDeletedAt, deletedNodeSummary.lastDeletedAt) &&
        Objects.equals(this.lastDeletedNodeId, deletedNodeSummary.lastDeletedNodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentId, parentPath, name, type, cntVersions, firstDeletedAt, lastDeletedAt, lastDeletedNodeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletedNodeSummary {\n");
    
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentPath: ").append(toIndentedString(parentPath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    cntVersions: ").append(toIndentedString(cntVersions)).append("\n");
    sb.append("    firstDeletedAt: ").append(toIndentedString(firstDeletedAt)).append("\n");
    sb.append("    lastDeletedAt: ").append(toIndentedString(lastDeletedAt)).append("\n");
    sb.append("    lastDeletedNodeId: ").append(toIndentedString(lastDeletedNodeId)).append("\n");
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

