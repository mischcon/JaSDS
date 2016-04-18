package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class FileKeyContainer   {
  
  private String key = null;
  private String iv = null;
  private String version = null;
  private String tag = null;

  
  /**
   * Encryption key
   **/
  public FileKeyContainer key(String key) {
    this.key = key;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Encryption key")
  @JsonProperty("key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }


  /**
   * Initial vector
   **/
  public FileKeyContainer iv(String iv) {
    this.iv = iv;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Initial vector")
  @JsonProperty("iv")
  public String getIv() {
    return iv;
  }
  public void setIv(String iv) {
    this.iv = iv;
  }


  /**
   * version
   **/
  public FileKeyContainer version(String version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "version")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   * Authentication tag. Needed with authenticated encryption
   **/
  public FileKeyContainer tag(String tag) {
    this.tag = tag;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Authentication tag. Needed with authenticated encryption")
  @JsonProperty("tag")
  public String getTag() {
    return tag;
  }
  public void setTag(String tag) {
    this.tag = tag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileKeyContainer fileKeyContainer = (FileKeyContainer) o;
    return Objects.equals(this.key, fileKeyContainer.key) &&
        Objects.equals(this.iv, fileKeyContainer.iv) &&
        Objects.equals(this.version, fileKeyContainer.version) &&
        Objects.equals(this.tag, fileKeyContainer.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, iv, version, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileKeyContainer {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    iv: ").append(toIndentedString(iv)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

