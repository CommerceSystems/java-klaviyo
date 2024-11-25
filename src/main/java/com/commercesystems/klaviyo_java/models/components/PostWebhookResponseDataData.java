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


public class PostWebhookResponseDataData {

    @JsonProperty("type")
    private WebhookTopicEnum type;

    /**
     * A topic the webhook is subscribed to.
     */
    @JsonProperty("id")
    private String id;

    @JsonCreator
    public PostWebhookResponseDataData(
            @JsonProperty("type") WebhookTopicEnum type,
            @JsonProperty("id") String id) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(id, "id");
        this.type = type;
        this.id = id;
    }

    @JsonIgnore
    public WebhookTopicEnum type() {
        return type;
    }

    /**
     * A topic the webhook is subscribed to.
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PostWebhookResponseDataData withType(WebhookTopicEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * A topic the webhook is subscribed to.
     */
    public PostWebhookResponseDataData withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
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
        PostWebhookResponseDataData other = (PostWebhookResponseDataData) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostWebhookResponseDataData.class,
                "type", type,
                "id", id);
    }
    
    public final static class Builder {
 
        private WebhookTopicEnum type;
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(WebhookTopicEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * A topic the webhook is subscribed to.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public PostWebhookResponseDataData build() {
            return new PostWebhookResponseDataData(
                type,
                id);
        }
    }
}

