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
import io.swagger.client.model.EventCreateQueryV2ResourceObjectAttributesMetric;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
/**
 * BaseEventCreateQueryResourceObjectAttributes
 */



public class BaseEventCreateQueryResourceObjectAttributes {
  @SerializedName("properties")
  private Object properties = null;

  @SerializedName("time")
  private OffsetDateTime time = null;

  @SerializedName("value")
  private BigDecimal value = null;

  @SerializedName("value_currency")
  private String valueCurrency = null;

  @SerializedName("unique_id")
  private String uniqueId = null;

  @SerializedName("metric")
  private EventCreateQueryV2ResourceObjectAttributesMetric metric = null;

  public BaseEventCreateQueryResourceObjectAttributes properties(Object properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Properties of this event. Any top level property (that are not objects) can be used to create segments. The $extra property is a special property. This records any non-segmentable values that can be referenced later. For example, HTML templates are useful on a segment but are not used to create a segment. There are limits placed onto the size of the data present. This must not exceed 5 MB. This must not exceed 300 event properties. A single string cannot be larger than 100 KB. Each array must not exceed 4000 elements. The properties cannot contain more than 10 nested levels.
   * @return properties
  **/
  @Schema(example = "{\"Brand\":\"Kids Book\",\"Categories\":[\"Fiction\",\"Children\"],\"ProductID\":1111,\"ProductName\":\"Winnie the Pooh\",\"$extra\":{\"URL\":\"http://www.example.com/path/to/product\",\"ImageURL\":\"http://www.example.com/path/to/product/image.png\"}}", required = true, description = "Properties of this event. Any top level property (that are not objects) can be used to create segments. The $extra property is a special property. This records any non-segmentable values that can be referenced later. For example, HTML templates are useful on a segment but are not used to create a segment. There are limits placed onto the size of the data present. This must not exceed 5 MB. This must not exceed 300 event properties. A single string cannot be larger than 100 KB. Each array must not exceed 4000 elements. The properties cannot contain more than 10 nested levels.")
  public Object getProperties() {
    return properties;
  }

  public void setProperties(Object properties) {
    this.properties = properties;
  }

  public BaseEventCreateQueryResourceObjectAttributes time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

   /**
   * When this event occurred. By default, the time the request was received will be used. The time is truncated to the second. The time must be after the year 2000 and can only be up to 1 year in the future.
   * @return time
  **/
  @Schema(example = "2022-11-08T00:00Z", description = "When this event occurred. By default, the time the request was received will be used. The time is truncated to the second. The time must be after the year 2000 and can only be up to 1 year in the future.")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public BaseEventCreateQueryResourceObjectAttributes value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * A numeric, monetary value to associate with this event. For example, the dollar amount of a purchase.
   * @return value
  **/
  @Schema(example = "9.99", description = "A numeric, monetary value to associate with this event. For example, the dollar amount of a purchase.")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public BaseEventCreateQueryResourceObjectAttributes valueCurrency(String valueCurrency) {
    this.valueCurrency = valueCurrency;
    return this;
  }

   /**
   * The ISO 4217 currency code of the value associated with the event.
   * @return valueCurrency
  **/
  @Schema(example = "USD", description = "The ISO 4217 currency code of the value associated with the event.")
  public String getValueCurrency() {
    return valueCurrency;
  }

  public void setValueCurrency(String valueCurrency) {
    this.valueCurrency = valueCurrency;
  }

  public BaseEventCreateQueryResourceObjectAttributes uniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * A unique identifier for an event. If the unique_id is repeated for the same profile and metric, only the first processed event will be recorded. If this is not present, this will use the time to the second. Using the default, this limits only one event per profile per second.
   * @return uniqueId
  **/
  @Schema(description = "A unique identifier for an event. If the unique_id is repeated for the same profile and metric, only the first processed event will be recorded. If this is not present, this will use the time to the second. Using the default, this limits only one event per profile per second.")
  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  public BaseEventCreateQueryResourceObjectAttributes metric(EventCreateQueryV2ResourceObjectAttributesMetric metric) {
    this.metric = metric;
    return this;
  }

   /**
   * Get metric
   * @return metric
  **/
  @Schema(required = true, description = "")
  public EventCreateQueryV2ResourceObjectAttributesMetric getMetric() {
    return metric;
  }

  public void setMetric(EventCreateQueryV2ResourceObjectAttributesMetric metric) {
    this.metric = metric;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseEventCreateQueryResourceObjectAttributes baseEventCreateQueryResourceObjectAttributes = (BaseEventCreateQueryResourceObjectAttributes) o;
    return Objects.equals(this.properties, baseEventCreateQueryResourceObjectAttributes.properties) &&
        Objects.equals(this.time, baseEventCreateQueryResourceObjectAttributes.time) &&
        Objects.equals(this.value, baseEventCreateQueryResourceObjectAttributes.value) &&
        Objects.equals(this.valueCurrency, baseEventCreateQueryResourceObjectAttributes.valueCurrency) &&
        Objects.equals(this.uniqueId, baseEventCreateQueryResourceObjectAttributes.uniqueId) &&
        Objects.equals(this.metric, baseEventCreateQueryResourceObjectAttributes.metric);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties, time, value, valueCurrency, uniqueId, metric);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseEventCreateQueryResourceObjectAttributes {\n");
    
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueCurrency: ").append(toIndentedString(valueCurrency)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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
