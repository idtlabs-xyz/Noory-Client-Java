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
public class Source {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Three-letter ISO code for the currency of this payment Source
   */
  @JsonAdapter(CurrencyEnum.Adapter.class)
  public enum CurrencyEnum {
    SLL("SLL");

    private String value;

    CurrencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CurrencyEnum fromValue(String text) {
      for (CurrencyEnum b : CurrencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CurrencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CurrencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CurrencyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CurrencyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("currency")
  private CurrencyEnum currency = null;

  /**
   * Nature of the source. Can be either of Card, Bank Account, Mobile Money
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CARD("card"),
    
    NOORY("noory"),
    
    BANK_ACCOUNT("bank_account"),
    
    MOBILE_MONEY("mobile_money");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  /**
   * Issuer that supports/issued this payment source.
   */
  @JsonAdapter(IssuerEnum.Adapter.class)
  public enum IssuerEnum {
    AFRIMONEY("afrimoney"),
    
    ORANGEMONEY("orangeMoney"),
    
    NOORY("noory");

    private String value;

    IssuerEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IssuerEnum fromValue(String text) {
      for (IssuerEnum b : IssuerEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IssuerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IssuerEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IssuerEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return IssuerEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("issuer")
  private IssuerEnum issuer = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("defaultSource")
  private Boolean defaultSource = false;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("modified")
  private String modified = null;

  public Source id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of Source
   * @return id
  **/
  @ApiModelProperty(value = "ID of Source")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Source name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Human readble name of Source
   * @return name
  **/
  @ApiModelProperty(example = "Salton Massally, AfriMoney Wallet", value = "Human readble name of Source")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Source currency(CurrencyEnum currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Three-letter ISO code for the currency of this payment Source
   * @return currency
  **/
  @ApiModelProperty(example = "SLL", value = "Three-letter ISO code for the currency of this payment Source")
  public CurrencyEnum getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }

  public Source type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Nature of the source. Can be either of Card, Bank Account, Mobile Money
   * @return type
  **/
  @ApiModelProperty(example = "mobile_money", value = "Nature of the source. Can be either of Card, Bank Account, Mobile Money")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Source issuer(IssuerEnum issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Issuer that supports/issued this payment source.
   * @return issuer
  **/
  @ApiModelProperty(example = "afrimoney", value = "Issuer that supports/issued this payment source.")
  public IssuerEnum getIssuer() {
    return issuer;
  }

  public void setIssuer(IssuerEnum issuer) {
    this.issuer = issuer;
  }

  public Source identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Primary account number for source. For mobile money this will be a phone number and for banks an account number 
   * @return identifier
  **/
  @ApiModelProperty(example = "23277772772", value = "Primary account number for source. For mobile money this will be a phone number and for banks an account number ")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public Source address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Unique Noory address for the payment source
   * @return address
  **/
  @ApiModelProperty(example = "+23277772772@afrimoney", value = "Unique Noory address for the payment source")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Source defaultSource(Boolean defaultSource) {
    this.defaultSource = defaultSource;
    return this;
  }

   /**
   * Marks a source as being default for a customer
   * @return defaultSource
  **/
  @ApiModelProperty(value = "Marks a source as being default for a customer")
  public Boolean isDefaultSource() {
    return defaultSource;
  }

  public void setDefaultSource(Boolean defaultSource) {
    this.defaultSource = defaultSource;
  }

  public Source metadata(Object metadata) {
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

  public Source active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Source is active
   * @return active
  **/
  @ApiModelProperty(value = "Source is active")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Source deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Source record has been soft deleted
   * @return deleted
  **/
  @ApiModelProperty(value = "Source record has been soft deleted")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public Source created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Date on which source was created
   * @return created
  **/
  @ApiModelProperty(example = "2018-01-01T12:34:03.000Z", value = "Date on which source was created")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public Source modified(String modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Date on which source was modified
   * @return modified
  **/
  @ApiModelProperty(example = "2018-01-01T12:34:03.000Z", value = "Date on which source was modified")
  public String getModified() {
    return modified;
  }

  public void setModified(String modified) {
    this.modified = modified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Source source = (Source) o;
    return Objects.equals(this.id, source.id) &&
        Objects.equals(this.name, source.name) &&
        Objects.equals(this.currency, source.currency) &&
        Objects.equals(this.type, source.type) &&
        Objects.equals(this.issuer, source.issuer) &&
        Objects.equals(this.identifier, source.identifier) &&
        Objects.equals(this.address, source.address) &&
        Objects.equals(this.defaultSource, source.defaultSource) &&
        Objects.equals(this.metadata, source.metadata) &&
        Objects.equals(this.active, source.active) &&
        Objects.equals(this.deleted, source.deleted) &&
        Objects.equals(this.created, source.created) &&
        Objects.equals(this.modified, source.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, currency, type, issuer, identifier, address, defaultSource, metadata, active, deleted, created, modified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Source {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    defaultSource: ").append(toIndentedString(defaultSource)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
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

