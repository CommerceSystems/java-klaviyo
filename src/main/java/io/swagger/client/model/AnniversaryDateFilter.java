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
 * AnniversaryDateFilter
 */



public class AnniversaryDateFilter implements OneOfBounceDateFilterFilter, OneOfInvalidEmailDateFilterFilter, OneOfManualSuppressionDateFilterFilter, OneOfProfilePropertyConditionFilter, OneOfStatusDateFilterFilter {
  @SerializedName("type")
  private DateEnum type = null;

  /**
   * Operators for anniversary date filters.
   */
  @JsonAdapter(OperatorEnum.Adapter.class)
  public enum OperatorEnum {
    @SerializedName("anniversary")
    ANNIVERSARY("anniversary"),
    @SerializedName("anniversary-month")
    ANNIVERSARY_MONTH("anniversary-month");

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

  public AnniversaryDateFilter type(DateEnum type) {
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

  public AnniversaryDateFilter operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Operators for anniversary date filters.
   * @return operator
  **/
  @Schema(required = true, description = "Operators for anniversary date filters.")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnniversaryDateFilter anniversaryDateFilter = (AnniversaryDateFilter) o;
    return Objects.equals(this.type, anniversaryDateFilter.type) &&
        Objects.equals(this.operator, anniversaryDateFilter.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, operator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnniversaryDateFilter {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
