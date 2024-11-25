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


public class GetCampaignResponseCollectionCompoundDocument {

    @JsonProperty("data")
    private List<Data> data;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("links")
    private Optional<? extends CollectionLinks> links;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("included")
    private Optional<? extends List<Included>> included;

    @JsonCreator
    public GetCampaignResponseCollectionCompoundDocument(
            @JsonProperty("data") List<Data> data,
            @JsonProperty("links") Optional<? extends CollectionLinks> links,
            @JsonProperty("included") Optional<? extends List<Included>> included) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(links, "links");
        Utils.checkNotNull(included, "included");
        this.data = data;
        this.links = links;
        this.included = included;
    }
    
    public GetCampaignResponseCollectionCompoundDocument(
            List<Data> data) {
        this(data, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public List<Data> data() {
        return data;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CollectionLinks> links() {
        return (Optional<CollectionLinks>) links;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Included>> included() {
        return (Optional<List<Included>>) included;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetCampaignResponseCollectionCompoundDocument withData(List<Data> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public GetCampaignResponseCollectionCompoundDocument withLinks(CollectionLinks links) {
        Utils.checkNotNull(links, "links");
        this.links = Optional.ofNullable(links);
        return this;
    }

    public GetCampaignResponseCollectionCompoundDocument withLinks(Optional<? extends CollectionLinks> links) {
        Utils.checkNotNull(links, "links");
        this.links = links;
        return this;
    }

    public GetCampaignResponseCollectionCompoundDocument withIncluded(List<Included> included) {
        Utils.checkNotNull(included, "included");
        this.included = Optional.ofNullable(included);
        return this;
    }

    public GetCampaignResponseCollectionCompoundDocument withIncluded(Optional<? extends List<Included>> included) {
        Utils.checkNotNull(included, "included");
        this.included = included;
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
        GetCampaignResponseCollectionCompoundDocument other = (GetCampaignResponseCollectionCompoundDocument) o;
        return 
            Objects.deepEquals(this.data, other.data) &&
            Objects.deepEquals(this.links, other.links) &&
            Objects.deepEquals(this.included, other.included);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            data,
            links,
            included);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCampaignResponseCollectionCompoundDocument.class,
                "data", data,
                "links", links,
                "included", included);
    }
    
    public final static class Builder {
 
        private List<Data> data;
 
        private Optional<? extends CollectionLinks> links = Optional.empty();
 
        private Optional<? extends List<Included>> included = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(List<Data> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        public Builder links(CollectionLinks links) {
            Utils.checkNotNull(links, "links");
            this.links = Optional.ofNullable(links);
            return this;
        }

        public Builder links(Optional<? extends CollectionLinks> links) {
            Utils.checkNotNull(links, "links");
            this.links = links;
            return this;
        }

        public Builder included(List<Included> included) {
            Utils.checkNotNull(included, "included");
            this.included = Optional.ofNullable(included);
            return this;
        }

        public Builder included(Optional<? extends List<Included>> included) {
            Utils.checkNotNull(included, "included");
            this.included = included;
            return this;
        }
        
        public GetCampaignResponseCollectionCompoundDocument build() {
            return new GetCampaignResponseCollectionCompoundDocument(
                data,
                links,
                included);
        }
    }
}
