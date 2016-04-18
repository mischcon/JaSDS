package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class PrivateKeyContainer   {
  
  private String version = null;
  private String privateKey = null;

  
  /**
   * version
   **/
  public PrivateKeyContainer version(String version) {
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
   * privateKey
   **/
  public PrivateKeyContainer privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "privateKey")
  @JsonProperty("privateKey")
  public String getPrivateKey() {
    return privateKey;
  }
  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivateKeyContainer privateKeyContainer = (PrivateKeyContainer) o;
    return Objects.equals(this.version, privateKeyContainer.version) &&
        Objects.equals(this.privateKey, privateKeyContainer.privateKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, privateKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivateKeyContainer {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
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

