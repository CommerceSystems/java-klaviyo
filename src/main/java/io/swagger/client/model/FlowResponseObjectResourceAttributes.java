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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * FlowResponseObjectResourceAttributes
 */



public class FlowResponseObjectResourceAttributes {
  @SerializedName("name")
  private String name = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("archived")
  private Boolean archived = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("updated")
  private OffsetDateTime updated = null;

  /**
   * Corresponds to the object which triggered the flow.
   */
  @JsonAdapter(TriggerTypeEnum.Adapter.class)
  public enum TriggerTypeEnum {
    @SerializedName("Added to List")
    ADDED_TO_LIST("Added to List"),
    @SerializedName("Date Based")
    DATE_BASED("Date Based"),
    @SerializedName("Low Inventory")
    LOW_INVENTORY("Low Inventory"),
    @SerializedName("Metric")
    METRIC("Metric"),
    @SerializedName("Price Drop")
    PRICE_DROP("Price Drop"),
    @SerializedName("Unconfigured")
    UNCONFIGURED("Unconfigured");

    private String value;

    TriggerTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TriggerTypeEnum fromValue(String input) {
      for (TriggerTypeEnum b : TriggerTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TriggerTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TriggerTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TriggerTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TriggerTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("trigger_type")
  private TriggerTypeEnum triggerType = null;

  public FlowResponseObjectResourceAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FlowResponseObjectResourceAttributes status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public FlowResponseObjectResourceAttributes archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

   /**
   * Get archived
   * @return archived
  **/
  @Schema(description = "")
  public Boolean isArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public FlowResponseObjectResourceAttributes created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @Schema(example = "2022-11-08T00:00Z", description = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public FlowResponseObjectResourceAttributes updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @Schema(example = "2022-11-08T00:00Z", description = "")
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }

  public FlowResponseObjectResourceAttributes triggerType(TriggerTypeEnum triggerType) {
    this.triggerType = triggerType;
    return this;
  }

   /**
   * Corresponds to the object which triggered the flow.
   * @return triggerType
  **/
  @Schema(description = "Corresponds to the object which triggered the flow.")
  public TriggerTypeEnum getTriggerType() {
    return triggerType;
  }

  public void setTriggerType(TriggerTypeEnum triggerType) {
    this.triggerType = triggerType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowResponseObjectResourceAttributes flowResponseObjectResourceAttributes = (FlowResponseObjectResourceAttributes) o;
    return Objects.equals(this.name, flowResponseObjectResourceAttributes.name) &&
        Objects.equals(this.status, flowResponseObjectResourceAttributes.status) &&
        Objects.equals(this.archived, flowResponseObjectResourceAttributes.archived) &&
        Objects.equals(this.created, flowResponseObjectResourceAttributes.created) &&
        Objects.equals(this.updated, flowResponseObjectResourceAttributes.updated) &&
        Objects.equals(this.triggerType, flowResponseObjectResourceAttributes.triggerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, archived, created, updated, triggerType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowResponseObjectResourceAttributes {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
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
