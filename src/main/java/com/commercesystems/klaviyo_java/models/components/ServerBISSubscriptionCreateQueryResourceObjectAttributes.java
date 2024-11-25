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
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class ServerBISSubscriptionCreateQueryResourceObjectAttributes {

    /**
     * The channel(s) through which the profile would like to receive the back in stock notification. This can be leveraged within a back in stock flow to notify the subscriber through their preferred channel(s).
     */
    @JsonProperty("channels")
    private List<Channels> channels;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("profile")
    private JsonNullable<? extends Profile> profile;

    @JsonCreator
    public ServerBISSubscriptionCreateQueryResourceObjectAttributes(
            @JsonProperty("channels") List<Channels> channels,
            @JsonProperty("profile") JsonNullable<? extends Profile> profile) {
        Utils.checkNotNull(channels, "channels");
        Utils.checkNotNull(profile, "profile");
        this.channels = channels;
        this.profile = profile;
    }
    
    public ServerBISSubscriptionCreateQueryResourceObjectAttributes(
            List<Channels> channels) {
        this(channels, JsonNullable.undefined());
    }

    /**
     * The channel(s) through which the profile would like to receive the back in stock notification. This can be leveraged within a back in stock flow to notify the subscriber through their preferred channel(s).
     */
    @JsonIgnore
    public List<Channels> channels() {
        return channels;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Profile> profile() {
        return (JsonNullable<Profile>) profile;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The channel(s) through which the profile would like to receive the back in stock notification. This can be leveraged within a back in stock flow to notify the subscriber through their preferred channel(s).
     */
    public ServerBISSubscriptionCreateQueryResourceObjectAttributes withChannels(List<Channels> channels) {
        Utils.checkNotNull(channels, "channels");
        this.channels = channels;
        return this;
    }

    public ServerBISSubscriptionCreateQueryResourceObjectAttributes withProfile(Profile profile) {
        Utils.checkNotNull(profile, "profile");
        this.profile = JsonNullable.of(profile);
        return this;
    }

    public ServerBISSubscriptionCreateQueryResourceObjectAttributes withProfile(JsonNullable<? extends Profile> profile) {
        Utils.checkNotNull(profile, "profile");
        this.profile = profile;
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
        ServerBISSubscriptionCreateQueryResourceObjectAttributes other = (ServerBISSubscriptionCreateQueryResourceObjectAttributes) o;
        return 
            Objects.deepEquals(this.channels, other.channels) &&
            Objects.deepEquals(this.profile, other.profile);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            channels,
            profile);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ServerBISSubscriptionCreateQueryResourceObjectAttributes.class,
                "channels", channels,
                "profile", profile);
    }
    
    public final static class Builder {
 
        private List<Channels> channels;
 
        private JsonNullable<? extends Profile> profile = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The channel(s) through which the profile would like to receive the back in stock notification. This can be leveraged within a back in stock flow to notify the subscriber through their preferred channel(s).
         */
        public Builder channels(List<Channels> channels) {
            Utils.checkNotNull(channels, "channels");
            this.channels = channels;
            return this;
        }

        public Builder profile(Profile profile) {
            Utils.checkNotNull(profile, "profile");
            this.profile = JsonNullable.of(profile);
            return this;
        }

        public Builder profile(JsonNullable<? extends Profile> profile) {
            Utils.checkNotNull(profile, "profile");
            this.profile = profile;
            return this;
        }
        
        public ServerBISSubscriptionCreateQueryResourceObjectAttributes build() {
            return new ServerBISSubscriptionCreateQueryResourceObjectAttributes(
                channels,
                profile);
        }
    }
}
