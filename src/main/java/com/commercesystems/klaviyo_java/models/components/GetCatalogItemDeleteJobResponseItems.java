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


public class GetCatalogItemDeleteJobResponseItems {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("links")
    private Optional<? extends RelationshipLinks> links;

    @JsonCreator
    public GetCatalogItemDeleteJobResponseItems(
            @JsonProperty("links") Optional<? extends RelationshipLinks> links) {
        Utils.checkNotNull(links, "links");
        this.links = links;
    }
    
    public GetCatalogItemDeleteJobResponseItems() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<RelationshipLinks> links() {
        return (Optional<RelationshipLinks>) links;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetCatalogItemDeleteJobResponseItems withLinks(RelationshipLinks links) {
        Utils.checkNotNull(links, "links");
        this.links = Optional.ofNullable(links);
        return this;
    }

    public GetCatalogItemDeleteJobResponseItems withLinks(Optional<? extends RelationshipLinks> links) {
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
        GetCatalogItemDeleteJobResponseItems other = (GetCatalogItemDeleteJobResponseItems) o;
        return 
            Objects.deepEquals(this.links, other.links);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            links);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCatalogItemDeleteJobResponseItems.class,
                "links", links);
    }
    
    public final static class Builder {
 
        private Optional<? extends RelationshipLinks> links = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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
        
        public GetCatalogItemDeleteJobResponseItems build() {
            return new GetCatalogItemDeleteJobResponseItems(
                links);
        }
    }
}

