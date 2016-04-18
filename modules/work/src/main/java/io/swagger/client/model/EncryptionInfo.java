package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class EncryptionInfo   {
  


  public enum UserkeyStateEnum {
    NONE("none"),
    PENDING("pending"),
    AVAILABLE("available");

    private String value;

    UserkeyStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private UserkeyStateEnum userkeyState = null;


  public enum RoomkeyStateEnum {
    NONE("none"),
    PENDING("pending"),
    AVAILABLE("available");

    private String value;

    RoomkeyStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private RoomkeyStateEnum roomkeyState = null;


  public enum DataspacekeyStateEnum {
    NONE("none"),
    PENDING("pending"),
    AVAILABLE("available");

    private String value;

    DataspacekeyStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private DataspacekeyStateEnum dataspacekeyState = null;

  
  /**
   * shows if there is no key/ should be a key/ is a key
   **/
  public EncryptionInfo userkeyState(UserkeyStateEnum userkeyState) {
    this.userkeyState = userkeyState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "shows if there is no key/ should be a key/ is a key")
  @JsonProperty("userkey_state")
  public UserkeyStateEnum getUserkeyState() {
    return userkeyState;
  }
  public void setUserkeyState(UserkeyStateEnum userkeyState) {
    this.userkeyState = userkeyState;
  }


  /**
   * shows if there is no key/ should be a key/ is a key
   **/
  public EncryptionInfo roomkeyState(RoomkeyStateEnum roomkeyState) {
    this.roomkeyState = roomkeyState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "shows if there is no key/ should be a key/ is a key")
  @JsonProperty("roomkey_state")
  public RoomkeyStateEnum getRoomkeyState() {
    return roomkeyState;
  }
  public void setRoomkeyState(RoomkeyStateEnum roomkeyState) {
    this.roomkeyState = roomkeyState;
  }


  /**
   * shows if there is no key/ should be a key/ is a key
   **/
  public EncryptionInfo dataspacekeyState(DataspacekeyStateEnum dataspacekeyState) {
    this.dataspacekeyState = dataspacekeyState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "shows if there is no key/ should be a key/ is a key")
  @JsonProperty("dataspacekey_state")
  public DataspacekeyStateEnum getDataspacekeyState() {
    return dataspacekeyState;
  }
  public void setDataspacekeyState(DataspacekeyStateEnum dataspacekeyState) {
    this.dataspacekeyState = dataspacekeyState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncryptionInfo encryptionInfo = (EncryptionInfo) o;
    return Objects.equals(this.userkeyState, encryptionInfo.userkeyState) &&
        Objects.equals(this.roomkeyState, encryptionInfo.roomkeyState) &&
        Objects.equals(this.dataspacekeyState, encryptionInfo.dataspacekeyState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userkeyState, roomkeyState, dataspacekeyState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptionInfo {\n");
    
    sb.append("    userkeyState: ").append(toIndentedString(userkeyState)).append("\n");
    sb.append("    roomkeyState: ").append(toIndentedString(roomkeyState)).append("\n");
    sb.append("    dataspacekeyState: ").append(toIndentedString(dataspacekeyState)).append("\n");
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

