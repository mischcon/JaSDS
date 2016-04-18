package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.PublicKeyContainer;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class UserUserPublicKey   {
  
  private Long id = null;
  private PublicKeyContainer publicKeyContainer = null;

  
  /**
   * User Id
   **/
  public UserUserPublicKey id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User Id")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * User Public Key
   **/
  public UserUserPublicKey publicKeyContainer(PublicKeyContainer publicKeyContainer) {
    this.publicKeyContainer = publicKeyContainer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User Public Key")
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
    UserUserPublicKey userUserPublicKey = (UserUserPublicKey) o;
    return Objects.equals(this.id, userUserPublicKey.id) &&
        Objects.equals(this.publicKeyContainer, userUserPublicKey.publicKeyContainer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, publicKeyContainer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUserPublicKey {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

