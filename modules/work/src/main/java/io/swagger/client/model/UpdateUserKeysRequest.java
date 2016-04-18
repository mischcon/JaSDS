package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class UpdateUserKeysRequest   {
  
  private String privateKey = null;
  private String publicKey = null;

  
  /**
   * Public key
   **/
  public UpdateUserKeysRequest privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Public key")
  @JsonProperty("privateKey")
  public String getPrivateKey() {
    return privateKey;
  }
  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }


  /**
   * Private key
   **/
  public UpdateUserKeysRequest publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Private key")
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
    UpdateUserKeysRequest updateUserKeysRequest = (UpdateUserKeysRequest) o;
    return Objects.equals(this.privateKey, updateUserKeysRequest.privateKey) &&
        Objects.equals(this.publicKey, updateUserKeysRequest.publicKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateKey, publicKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserKeysRequest {\n");
    
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
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

