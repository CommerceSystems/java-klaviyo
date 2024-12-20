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
import java.lang.SuppressWarnings;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class SuppressionCreateJobCreateQueryResourceObjectAttributes {

    /**
     * The profile(s) to create suppressions for.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("profiles")
    private JsonNullable<? extends SuppressionCreateJobCreateQueryResourceObjectProfiles> profiles;

    @JsonCreator
    public SuppressionCreateJobCreateQueryResourceObjectAttributes(
            @JsonProperty("profiles") JsonNullable<? extends SuppressionCreateJobCreateQueryResourceObjectProfiles> profiles) {
        Utils.checkNotNull(profiles, "profiles");
        this.profiles = profiles;
    }
    
    public SuppressionCreateJobCreateQueryResourceObjectAttributes() {
        this(JsonNullable.undefined());
    }

    /**
     * The profile(s) to create suppressions for.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<SuppressionCreateJobCreateQueryResourceObjectProfiles> profiles() {
        return (JsonNullable<SuppressionCreateJobCreateQueryResourceObjectProfiles>) profiles;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The profile(s) to create suppressions for.
     */
    public SuppressionCreateJobCreateQueryResourceObjectAttributes withProfiles(SuppressionCreateJobCreateQueryResourceObjectProfiles profiles) {
        Utils.checkNotNull(profiles, "profiles");
        this.profiles = JsonNullable.of(profiles);
        return this;
    }

    /**
     * The profile(s) to create suppressions for.
     */
    public SuppressionCreateJobCreateQueryResourceObjectAttributes withProfiles(JsonNullable<? extends SuppressionCreateJobCreateQueryResourceObjectProfiles> profiles) {
        Utils.checkNotNull(profiles, "profiles");
        this.profiles = profiles;
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
        SuppressionCreateJobCreateQueryResourceObjectAttributes other = (SuppressionCreateJobCreateQueryResourceObjectAttributes) o;
        return 
            Objects.deepEquals(this.profiles, other.profiles);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            profiles);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SuppressionCreateJobCreateQueryResourceObjectAttributes.class,
                "profiles", profiles);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends SuppressionCreateJobCreateQueryResourceObjectProfiles> profiles = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The profile(s) to create suppressions for.
         */
        public Builder profiles(SuppressionCreateJobCreateQueryResourceObjectProfiles profiles) {
            Utils.checkNotNull(profiles, "profiles");
            this.profiles = JsonNullable.of(profiles);
            return this;
        }

        /**
         * The profile(s) to create suppressions for.
         */
        public Builder profiles(JsonNullable<? extends SuppressionCreateJobCreateQueryResourceObjectProfiles> profiles) {
            Utils.checkNotNull(profiles, "profiles");
            this.profiles = profiles;
            return this;
        }
        
        public SuppressionCreateJobCreateQueryResourceObjectAttributes build() {
            return new SuppressionCreateJobCreateQueryResourceObjectAttributes(
                profiles);
        }
    }
}

