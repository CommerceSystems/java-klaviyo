/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;


import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class ProfileSubscriptionDeleteQueryResourceObjectAttributes {

    /**
     * The email address to unsubscribe.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private JsonNullable<String> email;

    /**
     * The phone number to unsubscribe. This must be in E.164 format.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone_number")
    private JsonNullable<String> phoneNumber;

    @JsonCreator
    public ProfileSubscriptionDeleteQueryResourceObjectAttributes(
            @JsonProperty("email") JsonNullable<String> email,
            @JsonProperty("phone_number") JsonNullable<String> phoneNumber) {
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    public ProfileSubscriptionDeleteQueryResourceObjectAttributes() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The email address to unsubscribe.
     */
    @JsonIgnore
    public JsonNullable<String> email() {
        return email;
    }

    /**
     * The phone number to unsubscribe. This must be in E.164 format.
     */
    @JsonIgnore
    public JsonNullable<String> phoneNumber() {
        return phoneNumber;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The email address to unsubscribe.
     */
    public ProfileSubscriptionDeleteQueryResourceObjectAttributes withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = JsonNullable.of(email);
        return this;
    }

    /**
     * The email address to unsubscribe.
     */
    public ProfileSubscriptionDeleteQueryResourceObjectAttributes withEmail(JsonNullable<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    /**
     * The phone number to unsubscribe. This must be in E.164 format.
     */
    public ProfileSubscriptionDeleteQueryResourceObjectAttributes withPhoneNumber(String phoneNumber) {
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.phoneNumber = JsonNullable.of(phoneNumber);
        return this;
    }

    /**
     * The phone number to unsubscribe. This must be in E.164 format.
     */
    public ProfileSubscriptionDeleteQueryResourceObjectAttributes withPhoneNumber(JsonNullable<String> phoneNumber) {
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.phoneNumber = phoneNumber;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProfileSubscriptionDeleteQueryResourceObjectAttributes other = (ProfileSubscriptionDeleteQueryResourceObjectAttributes) o;
        return 
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.phoneNumber, other.phoneNumber);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            email,
            phoneNumber);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ProfileSubscriptionDeleteQueryResourceObjectAttributes.class,
                "email", email,
                "phoneNumber", phoneNumber);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> email = JsonNullable.undefined();
 
        private JsonNullable<String> phoneNumber = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The email address to unsubscribe.
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = JsonNullable.of(email);
            return this;
        }

        /**
         * The email address to unsubscribe.
         */
        public Builder email(JsonNullable<String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        /**
         * The phone number to unsubscribe. This must be in E.164 format.
         */
        public Builder phoneNumber(String phoneNumber) {
            Utils.checkNotNull(phoneNumber, "phoneNumber");
            this.phoneNumber = JsonNullable.of(phoneNumber);
            return this;
        }

        /**
         * The phone number to unsubscribe. This must be in E.164 format.
         */
        public Builder phoneNumber(JsonNullable<String> phoneNumber) {
            Utils.checkNotNull(phoneNumber, "phoneNumber");
            this.phoneNumber = phoneNumber;
            return this;
        }
        
        public ProfileSubscriptionDeleteQueryResourceObjectAttributes build() {
            return new ProfileSubscriptionDeleteQueryResourceObjectAttributes(
                email,
                phoneNumber);
        }
    }
}

