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
import io.swagger.client.model.BlockDisplayOptions;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * HTMLBlockData
 */



public class HTMLBlockData {
  @SerializedName("content")
  private String content = null;

  @SerializedName("display_options")
  private BlockDisplayOptions displayOptions = null;

  @SerializedName("styles")
  private String styles = null;

  public HTMLBlockData content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @Schema(required = true, description = "")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public HTMLBlockData displayOptions(BlockDisplayOptions displayOptions) {
    this.displayOptions = displayOptions;
    return this;
  }

   /**
   * Get displayOptions
   * @return displayOptions
  **/
  @Schema(required = true, description = "")
  public BlockDisplayOptions getDisplayOptions() {
    return displayOptions;
  }

  public void setDisplayOptions(BlockDisplayOptions displayOptions) {
    this.displayOptions = displayOptions;
  }

  public HTMLBlockData styles(String styles) {
    this.styles = styles;
    return this;
  }

   /**
   * Get styles
   * @return styles
  **/
  @Schema(description = "")
  public String getStyles() {
    return styles;
  }

  public void setStyles(String styles) {
    this.styles = styles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTMLBlockData htMLBlockData = (HTMLBlockData) o;
    return Objects.equals(this.content, htMLBlockData.content) &&
        Objects.equals(this.displayOptions, htMLBlockData.displayOptions) &&
        Objects.equals(this.styles, htMLBlockData.styles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, displayOptions, styles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTMLBlockData {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    displayOptions: ").append(toIndentedString(displayOptions)).append("\n");
    sb.append("    styles: ").append(toIndentedString(styles)).append("\n");
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
