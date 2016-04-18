package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Group;
import io.swagger.client.model.Range;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class GroupList   {
  
  private Range range = null;
  private List<Group> items = new ArrayList<Group>();

  
  /**
   **/
  public GroupList range(Range range) {
    this.range = range;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("range")
  public Range getRange() {
    return range;
  }
  public void setRange(Range range) {
    this.range = range;
  }


  /**
   **/
  public GroupList items(List<Group> items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("items")
  public List<Group> getItems() {
    return items;
  }
  public void setItems(List<Group> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupList groupList = (GroupList) o;
    return Objects.equals(this.range, groupList.range) &&
        Objects.equals(this.items, groupList.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(range, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupList {\n");
    
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

