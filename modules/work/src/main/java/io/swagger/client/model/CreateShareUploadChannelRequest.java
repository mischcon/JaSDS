package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class CreateShareUploadChannelRequest   {
  
  private String name = null;
  private Long size = null;
  private String password = null;

  
  /**
   * File name
   **/
  public CreateShareUploadChannelRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "File name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * File size in byte
   **/
  public CreateShareUploadChannelRequest size(Long size) {
    this.size = size;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "File size in byte")
  @JsonProperty("size")
  public Long getSize() {
    return size;
  }
  public void setSize(Long size) {
    this.size = size;
  }


  /**
   * password
   **/
  public CreateShareUploadChannelRequest password(String password) {
    this.password = password;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "password")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateShareUploadChannelRequest createShareUploadChannelRequest = (CreateShareUploadChannelRequest) o;
    return Objects.equals(this.name, createShareUploadChannelRequest.name) &&
        Objects.equals(this.size, createShareUploadChannelRequest.size) &&
        Objects.equals(this.password, createShareUploadChannelRequest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, size, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateShareUploadChannelRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

