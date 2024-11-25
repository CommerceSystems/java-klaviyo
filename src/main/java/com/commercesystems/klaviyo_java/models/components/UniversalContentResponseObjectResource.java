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


public class UniversalContentResponseObjectResource {

    @JsonProperty("type")
    private TemplateUniversalContentEnum type;

    /**
     * The ID of the universal content
     */
    @JsonProperty("id")
    private String id;

    @JsonProperty("attributes")
    private UniversalContentResponseObjectResourceAttributes attributes;

    @JsonProperty("links")
    private ObjectLinks links;

    @JsonCreator
    public UniversalContentResponseObjectResource(
            @JsonProperty("type") TemplateUniversalContentEnum type,
            @JsonProperty("id") String id,
            @JsonProperty("attributes") UniversalContentResponseObjectResourceAttributes attributes,
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
    public TemplateUniversalContentEnum type() {
        return type;
    }

    /**
     * The ID of the universal content
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public UniversalContentResponseObjectResourceAttributes attributes() {
        return attributes;
    }

    @JsonIgnore
    public ObjectLinks links() {
        return links;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UniversalContentResponseObjectResource withType(TemplateUniversalContentEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * The ID of the universal content
     */
    public UniversalContentResponseObjectResource withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public UniversalContentResponseObjectResource withAttributes(UniversalContentResponseObjectResourceAttributes attributes) {
        Utils.checkNotNull(attributes, "attributes");
        this.attributes = attributes;
        return this;
    }

    public UniversalContentResponseObjectResource withLinks(ObjectLinks links) {
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
        UniversalContentResponseObjectResource other = (UniversalContentResponseObjectResource) o;
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
        return Utils.toString(UniversalContentResponseObjectResource.class,
                "type", type,
                "id", id,
                "attributes", attributes,
                "links", links);
    }
    
    public final static class Builder {
 
        private TemplateUniversalContentEnum type;
 
        private String id;
 
        private UniversalContentResponseObjectResourceAttributes attributes;
 
        private ObjectLinks links;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(TemplateUniversalContentEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * The ID of the universal content
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder attributes(UniversalContentResponseObjectResourceAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }

        public Builder links(ObjectLinks links) {
            Utils.checkNotNull(links, "links");
            this.links = links;
            return this;
        }
        
        public UniversalContentResponseObjectResource build() {
            return new UniversalContentResponseObjectResource(
                type,
                id,
                attributes,
                links);
        }
    }
}

