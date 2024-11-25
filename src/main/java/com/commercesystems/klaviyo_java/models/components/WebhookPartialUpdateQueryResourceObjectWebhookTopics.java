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
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class WebhookPartialUpdateQueryResourceObjectWebhookTopics {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    private Optional<? extends List<WebhookPartialUpdateQueryResourceObjectData>> data;

    @JsonCreator
    public WebhookPartialUpdateQueryResourceObjectWebhookTopics(
            @JsonProperty("data") Optional<? extends List<WebhookPartialUpdateQueryResourceObjectData>> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }
    
    public WebhookPartialUpdateQueryResourceObjectWebhookTopics() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<WebhookPartialUpdateQueryResourceObjectData>> data() {
        return (Optional<List<WebhookPartialUpdateQueryResourceObjectData>>) data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public WebhookPartialUpdateQueryResourceObjectWebhookTopics withData(List<WebhookPartialUpdateQueryResourceObjectData> data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    public WebhookPartialUpdateQueryResourceObjectWebhookTopics withData(Optional<? extends List<WebhookPartialUpdateQueryResourceObjectData>> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
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
        WebhookPartialUpdateQueryResourceObjectWebhookTopics other = (WebhookPartialUpdateQueryResourceObjectWebhookTopics) o;
        return 
            Objects.deepEquals(this.data, other.data);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            data);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WebhookPartialUpdateQueryResourceObjectWebhookTopics.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<WebhookPartialUpdateQueryResourceObjectData>> data = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(List<WebhookPartialUpdateQueryResourceObjectData> data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        public Builder data(Optional<? extends List<WebhookPartialUpdateQueryResourceObjectData>> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public WebhookPartialUpdateQueryResourceObjectWebhookTopics build() {
            return new WebhookPartialUpdateQueryResourceObjectWebhookTopics(
                data);
        }
    }
}

