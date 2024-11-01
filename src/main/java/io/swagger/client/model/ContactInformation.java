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
import io.swagger.client.model.StreetAddress;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ContactInformation
 */



public class ContactInformation {
  @SerializedName("default_sender_name")
  private String defaultSenderName = null;

  @SerializedName("default_sender_email")
  private String defaultSenderEmail = null;

  @SerializedName("website_url")
  private String websiteUrl = null;

  @SerializedName("organization_name")
  private String organizationName = null;

  @SerializedName("street_address")
  private StreetAddress streetAddress = null;

  public ContactInformation defaultSenderName(String defaultSenderName) {
    this.defaultSenderName = defaultSenderName;
    return this;
  }

   /**
   * This field is used to auto-populate the default sender name on flow and campaign emails.
   * @return defaultSenderName
  **/
  @Schema(example = "Klaviyo Demo", required = true, description = "This field is used to auto-populate the default sender name on flow and campaign emails.")
  public String getDefaultSenderName() {
    return defaultSenderName;
  }

  public void setDefaultSenderName(String defaultSenderName) {
    this.defaultSenderName = defaultSenderName;
  }

  public ContactInformation defaultSenderEmail(String defaultSenderEmail) {
    this.defaultSenderEmail = defaultSenderEmail;
    return this;
  }

   /**
   * This field is used to auto-populate the default sender email address on flow and campaign emails.
   * @return defaultSenderEmail
  **/
  @Schema(example = "contact@klaviyo-demo.com", required = true, description = "This field is used to auto-populate the default sender email address on flow and campaign emails.")
  public String getDefaultSenderEmail() {
    return defaultSenderEmail;
  }

  public void setDefaultSenderEmail(String defaultSenderEmail) {
    this.defaultSenderEmail = defaultSenderEmail;
  }

  public ContactInformation websiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
    return this;
  }

   /**
   * Get websiteUrl
   * @return websiteUrl
  **/
  @Schema(example = "https://www.klaviyo.com", description = "")
  public String getWebsiteUrl() {
    return websiteUrl;
  }

  public void setWebsiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
  }

  public ContactInformation organizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

   /**
   * Get organizationName
   * @return organizationName
  **/
  @Schema(example = "Klaviyo Demo", required = true, description = "")
  public String getOrganizationName() {
    return organizationName;
  }

  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  public ContactInformation streetAddress(StreetAddress streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * Get streetAddress
   * @return streetAddress
  **/
  @Schema(required = true, description = "")
  public StreetAddress getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(StreetAddress streetAddress) {
    this.streetAddress = streetAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactInformation contactInformation = (ContactInformation) o;
    return Objects.equals(this.defaultSenderName, contactInformation.defaultSenderName) &&
        Objects.equals(this.defaultSenderEmail, contactInformation.defaultSenderEmail) &&
        Objects.equals(this.websiteUrl, contactInformation.websiteUrl) &&
        Objects.equals(this.organizationName, contactInformation.organizationName) &&
        Objects.equals(this.streetAddress, contactInformation.streetAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultSenderName, defaultSenderEmail, websiteUrl, organizationName, streetAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactInformation {\n");
    
    sb.append("    defaultSenderName: ").append(toIndentedString(defaultSenderName)).append("\n");
    sb.append("    defaultSenderEmail: ").append(toIndentedString(defaultSenderEmail)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
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
