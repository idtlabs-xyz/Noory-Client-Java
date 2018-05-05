package io.noory.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.noory.client.model.Account;
import io.noory.client.model.Source;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Customer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-05T21:17:14.717Z")
public class Customer {
  @SerializedName("id")
  private String id = null;

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
  private DefaultCurrencyEnum defaultCurrency = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("sources")
  private List<Source> sources = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("account")
  private Account account = null;

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

  public Customer id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of Customer
   * @return id
  **/
  @ApiModelProperty(value = "ID of Customer")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Customer name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of Customer
   * @return name
  **/
  @ApiModelProperty(example = "Salton Massally", value = "Name of Customer")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Customer externalID(String externalID) {
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

  public Customer defaultCurrency(DefaultCurrencyEnum defaultCurrency) {
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

  public Customer email(String email) {
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

  public Customer address(String address) {
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

  public Customer phone(String phone) {
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

  public Customer sources(List<Source> sources) {
    this.sources = sources;
    return this;
  }

  public Customer addSourcesItem(Source sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<Source>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * Get sources
   * @return sources
  **/
  @ApiModelProperty(value = "")
  public List<Source> getSources() {
    return sources;
  }

  public void setSources(List<Source> sources) {
    this.sources = sources;
  }

  public Customer locale(String locale) {
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

  public Customer account(Account account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public Customer metadata(Object metadata) {
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

  public Customer active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Customer is active
   * @return active
  **/
  @ApiModelProperty(value = "Customer is active")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Customer deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Customer record has been soft deleted
   * @return deleted
  **/
  @ApiModelProperty(value = "Customer record has been soft deleted")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public Customer created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Date on which customer was created
   * @return created
  **/
  @ApiModelProperty(example = "2018-01-01T12:34:03.000Z", value = "Date on which customer was created")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public Customer modified(String modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Date on which customer was modified
   * @return modified
  **/
  @ApiModelProperty(example = "2018-01-01T12:34:03.000Z", value = "Date on which customer was modified")
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
    Customer customer = (Customer) o;
    return Objects.equals(this.id, customer.id) &&
        Objects.equals(this.name, customer.name) &&
        Objects.equals(this.externalID, customer.externalID) &&
        Objects.equals(this.defaultCurrency, customer.defaultCurrency) &&
        Objects.equals(this.email, customer.email) &&
        Objects.equals(this.address, customer.address) &&
        Objects.equals(this.phone, customer.phone) &&
        Objects.equals(this.sources, customer.sources) &&
        Objects.equals(this.locale, customer.locale) &&
        Objects.equals(this.account, customer.account) &&
        Objects.equals(this.metadata, customer.metadata) &&
        Objects.equals(this.active, customer.active) &&
        Objects.equals(this.deleted, customer.deleted) &&
        Objects.equals(this.created, customer.created) &&
        Objects.equals(this.modified, customer.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, externalID, defaultCurrency, email, address, phone, sources, locale, account, metadata, active, deleted, created, modified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    externalID: ").append(toIndentedString(externalID)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

