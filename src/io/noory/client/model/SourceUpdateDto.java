package io.noory.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Source objects allow you to accept a variety of payment methods. They represent a customer&#39;s payment instrument and can be used with the Noory API just like a card object once chargeable, they can be charged, or attached to customers. 
 */
@ApiModel(description = "Source objects allow you to accept a variety of payment methods. They represent a customer's payment instrument and can be used with the Noory API just like a card object once chargeable, they can be charged, or attached to customers. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-05T21:17:14.717Z")
public class SourceUpdateDto {
  @SerializedName("name")
  private String name = null;

  @SerializedName("metadata")
  private Object metadata = null;

  public SourceUpdateDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Human readble name of Source
   * @return name
  **/
  @ApiModelProperty(example = "Salton Massally, AfriMoney Wallet", required = true, value = "Human readble name of Source")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SourceUpdateDto metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Used to store Arbitrary data
   * @return metadata
  **/
  @ApiModelProperty(value = "Used to store Arbitrary data")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceUpdateDto sourceUpdateDto = (SourceUpdateDto) o;
    return Objects.equals(this.name, sourceUpdateDto.name) &&
        Objects.equals(this.metadata, sourceUpdateDto.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceUpdateDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

