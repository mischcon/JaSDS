package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class RestoreDeletedNodesRequest   {
  
  private List<Long> deletedNodeIds = new ArrayList<Long>();


  public enum ResolutionStrategyEnum {
    AUTORENAME("autorename"),
    OVERWRITE("overwrite"),
    FAIL("fail");

    private String value;

    ResolutionStrategyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ResolutionStrategyEnum resolutionStrategy = null;
  private Long parentId = null;

  
  /**
   **/
  public RestoreDeletedNodesRequest deletedNodeIds(List<Long> deletedNodeIds) {
    this.deletedNodeIds = deletedNodeIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("deletedNodeIds")
  public List<Long> getDeletedNodeIds() {
    return deletedNodeIds;
  }
  public void setDeletedNodeIds(List<Long> deletedNodeIds) {
    this.deletedNodeIds = deletedNodeIds;
  }


  /**
   * File/Folder name conflict resolution strategy. (default: Autorename)
   **/
  public RestoreDeletedNodesRequest resolutionStrategy(ResolutionStrategyEnum resolutionStrategy) {
    this.resolutionStrategy = resolutionStrategy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "File/Folder name conflict resolution strategy. (default: Autorename)")
  @JsonProperty("resolutionStrategy")
  public ResolutionStrategyEnum getResolutionStrategy() {
    return resolutionStrategy;
  }
  public void setResolutionStrategy(ResolutionStrategyEnum resolutionStrategy) {
    this.resolutionStrategy = resolutionStrategy;
  }


  /**
   * Node parent ID. (default: Old parent ID)
   **/
  public RestoreDeletedNodesRequest parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Node parent ID. (default: Old parent ID)")
  @JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }
  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestoreDeletedNodesRequest restoreDeletedNodesRequest = (RestoreDeletedNodesRequest) o;
    return Objects.equals(this.deletedNodeIds, restoreDeletedNodesRequest.deletedNodeIds) &&
        Objects.equals(this.resolutionStrategy, restoreDeletedNodesRequest.resolutionStrategy) &&
        Objects.equals(this.parentId, restoreDeletedNodesRequest.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedNodeIds, resolutionStrategy, parentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestoreDeletedNodesRequest {\n");
    
    sb.append("    deletedNodeIds: ").append(toIndentedString(deletedNodeIds)).append("\n");
    sb.append("    resolutionStrategy: ").append(toIndentedString(resolutionStrategy)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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

