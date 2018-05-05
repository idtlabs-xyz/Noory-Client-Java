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
 * Schedule that dictates the frequency at which balances of the account are pushed to the bank account of the user
 */
@ApiModel(description = "Schedule that dictates the frequency at which balances of the account are pushed to the bank account of the user")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-05T21:17:14.717Z")
public class Schedule {
  /**
   * Interval of schedule
   */
  @JsonAdapter(IntervalEnum.Adapter.class)
  public enum IntervalEnum {
    SECOND("second"),
    
    MINUTE("minute"),
    
    HOURLY("hourly"),
    
    DAILY("daily"),
    
    WEEKLY("weekly"),
    
    MONTHLY("monthly"),
    
    YEARLY("yearly");

    private String value;

    IntervalEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IntervalEnum fromValue(String text) {
      for (IntervalEnum b : IntervalEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IntervalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IntervalEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IntervalEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return IntervalEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("interval")
  private IntervalEnum interval = null;

  @SerializedName("intervalUnit")
  private Integer intervalUnit = null;

  @SerializedName("max")
  private Integer max = null;

  @SerializedName("start")
  private String start = null;

  @SerializedName("end")
  private String end = null;

  public Schedule interval(IntervalEnum interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Interval of schedule
   * @return interval
  **/
  @ApiModelProperty(value = "Interval of schedule")
  public IntervalEnum getInterval() {
    return interval;
  }

  public void setInterval(IntervalEnum interval) {
    this.interval = interval;
  }

  public Schedule intervalUnit(Integer intervalUnit) {
    this.intervalUnit = intervalUnit;
    return this;
  }

   /**
   * Units of interval
   * minimum: 1
   * @return intervalUnit
  **/
  @ApiModelProperty(value = "Units of interval")
  public Integer getIntervalUnit() {
    return intervalUnit;
  }

  public void setIntervalUnit(Integer intervalUnit) {
    this.intervalUnit = intervalUnit;
  }

  public Schedule max(Integer max) {
    this.max = max;
    return this;
  }

   /**
   * Maximum time a schedule can be run
   * minimum: 0
   * @return max
  **/
  @ApiModelProperty(value = "Maximum time a schedule can be run")
  public Integer getMax() {
    return max;
  }

  public void setMax(Integer max) {
    this.max = max;
  }

  public Schedule start(String start) {
    this.start = start;
    return this;
  }

   /**
   * When schedule shoul start
   * @return start
  **/
  @ApiModelProperty(example = "2018-01-01T11:23:01.000Z", value = "When schedule shoul start")
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public Schedule end(String end) {
    this.end = end;
    return this;
  }

   /**
   * When schedule should end
   * @return end
  **/
  @ApiModelProperty(example = "2018-01-02T11:23:01.000Z", value = "When schedule should end")
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedule schedule = (Schedule) o;
    return Objects.equals(this.interval, schedule.interval) &&
        Objects.equals(this.intervalUnit, schedule.intervalUnit) &&
        Objects.equals(this.max, schedule.max) &&
        Objects.equals(this.start, schedule.start) &&
        Objects.equals(this.end, schedule.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, intervalUnit, max, start, end);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedule {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    intervalUnit: ").append(toIndentedString(intervalUnit)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

