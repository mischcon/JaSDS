package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class NotRestoredNode   {
  
  private Long id = null;
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

  
  /**
   * Not restored node id 
   **/
  public NotRestoredNode id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Not restored node id ")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * Parent Node ID
   **/
  public NotRestoredNode parentId(Long parentId) {
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
  public NotRestoredNode parentPath(String parentPath) {
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
  public NotRestoredNode name(String name) {
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
  public NotRestoredNode type(TypeEnum type) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotRestoredNode notRestoredNode = (NotRestoredNode) o;
    return Objects.equals(this.id, notRestoredNode.id) &&
        Objects.equals(this.parentId, notRestoredNode.parentId) &&
        Objects.equals(this.parentPath, notRestoredNode.parentPath) &&
        Objects.equals(this.name, notRestoredNode.name) &&
        Objects.equals(this.type, notRestoredNode.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, parentPath, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotRestoredNode {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentPath: ").append(toIndentedString(parentPath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

