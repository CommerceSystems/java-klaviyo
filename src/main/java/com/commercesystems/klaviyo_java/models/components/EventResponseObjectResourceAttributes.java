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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class EventResponseObjectResourceAttributes {

    /**
     * Event timestamp in seconds
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timestamp")
    private JsonNullable<Long> timestamp;

    /**
     * Event properties, can include identifiers and extra properties
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("event_properties")
    private JsonNullable<? extends EventProperties> eventProperties;

    /**
     * Event timestamp in ISO8601 format (YYYY-MM-DDTHH:MM:SS+hh:mm)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("datetime")
    private JsonNullable<OffsetDateTime> datetime;

    /**
     * A unique identifier for the event, this can be used as a cursor in pagination
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("uuid")
    private JsonNullable<String> uuid;

    @JsonCreator
    public EventResponseObjectResourceAttributes(
            @JsonProperty("timestamp") JsonNullable<Long> timestamp,
            @JsonProperty("event_properties") JsonNullable<? extends EventProperties> eventProperties,
            @JsonProperty("datetime") JsonNullable<OffsetDateTime> datetime,
            @JsonProperty("uuid") JsonNullable<String> uuid) {
        Utils.checkNotNull(timestamp, "timestamp");
        Utils.checkNotNull(eventProperties, "eventProperties");
        Utils.checkNotNull(datetime, "datetime");
        Utils.checkNotNull(uuid, "uuid");
        this.timestamp = timestamp;
        this.eventProperties = eventProperties;
        this.datetime = datetime;
        this.uuid = uuid;
    }
    
    public EventResponseObjectResourceAttributes() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Event timestamp in seconds
     */
    @JsonIgnore
    public JsonNullable<Long> timestamp() {
        return timestamp;
    }

    /**
     * Event properties, can include identifiers and extra properties
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<EventProperties> eventProperties() {
        return (JsonNullable<EventProperties>) eventProperties;
    }

    /**
     * Event timestamp in ISO8601 format (YYYY-MM-DDTHH:MM:SS+hh:mm)
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> datetime() {
        return datetime;
    }

    /**
     * A unique identifier for the event, this can be used as a cursor in pagination
     */
    @JsonIgnore
    public JsonNullable<String> uuid() {
        return uuid;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Event timestamp in seconds
     */
    public EventResponseObjectResourceAttributes withTimestamp(long timestamp) {
        Utils.checkNotNull(timestamp, "timestamp");
        this.timestamp = JsonNullable.of(timestamp);
        return this;
    }

    /**
     * Event timestamp in seconds
     */
    public EventResponseObjectResourceAttributes withTimestamp(JsonNullable<Long> timestamp) {
        Utils.checkNotNull(timestamp, "timestamp");
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Event properties, can include identifiers and extra properties
     */
    public EventResponseObjectResourceAttributes withEventProperties(EventProperties eventProperties) {
        Utils.checkNotNull(eventProperties, "eventProperties");
        this.eventProperties = JsonNullable.of(eventProperties);
        return this;
    }

    /**
     * Event properties, can include identifiers and extra properties
     */
    public EventResponseObjectResourceAttributes withEventProperties(JsonNullable<? extends EventProperties> eventProperties) {
        Utils.checkNotNull(eventProperties, "eventProperties");
        this.eventProperties = eventProperties;
        return this;
    }

    /**
     * Event timestamp in ISO8601 format (YYYY-MM-DDTHH:MM:SS+hh:mm)
     */
    public EventResponseObjectResourceAttributes withDatetime(OffsetDateTime datetime) {
        Utils.checkNotNull(datetime, "datetime");
        this.datetime = JsonNullable.of(datetime);
        return this;
    }

    /**
     * Event timestamp in ISO8601 format (YYYY-MM-DDTHH:MM:SS+hh:mm)
     */
    public EventResponseObjectResourceAttributes withDatetime(JsonNullable<OffsetDateTime> datetime) {
        Utils.checkNotNull(datetime, "datetime");
        this.datetime = datetime;
        return this;
    }

    /**
     * A unique identifier for the event, this can be used as a cursor in pagination
     */
    public EventResponseObjectResourceAttributes withUuid(String uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = JsonNullable.of(uuid);
        return this;
    }

    /**
     * A unique identifier for the event, this can be used as a cursor in pagination
     */
    public EventResponseObjectResourceAttributes withUuid(JsonNullable<String> uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = uuid;
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
        EventResponseObjectResourceAttributes other = (EventResponseObjectResourceAttributes) o;
        return 
            Objects.deepEquals(this.timestamp, other.timestamp) &&
            Objects.deepEquals(this.eventProperties, other.eventProperties) &&
            Objects.deepEquals(this.datetime, other.datetime) &&
            Objects.deepEquals(this.uuid, other.uuid);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            timestamp,
            eventProperties,
            datetime,
            uuid);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EventResponseObjectResourceAttributes.class,
                "timestamp", timestamp,
                "eventProperties", eventProperties,
                "datetime", datetime,
                "uuid", uuid);
    }
    
    public final static class Builder {
 
        private JsonNullable<Long> timestamp = JsonNullable.undefined();
 
        private JsonNullable<? extends EventProperties> eventProperties = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> datetime = JsonNullable.undefined();
 
        private JsonNullable<String> uuid = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Event timestamp in seconds
         */
        public Builder timestamp(long timestamp) {
            Utils.checkNotNull(timestamp, "timestamp");
            this.timestamp = JsonNullable.of(timestamp);
            return this;
        }

        /**
         * Event timestamp in seconds
         */
        public Builder timestamp(JsonNullable<Long> timestamp) {
            Utils.checkNotNull(timestamp, "timestamp");
            this.timestamp = timestamp;
            return this;
        }

        /**
         * Event properties, can include identifiers and extra properties
         */
        public Builder eventProperties(EventProperties eventProperties) {
            Utils.checkNotNull(eventProperties, "eventProperties");
            this.eventProperties = JsonNullable.of(eventProperties);
            return this;
        }

        /**
         * Event properties, can include identifiers and extra properties
         */
        public Builder eventProperties(JsonNullable<? extends EventProperties> eventProperties) {
            Utils.checkNotNull(eventProperties, "eventProperties");
            this.eventProperties = eventProperties;
            return this;
        }

        /**
         * Event timestamp in ISO8601 format (YYYY-MM-DDTHH:MM:SS+hh:mm)
         */
        public Builder datetime(OffsetDateTime datetime) {
            Utils.checkNotNull(datetime, "datetime");
            this.datetime = JsonNullable.of(datetime);
            return this;
        }

        /**
         * Event timestamp in ISO8601 format (YYYY-MM-DDTHH:MM:SS+hh:mm)
         */
        public Builder datetime(JsonNullable<OffsetDateTime> datetime) {
            Utils.checkNotNull(datetime, "datetime");
            this.datetime = datetime;
            return this;
        }

        /**
         * A unique identifier for the event, this can be used as a cursor in pagination
         */
        public Builder uuid(String uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = JsonNullable.of(uuid);
            return this;
        }

        /**
         * A unique identifier for the event, this can be used as a cursor in pagination
         */
        public Builder uuid(JsonNullable<String> uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = uuid;
            return this;
        }
        
        public EventResponseObjectResourceAttributes build() {
            return new EventResponseObjectResourceAttributes(
                timestamp,
                eventProperties,
                datetime,
                uuid);
        }
    }
}

