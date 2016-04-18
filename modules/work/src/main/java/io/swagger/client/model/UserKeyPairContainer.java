package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.PrivateKeyContainer;
import io.swagger.client.model.PublicKeyContainer;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class UserKeyPairContainer   {
  
  private PrivateKeyContainer privateKeyContainer = null;
  private PublicKeyContainer publicKeyContainer = null;

  
  /**
   **/
  public UserKeyPairContainer privateKeyContainer(PrivateKeyContainer privateKeyContainer) {
    this.privateKeyContainer = privateKeyContainer;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("privateKeyContainer")
  public PrivateKeyContainer getPrivateKeyContainer() {
    return privateKeyContainer;
  }
  public void setPrivateKeyContainer(PrivateKeyContainer privateKeyContainer) {
    this.privateKeyContainer = privateKeyContainer;
  }


  /**
   **/
  public UserKeyPairContainer publicKeyContainer(PublicKeyContainer publicKeyContainer) {
    this.publicKeyContainer = publicKeyContainer;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("publicKeyContainer")
  public PublicKeyContainer getPublicKeyContainer() {
    return publicKeyContainer;
  }
  public void setPublicKeyContainer(PublicKeyContainer publicKeyContainer) {
    this.publicKeyContainer = publicKeyContainer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserKeyPairContainer userKeyPairContainer = (UserKeyPairContainer) o;
    return Objects.equals(this.privateKeyContainer, userKeyPairContainer.privateKeyContainer) &&
        Objects.equals(this.publicKeyContainer, userKeyPairContainer.publicKeyContainer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateKeyContainer, publicKeyContainer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserKeyPairContainer {\n");
    
    sb.append("    privateKeyContainer: ").append(toIndentedString(privateKeyContainer)).append("\n");
    sb.append("    publicKeyContainer: ").append(toIndentedString(publicKeyContainer)).append("\n");
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

