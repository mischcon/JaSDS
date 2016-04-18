package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Range;
import io.swagger.client.model.UploadShare;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class UploadShareList   {
  
  private Range range = null;
  private List<UploadShare> items = new ArrayList<UploadShare>();

  
  /**
   **/
  public UploadShareList range(Range range) {
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
  public UploadShareList items(List<UploadShare> items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("items")
  public List<UploadShare> getItems() {
    return items;
  }
  public void setItems(List<UploadShare> items) {
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
    UploadShareList uploadShareList = (UploadShareList) o;
    return Objects.equals(this.range, uploadShareList.range) &&
        Objects.equals(this.items, uploadShareList.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(range, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadShareList {\n");
    
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

