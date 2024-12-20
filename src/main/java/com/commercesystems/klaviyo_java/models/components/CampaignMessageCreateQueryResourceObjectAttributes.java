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


public class CampaignMessageCreateQueryResourceObjectAttributes {

    /**
     * The channel the message is to be sent on (email or sms, for example)
     */
    @JsonProperty("channel")
    private String channel;

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
    private JsonNullable<? extends CampaignMessageCreateQueryResourceObjectContent> content;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("render_options")
    private Optional<? extends RenderOptionsSubObject> renderOptions;

    @JsonCreator
    public CampaignMessageCreateQueryResourceObjectAttributes(
            @JsonProperty("channel") String channel,
            @JsonProperty("label") JsonNullable<String> label,
            @JsonProperty("content") JsonNullable<? extends CampaignMessageCreateQueryResourceObjectContent> content,
            @JsonProperty("render_options") Optional<? extends RenderOptionsSubObject> renderOptions) {
        Utils.checkNotNull(channel, "channel");
        Utils.checkNotNull(label, "label");
        Utils.checkNotNull(content, "content");
        Utils.checkNotNull(renderOptions, "renderOptions");
        this.channel = channel;
        this.label = label;
        this.content = content;
        this.renderOptions = renderOptions;
    }
    
    public CampaignMessageCreateQueryResourceObjectAttributes(
            String channel) {
        this(channel, JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * The channel the message is to be sent on (email or sms, for example)
     */
    @JsonIgnore
    public String channel() {
        return channel;
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
    public JsonNullable<CampaignMessageCreateQueryResourceObjectContent> content() {
        return (JsonNullable<CampaignMessageCreateQueryResourceObjectContent>) content;
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
     * The channel the message is to be sent on (email or sms, for example)
     */
    public CampaignMessageCreateQueryResourceObjectAttributes withChannel(String channel) {
        Utils.checkNotNull(channel, "channel");
        this.channel = channel;
        return this;
    }

    /**
     * The label or name on the message
     */
    public CampaignMessageCreateQueryResourceObjectAttributes withLabel(String label) {
        Utils.checkNotNull(label, "label");
        this.label = JsonNullable.of(label);
        return this;
    }

    /**
     * The label or name on the message
     */
    public CampaignMessageCreateQueryResourceObjectAttributes withLabel(JsonNullable<String> label) {
        Utils.checkNotNull(label, "label");
        this.label = label;
        return this;
    }

    /**
     * Additional attributes relating to the content of the message
     */
    public CampaignMessageCreateQueryResourceObjectAttributes withContent(CampaignMessageCreateQueryResourceObjectContent content) {
        Utils.checkNotNull(content, "content");
        this.content = JsonNullable.of(content);
        return this;
    }

    /**
     * Additional attributes relating to the content of the message
     */
    public CampaignMessageCreateQueryResourceObjectAttributes withContent(JsonNullable<? extends CampaignMessageCreateQueryResourceObjectContent> content) {
        Utils.checkNotNull(content, "content");
        this.content = content;
        return this;
    }

    public CampaignMessageCreateQueryResourceObjectAttributes withRenderOptions(RenderOptionsSubObject renderOptions) {
        Utils.checkNotNull(renderOptions, "renderOptions");
        this.renderOptions = Optional.ofNullable(renderOptions);
        return this;
    }

    public CampaignMessageCreateQueryResourceObjectAttributes withRenderOptions(Optional<? extends RenderOptionsSubObject> renderOptions) {
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
        CampaignMessageCreateQueryResourceObjectAttributes other = (CampaignMessageCreateQueryResourceObjectAttributes) o;
        return 
            Objects.deepEquals(this.channel, other.channel) &&
            Objects.deepEquals(this.label, other.label) &&
            Objects.deepEquals(this.content, other.content) &&
            Objects.deepEquals(this.renderOptions, other.renderOptions);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            channel,
            label,
            content,
            renderOptions);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CampaignMessageCreateQueryResourceObjectAttributes.class,
                "channel", channel,
                "label", label,
                "content", content,
                "renderOptions", renderOptions);
    }
    
    public final static class Builder {
 
        private String channel;
 
        private JsonNullable<String> label = JsonNullable.undefined();
 
        private JsonNullable<? extends CampaignMessageCreateQueryResourceObjectContent> content = JsonNullable.undefined();
 
        private Optional<? extends RenderOptionsSubObject> renderOptions = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The channel the message is to be sent on (email or sms, for example)
         */
        public Builder channel(String channel) {
            Utils.checkNotNull(channel, "channel");
            this.channel = channel;
            return this;
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
        public Builder content(CampaignMessageCreateQueryResourceObjectContent content) {
            Utils.checkNotNull(content, "content");
            this.content = JsonNullable.of(content);
            return this;
        }

        /**
         * Additional attributes relating to the content of the message
         */
        public Builder content(JsonNullable<? extends CampaignMessageCreateQueryResourceObjectContent> content) {
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
        
        public CampaignMessageCreateQueryResourceObjectAttributes build() {
            return new CampaignMessageCreateQueryResourceObjectAttributes(
                channel,
                label,
                content,
                renderOptions);
        }
    }
}

