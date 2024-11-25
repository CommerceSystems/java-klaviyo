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


public class GetEventResponseCollectionCompoundDocumentRelationships {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("profile")
    private Optional<? extends GetEventResponseCollectionCompoundDocumentProfile> profile;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metric")
    private Optional<? extends GetEventResponseCollectionCompoundDocumentMetric> metric;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attributions")
    private Optional<? extends Attributions> attributions;

    @JsonCreator
    public GetEventResponseCollectionCompoundDocumentRelationships(
            @JsonProperty("profile") Optional<? extends GetEventResponseCollectionCompoundDocumentProfile> profile,
            @JsonProperty("metric") Optional<? extends GetEventResponseCollectionCompoundDocumentMetric> metric,
            @JsonProperty("attributions") Optional<? extends Attributions> attributions) {
        Utils.checkNotNull(profile, "profile");
        Utils.checkNotNull(metric, "metric");
        Utils.checkNotNull(attributions, "attributions");
        this.profile = profile;
        this.metric = metric;
        this.attributions = attributions;
    }
    
    public GetEventResponseCollectionCompoundDocumentRelationships() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetEventResponseCollectionCompoundDocumentProfile> profile() {
        return (Optional<GetEventResponseCollectionCompoundDocumentProfile>) profile;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetEventResponseCollectionCompoundDocumentMetric> metric() {
        return (Optional<GetEventResponseCollectionCompoundDocumentMetric>) metric;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Attributions> attributions() {
        return (Optional<Attributions>) attributions;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetEventResponseCollectionCompoundDocumentRelationships withProfile(GetEventResponseCollectionCompoundDocumentProfile profile) {
        Utils.checkNotNull(profile, "profile");
        this.profile = Optional.ofNullable(profile);
        return this;
    }

    public GetEventResponseCollectionCompoundDocumentRelationships withProfile(Optional<? extends GetEventResponseCollectionCompoundDocumentProfile> profile) {
        Utils.checkNotNull(profile, "profile");
        this.profile = profile;
        return this;
    }

    public GetEventResponseCollectionCompoundDocumentRelationships withMetric(GetEventResponseCollectionCompoundDocumentMetric metric) {
        Utils.checkNotNull(metric, "metric");
        this.metric = Optional.ofNullable(metric);
        return this;
    }

    public GetEventResponseCollectionCompoundDocumentRelationships withMetric(Optional<? extends GetEventResponseCollectionCompoundDocumentMetric> metric) {
        Utils.checkNotNull(metric, "metric");
        this.metric = metric;
        return this;
    }

    public GetEventResponseCollectionCompoundDocumentRelationships withAttributions(Attributions attributions) {
        Utils.checkNotNull(attributions, "attributions");
        this.attributions = Optional.ofNullable(attributions);
        return this;
    }

    public GetEventResponseCollectionCompoundDocumentRelationships withAttributions(Optional<? extends Attributions> attributions) {
        Utils.checkNotNull(attributions, "attributions");
        this.attributions = attributions;
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
        GetEventResponseCollectionCompoundDocumentRelationships other = (GetEventResponseCollectionCompoundDocumentRelationships) o;
        return 
            Objects.deepEquals(this.profile, other.profile) &&
            Objects.deepEquals(this.metric, other.metric) &&
            Objects.deepEquals(this.attributions, other.attributions);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            profile,
            metric,
            attributions);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetEventResponseCollectionCompoundDocumentRelationships.class,
                "profile", profile,
                "metric", metric,
                "attributions", attributions);
    }
    
    public final static class Builder {
 
        private Optional<? extends GetEventResponseCollectionCompoundDocumentProfile> profile = Optional.empty();
 
        private Optional<? extends GetEventResponseCollectionCompoundDocumentMetric> metric = Optional.empty();
 
        private Optional<? extends Attributions> attributions = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder profile(GetEventResponseCollectionCompoundDocumentProfile profile) {
            Utils.checkNotNull(profile, "profile");
            this.profile = Optional.ofNullable(profile);
            return this;
        }

        public Builder profile(Optional<? extends GetEventResponseCollectionCompoundDocumentProfile> profile) {
            Utils.checkNotNull(profile, "profile");
            this.profile = profile;
            return this;
        }

        public Builder metric(GetEventResponseCollectionCompoundDocumentMetric metric) {
            Utils.checkNotNull(metric, "metric");
            this.metric = Optional.ofNullable(metric);
            return this;
        }

        public Builder metric(Optional<? extends GetEventResponseCollectionCompoundDocumentMetric> metric) {
            Utils.checkNotNull(metric, "metric");
            this.metric = metric;
            return this;
        }

        public Builder attributions(Attributions attributions) {
            Utils.checkNotNull(attributions, "attributions");
            this.attributions = Optional.ofNullable(attributions);
            return this;
        }

        public Builder attributions(Optional<? extends Attributions> attributions) {
            Utils.checkNotNull(attributions, "attributions");
            this.attributions = attributions;
            return this;
        }
        
        public GetEventResponseCollectionCompoundDocumentRelationships build() {
            return new GetEventResponseCollectionCompoundDocumentRelationships(
                profile,
                metric,
                attributions);
        }
    }
}
