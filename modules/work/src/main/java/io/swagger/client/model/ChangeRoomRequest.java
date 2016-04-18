package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class ChangeRoomRequest   {
  
  private String name = null;
  private Boolean hasRecycleBin = null;
  private Integer recycleBinRetentionPeriod = null;
  private Long quota = null;

  
  /**
   * Name
   **/
  public ChangeRoomRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Activate Recycle Bin
   **/
  public ChangeRoomRequest hasRecycleBin(Boolean hasRecycleBin) {
    this.hasRecycleBin = hasRecycleBin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Activate Recycle Bin")
  @JsonProperty("hasRecycleBin")
  public Boolean getHasRecycleBin() {
    return hasRecycleBin;
  }
  public void setHasRecycleBin(Boolean hasRecycleBin) {
    this.hasRecycleBin = hasRecycleBin;
  }


  /**
   * Retention period for deleted nodes in days. Integer between 1 and 9999
   **/
  public ChangeRoomRequest recycleBinRetentionPeriod(Integer recycleBinRetentionPeriod) {
    this.recycleBinRetentionPeriod = recycleBinRetentionPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Retention period for deleted nodes in days. Integer between 1 and 9999")
  @JsonProperty("recycleBinRetentionPeriod")
  public Integer getRecycleBinRetentionPeriod() {
    return recycleBinRetentionPeriod;
  }
  public void setRecycleBinRetentionPeriod(Integer recycleBinRetentionPeriod) {
    this.recycleBinRetentionPeriod = recycleBinRetentionPeriod;
  }


  /**
   * Quota in Byte
   **/
  public ChangeRoomRequest quota(Long quota) {
    this.quota = quota;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quota in Byte")
  @JsonProperty("quota")
  public Long getQuota() {
    return quota;
  }
  public void setQuota(Long quota) {
    this.quota = quota;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeRoomRequest changeRoomRequest = (ChangeRoomRequest) o;
    return Objects.equals(this.name, changeRoomRequest.name) &&
        Objects.equals(this.hasRecycleBin, changeRoomRequest.hasRecycleBin) &&
        Objects.equals(this.recycleBinRetentionPeriod, changeRoomRequest.recycleBinRetentionPeriod) &&
        Objects.equals(this.quota, changeRoomRequest.quota);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, hasRecycleBin, recycleBinRetentionPeriod, quota);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeRoomRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hasRecycleBin: ").append(toIndentedString(hasRecycleBin)).append("\n");
    sb.append("    recycleBinRetentionPeriod: ").append(toIndentedString(recycleBinRetentionPeriod)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
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

