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
import java.util.List;
import java.util.Objects;


public class ClientBISSubscriptionCreateQueryResourceObjectAttributes {

    /**
     * The channel(s) through which the profile would like to receive the back in stock notification. This can be leveraged within a back in stock flow to notify the subscriber through their preferred channel(s).
     */
    @JsonProperty("channels")
    private List<ClientBISSubscriptionCreateQueryResourceObjectChannels> channels;

    @JsonProperty("profile")
    private ClientBISSubscriptionCreateQueryResourceObjectProfile profile;

    @JsonCreator
    public ClientBISSubscriptionCreateQueryResourceObjectAttributes(
            @JsonProperty("channels") List<ClientBISSubscriptionCreateQueryResourceObjectChannels> channels,
            @JsonProperty("profile") ClientBISSubscriptionCreateQueryResourceObjectProfile profile) {
        Utils.checkNotNull(channels, "channels");
        Utils.checkNotNull(profile, "profile");
        this.channels = channels;
        this.profile = profile;
    }

    /**
     * The channel(s) through which the profile would like to receive the back in stock notification. This can be leveraged within a back in stock flow to notify the subscriber through their preferred channel(s).
     */
    @JsonIgnore
    public List<ClientBISSubscriptionCreateQueryResourceObjectChannels> channels() {
        return channels;
    }

    @JsonIgnore
    public ClientBISSubscriptionCreateQueryResourceObjectProfile profile() {
        return profile;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The channel(s) through which the profile would like to receive the back in stock notification. This can be leveraged within a back in stock flow to notify the subscriber through their preferred channel(s).
     */
    public ClientBISSubscriptionCreateQueryResourceObjectAttributes withChannels(List<ClientBISSubscriptionCreateQueryResourceObjectChannels> channels) {
        Utils.checkNotNull(channels, "channels");
        this.channels = channels;
        return this;
    }

    public ClientBISSubscriptionCreateQueryResourceObjectAttributes withProfile(ClientBISSubscriptionCreateQueryResourceObjectProfile profile) {
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
        ClientBISSubscriptionCreateQueryResourceObjectAttributes other = (ClientBISSubscriptionCreateQueryResourceObjectAttributes) o;
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
        return Utils.toString(ClientBISSubscriptionCreateQueryResourceObjectAttributes.class,
                "channels", channels,
                "profile", profile);
    }
    
    public final static class Builder {
 
        private List<ClientBISSubscriptionCreateQueryResourceObjectChannels> channels;
 
        private ClientBISSubscriptionCreateQueryResourceObjectProfile profile;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The channel(s) through which the profile would like to receive the back in stock notification. This can be leveraged within a back in stock flow to notify the subscriber through their preferred channel(s).
         */
        public Builder channels(List<ClientBISSubscriptionCreateQueryResourceObjectChannels> channels) {
            Utils.checkNotNull(channels, "channels");
            this.channels = channels;
            return this;
        }

        public Builder profile(ClientBISSubscriptionCreateQueryResourceObjectProfile profile) {
            Utils.checkNotNull(profile, "profile");
            this.profile = profile;
            return this;
        }
        
        public ClientBISSubscriptionCreateQueryResourceObjectAttributes build() {
            return new ClientBISSubscriptionCreateQueryResourceObjectAttributes(
                channels,
                profile);
        }
    }
}
