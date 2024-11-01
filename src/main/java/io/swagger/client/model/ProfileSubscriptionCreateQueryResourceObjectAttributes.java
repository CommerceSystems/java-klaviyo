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
import io.swagger.client.model.SubscriptionChannels;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.LocalDate;
/**
 * ProfileSubscriptionCreateQueryResourceObjectAttributes
 */



public class ProfileSubscriptionCreateQueryResourceObjectAttributes {
  @SerializedName("email")
  private String email = null;

  @SerializedName("phone_number")
  private String phoneNumber = null;

  @SerializedName("subscriptions")
  private SubscriptionChannels subscriptions = null;

  @SerializedName("age_gated_date_of_birth")
  private LocalDate ageGatedDateOfBirth = null;

  public ProfileSubscriptionCreateQueryResourceObjectAttributes email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address to subscribe or to set on the profile if &#x60;channels&#x60; is specified and the email channel is omitted.
   * @return email
  **/
  @Schema(example = "matt-kemp@klaviyo-demo.com", description = "The email address to subscribe or to set on the profile if `channels` is specified and the email channel is omitted.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ProfileSubscriptionCreateQueryResourceObjectAttributes phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number to subscribe or to set on the profile if &#x60;channels&#x60; is specified and the SMS channel is omitted. This must be in E.164 format.
   * @return phoneNumber
  **/
  @Schema(example = "+15005550006", description = "The phone number to subscribe or to set on the profile if `channels` is specified and the SMS channel is omitted. This must be in E.164 format.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public ProfileSubscriptionCreateQueryResourceObjectAttributes subscriptions(SubscriptionChannels subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

   /**
   * Get subscriptions
   * @return subscriptions
  **/
  @Schema(description = "")
  public SubscriptionChannels getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(SubscriptionChannels subscriptions) {
    this.subscriptions = subscriptions;
  }

  public ProfileSubscriptionCreateQueryResourceObjectAttributes ageGatedDateOfBirth(LocalDate ageGatedDateOfBirth) {
    this.ageGatedDateOfBirth = ageGatedDateOfBirth;
    return this;
  }

   /**
   * The profile&#x27;s date of birth. This field is required to update SMS consent for accounts using age-gating: https://help.klaviyo.com/hc/en-us/articles/17252552814875
   * @return ageGatedDateOfBirth
  **/
  @Schema(description = "The profile's date of birth. This field is required to update SMS consent for accounts using age-gating: https://help.klaviyo.com/hc/en-us/articles/17252552814875")
  public LocalDate getAgeGatedDateOfBirth() {
    return ageGatedDateOfBirth;
  }

  public void setAgeGatedDateOfBirth(LocalDate ageGatedDateOfBirth) {
    this.ageGatedDateOfBirth = ageGatedDateOfBirth;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileSubscriptionCreateQueryResourceObjectAttributes profileSubscriptionCreateQueryResourceObjectAttributes = (ProfileSubscriptionCreateQueryResourceObjectAttributes) o;
    return Objects.equals(this.email, profileSubscriptionCreateQueryResourceObjectAttributes.email) &&
        Objects.equals(this.phoneNumber, profileSubscriptionCreateQueryResourceObjectAttributes.phoneNumber) &&
        Objects.equals(this.subscriptions, profileSubscriptionCreateQueryResourceObjectAttributes.subscriptions) &&
        Objects.equals(this.ageGatedDateOfBirth, profileSubscriptionCreateQueryResourceObjectAttributes.ageGatedDateOfBirth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, phoneNumber, subscriptions, ageGatedDateOfBirth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileSubscriptionCreateQueryResourceObjectAttributes {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
    sb.append("    ageGatedDateOfBirth: ").append(toIndentedString(ageGatedDateOfBirth)).append("\n");
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
