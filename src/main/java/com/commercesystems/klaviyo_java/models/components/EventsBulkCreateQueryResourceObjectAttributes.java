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


public class EventsBulkCreateQueryResourceObjectAttributes {

    @JsonProperty("profile")
    private EventsBulkCreateQueryResourceObjectProfile profile;

    @JsonProperty("events")
    private Events events;

    @JsonCreator
    public EventsBulkCreateQueryResourceObjectAttributes(
            @JsonProperty("profile") EventsBulkCreateQueryResourceObjectProfile profile,
            @JsonProperty("events") Events events) {
        Utils.checkNotNull(profile, "profile");
        Utils.checkNotNull(events, "events");
        this.profile = profile;
        this.events = events;
    }

    @JsonIgnore
    public EventsBulkCreateQueryResourceObjectProfile profile() {
        return profile;
    }

    @JsonIgnore
    public Events events() {
        return events;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public EventsBulkCreateQueryResourceObjectAttributes withProfile(EventsBulkCreateQueryResourceObjectProfile profile) {
        Utils.checkNotNull(profile, "profile");
        this.profile = profile;
        return this;
    }

    public EventsBulkCreateQueryResourceObjectAttributes withEvents(Events events) {
        Utils.checkNotNull(events, "events");
        this.events = events;
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
        EventsBulkCreateQueryResourceObjectAttributes other = (EventsBulkCreateQueryResourceObjectAttributes) o;
        return 
            Objects.deepEquals(this.profile, other.profile) &&
            Objects.deepEquals(this.events, other.events);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            profile,
            events);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EventsBulkCreateQueryResourceObjectAttributes.class,
                "profile", profile,
                "events", events);
    }
    
    public final static class Builder {
 
        private EventsBulkCreateQueryResourceObjectProfile profile;
 
        private Events events;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder profile(EventsBulkCreateQueryResourceObjectProfile profile) {
            Utils.checkNotNull(profile, "profile");
            this.profile = profile;
            return this;
        }

        public Builder events(Events events) {
            Utils.checkNotNull(events, "events");
            this.events = events;
            return this;
        }
        
        public EventsBulkCreateQueryResourceObjectAttributes build() {
            return new EventsBulkCreateQueryResourceObjectAttributes(
                profile,
                events);
        }
    }
}
