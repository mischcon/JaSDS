package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.UserKeyPairContainer;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class EnableCustomerEncryptionRequest   {
  
  private Boolean enableCustomerEncryption = null;
  private UserKeyPairContainer dataSpaceRescueKey = null;

  
  /**
   * true to enable Encryption for this customer
   **/
  public EnableCustomerEncryptionRequest enableCustomerEncryption(Boolean enableCustomerEncryption) {
    this.enableCustomerEncryption = enableCustomerEncryption;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "true to enable Encryption for this customer")
  @JsonProperty("enableCustomerEncryption")
  public Boolean getEnableCustomerEncryption() {
    return enableCustomerEncryption;
  }
  public void setEnableCustomerEncryption(Boolean enableCustomerEncryption) {
    this.enableCustomerEncryption = enableCustomerEncryption;
  }


  /**
   **/
  public EnableCustomerEncryptionRequest dataSpaceRescueKey(UserKeyPairContainer dataSpaceRescueKey) {
    this.dataSpaceRescueKey = dataSpaceRescueKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("dataSpaceRescueKey")
  public UserKeyPairContainer getDataSpaceRescueKey() {
    return dataSpaceRescueKey;
  }
  public void setDataSpaceRescueKey(UserKeyPairContainer dataSpaceRescueKey) {
    this.dataSpaceRescueKey = dataSpaceRescueKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnableCustomerEncryptionRequest enableCustomerEncryptionRequest = (EnableCustomerEncryptionRequest) o;
    return Objects.equals(this.enableCustomerEncryption, enableCustomerEncryptionRequest.enableCustomerEncryption) &&
        Objects.equals(this.dataSpaceRescueKey, enableCustomerEncryptionRequest.dataSpaceRescueKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableCustomerEncryption, dataSpaceRescueKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnableCustomerEncryptionRequest {\n");
    
    sb.append("    enableCustomerEncryption: ").append(toIndentedString(enableCustomerEncryption)).append("\n");
    sb.append("    dataSpaceRescueKey: ").append(toIndentedString(dataSpaceRescueKey)).append("\n");
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

