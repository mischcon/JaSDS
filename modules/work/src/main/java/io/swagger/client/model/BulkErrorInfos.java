package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ConflictNode;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class BulkErrorInfos   {
  
  private List<ConflictNode> conflictNodes = new ArrayList<ConflictNode>();

  
  /**
   **/
  public BulkErrorInfos conflictNodes(List<ConflictNode> conflictNodes) {
    this.conflictNodes = conflictNodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conflictNodes")
  public List<ConflictNode> getConflictNodes() {
    return conflictNodes;
  }
  public void setConflictNodes(List<ConflictNode> conflictNodes) {
    this.conflictNodes = conflictNodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkErrorInfos bulkErrorInfos = (BulkErrorInfos) o;
    return Objects.equals(this.conflictNodes, bulkErrorInfos.conflictNodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conflictNodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkErrorInfos {\n");
    
    sb.append("    conflictNodes: ").append(toIndentedString(conflictNodes)).append("\n");
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

