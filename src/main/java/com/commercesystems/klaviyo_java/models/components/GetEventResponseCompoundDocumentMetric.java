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


public class GetEventResponseCompoundDocumentMetric {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    private Optional<? extends GetEventResponseCompoundDocumentDataData> data;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("links")
    private Optional<? extends RelationshipLinks> links;

    @JsonCreator
    public GetEventResponseCompoundDocumentMetric(
            @JsonProperty("data") Optional<? extends GetEventResponseCompoundDocumentDataData> data,
            @JsonProperty("links") Optional<? extends RelationshipLinks> links) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(links, "links");
        this.data = data;
        this.links = links;
    }
    
    public GetEventResponseCompoundDocumentMetric() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetEventResponseCompoundDocumentDataData> data() {
        return (Optional<GetEventResponseCompoundDocumentDataData>) data;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<RelationshipLinks> links() {
        return (Optional<RelationshipLinks>) links;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetEventResponseCompoundDocumentMetric withData(GetEventResponseCompoundDocumentDataData data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    public GetEventResponseCompoundDocumentMetric withData(Optional<? extends GetEventResponseCompoundDocumentDataData> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public GetEventResponseCompoundDocumentMetric withLinks(RelationshipLinks links) {
        Utils.checkNotNull(links, "links");
        this.links = Optional.ofNullable(links);
        return this;
    }

    public GetEventResponseCompoundDocumentMetric withLinks(Optional<? extends RelationshipLinks> links) {
        Utils.checkNotNull(links, "links");
        this.links = links;
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
        GetEventResponseCompoundDocumentMetric other = (GetEventResponseCompoundDocumentMetric) o;
        return 
            Objects.deepEquals(this.data, other.data) &&
            Objects.deepEquals(this.links, other.links);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            data,
            links);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetEventResponseCompoundDocumentMetric.class,
                "data", data,
                "links", links);
    }
    
    public final static class Builder {
 
        private Optional<? extends GetEventResponseCompoundDocumentDataData> data = Optional.empty();
 
        private Optional<? extends RelationshipLinks> links = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(GetEventResponseCompoundDocumentDataData data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        public Builder data(Optional<? extends GetEventResponseCompoundDocumentDataData> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        public Builder links(RelationshipLinks links) {
            Utils.checkNotNull(links, "links");
            this.links = Optional.ofNullable(links);
            return this;
        }

        public Builder links(Optional<? extends RelationshipLinks> links) {
            Utils.checkNotNull(links, "links");
            this.links = links;
            return this;
        }
        
        public GetEventResponseCompoundDocumentMetric build() {
            return new GetEventResponseCompoundDocumentMetric(
                data,
                links);
        }
    }
}

