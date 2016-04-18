package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class NodesCopyRequest   {
  
  private List<Long> nodeIds = new ArrayList<Long>();


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

  
  /**
   **/
  public NodesCopyRequest nodeIds(List<Long> nodeIds) {
    this.nodeIds = nodeIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("nodeIds")
  public List<Long> getNodeIds() {
    return nodeIds;
  }
  public void setNodeIds(List<Long> nodeIds) {
    this.nodeIds = nodeIds;
  }


  /**
   * Node conflict resolution strategy. (default: autorename)
   **/
  public NodesCopyRequest resolutionStrategy(ResolutionStrategyEnum resolutionStrategy) {
    this.resolutionStrategy = resolutionStrategy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Node conflict resolution strategy. (default: autorename)")
  @JsonProperty("resolutionStrategy")
  public ResolutionStrategyEnum getResolutionStrategy() {
    return resolutionStrategy;
  }
  public void setResolutionStrategy(ResolutionStrategyEnum resolutionStrategy) {
    this.resolutionStrategy = resolutionStrategy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodesCopyRequest nodesCopyRequest = (NodesCopyRequest) o;
    return Objects.equals(this.nodeIds, nodesCopyRequest.nodeIds) &&
        Objects.equals(this.resolutionStrategy, nodesCopyRequest.resolutionStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeIds, resolutionStrategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodesCopyRequest {\n");
    
    sb.append("    nodeIds: ").append(toIndentedString(nodeIds)).append("\n");
    sb.append("    resolutionStrategy: ").append(toIndentedString(resolutionStrategy)).append("\n");
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

