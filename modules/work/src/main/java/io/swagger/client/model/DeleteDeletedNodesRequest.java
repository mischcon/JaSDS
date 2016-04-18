package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class DeleteDeletedNodesRequest   {
  
  private List<Long> deletedNodeIds = new ArrayList<Long>();

  
  /**
   **/
  public DeleteDeletedNodesRequest deletedNodeIds(List<Long> deletedNodeIds) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteDeletedNodesRequest deleteDeletedNodesRequest = (DeleteDeletedNodesRequest) o;
    return Objects.equals(this.deletedNodeIds, deleteDeletedNodesRequest.deletedNodeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedNodeIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteDeletedNodesRequest {\n");
    
    sb.append("    deletedNodeIds: ").append(toIndentedString(deletedNodeIds)).append("\n");
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

