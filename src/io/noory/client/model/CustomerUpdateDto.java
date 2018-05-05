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
 * CustomerUpdateDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-05T21:17:14.717Z")
public class CustomerUpdateDto {
  @SerializedName("name")
  private String name = null;

  @SerializedName("externalID")
  private String externalID = null;

  /**
   * Three-letter ISO code for the default currency to associate with this customer. If charges or payments requests are created from this customer and no currency specified, this default currency is used. Should be a currency supported by noory. See {link} for a list of currencies supported by Noory
   */
  @JsonAdapter(DefaultCurrencyEnum.Adapter.class)
  public enum DefaultCurrencyEnum {
    SLL("SLL");

    private String value;

    DefaultCurrencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DefaultCurrencyEnum fromValue(String text) {
      for (DefaultCurrencyEnum b : DefaultCurrencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DefaultCurrencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DefaultCurrencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DefaultCurrencyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DefaultCurrencyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("defaultCurrency")
  private DefaultCurrencyEnum defaultCurrency = DefaultCurrencyEnum.SLL;

  @SerializedName("email")
  private String email = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("metadata")
  private Object metadata = null;

  public CustomerUpdateDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of Customer
   * @return name
  **/
  @ApiModelProperty(example = "Salton Massally", required = true, value = "Name of Customer")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomerUpdateDto externalID(String externalID) {
    this.externalID = externalID;
    return this;
  }

   /**
   * External ID of the customer. THis allows applications to associate their own ID with the customer record
   * @return externalID
  **/
  @ApiModelProperty(example = "1", value = "External ID of the customer. THis allows applications to associate their own ID with the customer record")
  public String getExternalID() {
    return externalID;
  }

  public void setExternalID(String externalID) {
    this.externalID = externalID;
  }

  public CustomerUpdateDto defaultCurrency(DefaultCurrencyEnum defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
    return this;
  }

   /**
   * Three-letter ISO code for the default currency to associate with this customer. If charges or payments requests are created from this customer and no currency specified, this default currency is used. Should be a currency supported by noory. See {link} for a list of currencies supported by Noory
   * @return defaultCurrency
  **/
  @ApiModelProperty(example = "SLL", value = "Three-letter ISO code for the default currency to associate with this customer. If charges or payments requests are created from this customer and no currency specified, this default currency is used. Should be a currency supported by noory. See {link} for a list of currencies supported by Noory")
  public DefaultCurrencyEnum getDefaultCurrency() {
    return defaultCurrency;
  }

  public void setDefaultCurrency(DefaultCurrencyEnum defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  public CustomerUpdateDto email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of the customer
   * @return email
  **/
  @ApiModelProperty(example = "smassally@idtlabs.xyz", value = "Email of the customer")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CustomerUpdateDto phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Phone Number of the customer
   * @return phone
  **/
  @ApiModelProperty(example = "23277772772", value = "Phone Number of the customer")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public CustomerUpdateDto address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Customer&#39;s address
   * @return address
  **/
  @ApiModelProperty(value = "Customer's address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public CustomerUpdateDto locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Locale of the customer. Allows us to present content in the user&#39;s local language
   * @return locale
  **/
  @ApiModelProperty(example = "en_GB", value = "Locale of the customer. Allows us to present content in the user's local language")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public CustomerUpdateDto metadata(Object metadata) {
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
    CustomerUpdateDto customerUpdateDto = (CustomerUpdateDto) o;
    return Objects.equals(this.name, customerUpdateDto.name) &&
        Objects.equals(this.externalID, customerUpdateDto.externalID) &&
        Objects.equals(this.defaultCurrency, customerUpdateDto.defaultCurrency) &&
        Objects.equals(this.email, customerUpdateDto.email) &&
        Objects.equals(this.phone, customerUpdateDto.phone) &&
        Objects.equals(this.address, customerUpdateDto.address) &&
        Objects.equals(this.locale, customerUpdateDto.locale) &&
        Objects.equals(this.metadata, customerUpdateDto.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, externalID, defaultCurrency, email, phone, address, locale, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerUpdateDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    externalID: ").append(toIndentedString(externalID)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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

