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
import io.swagger.client.model.InvalidEmailDateEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InvalidEmailDateFilter
 */



public class InvalidEmailDateFilter implements OneOfNoEmailMarketingFiltersItems, OneOfNoEmailMarketingNeverSubscribedFiltersItems, OneOfNoEmailMarketingSubscribedFiltersItems {
  @SerializedName("field")
  private InvalidEmailDateEnum field = null;

  @SerializedName("filter")
  private OneOfInvalidEmailDateFilterFilter filter = null;

  public InvalidEmailDateFilter field(InvalidEmailDateEnum field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @Schema(required = true, description = "")
  public InvalidEmailDateEnum getField() {
    return field;
  }

  public void setField(InvalidEmailDateEnum field) {
    this.field = field;
  }

  public InvalidEmailDateFilter filter(OneOfInvalidEmailDateFilterFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @Schema(required = true, description = "")
  public OneOfInvalidEmailDateFilterFilter getFilter() {
    return filter;
  }

  public void setFilter(OneOfInvalidEmailDateFilterFilter filter) {
    this.filter = filter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvalidEmailDateFilter invalidEmailDateFilter = (InvalidEmailDateFilter) o;
    return Objects.equals(this.field, invalidEmailDateFilter.field) &&
        Objects.equals(this.filter, invalidEmailDateFilter.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, filter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvalidEmailDateFilter {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
