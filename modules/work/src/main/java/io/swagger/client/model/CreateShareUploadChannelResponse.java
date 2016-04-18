package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class CreateShareUploadChannelResponse   {
  
  private String uploadId = null;
  private String token = null;

  
  /**
   * Upload channel Id
   **/
  public CreateShareUploadChannelResponse uploadId(String uploadId) {
    this.uploadId = uploadId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Upload channel Id")
  @JsonProperty("uploadId")
  public String getUploadId() {
    return uploadId;
  }
  public void setUploadId(String uploadId) {
    this.uploadId = uploadId;
  }


  /**
   * Upload token
   **/
  public CreateShareUploadChannelResponse token(String token) {
    this.token = token;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Upload token")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateShareUploadChannelResponse createShareUploadChannelResponse = (CreateShareUploadChannelResponse) o;
    return Objects.equals(this.uploadId, createShareUploadChannelResponse.uploadId) &&
        Objects.equals(this.token, createShareUploadChannelResponse.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadId, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateShareUploadChannelResponse {\n");
    
    sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

