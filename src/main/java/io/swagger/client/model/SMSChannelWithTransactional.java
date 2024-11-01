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
import io.swagger.client.model.SMSMarketing;
import io.swagger.client.model.SMSTransactional;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SMSChannelWithTransactional
 */



public class SMSChannelWithTransactional implements OneOfSubscriptionsSms {
  @SerializedName("marketing")
  private SMSMarketing marketing = null;

  @SerializedName("transactional")
  private SMSTransactional transactional = null;

  public SMSChannelWithTransactional marketing(SMSMarketing marketing) {
    this.marketing = marketing;
    return this;
  }

   /**
   * Get marketing
   * @return marketing
  **/
  @Schema(description = "")
  public SMSMarketing getMarketing() {
    return marketing;
  }

  public void setMarketing(SMSMarketing marketing) {
    this.marketing = marketing;
  }

  public SMSChannelWithTransactional transactional(SMSTransactional transactional) {
    this.transactional = transactional;
    return this;
  }

   /**
   * Get transactional
   * @return transactional
  **/
  @Schema(description = "")
  public SMSTransactional getTransactional() {
    return transactional;
  }

  public void setTransactional(SMSTransactional transactional) {
    this.transactional = transactional;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SMSChannelWithTransactional smSChannelWithTransactional = (SMSChannelWithTransactional) o;
    return Objects.equals(this.marketing, smSChannelWithTransactional.marketing) &&
        Objects.equals(this.transactional, smSChannelWithTransactional.transactional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketing, transactional);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SMSChannelWithTransactional {\n");
    
    sb.append("    marketing: ").append(toIndentedString(marketing)).append("\n");
    sb.append("    transactional: ").append(toIndentedString(transactional)).append("\n");
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
