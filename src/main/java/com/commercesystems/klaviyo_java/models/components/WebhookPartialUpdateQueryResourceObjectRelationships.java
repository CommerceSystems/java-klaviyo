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


public class WebhookPartialUpdateQueryResourceObjectRelationships {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("webhook-topics")
    private Optional<? extends WebhookPartialUpdateQueryResourceObjectWebhookTopics> webhookTopics;

    @JsonCreator
    public WebhookPartialUpdateQueryResourceObjectRelationships(
            @JsonProperty("webhook-topics") Optional<? extends WebhookPartialUpdateQueryResourceObjectWebhookTopics> webhookTopics) {
        Utils.checkNotNull(webhookTopics, "webhookTopics");
        this.webhookTopics = webhookTopics;
    }
    
    public WebhookPartialUpdateQueryResourceObjectRelationships() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<WebhookPartialUpdateQueryResourceObjectWebhookTopics> webhookTopics() {
        return (Optional<WebhookPartialUpdateQueryResourceObjectWebhookTopics>) webhookTopics;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public WebhookPartialUpdateQueryResourceObjectRelationships withWebhookTopics(WebhookPartialUpdateQueryResourceObjectWebhookTopics webhookTopics) {
        Utils.checkNotNull(webhookTopics, "webhookTopics");
        this.webhookTopics = Optional.ofNullable(webhookTopics);
        return this;
    }

    public WebhookPartialUpdateQueryResourceObjectRelationships withWebhookTopics(Optional<? extends WebhookPartialUpdateQueryResourceObjectWebhookTopics> webhookTopics) {
        Utils.checkNotNull(webhookTopics, "webhookTopics");
        this.webhookTopics = webhookTopics;
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
        WebhookPartialUpdateQueryResourceObjectRelationships other = (WebhookPartialUpdateQueryResourceObjectRelationships) o;
        return 
            Objects.deepEquals(this.webhookTopics, other.webhookTopics);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            webhookTopics);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WebhookPartialUpdateQueryResourceObjectRelationships.class,
                "webhookTopics", webhookTopics);
    }
    
    public final static class Builder {
 
        private Optional<? extends WebhookPartialUpdateQueryResourceObjectWebhookTopics> webhookTopics = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder webhookTopics(WebhookPartialUpdateQueryResourceObjectWebhookTopics webhookTopics) {
            Utils.checkNotNull(webhookTopics, "webhookTopics");
            this.webhookTopics = Optional.ofNullable(webhookTopics);
            return this;
        }

        public Builder webhookTopics(Optional<? extends WebhookPartialUpdateQueryResourceObjectWebhookTopics> webhookTopics) {
            Utils.checkNotNull(webhookTopics, "webhookTopics");
            this.webhookTopics = webhookTopics;
            return this;
        }
        
        public WebhookPartialUpdateQueryResourceObjectRelationships build() {
            return new WebhookPartialUpdateQueryResourceObjectRelationships(
                webhookTopics);
        }
    }
}

