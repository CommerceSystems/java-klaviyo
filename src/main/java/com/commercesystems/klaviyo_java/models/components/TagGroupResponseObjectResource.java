/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;


import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class TagGroupResponseObjectResource {

    @JsonProperty("type")
    private TagGroupEnum type;

    /**
     * The Tag Group ID
     */
    @JsonProperty("id")
    private String id;

    @JsonProperty("attributes")
    private TagGroupResponseObjectResourceAttributes attributes;

    @JsonProperty("links")
    private ObjectLinks links;

    @JsonCreator
    public TagGroupResponseObjectResource(
            @JsonProperty("type") TagGroupEnum type,
            @JsonProperty("id") String id,
            @JsonProperty("attributes") TagGroupResponseObjectResourceAttributes attributes,
            @JsonProperty("links") ObjectLinks links) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(attributes, "attributes");
        Utils.checkNotNull(links, "links");
        this.type = type;
        this.id = id;
        this.attributes = attributes;
        this.links = links;
    }

    @JsonIgnore
    public TagGroupEnum type() {
        return type;
    }

    /**
     * The Tag Group ID
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public TagGroupResponseObjectResourceAttributes attributes() {
        return attributes;
    }

    @JsonIgnore
    public ObjectLinks links() {
        return links;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TagGroupResponseObjectResource withType(TagGroupEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * The Tag Group ID
     */
    public TagGroupResponseObjectResource withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public TagGroupResponseObjectResource withAttributes(TagGroupResponseObjectResourceAttributes attributes) {
        Utils.checkNotNull(attributes, "attributes");
        this.attributes = attributes;
        return this;
    }

    public TagGroupResponseObjectResource withLinks(ObjectLinks links) {
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
        TagGroupResponseObjectResource other = (TagGroupResponseObjectResource) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.attributes, other.attributes) &&
            Objects.deepEquals(this.links, other.links);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            id,
            attributes,
            links);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TagGroupResponseObjectResource.class,
                "type", type,
                "id", id,
                "attributes", attributes,
                "links", links);
    }
    
    public final static class Builder {
 
        private TagGroupEnum type;
 
        private String id;
 
        private TagGroupResponseObjectResourceAttributes attributes;
 
        private ObjectLinks links;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(TagGroupEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * The Tag Group ID
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder attributes(TagGroupResponseObjectResourceAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }

        public Builder links(ObjectLinks links) {
            Utils.checkNotNull(links, "links");
            this.links = links;
            return this;
        }
        
        public TagGroupResponseObjectResource build() {
            return new TagGroupResponseObjectResource(
                type,
                id,
                attributes,
                links);
        }
    }
}

