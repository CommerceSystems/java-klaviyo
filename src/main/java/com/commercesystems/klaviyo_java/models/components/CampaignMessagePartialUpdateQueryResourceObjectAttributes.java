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
import org.openapitools.jackson.nullable.JsonNullable;


public class CampaignMessagePartialUpdateQueryResourceObjectAttributes {

    /**
     * The label or name on the message
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("label")
    private JsonNullable<String> label;

    /**
     * Additional attributes relating to the content of the message
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("content")
    private JsonNullable<? extends CampaignMessagePartialUpdateQueryResourceObjectContent> content;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("render_options")
    private Optional<? extends RenderOptionsSubObject> renderOptions;

    @JsonCreator
    public CampaignMessagePartialUpdateQueryResourceObjectAttributes(
            @JsonProperty("label") JsonNullable<String> label,
            @JsonProperty("content") JsonNullable<? extends CampaignMessagePartialUpdateQueryResourceObjectContent> content,
            @JsonProperty("render_options") Optional<? extends RenderOptionsSubObject> renderOptions) {
        Utils.checkNotNull(label, "label");
        Utils.checkNotNull(content, "content");
        Utils.checkNotNull(renderOptions, "renderOptions");
        this.label = label;
        this.content = content;
        this.renderOptions = renderOptions;
    }
    
    public CampaignMessagePartialUpdateQueryResourceObjectAttributes() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * The label or name on the message
     */
    @JsonIgnore
    public JsonNullable<String> label() {
        return label;
    }

    /**
     * Additional attributes relating to the content of the message
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<CampaignMessagePartialUpdateQueryResourceObjectContent> content() {
        return (JsonNullable<CampaignMessagePartialUpdateQueryResourceObjectContent>) content;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<RenderOptionsSubObject> renderOptions() {
        return (Optional<RenderOptionsSubObject>) renderOptions;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The label or name on the message
     */
    public CampaignMessagePartialUpdateQueryResourceObjectAttributes withLabel(String label) {
        Utils.checkNotNull(label, "label");
        this.label = JsonNullable.of(label);
        return this;
    }

    /**
     * The label or name on the message
     */
    public CampaignMessagePartialUpdateQueryResourceObjectAttributes withLabel(JsonNullable<String> label) {
        Utils.checkNotNull(label, "label");
        this.label = label;
        return this;
    }

    /**
     * Additional attributes relating to the content of the message
     */
    public CampaignMessagePartialUpdateQueryResourceObjectAttributes withContent(CampaignMessagePartialUpdateQueryResourceObjectContent content) {
        Utils.checkNotNull(content, "content");
        this.content = JsonNullable.of(content);
        return this;
    }

    /**
     * Additional attributes relating to the content of the message
     */
    public CampaignMessagePartialUpdateQueryResourceObjectAttributes withContent(JsonNullable<? extends CampaignMessagePartialUpdateQueryResourceObjectContent> content) {
        Utils.checkNotNull(content, "content");
        this.content = content;
        return this;
    }

    public CampaignMessagePartialUpdateQueryResourceObjectAttributes withRenderOptions(RenderOptionsSubObject renderOptions) {
        Utils.checkNotNull(renderOptions, "renderOptions");
        this.renderOptions = Optional.ofNullable(renderOptions);
        return this;
    }

    public CampaignMessagePartialUpdateQueryResourceObjectAttributes withRenderOptions(Optional<? extends RenderOptionsSubObject> renderOptions) {
        Utils.checkNotNull(renderOptions, "renderOptions");
        this.renderOptions = renderOptions;
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
        CampaignMessagePartialUpdateQueryResourceObjectAttributes other = (CampaignMessagePartialUpdateQueryResourceObjectAttributes) o;
        return 
            Objects.deepEquals(this.label, other.label) &&
            Objects.deepEquals(this.content, other.content) &&
            Objects.deepEquals(this.renderOptions, other.renderOptions);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            label,
            content,
            renderOptions);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CampaignMessagePartialUpdateQueryResourceObjectAttributes.class,
                "label", label,
                "content", content,
                "renderOptions", renderOptions);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> label = JsonNullable.undefined();
 
        private JsonNullable<? extends CampaignMessagePartialUpdateQueryResourceObjectContent> content = JsonNullable.undefined();
 
        private Optional<? extends RenderOptionsSubObject> renderOptions = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The label or name on the message
         */
        public Builder label(String label) {
            Utils.checkNotNull(label, "label");
            this.label = JsonNullable.of(label);
            return this;
        }

        /**
         * The label or name on the message
         */
        public Builder label(JsonNullable<String> label) {
            Utils.checkNotNull(label, "label");
            this.label = label;
            return this;
        }

        /**
         * Additional attributes relating to the content of the message
         */
        public Builder content(CampaignMessagePartialUpdateQueryResourceObjectContent content) {
            Utils.checkNotNull(content, "content");
            this.content = JsonNullable.of(content);
            return this;
        }

        /**
         * Additional attributes relating to the content of the message
         */
        public Builder content(JsonNullable<? extends CampaignMessagePartialUpdateQueryResourceObjectContent> content) {
            Utils.checkNotNull(content, "content");
            this.content = content;
            return this;
        }

        public Builder renderOptions(RenderOptionsSubObject renderOptions) {
            Utils.checkNotNull(renderOptions, "renderOptions");
            this.renderOptions = Optional.ofNullable(renderOptions);
            return this;
        }

        public Builder renderOptions(Optional<? extends RenderOptionsSubObject> renderOptions) {
            Utils.checkNotNull(renderOptions, "renderOptions");
            this.renderOptions = renderOptions;
            return this;
        }
        
        public CampaignMessagePartialUpdateQueryResourceObjectAttributes build() {
            return new CampaignMessagePartialUpdateQueryResourceObjectAttributes(
                label,
                content,
                renderOptions);
        }
    }
}

