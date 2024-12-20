/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;


import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ProfileSuppressionCreateQueryResourceObjectAttributes {

    /**
     * The email of the profile to suppress.
     */
    @JsonProperty("email")
    private String email;

    @JsonCreator
    public ProfileSuppressionCreateQueryResourceObjectAttributes(
            @JsonProperty("email") String email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
    }

    /**
     * The email of the profile to suppress.
     */
    @JsonIgnore
    public String email() {
        return email;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The email of the profile to suppress.
     */
    public ProfileSuppressionCreateQueryResourceObjectAttributes withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
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
        ProfileSuppressionCreateQueryResourceObjectAttributes other = (ProfileSuppressionCreateQueryResourceObjectAttributes) o;
        return 
            Objects.deepEquals(this.email, other.email);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            email);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ProfileSuppressionCreateQueryResourceObjectAttributes.class,
                "email", email);
    }
    
    public final static class Builder {
 
        private String email;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The email of the profile to suppress.
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }
        
        public ProfileSuppressionCreateQueryResourceObjectAttributes build() {
            return new ProfileSuppressionCreateQueryResourceObjectAttributes(
                email);
        }
    }
}

