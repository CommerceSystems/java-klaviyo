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
 * RenderOptionsSubObject
 */



public class RenderOptionsSubObject {
  @SerializedName("shorten_links")
  private Boolean shortenLinks = true;

  @SerializedName("add_org_prefix")
  private Boolean addOrgPrefix = true;

  @SerializedName("add_info_link")
  private Boolean addInfoLink = true;

  @SerializedName("add_opt_out_language")
  private Boolean addOptOutLanguage = false;

  public RenderOptionsSubObject shortenLinks(Boolean shortenLinks) {
    this.shortenLinks = shortenLinks;
    return this;
  }

   /**
   * Get shortenLinks
   * @return shortenLinks
  **/
  @Schema(example = "true", description = "")
  public Boolean isShortenLinks() {
    return shortenLinks;
  }

  public void setShortenLinks(Boolean shortenLinks) {
    this.shortenLinks = shortenLinks;
  }

  public RenderOptionsSubObject addOrgPrefix(Boolean addOrgPrefix) {
    this.addOrgPrefix = addOrgPrefix;
    return this;
  }

   /**
   * Get addOrgPrefix
   * @return addOrgPrefix
  **/
  @Schema(example = "true", description = "")
  public Boolean isAddOrgPrefix() {
    return addOrgPrefix;
  }

  public void setAddOrgPrefix(Boolean addOrgPrefix) {
    this.addOrgPrefix = addOrgPrefix;
  }

  public RenderOptionsSubObject addInfoLink(Boolean addInfoLink) {
    this.addInfoLink = addInfoLink;
    return this;
  }

   /**
   * Get addInfoLink
   * @return addInfoLink
  **/
  @Schema(example = "true", description = "")
  public Boolean isAddInfoLink() {
    return addInfoLink;
  }

  public void setAddInfoLink(Boolean addInfoLink) {
    this.addInfoLink = addInfoLink;
  }

  public RenderOptionsSubObject addOptOutLanguage(Boolean addOptOutLanguage) {
    this.addOptOutLanguage = addOptOutLanguage;
    return this;
  }

   /**
   * Get addOptOutLanguage
   * @return addOptOutLanguage
  **/
  @Schema(description = "")
  public Boolean isAddOptOutLanguage() {
    return addOptOutLanguage;
  }

  public void setAddOptOutLanguage(Boolean addOptOutLanguage) {
    this.addOptOutLanguage = addOptOutLanguage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenderOptionsSubObject renderOptionsSubObject = (RenderOptionsSubObject) o;
    return Objects.equals(this.shortenLinks, renderOptionsSubObject.shortenLinks) &&
        Objects.equals(this.addOrgPrefix, renderOptionsSubObject.addOrgPrefix) &&
        Objects.equals(this.addInfoLink, renderOptionsSubObject.addInfoLink) &&
        Objects.equals(this.addOptOutLanguage, renderOptionsSubObject.addOptOutLanguage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shortenLinks, addOrgPrefix, addInfoLink, addOptOutLanguage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenderOptionsSubObject {\n");
    
    sb.append("    shortenLinks: ").append(toIndentedString(shortenLinks)).append("\n");
    sb.append("    addOrgPrefix: ").append(toIndentedString(addOrgPrefix)).append("\n");
    sb.append("    addInfoLink: ").append(toIndentedString(addInfoLink)).append("\n");
    sb.append("    addOptOutLanguage: ").append(toIndentedString(addOptOutLanguage)).append("\n");
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
