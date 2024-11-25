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
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class ProfileResponseObjectResource {

    @JsonProperty("type")
    private ProfileEnum type;

    /**
     * Primary key that uniquely identifies this profile. Generated by Klaviyo.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private JsonNullable<String> id;

    @JsonProperty("attributes")
    private ProfileResponseObjectResourceAttributes attributes;

    @JsonProperty("links")
    private ObjectLinks links;

    @JsonCreator
    public ProfileResponseObjectResource(
            @JsonProperty("type") ProfileEnum type,
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("attributes") ProfileResponseObjectResourceAttributes attributes,
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
    
    public ProfileResponseObjectResource(
            ProfileEnum type,
            ProfileResponseObjectResourceAttributes attributes,
            ObjectLinks links) {
        this(type, JsonNullable.undefined(), attributes, links);
    }

    @JsonIgnore
    public ProfileEnum type() {
        return type;
    }

    /**
     * Primary key that uniquely identifies this profile. Generated by Klaviyo.
     */
    @JsonIgnore
    public JsonNullable<String> id() {
        return id;
    }

    @JsonIgnore
    public ProfileResponseObjectResourceAttributes attributes() {
        return attributes;
    }

    @JsonIgnore
    public ObjectLinks links() {
        return links;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ProfileResponseObjectResource withType(ProfileEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Primary key that uniquely identifies this profile. Generated by Klaviyo.
     */
    public ProfileResponseObjectResource withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * Primary key that uniquely identifies this profile. Generated by Klaviyo.
     */
    public ProfileResponseObjectResource withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public ProfileResponseObjectResource withAttributes(ProfileResponseObjectResourceAttributes attributes) {
        Utils.checkNotNull(attributes, "attributes");
        this.attributes = attributes;
        return this;
    }

    public ProfileResponseObjectResource withLinks(ObjectLinks links) {
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
        ProfileResponseObjectResource other = (ProfileResponseObjectResource) o;
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
        return Utils.toString(ProfileResponseObjectResource.class,
                "type", type,
                "id", id,
                "attributes", attributes,
                "links", links);
    }
    
    public final static class Builder {
 
        private ProfileEnum type;
 
        private JsonNullable<String> id = JsonNullable.undefined();
 
        private ProfileResponseObjectResourceAttributes attributes;
 
        private ObjectLinks links;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(ProfileEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * Primary key that uniquely identifies this profile. Generated by Klaviyo.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = JsonNullable.of(id);
            return this;
        }

        /**
         * Primary key that uniquely identifies this profile. Generated by Klaviyo.
         */
        public Builder id(JsonNullable<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder attributes(ProfileResponseObjectResourceAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }

        public Builder links(ObjectLinks links) {
            Utils.checkNotNull(links, "links");
            this.links = links;
            return this;
        }
        
        public ProfileResponseObjectResource build() {
            return new ProfileResponseObjectResource(
                type,
                id,
                attributes,
                links);
        }
    }
}
