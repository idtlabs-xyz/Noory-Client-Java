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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * Provides reasons for which an account might be blocked.
 */
@ApiModel(description = "Provides reasons for which an account might be blocked.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-05T21:17:14.717Z")
public class AccountVerification {
  /**
   * Reason that account is disabled or will be disabled
   */
  @JsonAdapter(DisabledReasonEnum.Adapter.class)
  public enum DisabledReasonEnum {
    REJECTED_FRAUD("rejected_fraud"),
    
    REJECTED_TERMS_OF_SERVICE("rejected_terms_of_service"),
    
    REJECTED_LISTED("rejected_listed"),
    
    UNDER_REVIEW("under_review"),
    
    REJECTED_OTHER("rejected_other"),
    
    FIELDS_NEEDED("fields_needed"),
    
    LISTED("listed"),
    
    OTHER("other");

    private String value;

    DisabledReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DisabledReasonEnum fromValue(String text) {
      for (DisabledReasonEnum b : DisabledReasonEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DisabledReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DisabledReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DisabledReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DisabledReasonEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("disabledReason")
  private DisabledReasonEnum disabledReason = null;

  @SerializedName("dueBy")
  private LocalDate dueBy = null;

  @SerializedName("fieldsNeeded")
  private  fieldsNeeded = null;

  public AccountVerification disabledReason(DisabledReasonEnum disabledReason) {
    this.disabledReason = disabledReason;
    return this;
  }

   /**
   * Reason that account is disabled or will be disabled
   * @return disabledReason
  **/
  @ApiModelProperty(required = true, value = "Reason that account is disabled or will be disabled")
  public DisabledReasonEnum getDisabledReason() {
    return disabledReason;
  }

  public void setDisabledReason(DisabledReasonEnum disabledReason) {
    this.disabledReason = disabledReason;
  }

  public AccountVerification dueBy(LocalDate dueBy) {
    this.dueBy = dueBy;
    return this;
  }

   /**
   * If this date is in the future, fields_needed must be provided to ensure the account remains in good standing
   * @return dueBy
  **/
  @ApiModelProperty(example = "2018-01-01T00:00:00.000Z", value = "If this date is in the future, fields_needed must be provided to ensure the account remains in good standing")
  public LocalDate getDueBy() {
    return dueBy;
  }

  public void setDueBy(LocalDate dueBy) {
    this.dueBy = dueBy;
  }

  public AccountVerification fieldsNeeded( fieldsNeeded) {
    this.fieldsNeeded = fieldsNeeded;
    return this;
  }

  public AccountVerification addFieldsNeededItem( fieldsNeededItem) {
    if (this.fieldsNeeded == null) {
      this.fieldsNeeded = ;
    }
    this.fieldsNeeded.add(fieldsNeededItem);
    return this;
  }

   /**
   * Field names that need to be provided for the account to remain in good standing
   * @return fieldsNeeded
  **/
  @ApiModelProperty(value = "Field names that need to be provided for the account to remain in good standing")
  public  getFieldsNeeded() {
    return fieldsNeeded;
  }

  public void setFieldsNeeded( fieldsNeeded) {
    this.fieldsNeeded = fieldsNeeded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountVerification accountVerification = (AccountVerification) o;
    return Objects.equals(this.disabledReason, accountVerification.disabledReason) &&
        Objects.equals(this.dueBy, accountVerification.dueBy) &&
        Objects.equals(this.fieldsNeeded, accountVerification.fieldsNeeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabledReason, dueBy, fieldsNeeded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountVerification {\n");
    
    sb.append("    disabledReason: ").append(toIndentedString(disabledReason)).append("\n");
    sb.append("    dueBy: ").append(toIndentedString(dueBy)).append("\n");
    sb.append("    fieldsNeeded: ").append(toIndentedString(fieldsNeeded)).append("\n");
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

