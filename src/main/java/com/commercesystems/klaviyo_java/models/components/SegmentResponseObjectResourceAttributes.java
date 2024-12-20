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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class SegmentResponseObjectResourceAttributes {

    /**
     * A helpful name to label the segment
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("definition")
    private Optional<? extends SegmentDefinition> definition;

    /**
     * Date and time when the segment was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created")
    private JsonNullable<OffsetDateTime> created;

    /**
     * Date and time when the segment was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated")
    private JsonNullable<OffsetDateTime> updated;

    @JsonProperty("is_active")
    private boolean isActive;

    @JsonProperty("is_processing")
    private boolean isProcessing;

    @JsonProperty("is_starred")
    private boolean isStarred;

    @JsonCreator
    public SegmentResponseObjectResourceAttributes(
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("definition") Optional<? extends SegmentDefinition> definition,
            @JsonProperty("created") JsonNullable<OffsetDateTime> created,
            @JsonProperty("updated") JsonNullable<OffsetDateTime> updated,
            @JsonProperty("is_active") boolean isActive,
            @JsonProperty("is_processing") boolean isProcessing,
            @JsonProperty("is_starred") boolean isStarred) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(definition, "definition");
        Utils.checkNotNull(created, "created");
        Utils.checkNotNull(updated, "updated");
        Utils.checkNotNull(isActive, "isActive");
        Utils.checkNotNull(isProcessing, "isProcessing");
        Utils.checkNotNull(isStarred, "isStarred");
        this.name = name;
        this.definition = definition;
        this.created = created;
        this.updated = updated;
        this.isActive = isActive;
        this.isProcessing = isProcessing;
        this.isStarred = isStarred;
    }
    
    public SegmentResponseObjectResourceAttributes(
            boolean isActive,
            boolean isProcessing,
            boolean isStarred) {
        this(JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), isActive, isProcessing, isStarred);
    }

    /**
     * A helpful name to label the segment
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SegmentDefinition> definition() {
        return (Optional<SegmentDefinition>) definition;
    }

    /**
     * Date and time when the segment was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> created() {
        return created;
    }

    /**
     * Date and time when the segment was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> updated() {
        return updated;
    }

    @JsonIgnore
    public boolean isActive() {
        return isActive;
    }

    @JsonIgnore
    public boolean isProcessing() {
        return isProcessing;
    }

    @JsonIgnore
    public boolean isStarred() {
        return isStarred;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A helpful name to label the segment
     */
    public SegmentResponseObjectResourceAttributes withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * A helpful name to label the segment
     */
    public SegmentResponseObjectResourceAttributes withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public SegmentResponseObjectResourceAttributes withDefinition(SegmentDefinition definition) {
        Utils.checkNotNull(definition, "definition");
        this.definition = Optional.ofNullable(definition);
        return this;
    }

    public SegmentResponseObjectResourceAttributes withDefinition(Optional<? extends SegmentDefinition> definition) {
        Utils.checkNotNull(definition, "definition");
        this.definition = definition;
        return this;
    }

    /**
     * Date and time when the segment was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)
     */
    public SegmentResponseObjectResourceAttributes withCreated(OffsetDateTime created) {
        Utils.checkNotNull(created, "created");
        this.created = JsonNullable.of(created);
        return this;
    }

    /**
     * Date and time when the segment was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)
     */
    public SegmentResponseObjectResourceAttributes withCreated(JsonNullable<OffsetDateTime> created) {
        Utils.checkNotNull(created, "created");
        this.created = created;
        return this;
    }

    /**
     * Date and time when the segment was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)
     */
    public SegmentResponseObjectResourceAttributes withUpdated(OffsetDateTime updated) {
        Utils.checkNotNull(updated, "updated");
        this.updated = JsonNullable.of(updated);
        return this;
    }

    /**
     * Date and time when the segment was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)
     */
    public SegmentResponseObjectResourceAttributes withUpdated(JsonNullable<OffsetDateTime> updated) {
        Utils.checkNotNull(updated, "updated");
        this.updated = updated;
        return this;
    }

    public SegmentResponseObjectResourceAttributes withIsActive(boolean isActive) {
        Utils.checkNotNull(isActive, "isActive");
        this.isActive = isActive;
        return this;
    }

    public SegmentResponseObjectResourceAttributes withIsProcessing(boolean isProcessing) {
        Utils.checkNotNull(isProcessing, "isProcessing");
        this.isProcessing = isProcessing;
        return this;
    }

    public SegmentResponseObjectResourceAttributes withIsStarred(boolean isStarred) {
        Utils.checkNotNull(isStarred, "isStarred");
        this.isStarred = isStarred;
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
        SegmentResponseObjectResourceAttributes other = (SegmentResponseObjectResourceAttributes) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.definition, other.definition) &&
            Objects.deepEquals(this.created, other.created) &&
            Objects.deepEquals(this.updated, other.updated) &&
            Objects.deepEquals(this.isActive, other.isActive) &&
            Objects.deepEquals(this.isProcessing, other.isProcessing) &&
            Objects.deepEquals(this.isStarred, other.isStarred);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            definition,
            created,
            updated,
            isActive,
            isProcessing,
            isStarred);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SegmentResponseObjectResourceAttributes.class,
                "name", name,
                "definition", definition,
                "created", created,
                "updated", updated,
                "isActive", isActive,
                "isProcessing", isProcessing,
                "isStarred", isStarred);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private Optional<? extends SegmentDefinition> definition = Optional.empty();
 
        private JsonNullable<OffsetDateTime> created = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> updated = JsonNullable.undefined();
 
        private Boolean isActive;
 
        private Boolean isProcessing;
 
        private Boolean isStarred;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A helpful name to label the segment
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * A helpful name to label the segment
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder definition(SegmentDefinition definition) {
            Utils.checkNotNull(definition, "definition");
            this.definition = Optional.ofNullable(definition);
            return this;
        }

        public Builder definition(Optional<? extends SegmentDefinition> definition) {
            Utils.checkNotNull(definition, "definition");
            this.definition = definition;
            return this;
        }

        /**
         * Date and time when the segment was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)
         */
        public Builder created(OffsetDateTime created) {
            Utils.checkNotNull(created, "created");
            this.created = JsonNullable.of(created);
            return this;
        }

        /**
         * Date and time when the segment was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)
         */
        public Builder created(JsonNullable<OffsetDateTime> created) {
            Utils.checkNotNull(created, "created");
            this.created = created;
            return this;
        }

        /**
         * Date and time when the segment was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)
         */
        public Builder updated(OffsetDateTime updated) {
            Utils.checkNotNull(updated, "updated");
            this.updated = JsonNullable.of(updated);
            return this;
        }

        /**
         * Date and time when the segment was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)
         */
        public Builder updated(JsonNullable<OffsetDateTime> updated) {
            Utils.checkNotNull(updated, "updated");
            this.updated = updated;
            return this;
        }

        public Builder isActive(boolean isActive) {
            Utils.checkNotNull(isActive, "isActive");
            this.isActive = isActive;
            return this;
        }

        public Builder isProcessing(boolean isProcessing) {
            Utils.checkNotNull(isProcessing, "isProcessing");
            this.isProcessing = isProcessing;
            return this;
        }

        public Builder isStarred(boolean isStarred) {
            Utils.checkNotNull(isStarred, "isStarred");
            this.isStarred = isStarred;
            return this;
        }
        
        public SegmentResponseObjectResourceAttributes build() {
            return new SegmentResponseObjectResourceAttributes(
                name,
                definition,
                created,
                updated,
                isActive,
                isProcessing,
                isStarred);
        }
    }
}

