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
/**
 * ImageCreateQueryResourceObjectAttributes
 */



public class ImageCreateQueryResourceObjectAttributes {
  @SerializedName("name")
  private String name = null;

  @SerializedName("import_from_url")
  private String importFromUrl = null;

  @SerializedName("hidden")
  private Boolean hidden = false;

  public ImageCreateQueryResourceObjectAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A name for the image.  Defaults to the filename if not provided.  If the name matches an existing image, a suffix will be added.
   * @return name
  **/
  @Schema(description = "A name for the image.  Defaults to the filename if not provided.  If the name matches an existing image, a suffix will be added.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ImageCreateQueryResourceObjectAttributes importFromUrl(String importFromUrl) {
    this.importFromUrl = importFromUrl;
    return this;
  }

   /**
   * An existing image url to import the image from. Alternatively, you may specify a base-64 encoded data-uri (&#x60;data:image/...&#x60;). Supported image formats: jpeg,png,gif. Maximum image size: 5MB.
   * @return importFromUrl
  **/
  @Schema(example = "https://www.example.com/example.jpg", required = true, description = "An existing image url to import the image from. Alternatively, you may specify a base-64 encoded data-uri (`data:image/...`). Supported image formats: jpeg,png,gif. Maximum image size: 5MB.")
  public String getImportFromUrl() {
    return importFromUrl;
  }

  public void setImportFromUrl(String importFromUrl) {
    this.importFromUrl = importFromUrl;
  }

  public ImageCreateQueryResourceObjectAttributes hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * If true, this image is not shown in the asset library.
   * @return hidden
  **/
  @Schema(description = "If true, this image is not shown in the asset library.")
  public Boolean isHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageCreateQueryResourceObjectAttributes imageCreateQueryResourceObjectAttributes = (ImageCreateQueryResourceObjectAttributes) o;
    return Objects.equals(this.name, imageCreateQueryResourceObjectAttributes.name) &&
        Objects.equals(this.importFromUrl, imageCreateQueryResourceObjectAttributes.importFromUrl) &&
        Objects.equals(this.hidden, imageCreateQueryResourceObjectAttributes.hidden);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, importFromUrl, hidden);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageCreateQueryResourceObjectAttributes {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    importFromUrl: ").append(toIndentedString(importFromUrl)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
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
