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
 * ImageResponseObjectResourceAttributes
 */



public class ImageResponseObjectResourceAttributes {
  @SerializedName("name")
  private String name = null;

  @SerializedName("image_url")
  private String imageUrl = null;

  @SerializedName("format")
  private String format = null;

  @SerializedName("size")
  private Integer size = null;

  @SerializedName("hidden")
  private Boolean hidden = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  public ImageResponseObjectResourceAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ImageResponseObjectResourceAttributes imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @Schema(required = true, description = "")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public ImageResponseObjectResourceAttributes format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @Schema(required = true, description = "")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public ImageResponseObjectResourceAttributes size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(required = true, description = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public ImageResponseObjectResourceAttributes hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * Get hidden
   * @return hidden
  **/
  @Schema(required = true, description = "")
  public Boolean isHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public ImageResponseObjectResourceAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(example = "2022-11-08T00:00Z", required = true, description = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageResponseObjectResourceAttributes imageResponseObjectResourceAttributes = (ImageResponseObjectResourceAttributes) o;
    return Objects.equals(this.name, imageResponseObjectResourceAttributes.name) &&
        Objects.equals(this.imageUrl, imageResponseObjectResourceAttributes.imageUrl) &&
        Objects.equals(this.format, imageResponseObjectResourceAttributes.format) &&
        Objects.equals(this.size, imageResponseObjectResourceAttributes.size) &&
        Objects.equals(this.hidden, imageResponseObjectResourceAttributes.hidden) &&
        Objects.equals(this.updatedAt, imageResponseObjectResourceAttributes.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, imageUrl, format, size, hidden, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageResponseObjectResourceAttributes {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
