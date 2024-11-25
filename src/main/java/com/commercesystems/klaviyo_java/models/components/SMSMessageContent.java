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
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class SMSMessageContent {

    @JsonProperty("body")
    private String body;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("media_url")
    private JsonNullable<String> mediaUrl;

    @JsonCreator
    public SMSMessageContent(
            @JsonProperty("body") String body,
            @JsonProperty("media_url") JsonNullable<String> mediaUrl) {
        Utils.checkNotNull(body, "body");
        Utils.checkNotNull(mediaUrl, "mediaUrl");
        this.body = body;
        this.mediaUrl = mediaUrl;
    }
    
    public SMSMessageContent(
            String body) {
        this(body, JsonNullable.undefined());
    }

    @JsonIgnore
    public String body() {
        return body;
    }

    @JsonIgnore
    public JsonNullable<String> mediaUrl() {
        return mediaUrl;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SMSMessageContent withBody(String body) {
        Utils.checkNotNull(body, "body");
        this.body = body;
        return this;
    }

    public SMSMessageContent withMediaUrl(String mediaUrl) {
        Utils.checkNotNull(mediaUrl, "mediaUrl");
        this.mediaUrl = JsonNullable.of(mediaUrl);
        return this;
    }

    public SMSMessageContent withMediaUrl(JsonNullable<String> mediaUrl) {
        Utils.checkNotNull(mediaUrl, "mediaUrl");
        this.mediaUrl = mediaUrl;
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
        SMSMessageContent other = (SMSMessageContent) o;
        return 
            Objects.deepEquals(this.body, other.body) &&
            Objects.deepEquals(this.mediaUrl, other.mediaUrl);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            body,
            mediaUrl);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SMSMessageContent.class,
                "body", body,
                "mediaUrl", mediaUrl);
    }
    
    public final static class Builder {
 
        private String body;
 
        private JsonNullable<String> mediaUrl = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder body(String body) {
            Utils.checkNotNull(body, "body");
            this.body = body;
            return this;
        }

        public Builder mediaUrl(String mediaUrl) {
            Utils.checkNotNull(mediaUrl, "mediaUrl");
            this.mediaUrl = JsonNullable.of(mediaUrl);
            return this;
        }

        public Builder mediaUrl(JsonNullable<String> mediaUrl) {
            Utils.checkNotNull(mediaUrl, "mediaUrl");
            this.mediaUrl = mediaUrl;
            return this;
        }
        
        public SMSMessageContent build() {
            return new SMSMessageContent(
                body,
                mediaUrl);
        }
    }
}
