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
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class ImagePartialUpdateQueryResourceObjectAttributes {

    /**
     * A name for the image.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * If true, this image is not shown in the asset library.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hidden")
    private JsonNullable<Boolean> hidden;

    @JsonCreator
    public ImagePartialUpdateQueryResourceObjectAttributes(
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("hidden") JsonNullable<Boolean> hidden) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(hidden, "hidden");
        this.name = name;
        this.hidden = hidden;
    }
    
    public ImagePartialUpdateQueryResourceObjectAttributes() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * A name for the image.
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * If true, this image is not shown in the asset library.
     */
    @JsonIgnore
    public JsonNullable<Boolean> hidden() {
        return hidden;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A name for the image.
     */
    public ImagePartialUpdateQueryResourceObjectAttributes withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * A name for the image.
     */
    public ImagePartialUpdateQueryResourceObjectAttributes withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * If true, this image is not shown in the asset library.
     */
    public ImagePartialUpdateQueryResourceObjectAttributes withHidden(boolean hidden) {
        Utils.checkNotNull(hidden, "hidden");
        this.hidden = JsonNullable.of(hidden);
        return this;
    }

    /**
     * If true, this image is not shown in the asset library.
     */
    public ImagePartialUpdateQueryResourceObjectAttributes withHidden(JsonNullable<Boolean> hidden) {
        Utils.checkNotNull(hidden, "hidden");
        this.hidden = hidden;
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
        ImagePartialUpdateQueryResourceObjectAttributes other = (ImagePartialUpdateQueryResourceObjectAttributes) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.hidden, other.hidden);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            hidden);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ImagePartialUpdateQueryResourceObjectAttributes.class,
                "name", name,
                "hidden", hidden);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private JsonNullable<Boolean> hidden = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A name for the image.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * A name for the image.
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * If true, this image is not shown in the asset library.
         */
        public Builder hidden(boolean hidden) {
            Utils.checkNotNull(hidden, "hidden");
            this.hidden = JsonNullable.of(hidden);
            return this;
        }

        /**
         * If true, this image is not shown in the asset library.
         */
        public Builder hidden(JsonNullable<Boolean> hidden) {
            Utils.checkNotNull(hidden, "hidden");
            this.hidden = hidden;
            return this;
        }
        
        public ImagePartialUpdateQueryResourceObjectAttributes build() {
            return new ImagePartialUpdateQueryResourceObjectAttributes(
                name,
                hidden);
        }
    }
}

