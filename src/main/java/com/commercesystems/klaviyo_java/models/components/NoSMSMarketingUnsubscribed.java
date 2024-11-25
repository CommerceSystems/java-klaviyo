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


public class NoSMSMarketingUnsubscribed {

    @JsonProperty("subscription")
    private UnsubscribedEnum subscription;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filters")
    private JsonNullable<? extends List<NoSMSMarketingUnsubscribedFilters>> filters;

    @JsonCreator
    public NoSMSMarketingUnsubscribed(
            @JsonProperty("subscription") UnsubscribedEnum subscription,
            @JsonProperty("filters") JsonNullable<? extends List<NoSMSMarketingUnsubscribedFilters>> filters) {
        Utils.checkNotNull(subscription, "subscription");
        Utils.checkNotNull(filters, "filters");
        this.subscription = subscription;
        this.filters = filters;
    }
    
    public NoSMSMarketingUnsubscribed(
            UnsubscribedEnum subscription) {
        this(subscription, JsonNullable.undefined());
    }

    @JsonIgnore
    public UnsubscribedEnum subscription() {
        return subscription;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<NoSMSMarketingUnsubscribedFilters>> filters() {
        return (JsonNullable<List<NoSMSMarketingUnsubscribedFilters>>) filters;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public NoSMSMarketingUnsubscribed withSubscription(UnsubscribedEnum subscription) {
        Utils.checkNotNull(subscription, "subscription");
        this.subscription = subscription;
        return this;
    }

    public NoSMSMarketingUnsubscribed withFilters(List<NoSMSMarketingUnsubscribedFilters> filters) {
        Utils.checkNotNull(filters, "filters");
        this.filters = JsonNullable.of(filters);
        return this;
    }

    public NoSMSMarketingUnsubscribed withFilters(JsonNullable<? extends List<NoSMSMarketingUnsubscribedFilters>> filters) {
        Utils.checkNotNull(filters, "filters");
        this.filters = filters;
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
        NoSMSMarketingUnsubscribed other = (NoSMSMarketingUnsubscribed) o;
        return 
            Objects.deepEquals(this.subscription, other.subscription) &&
            Objects.deepEquals(this.filters, other.filters);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            subscription,
            filters);
    }
    
    @Override
    public String toString() {
        return Utils.toString(NoSMSMarketingUnsubscribed.class,
                "subscription", subscription,
                "filters", filters);
    }
    
    public final static class Builder {
 
        private UnsubscribedEnum subscription;
 
        private JsonNullable<? extends List<NoSMSMarketingUnsubscribedFilters>> filters = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder subscription(UnsubscribedEnum subscription) {
            Utils.checkNotNull(subscription, "subscription");
            this.subscription = subscription;
            return this;
        }

        public Builder filters(List<NoSMSMarketingUnsubscribedFilters> filters) {
            Utils.checkNotNull(filters, "filters");
            this.filters = JsonNullable.of(filters);
            return this;
        }

        public Builder filters(JsonNullable<? extends List<NoSMSMarketingUnsubscribedFilters>> filters) {
            Utils.checkNotNull(filters, "filters");
            this.filters = filters;
            return this;
        }
        
        public NoSMSMarketingUnsubscribed build() {
            return new NoSMSMarketingUnsubscribed(
                subscription,
                filters);
        }
    }
}

