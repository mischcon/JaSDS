package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Range;
import io.swagger.client.model.SyslogEvent;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class SyslogEventList   {
  
  private Range range = null;
  private List<SyslogEvent> items = new ArrayList<SyslogEvent>();

  
  /**
   **/
  public SyslogEventList range(Range range) {
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
  public SyslogEventList items(List<SyslogEvent> items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("items")
  public List<SyslogEvent> getItems() {
    return items;
  }
  public void setItems(List<SyslogEvent> items) {
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
    SyslogEventList syslogEventList = (SyslogEventList) o;
    return Objects.equals(this.range, syslogEventList.range) &&
        Objects.equals(this.items, syslogEventList.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(range, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyslogEventList {\n");
    
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

