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


public class WebhookPartialUpdateQuery {

    @JsonProperty("data")
    private WebhookPartialUpdateQueryResourceObject data;

    @JsonCreator
    public WebhookPartialUpdateQuery(
            @JsonProperty("data") WebhookPartialUpdateQueryResourceObject data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public WebhookPartialUpdateQueryResourceObject data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public WebhookPartialUpdateQuery withData(WebhookPartialUpdateQueryResourceObject data) {
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
        WebhookPartialUpdateQuery other = (WebhookPartialUpdateQuery) o;
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
        return Utils.toString(WebhookPartialUpdateQuery.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private WebhookPartialUpdateQueryResourceObject data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(WebhookPartialUpdateQueryResourceObject data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public WebhookPartialUpdateQuery build() {
            return new WebhookPartialUpdateQuery(
                data);
        }
    }
}

