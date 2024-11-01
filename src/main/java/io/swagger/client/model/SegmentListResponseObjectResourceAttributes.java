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
import io.swagger.client.model.SegmentDefinition;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * SegmentListResponseObjectResourceAttributes
 */



public class SegmentListResponseObjectResourceAttributes {
  @SerializedName("name")
  private String name = null;

  @SerializedName("definition")
  private SegmentDefinition definition = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("updated")
  private OffsetDateTime updated = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

  @SerializedName("is_processing")
  private Boolean isProcessing = null;

  @SerializedName("is_starred")
  private Boolean isStarred = null;

  public SegmentListResponseObjectResourceAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A helpful name to label the segment
   * @return name
  **/
  @Schema(example = "Repeat Purchasers", description = "A helpful name to label the segment")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SegmentListResponseObjectResourceAttributes definition(SegmentDefinition definition) {
    this.definition = definition;
    return this;
  }

   /**
   * Get definition
   * @return definition
  **/
  @Schema(description = "")
  public SegmentDefinition getDefinition() {
    return definition;
  }

  public void setDefinition(SegmentDefinition definition) {
    this.definition = definition;
  }

  public SegmentListResponseObjectResourceAttributes created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Date and time when the segment was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)
   * @return created
  **/
  @Schema(example = "2022-11-08T00:00Z", description = "Date and time when the segment was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public SegmentListResponseObjectResourceAttributes updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Date and time when the segment was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)
   * @return updated
  **/
  @Schema(example = "2022-11-08T00:00Z", description = "Date and time when the segment was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)")
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }

  public SegmentListResponseObjectResourceAttributes isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @Schema(required = true, description = "")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public SegmentListResponseObjectResourceAttributes isProcessing(Boolean isProcessing) {
    this.isProcessing = isProcessing;
    return this;
  }

   /**
   * Get isProcessing
   * @return isProcessing
  **/
  @Schema(required = true, description = "")
  public Boolean isIsProcessing() {
    return isProcessing;
  }

  public void setIsProcessing(Boolean isProcessing) {
    this.isProcessing = isProcessing;
  }

  public SegmentListResponseObjectResourceAttributes isStarred(Boolean isStarred) {
    this.isStarred = isStarred;
    return this;
  }

   /**
   * Get isStarred
   * @return isStarred
  **/
  @Schema(required = true, description = "")
  public Boolean isIsStarred() {
    return isStarred;
  }

  public void setIsStarred(Boolean isStarred) {
    this.isStarred = isStarred;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentListResponseObjectResourceAttributes segmentListResponseObjectResourceAttributes = (SegmentListResponseObjectResourceAttributes) o;
    return Objects.equals(this.name, segmentListResponseObjectResourceAttributes.name) &&
        Objects.equals(this.definition, segmentListResponseObjectResourceAttributes.definition) &&
        Objects.equals(this.created, segmentListResponseObjectResourceAttributes.created) &&
        Objects.equals(this.updated, segmentListResponseObjectResourceAttributes.updated) &&
        Objects.equals(this.isActive, segmentListResponseObjectResourceAttributes.isActive) &&
        Objects.equals(this.isProcessing, segmentListResponseObjectResourceAttributes.isProcessing) &&
        Objects.equals(this.isStarred, segmentListResponseObjectResourceAttributes.isStarred);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, definition, created, updated, isActive, isProcessing, isStarred);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentListResponseObjectResourceAttributes {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isProcessing: ").append(toIndentedString(isProcessing)).append("\n");
    sb.append("    isStarred: ").append(toIndentedString(isStarred)).append("\n");
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
