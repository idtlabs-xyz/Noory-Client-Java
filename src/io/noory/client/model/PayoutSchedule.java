package io.noory.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.noory.client.model.Schedule;
import io.noory.client.model.Source;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Payout schedule that dictates the frequency at which balances of the account are pushed to the bank account of the user
 */
@ApiModel(description = "Payout schedule that dictates the frequency at which balances of the account are pushed to the bank account of the user")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-05T21:17:14.717Z")
public class PayoutSchedule {
  @SerializedName("schedule")
  private Schedule schedule = null;

  @SerializedName("monthlyAnchor")
  private Integer monthlyAnchor = null;

  @SerializedName("weeklyAnchor")
  private Integer weeklyAnchor = null;

  @SerializedName("source")
  private Source source = null;

  public PayoutSchedule schedule(Schedule schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @ApiModelProperty(value = "")
  public Schedule getSchedule() {
    return schedule;
  }

  public void setSchedule(Schedule schedule) {
    this.schedule = schedule;
  }

  public PayoutSchedule monthlyAnchor(Integer monthlyAnchor) {
    this.monthlyAnchor = monthlyAnchor;
    return this;
  }

   /**
   * The day of the month funds will be paid out. Only if interval is monthly. Payouts scheduled between 29-31st of the month are sent on the last day of shorter months. 
   * @return monthlyAnchor
  **/
  @ApiModelProperty(value = "The day of the month funds will be paid out. Only if interval is monthly. Payouts scheduled between 29-31st of the month are sent on the last day of shorter months. ")
  public Integer getMonthlyAnchor() {
    return monthlyAnchor;
  }

  public void setMonthlyAnchor(Integer monthlyAnchor) {
    this.monthlyAnchor = monthlyAnchor;
  }

  public PayoutSchedule weeklyAnchor(Integer weeklyAnchor) {
    this.weeklyAnchor = weeklyAnchor;
    return this;
  }

   /**
   * The day of the week funds will be paid out, of the style  1 for ‘monday’,  2 ‘tuesday’, etc. Only shown if interval is weekly. 
   * @return weeklyAnchor
  **/
  @ApiModelProperty(value = "The day of the week funds will be paid out, of the style  1 for ‘monday’,  2 ‘tuesday’, etc. Only shown if interval is weekly. ")
  public Integer getWeeklyAnchor() {
    return weeklyAnchor;
  }

  public void setWeeklyAnchor(Integer weeklyAnchor) {
    this.weeklyAnchor = weeklyAnchor;
  }

  public PayoutSchedule source(Source source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public Source getSource() {
    return source;
  }

  public void setSource(Source source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutSchedule payoutSchedule = (PayoutSchedule) o;
    return Objects.equals(this.schedule, payoutSchedule.schedule) &&
        Objects.equals(this.monthlyAnchor, payoutSchedule.monthlyAnchor) &&
        Objects.equals(this.weeklyAnchor, payoutSchedule.weeklyAnchor) &&
        Objects.equals(this.source, payoutSchedule.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedule, monthlyAnchor, weeklyAnchor, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutSchedule {\n");
    
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    monthlyAnchor: ").append(toIndentedString(monthlyAnchor)).append("\n");
    sb.append("    weeklyAnchor: ").append(toIndentedString(weeklyAnchor)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

