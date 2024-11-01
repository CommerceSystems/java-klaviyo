/*
 * Klaviyo API
 * The Klaviyo REST API. Please visit https://developers.klaviyo.com for more details.
 *
 * OpenAPI spec version: 2024-10-15
 * Contact: developers@klaviyo.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.DateEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * RelativeDateRangeFilter
 */



public class RelativeDateRangeFilter implements OneOfBounceDateFilterFilter, OneOfInvalidEmailDateFilterFilter, OneOfManualSuppressionDateFilterFilter, OneOfProfileHasGroupMembershipConditionTimeframeFilter, OneOfProfileMetricConditionTimeframeFilter, OneOfProfilePropertyConditionFilter, OneOfStatusDateFilterFilter {
  @SerializedName("type")
  private DateEnum type = null;

  /**
   * Operators for relative date range filters.  e.g. \&quot;between 10 and 20 days ago\&quot;
   */
  @JsonAdapter(OperatorEnum.Adapter.class)
  public enum OperatorEnum {
    @SerializedName("between")
    BETWEEN("between");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static OperatorEnum fromValue(String input) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<OperatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperatorEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public OperatorEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return OperatorEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("operator")
  private OperatorEnum operator = null;

  @SerializedName("start")
  private Integer start = null;

  @SerializedName("end")
  private Integer end = null;

  /**
   * Units for relative date filters.
   */
  @JsonAdapter(UnitEnum.Adapter.class)
  public enum UnitEnum {
    @SerializedName("day")
    DAY("day"),
    @SerializedName("hour")
    HOUR("hour"),
    @SerializedName("week")
    WEEK("week");

    private String value;

    UnitEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static UnitEnum fromValue(String input) {
      for (UnitEnum b : UnitEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<UnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UnitEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public UnitEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return UnitEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("unit")
  private UnitEnum unit = null;

  public RelativeDateRangeFilter type(DateEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public DateEnum getType() {
    return type;
  }

  public void setType(DateEnum type) {
    this.type = type;
  }

  public RelativeDateRangeFilter operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Operators for relative date range filters.  e.g. \&quot;between 10 and 20 days ago\&quot;
   * @return operator
  **/
  @Schema(required = true, description = "Operators for relative date range filters.  e.g. \"between 10 and 20 days ago\"")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  public RelativeDateRangeFilter start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @Schema(required = true, description = "")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public RelativeDateRangeFilter end(Integer end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @Schema(required = true, description = "")
  public Integer getEnd() {
    return end;
  }

  public void setEnd(Integer end) {
    this.end = end;
  }

  public RelativeDateRangeFilter unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Units for relative date filters.
   * @return unit
  **/
  @Schema(required = true, description = "Units for relative date filters.")
  public UnitEnum getUnit() {
    return unit;
  }

  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelativeDateRangeFilter relativeDateRangeFilter = (RelativeDateRangeFilter) o;
    return Objects.equals(this.type, relativeDateRangeFilter.type) &&
        Objects.equals(this.operator, relativeDateRangeFilter.operator) &&
        Objects.equals(this.start, relativeDateRangeFilter.start) &&
        Objects.equals(this.end, relativeDateRangeFilter.end) &&
        Objects.equals(this.unit, relativeDateRangeFilter.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, operator, start, end, unit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelativeDateRangeFilter {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
