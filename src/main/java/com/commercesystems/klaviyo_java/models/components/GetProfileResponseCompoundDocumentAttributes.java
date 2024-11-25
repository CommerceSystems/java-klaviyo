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
import java.util.Optional;


public class GetProfileResponseCompoundDocumentAttributes {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subscriptions")
    private Optional<? extends Subscriptions> subscriptions;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("predictive_analytics")
    private Optional<? extends PredictiveAnalytics> predictiveAnalytics;

    @JsonCreator
    public GetProfileResponseCompoundDocumentAttributes(
            @JsonProperty("subscriptions") Optional<? extends Subscriptions> subscriptions,
            @JsonProperty("predictive_analytics") Optional<? extends PredictiveAnalytics> predictiveAnalytics) {
        Utils.checkNotNull(subscriptions, "subscriptions");
        Utils.checkNotNull(predictiveAnalytics, "predictiveAnalytics");
        this.subscriptions = subscriptions;
        this.predictiveAnalytics = predictiveAnalytics;
    }
    
    public GetProfileResponseCompoundDocumentAttributes() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Subscriptions> subscriptions() {
        return (Optional<Subscriptions>) subscriptions;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PredictiveAnalytics> predictiveAnalytics() {
        return (Optional<PredictiveAnalytics>) predictiveAnalytics;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetProfileResponseCompoundDocumentAttributes withSubscriptions(Subscriptions subscriptions) {
        Utils.checkNotNull(subscriptions, "subscriptions");
        this.subscriptions = Optional.ofNullable(subscriptions);
        return this;
    }

    public GetProfileResponseCompoundDocumentAttributes withSubscriptions(Optional<? extends Subscriptions> subscriptions) {
        Utils.checkNotNull(subscriptions, "subscriptions");
        this.subscriptions = subscriptions;
        return this;
    }

    public GetProfileResponseCompoundDocumentAttributes withPredictiveAnalytics(PredictiveAnalytics predictiveAnalytics) {
        Utils.checkNotNull(predictiveAnalytics, "predictiveAnalytics");
        this.predictiveAnalytics = Optional.ofNullable(predictiveAnalytics);
        return this;
    }

    public GetProfileResponseCompoundDocumentAttributes withPredictiveAnalytics(Optional<? extends PredictiveAnalytics> predictiveAnalytics) {
        Utils.checkNotNull(predictiveAnalytics, "predictiveAnalytics");
        this.predictiveAnalytics = predictiveAnalytics;
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
        GetProfileResponseCompoundDocumentAttributes other = (GetProfileResponseCompoundDocumentAttributes) o;
        return 
            Objects.deepEquals(this.subscriptions, other.subscriptions) &&
            Objects.deepEquals(this.predictiveAnalytics, other.predictiveAnalytics);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            subscriptions,
            predictiveAnalytics);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetProfileResponseCompoundDocumentAttributes.class,
                "subscriptions", subscriptions,
                "predictiveAnalytics", predictiveAnalytics);
    }
    
    public final static class Builder {
 
        private Optional<? extends Subscriptions> subscriptions = Optional.empty();
 
        private Optional<? extends PredictiveAnalytics> predictiveAnalytics = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder subscriptions(Subscriptions subscriptions) {
            Utils.checkNotNull(subscriptions, "subscriptions");
            this.subscriptions = Optional.ofNullable(subscriptions);
            return this;
        }

        public Builder subscriptions(Optional<? extends Subscriptions> subscriptions) {
            Utils.checkNotNull(subscriptions, "subscriptions");
            this.subscriptions = subscriptions;
            return this;
        }

        public Builder predictiveAnalytics(PredictiveAnalytics predictiveAnalytics) {
            Utils.checkNotNull(predictiveAnalytics, "predictiveAnalytics");
            this.predictiveAnalytics = Optional.ofNullable(predictiveAnalytics);
            return this;
        }

        public Builder predictiveAnalytics(Optional<? extends PredictiveAnalytics> predictiveAnalytics) {
            Utils.checkNotNull(predictiveAnalytics, "predictiveAnalytics");
            this.predictiveAnalytics = predictiveAnalytics;
            return this;
        }
        
        public GetProfileResponseCompoundDocumentAttributes build() {
            return new GetProfileResponseCompoundDocumentAttributes(
                subscriptions,
                predictiveAnalytics);
        }
    }
}
