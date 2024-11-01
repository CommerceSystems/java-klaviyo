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
import io.swagger.client.model.ConstantContactEnum;
import io.swagger.client.model.InEnum;
import io.swagger.client.model.StringEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ConstantContactIntegrationFilter
 */



public class ConstantContactIntegrationFilter {
  @SerializedName("type")
  private StringEnum type = null;

  @SerializedName("operator")
  private InEnum operator = null;

  @SerializedName("value")
  private List<ConstantContactEnum> value = new ArrayList<ConstantContactEnum>();

  public ConstantContactIntegrationFilter type(StringEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public StringEnum getType() {
    return type;
  }

  public void setType(StringEnum type) {
    this.type = type;
  }

  public ConstantContactIntegrationFilter operator(InEnum operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @Schema(required = true, description = "")
  public InEnum getOperator() {
    return operator;
  }

  public void setOperator(InEnum operator) {
    this.operator = operator;
  }

  public ConstantContactIntegrationFilter value(List<ConstantContactEnum> value) {
    this.value = value;
    return this;
  }

  public ConstantContactIntegrationFilter addValueItem(ConstantContactEnum valueItem) {
    this.value.add(valueItem);
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(required = true, description = "")
  public List<ConstantContactEnum> getValue() {
    return value;
  }

  public void setValue(List<ConstantContactEnum> value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConstantContactIntegrationFilter constantContactIntegrationFilter = (ConstantContactIntegrationFilter) o;
    return Objects.equals(this.type, constantContactIntegrationFilter.type) &&
        Objects.equals(this.operator, constantContactIntegrationFilter.operator) &&
        Objects.equals(this.value, constantContactIntegrationFilter.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, operator, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConstantContactIntegrationFilter {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
