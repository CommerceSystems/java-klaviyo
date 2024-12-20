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
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class SegmentPartialUpdateQueryResourceObjectAttributes {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("definition")
    private Optional<? extends SegmentDefinition> definition;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_starred")
    private JsonNullable<Boolean> isStarred;

    @JsonCreator
    public SegmentPartialUpdateQueryResourceObjectAttributes(
            @JsonProperty("definition") Optional<? extends SegmentDefinition> definition,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("is_starred") JsonNullable<Boolean> isStarred) {
        Utils.checkNotNull(definition, "definition");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(isStarred, "isStarred");
        this.definition = definition;
        this.name = name;
        this.isStarred = isStarred;
    }
    
    public SegmentPartialUpdateQueryResourceObjectAttributes() {
        this(Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SegmentDefinition> definition() {
        return (Optional<SegmentDefinition>) definition;
    }

    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    @JsonIgnore
    public JsonNullable<Boolean> isStarred() {
        return isStarred;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SegmentPartialUpdateQueryResourceObjectAttributes withDefinition(SegmentDefinition definition) {
        Utils.checkNotNull(definition, "definition");
        this.definition = Optional.ofNullable(definition);
        return this;
    }

    public SegmentPartialUpdateQueryResourceObjectAttributes withDefinition(Optional<? extends SegmentDefinition> definition) {
        Utils.checkNotNull(definition, "definition");
        this.definition = definition;
        return this;
    }

    public SegmentPartialUpdateQueryResourceObjectAttributes withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    public SegmentPartialUpdateQueryResourceObjectAttributes withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public SegmentPartialUpdateQueryResourceObjectAttributes withIsStarred(boolean isStarred) {
        Utils.checkNotNull(isStarred, "isStarred");
        this.isStarred = JsonNullable.of(isStarred);
        return this;
    }

    public SegmentPartialUpdateQueryResourceObjectAttributes withIsStarred(JsonNullable<Boolean> isStarred) {
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
        SegmentPartialUpdateQueryResourceObjectAttributes other = (SegmentPartialUpdateQueryResourceObjectAttributes) o;
        return 
            Objects.deepEquals(this.definition, other.definition) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.isStarred, other.isStarred);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            definition,
            name,
            isStarred);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SegmentPartialUpdateQueryResourceObjectAttributes.class,
                "definition", definition,
                "name", name,
                "isStarred", isStarred);
    }
    
    public final static class Builder {
 
        private Optional<? extends SegmentDefinition> definition = Optional.empty();
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private JsonNullable<Boolean> isStarred = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder isStarred(boolean isStarred) {
            Utils.checkNotNull(isStarred, "isStarred");
            this.isStarred = JsonNullable.of(isStarred);
            return this;
        }

        public Builder isStarred(JsonNullable<Boolean> isStarred) {
            Utils.checkNotNull(isStarred, "isStarred");
            this.isStarred = isStarred;
            return this;
        }
        
        public SegmentPartialUpdateQueryResourceObjectAttributes build() {
            return new SegmentPartialUpdateQueryResourceObjectAttributes(
                definition,
                name,
                isStarred);
        }
    }
}

