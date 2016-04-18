package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class NodesDeleteRequest   {
  
  private List<Long> nodeIds = new ArrayList<Long>();

  
  /**
   **/
  public NodesDeleteRequest nodeIds(List<Long> nodeIds) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodesDeleteRequest nodesDeleteRequest = (NodesDeleteRequest) o;
    return Objects.equals(this.nodeIds, nodesDeleteRequest.nodeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodesDeleteRequest {\n");
    
    sb.append("    nodeIds: ").append(toIndentedString(nodeIds)).append("\n");
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

