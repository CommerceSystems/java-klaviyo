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
import java.time.OffsetDateTime;
import java.util.Objects;


public class PostUniversalContentResponseAttributes {

    /**
     * The name for this universal content
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("definition")
    private PostUniversalContentResponseDefinition definition;

    /**
     * The datetime when this universal content was created
     */
    @JsonProperty("created")
    private OffsetDateTime created;

    /**
     * The datetime when this universal content was updated
     */
    @JsonProperty("updated")
    private OffsetDateTime updated;

    /**
     * The status of a universal content screenshot.
     */
    @JsonProperty("screenshot_status")
    private PostUniversalContentResponseScreenshotStatus screenshotStatus;

    @JsonProperty("screenshot_url")
    private String screenshotUrl;

    @JsonCreator
    public PostUniversalContentResponseAttributes(
            @JsonProperty("name") String name,
            @JsonProperty("definition") PostUniversalContentResponseDefinition definition,
            @JsonProperty("created") OffsetDateTime created,
            @JsonProperty("updated") OffsetDateTime updated,
            @JsonProperty("screenshot_status") PostUniversalContentResponseScreenshotStatus screenshotStatus,
            @JsonProperty("screenshot_url") String screenshotUrl) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(definition, "definition");
        Utils.checkNotNull(created, "created");
        Utils.checkNotNull(updated, "updated");
        Utils.checkNotNull(screenshotStatus, "screenshotStatus");
        Utils.checkNotNull(screenshotUrl, "screenshotUrl");
        this.name = name;
        this.definition = definition;
        this.created = created;
        this.updated = updated;
        this.screenshotStatus = screenshotStatus;
        this.screenshotUrl = screenshotUrl;
    }

    /**
     * The name for this universal content
     */
    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public PostUniversalContentResponseDefinition definition() {
        return definition;
    }

    /**
     * The datetime when this universal content was created
     */
    @JsonIgnore
    public OffsetDateTime created() {
        return created;
    }

    /**
     * The datetime when this universal content was updated
     */
    @JsonIgnore
    public OffsetDateTime updated() {
        return updated;
    }

    /**
     * The status of a universal content screenshot.
     */
    @JsonIgnore
    public PostUniversalContentResponseScreenshotStatus screenshotStatus() {
        return screenshotStatus;
    }

    @JsonIgnore
    public String screenshotUrl() {
        return screenshotUrl;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The name for this universal content
     */
    public PostUniversalContentResponseAttributes withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public PostUniversalContentResponseAttributes withDefinition(PostUniversalContentResponseDefinition definition) {
        Utils.checkNotNull(definition, "definition");
        this.definition = definition;
        return this;
    }

    /**
     * The datetime when this universal content was created
     */
    public PostUniversalContentResponseAttributes withCreated(OffsetDateTime created) {
        Utils.checkNotNull(created, "created");
        this.created = created;
        return this;
    }

    /**
     * The datetime when this universal content was updated
     */
    public PostUniversalContentResponseAttributes withUpdated(OffsetDateTime updated) {
        Utils.checkNotNull(updated, "updated");
        this.updated = updated;
        return this;
    }

    /**
     * The status of a universal content screenshot.
     */
    public PostUniversalContentResponseAttributes withScreenshotStatus(PostUniversalContentResponseScreenshotStatus screenshotStatus) {
        Utils.checkNotNull(screenshotStatus, "screenshotStatus");
        this.screenshotStatus = screenshotStatus;
        return this;
    }

    public PostUniversalContentResponseAttributes withScreenshotUrl(String screenshotUrl) {
        Utils.checkNotNull(screenshotUrl, "screenshotUrl");
        this.screenshotUrl = screenshotUrl;
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
        PostUniversalContentResponseAttributes other = (PostUniversalContentResponseAttributes) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.definition, other.definition) &&
            Objects.deepEquals(this.created, other.created) &&
            Objects.deepEquals(this.updated, other.updated) &&
            Objects.deepEquals(this.screenshotStatus, other.screenshotStatus) &&
            Objects.deepEquals(this.screenshotUrl, other.screenshotUrl);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            definition,
            created,
            updated,
            screenshotStatus,
            screenshotUrl);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostUniversalContentResponseAttributes.class,
                "name", name,
                "definition", definition,
                "created", created,
                "updated", updated,
                "screenshotStatus", screenshotStatus,
                "screenshotUrl", screenshotUrl);
    }
    
    public final static class Builder {
 
        private String name;
 
        private PostUniversalContentResponseDefinition definition;
 
        private OffsetDateTime created;
 
        private OffsetDateTime updated;
 
        private PostUniversalContentResponseScreenshotStatus screenshotStatus;
 
        private String screenshotUrl;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The name for this universal content
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder definition(PostUniversalContentResponseDefinition definition) {
            Utils.checkNotNull(definition, "definition");
            this.definition = definition;
            return this;
        }

        /**
         * The datetime when this universal content was created
         */
        public Builder created(OffsetDateTime created) {
            Utils.checkNotNull(created, "created");
            this.created = created;
            return this;
        }

        /**
         * The datetime when this universal content was updated
         */
        public Builder updated(OffsetDateTime updated) {
            Utils.checkNotNull(updated, "updated");
            this.updated = updated;
            return this;
        }

        /**
         * The status of a universal content screenshot.
         */
        public Builder screenshotStatus(PostUniversalContentResponseScreenshotStatus screenshotStatus) {
            Utils.checkNotNull(screenshotStatus, "screenshotStatus");
            this.screenshotStatus = screenshotStatus;
            return this;
        }

        public Builder screenshotUrl(String screenshotUrl) {
            Utils.checkNotNull(screenshotUrl, "screenshotUrl");
            this.screenshotUrl = screenshotUrl;
            return this;
        }
        
        public PostUniversalContentResponseAttributes build() {
            return new PostUniversalContentResponseAttributes(
                name,
                definition,
                created,
                updated,
                screenshotStatus,
                screenshotUrl);
        }
    }
}

