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
import io.swagger.client.model.MetricResponseObjectResource;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * GetMetricPropertyResponseCompoundDocument
 */



public class GetMetricPropertyResponseCompoundDocument {
  @SerializedName("data")
  private AllOfGetMetricPropertyResponseCompoundDocumentData data = null;

  @SerializedName("included")
  private List<MetricResponseObjectResource> included = null;

  public GetMetricPropertyResponseCompoundDocument data(AllOfGetMetricPropertyResponseCompoundDocumentData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(required = true, description = "")
  public AllOfGetMetricPropertyResponseCompoundDocumentData getData() {
    return data;
  }

  public void setData(AllOfGetMetricPropertyResponseCompoundDocumentData data) {
    this.data = data;
  }

  public GetMetricPropertyResponseCompoundDocument included(List<MetricResponseObjectResource> included) {
    this.included = included;
    return this;
  }

  public GetMetricPropertyResponseCompoundDocument addIncludedItem(MetricResponseObjectResource includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<MetricResponseObjectResource>();
    }
    this.included.add(includedItem);
    return this;
  }

   /**
   * Get included
   * @return included
  **/
  @Schema(description = "")
  public List<MetricResponseObjectResource> getIncluded() {
    return included;
  }

  public void setIncluded(List<MetricResponseObjectResource> included) {
    this.included = included;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMetricPropertyResponseCompoundDocument getMetricPropertyResponseCompoundDocument = (GetMetricPropertyResponseCompoundDocument) o;
    return Objects.equals(this.data, getMetricPropertyResponseCompoundDocument.data) &&
        Objects.equals(this.included, getMetricPropertyResponseCompoundDocument.included);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMetricPropertyResponseCompoundDocument {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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
