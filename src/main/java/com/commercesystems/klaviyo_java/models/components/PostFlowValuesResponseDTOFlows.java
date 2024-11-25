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
import java.util.Optional;


public class PostFlowValuesResponseDTOFlows {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    private Optional<? extends List<PostFlowValuesResponseDTODataRelationshipsData>> data;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("links")
    private Optional<? extends RelationshipLinks> links;

    @JsonCreator
    public PostFlowValuesResponseDTOFlows(
            @JsonProperty("data") Optional<? extends List<PostFlowValuesResponseDTODataRelationshipsData>> data,
            @JsonProperty("links") Optional<? extends RelationshipLinks> links) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(links, "links");
        this.data = data;
        this.links = links;
    }
    
    public PostFlowValuesResponseDTOFlows() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<PostFlowValuesResponseDTODataRelationshipsData>> data() {
        return (Optional<List<PostFlowValuesResponseDTODataRelationshipsData>>) data;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<RelationshipLinks> links() {
        return (Optional<RelationshipLinks>) links;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PostFlowValuesResponseDTOFlows withData(List<PostFlowValuesResponseDTODataRelationshipsData> data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    public PostFlowValuesResponseDTOFlows withData(Optional<? extends List<PostFlowValuesResponseDTODataRelationshipsData>> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public PostFlowValuesResponseDTOFlows withLinks(RelationshipLinks links) {
        Utils.checkNotNull(links, "links");
        this.links = Optional.ofNullable(links);
        return this;
    }

    public PostFlowValuesResponseDTOFlows withLinks(Optional<? extends RelationshipLinks> links) {
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
        PostFlowValuesResponseDTOFlows other = (PostFlowValuesResponseDTOFlows) o;
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
        return Utils.toString(PostFlowValuesResponseDTOFlows.class,
                "data", data,
                "links", links);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<PostFlowValuesResponseDTODataRelationshipsData>> data = Optional.empty();
 
        private Optional<? extends RelationshipLinks> links = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(List<PostFlowValuesResponseDTODataRelationshipsData> data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        public Builder data(Optional<? extends List<PostFlowValuesResponseDTODataRelationshipsData>> data) {
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
        
        public PostFlowValuesResponseDTOFlows build() {
            return new PostFlowValuesResponseDTOFlows(
                data,
                links);
        }
    }
}
