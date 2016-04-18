package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class PublicKeyContainer   {
  
  private String version = null;
  private String publicKey = null;

  
  /**
   * version
   **/
  public PublicKeyContainer version(String version) {
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
   * publicKey
   **/
  public PublicKeyContainer publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "publicKey")
  @JsonProperty("publicKey")
  public String getPublicKey() {
    return publicKey;
  }
  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicKeyContainer publicKeyContainer = (PublicKeyContainer) o;
    return Objects.equals(this.version, publicKeyContainer.version) &&
        Objects.equals(this.publicKey, publicKeyContainer.publicKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, publicKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicKeyContainer {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
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

