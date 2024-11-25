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
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class EventCreateQueryV2ResourceObjectAttributes {

    /**
     * Properties of this event. Any top level property (that are not objects) can be
     * used to create segments. The $extra property is a special property. This records any
     * non-segmentable values that can be referenced later. For example, HTML templates are
     * useful on a segment but are not used to create a segment. There are limits
     * placed onto the size of the data present. This must not exceed 5 MB. This must not
     * exceed 300 event properties. A single string cannot be larger than 100 KB. Each array
     * must not exceed 4000 elements. The properties cannot contain more than 10 nested levels.
     */
    @JsonProperty("properties")
    private EventCreateQueryV2ResourceObjectProperties properties;

    /**
     * When this event occurred. By default, the time the request was received will be used.
     * The time is truncated to the second. The time must be after the year 2000 and can only
     * be up to 1 year in the future.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("time")
    private JsonNullable<OffsetDateTime> time;

    /**
     * A numeric, monetary value to associate with this event. For example, the dollar amount of a purchase.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<Double> value;

    /**
     * The ISO 4217 currency code of the value associated with the event.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value_currency")
    private JsonNullable<String> valueCurrency;

    /**
     * A unique identifier for an event. If the unique_id is repeated for the same
     * profile and metric, only the first processed event will be recorded. If this is not
     * present, this will use the time to the second. Using the default, this limits only one
     * event per profile per second.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unique_id")
    private JsonNullable<String> uniqueId;

    @JsonProperty("metric")
    private Metric metric;

    @JsonProperty("profile")
    private EventCreateQueryV2ResourceObjectProfile profile;

    @JsonCreator
    public EventCreateQueryV2ResourceObjectAttributes(
            @JsonProperty("properties") EventCreateQueryV2ResourceObjectProperties properties,
            @JsonProperty("time") JsonNullable<OffsetDateTime> time,
            @JsonProperty("value") JsonNullable<Double> value,
            @JsonProperty("value_currency") JsonNullable<String> valueCurrency,
            @JsonProperty("unique_id") JsonNullable<String> uniqueId,
            @JsonProperty("metric") Metric metric,
            @JsonProperty("profile") EventCreateQueryV2ResourceObjectProfile profile) {
        Utils.checkNotNull(properties, "properties");
        Utils.checkNotNull(time, "time");
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(valueCurrency, "valueCurrency");
        Utils.checkNotNull(uniqueId, "uniqueId");
        Utils.checkNotNull(metric, "metric");
        Utils.checkNotNull(profile, "profile");
        this.properties = properties;
        this.time = time;
        this.value = value;
        this.valueCurrency = valueCurrency;
        this.uniqueId = uniqueId;
        this.metric = metric;
        this.profile = profile;
    }
    
    public EventCreateQueryV2ResourceObjectAttributes(
            EventCreateQueryV2ResourceObjectProperties properties,
            Metric metric,
            EventCreateQueryV2ResourceObjectProfile profile) {
        this(properties, JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), metric, profile);
    }

    /**
     * Properties of this event. Any top level property (that are not objects) can be
     * used to create segments. The $extra property is a special property. This records any
     * non-segmentable values that can be referenced later. For example, HTML templates are
     * useful on a segment but are not used to create a segment. There are limits
     * placed onto the size of the data present. This must not exceed 5 MB. This must not
     * exceed 300 event properties. A single string cannot be larger than 100 KB. Each array
     * must not exceed 4000 elements. The properties cannot contain more than 10 nested levels.
     */
    @JsonIgnore
    public EventCreateQueryV2ResourceObjectProperties properties() {
        return properties;
    }

    /**
     * When this event occurred. By default, the time the request was received will be used.
     * The time is truncated to the second. The time must be after the year 2000 and can only
     * be up to 1 year in the future.
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> time() {
        return time;
    }

    /**
     * A numeric, monetary value to associate with this event. For example, the dollar amount of a purchase.
     */
    @JsonIgnore
    public JsonNullable<Double> value() {
        return value;
    }

    /**
     * The ISO 4217 currency code of the value associated with the event.
     */
    @JsonIgnore
    public JsonNullable<String> valueCurrency() {
        return valueCurrency;
    }

    /**
     * A unique identifier for an event. If the unique_id is repeated for the same
     * profile and metric, only the first processed event will be recorded. If this is not
     * present, this will use the time to the second. Using the default, this limits only one
     * event per profile per second.
     */
    @JsonIgnore
    public JsonNullable<String> uniqueId() {
        return uniqueId;
    }

    @JsonIgnore
    public Metric metric() {
        return metric;
    }

    @JsonIgnore
    public EventCreateQueryV2ResourceObjectProfile profile() {
        return profile;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Properties of this event. Any top level property (that are not objects) can be
     * used to create segments. The $extra property is a special property. This records any
     * non-segmentable values that can be referenced later. For example, HTML templates are
     * useful on a segment but are not used to create a segment. There are limits
     * placed onto the size of the data present. This must not exceed 5 MB. This must not
     * exceed 300 event properties. A single string cannot be larger than 100 KB. Each array
     * must not exceed 4000 elements. The properties cannot contain more than 10 nested levels.
     */
    public EventCreateQueryV2ResourceObjectAttributes withProperties(EventCreateQueryV2ResourceObjectProperties properties) {
        Utils.checkNotNull(properties, "properties");
        this.properties = properties;
        return this;
    }

    /**
     * When this event occurred. By default, the time the request was received will be used.
     * The time is truncated to the second. The time must be after the year 2000 and can only
     * be up to 1 year in the future.
     */
    public EventCreateQueryV2ResourceObjectAttributes withTime(OffsetDateTime time) {
        Utils.checkNotNull(time, "time");
        this.time = JsonNullable.of(time);
        return this;
    }

    /**
     * When this event occurred. By default, the time the request was received will be used.
     * The time is truncated to the second. The time must be after the year 2000 and can only
     * be up to 1 year in the future.
     */
    public EventCreateQueryV2ResourceObjectAttributes withTime(JsonNullable<OffsetDateTime> time) {
        Utils.checkNotNull(time, "time");
        this.time = time;
        return this;
    }

    /**
     * A numeric, monetary value to associate with this event. For example, the dollar amount of a purchase.
     */
    public EventCreateQueryV2ResourceObjectAttributes withValue(double value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    /**
     * A numeric, monetary value to associate with this event. For example, the dollar amount of a purchase.
     */
    public EventCreateQueryV2ResourceObjectAttributes withValue(JsonNullable<Double> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    /**
     * The ISO 4217 currency code of the value associated with the event.
     */
    public EventCreateQueryV2ResourceObjectAttributes withValueCurrency(String valueCurrency) {
        Utils.checkNotNull(valueCurrency, "valueCurrency");
        this.valueCurrency = JsonNullable.of(valueCurrency);
        return this;
    }

    /**
     * The ISO 4217 currency code of the value associated with the event.
     */
    public EventCreateQueryV2ResourceObjectAttributes withValueCurrency(JsonNullable<String> valueCurrency) {
        Utils.checkNotNull(valueCurrency, "valueCurrency");
        this.valueCurrency = valueCurrency;
        return this;
    }

    /**
     * A unique identifier for an event. If the unique_id is repeated for the same
     * profile and metric, only the first processed event will be recorded. If this is not
     * present, this will use the time to the second. Using the default, this limits only one
     * event per profile per second.
     */
    public EventCreateQueryV2ResourceObjectAttributes withUniqueId(String uniqueId) {
        Utils.checkNotNull(uniqueId, "uniqueId");
        this.uniqueId = JsonNullable.of(uniqueId);
        return this;
    }

    /**
     * A unique identifier for an event. If the unique_id is repeated for the same
     * profile and metric, only the first processed event will be recorded. If this is not
     * present, this will use the time to the second. Using the default, this limits only one
     * event per profile per second.
     */
    public EventCreateQueryV2ResourceObjectAttributes withUniqueId(JsonNullable<String> uniqueId) {
        Utils.checkNotNull(uniqueId, "uniqueId");
        this.uniqueId = uniqueId;
        return this;
    }

    public EventCreateQueryV2ResourceObjectAttributes withMetric(Metric metric) {
        Utils.checkNotNull(metric, "metric");
        this.metric = metric;
        return this;
    }

    public EventCreateQueryV2ResourceObjectAttributes withProfile(EventCreateQueryV2ResourceObjectProfile profile) {
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
        EventCreateQueryV2ResourceObjectAttributes other = (EventCreateQueryV2ResourceObjectAttributes) o;
        return 
            Objects.deepEquals(this.properties, other.properties) &&
            Objects.deepEquals(this.time, other.time) &&
            Objects.deepEquals(this.value, other.value) &&
            Objects.deepEquals(this.valueCurrency, other.valueCurrency) &&
            Objects.deepEquals(this.uniqueId, other.uniqueId) &&
            Objects.deepEquals(this.metric, other.metric) &&
            Objects.deepEquals(this.profile, other.profile);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            properties,
            time,
            value,
            valueCurrency,
            uniqueId,
            metric,
            profile);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EventCreateQueryV2ResourceObjectAttributes.class,
                "properties", properties,
                "time", time,
                "value", value,
                "valueCurrency", valueCurrency,
                "uniqueId", uniqueId,
                "metric", metric,
                "profile", profile);
    }
    
    public final static class Builder {
 
        private EventCreateQueryV2ResourceObjectProperties properties;
 
        private JsonNullable<OffsetDateTime> time = JsonNullable.undefined();
 
        private JsonNullable<Double> value = JsonNullable.undefined();
 
        private JsonNullable<String> valueCurrency = JsonNullable.undefined();
 
        private JsonNullable<String> uniqueId = JsonNullable.undefined();
 
        private Metric metric;
 
        private EventCreateQueryV2ResourceObjectProfile profile;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Properties of this event. Any top level property (that are not objects) can be
         * used to create segments. The $extra property is a special property. This records any
         * non-segmentable values that can be referenced later. For example, HTML templates are
         * useful on a segment but are not used to create a segment. There are limits
         * placed onto the size of the data present. This must not exceed 5 MB. This must not
         * exceed 300 event properties. A single string cannot be larger than 100 KB. Each array
         * must not exceed 4000 elements. The properties cannot contain more than 10 nested levels.
         */
        public Builder properties(EventCreateQueryV2ResourceObjectProperties properties) {
            Utils.checkNotNull(properties, "properties");
            this.properties = properties;
            return this;
        }

        /**
         * When this event occurred. By default, the time the request was received will be used.
         * The time is truncated to the second. The time must be after the year 2000 and can only
         * be up to 1 year in the future.
         */
        public Builder time(OffsetDateTime time) {
            Utils.checkNotNull(time, "time");
            this.time = JsonNullable.of(time);
            return this;
        }

        /**
         * When this event occurred. By default, the time the request was received will be used.
         * The time is truncated to the second. The time must be after the year 2000 and can only
         * be up to 1 year in the future.
         */
        public Builder time(JsonNullable<OffsetDateTime> time) {
            Utils.checkNotNull(time, "time");
            this.time = time;
            return this;
        }

        /**
         * A numeric, monetary value to associate with this event. For example, the dollar amount of a purchase.
         */
        public Builder value(double value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        /**
         * A numeric, monetary value to associate with this event. For example, the dollar amount of a purchase.
         */
        public Builder value(JsonNullable<Double> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }

        /**
         * The ISO 4217 currency code of the value associated with the event.
         */
        public Builder valueCurrency(String valueCurrency) {
            Utils.checkNotNull(valueCurrency, "valueCurrency");
            this.valueCurrency = JsonNullable.of(valueCurrency);
            return this;
        }

        /**
         * The ISO 4217 currency code of the value associated with the event.
         */
        public Builder valueCurrency(JsonNullable<String> valueCurrency) {
            Utils.checkNotNull(valueCurrency, "valueCurrency");
            this.valueCurrency = valueCurrency;
            return this;
        }

        /**
         * A unique identifier for an event. If the unique_id is repeated for the same
         * profile and metric, only the first processed event will be recorded. If this is not
         * present, this will use the time to the second. Using the default, this limits only one
         * event per profile per second.
         */
        public Builder uniqueId(String uniqueId) {
            Utils.checkNotNull(uniqueId, "uniqueId");
            this.uniqueId = JsonNullable.of(uniqueId);
            return this;
        }

        /**
         * A unique identifier for an event. If the unique_id is repeated for the same
         * profile and metric, only the first processed event will be recorded. If this is not
         * present, this will use the time to the second. Using the default, this limits only one
         * event per profile per second.
         */
        public Builder uniqueId(JsonNullable<String> uniqueId) {
            Utils.checkNotNull(uniqueId, "uniqueId");
            this.uniqueId = uniqueId;
            return this;
        }

        public Builder metric(Metric metric) {
            Utils.checkNotNull(metric, "metric");
            this.metric = metric;
            return this;
        }

        public Builder profile(EventCreateQueryV2ResourceObjectProfile profile) {
            Utils.checkNotNull(profile, "profile");
            this.profile = profile;
            return this;
        }
        
        public EventCreateQueryV2ResourceObjectAttributes build() {
            return new EventCreateQueryV2ResourceObjectAttributes(
                properties,
                time,
                value,
                valueCurrency,
                uniqueId,
                metric,
                profile);
        }
    }
}

