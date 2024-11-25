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


public class PostCatalogItemDeleteJobResponseRelationships {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("items")
    private Optional<? extends PostCatalogItemDeleteJobResponseItems> items;

    @JsonCreator
    public PostCatalogItemDeleteJobResponseRelationships(
            @JsonProperty("items") Optional<? extends PostCatalogItemDeleteJobResponseItems> items) {
        Utils.checkNotNull(items, "items");
        this.items = items;
    }
    
    public PostCatalogItemDeleteJobResponseRelationships() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostCatalogItemDeleteJobResponseItems> items() {
        return (Optional<PostCatalogItemDeleteJobResponseItems>) items;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PostCatalogItemDeleteJobResponseRelationships withItems(PostCatalogItemDeleteJobResponseItems items) {
        Utils.checkNotNull(items, "items");
        this.items = Optional.ofNullable(items);
        return this;
    }

    public PostCatalogItemDeleteJobResponseRelationships withItems(Optional<? extends PostCatalogItemDeleteJobResponseItems> items) {
        Utils.checkNotNull(items, "items");
        this.items = items;
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
        PostCatalogItemDeleteJobResponseRelationships other = (PostCatalogItemDeleteJobResponseRelationships) o;
        return 
            Objects.deepEquals(this.items, other.items);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            items);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostCatalogItemDeleteJobResponseRelationships.class,
                "items", items);
    }
    
    public final static class Builder {
 
        private Optional<? extends PostCatalogItemDeleteJobResponseItems> items = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder items(PostCatalogItemDeleteJobResponseItems items) {
            Utils.checkNotNull(items, "items");
            this.items = Optional.ofNullable(items);
            return this;
        }

        public Builder items(Optional<? extends PostCatalogItemDeleteJobResponseItems> items) {
            Utils.checkNotNull(items, "items");
            this.items = items;
            return this;
        }
        
        public PostCatalogItemDeleteJobResponseRelationships build() {
            return new PostCatalogItemDeleteJobResponseRelationships(
                items);
        }
    }
}

