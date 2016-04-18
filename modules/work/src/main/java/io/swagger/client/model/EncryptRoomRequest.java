package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.UserKeyPairContainer;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class EncryptRoomRequest   {
  
  private Boolean isEncrypted = null;
  private Boolean useDataSpaceRescueKey = null;
  private UserKeyPairContainer dataRoomRescueKey = null;

  
  /**
   * Set true to encrypt a room
   **/
  public EncryptRoomRequest isEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Set true to encrypt a room")
  @JsonProperty("isEncrypted")
  public Boolean getIsEncrypted() {
    return isEncrypted;
  }
  public void setIsEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
  }


  /**
   * Use DataSpace Rescue key for files in this room
   **/
  public EncryptRoomRequest useDataSpaceRescueKey(Boolean useDataSpaceRescueKey) {
    this.useDataSpaceRescueKey = useDataSpaceRescueKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Use DataSpace Rescue key for files in this room")
  @JsonProperty("useDataSpaceRescueKey")
  public Boolean getUseDataSpaceRescueKey() {
    return useDataSpaceRescueKey;
  }
  public void setUseDataSpaceRescueKey(Boolean useDataSpaceRescueKey) {
    this.useDataSpaceRescueKey = useDataSpaceRescueKey;
  }


  /**
   * Set DataRoom Rescue Key for files in this room
   **/
  public EncryptRoomRequest dataRoomRescueKey(UserKeyPairContainer dataRoomRescueKey) {
    this.dataRoomRescueKey = dataRoomRescueKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set DataRoom Rescue Key for files in this room")
  @JsonProperty("dataRoomRescueKey")
  public UserKeyPairContainer getDataRoomRescueKey() {
    return dataRoomRescueKey;
  }
  public void setDataRoomRescueKey(UserKeyPairContainer dataRoomRescueKey) {
    this.dataRoomRescueKey = dataRoomRescueKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncryptRoomRequest encryptRoomRequest = (EncryptRoomRequest) o;
    return Objects.equals(this.isEncrypted, encryptRoomRequest.isEncrypted) &&
        Objects.equals(this.useDataSpaceRescueKey, encryptRoomRequest.useDataSpaceRescueKey) &&
        Objects.equals(this.dataRoomRescueKey, encryptRoomRequest.dataRoomRescueKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEncrypted, useDataSpaceRescueKey, dataRoomRescueKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptRoomRequest {\n");
    
    sb.append("    isEncrypted: ").append(toIndentedString(isEncrypted)).append("\n");
    sb.append("    useDataSpaceRescueKey: ").append(toIndentedString(useDataSpaceRescueKey)).append("\n");
    sb.append("    dataRoomRescueKey: ").append(toIndentedString(dataRoomRescueKey)).append("\n");
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

