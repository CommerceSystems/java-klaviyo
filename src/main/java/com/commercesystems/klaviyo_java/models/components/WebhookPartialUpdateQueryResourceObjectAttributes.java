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


public class WebhookPartialUpdateQueryResourceObjectAttributes {

    /**
     * A name for the webhook.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * A description for the webhook.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<String> description;

    /**
     * A url to send webhook calls to. Must be https.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("endpoint_url")
    private JsonNullable<String> endpointUrl;

    /**
     * A secret key, that will be used for webhook request signing.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("secret_key")
    private JsonNullable<String> secretKey;

    /**
     * Is the webhook enabled.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enabled")
    private JsonNullable<Boolean> enabled;

    @JsonCreator
    public WebhookPartialUpdateQueryResourceObjectAttributes(
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("description") JsonNullable<String> description,
            @JsonProperty("endpoint_url") JsonNullable<String> endpointUrl,
            @JsonProperty("secret_key") JsonNullable<String> secretKey,
            @JsonProperty("enabled") JsonNullable<Boolean> enabled) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(endpointUrl, "endpointUrl");
        Utils.checkNotNull(secretKey, "secretKey");
        Utils.checkNotNull(enabled, "enabled");
        this.name = name;
        this.description = description;
        this.endpointUrl = endpointUrl;
        this.secretKey = secretKey;
        this.enabled = enabled;
    }
    
    public WebhookPartialUpdateQueryResourceObjectAttributes() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * A name for the webhook.
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * A description for the webhook.
     */
    @JsonIgnore
    public JsonNullable<String> description() {
        return description;
    }

    /**
     * A url to send webhook calls to. Must be https.
     */
    @JsonIgnore
    public JsonNullable<String> endpointUrl() {
        return endpointUrl;
    }

    /**
     * A secret key, that will be used for webhook request signing.
     */
    @JsonIgnore
    public JsonNullable<String> secretKey() {
        return secretKey;
    }

    /**
     * Is the webhook enabled.
     */
    @JsonIgnore
    public JsonNullable<Boolean> enabled() {
        return enabled;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A name for the webhook.
     */
    public WebhookPartialUpdateQueryResourceObjectAttributes withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * A name for the webhook.
     */
    public WebhookPartialUpdateQueryResourceObjectAttributes withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * A description for the webhook.
     */
    public WebhookPartialUpdateQueryResourceObjectAttributes withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * A description for the webhook.
     */
    public WebhookPartialUpdateQueryResourceObjectAttributes withDescription(JsonNullable<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * A url to send webhook calls to. Must be https.
     */
    public WebhookPartialUpdateQueryResourceObjectAttributes withEndpointUrl(String endpointUrl) {
        Utils.checkNotNull(endpointUrl, "endpointUrl");
        this.endpointUrl = JsonNullable.of(endpointUrl);
        return this;
    }

    /**
     * A url to send webhook calls to. Must be https.
     */
    public WebhookPartialUpdateQueryResourceObjectAttributes withEndpointUrl(JsonNullable<String> endpointUrl) {
        Utils.checkNotNull(endpointUrl, "endpointUrl");
        this.endpointUrl = endpointUrl;
        return this;
    }

    /**
     * A secret key, that will be used for webhook request signing.
     */
    public WebhookPartialUpdateQueryResourceObjectAttributes withSecretKey(String secretKey) {
        Utils.checkNotNull(secretKey, "secretKey");
        this.secretKey = JsonNullable.of(secretKey);
        return this;
    }

    /**
     * A secret key, that will be used for webhook request signing.
     */
    public WebhookPartialUpdateQueryResourceObjectAttributes withSecretKey(JsonNullable<String> secretKey) {
        Utils.checkNotNull(secretKey, "secretKey");
        this.secretKey = secretKey;
        return this;
    }

    /**
     * Is the webhook enabled.
     */
    public WebhookPartialUpdateQueryResourceObjectAttributes withEnabled(boolean enabled) {
        Utils.checkNotNull(enabled, "enabled");
        this.enabled = JsonNullable.of(enabled);
        return this;
    }

    /**
     * Is the webhook enabled.
     */
    public WebhookPartialUpdateQueryResourceObjectAttributes withEnabled(JsonNullable<Boolean> enabled) {
        Utils.checkNotNull(enabled, "enabled");
        this.enabled = enabled;
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
        WebhookPartialUpdateQueryResourceObjectAttributes other = (WebhookPartialUpdateQueryResourceObjectAttributes) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.endpointUrl, other.endpointUrl) &&
            Objects.deepEquals(this.secretKey, other.secretKey) &&
            Objects.deepEquals(this.enabled, other.enabled);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            description,
            endpointUrl,
            secretKey,
            enabled);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WebhookPartialUpdateQueryResourceObjectAttributes.class,
                "name", name,
                "description", description,
                "endpointUrl", endpointUrl,
                "secretKey", secretKey,
                "enabled", enabled);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private JsonNullable<String> description = JsonNullable.undefined();
 
        private JsonNullable<String> endpointUrl = JsonNullable.undefined();
 
        private JsonNullable<String> secretKey = JsonNullable.undefined();
 
        private JsonNullable<Boolean> enabled = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A name for the webhook.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * A name for the webhook.
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * A description for the webhook.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        /**
         * A description for the webhook.
         */
        public Builder description(JsonNullable<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * A url to send webhook calls to. Must be https.
         */
        public Builder endpointUrl(String endpointUrl) {
            Utils.checkNotNull(endpointUrl, "endpointUrl");
            this.endpointUrl = JsonNullable.of(endpointUrl);
            return this;
        }

        /**
         * A url to send webhook calls to. Must be https.
         */
        public Builder endpointUrl(JsonNullable<String> endpointUrl) {
            Utils.checkNotNull(endpointUrl, "endpointUrl");
            this.endpointUrl = endpointUrl;
            return this;
        }

        /**
         * A secret key, that will be used for webhook request signing.
         */
        public Builder secretKey(String secretKey) {
            Utils.checkNotNull(secretKey, "secretKey");
            this.secretKey = JsonNullable.of(secretKey);
            return this;
        }

        /**
         * A secret key, that will be used for webhook request signing.
         */
        public Builder secretKey(JsonNullable<String> secretKey) {
            Utils.checkNotNull(secretKey, "secretKey");
            this.secretKey = secretKey;
            return this;
        }

        /**
         * Is the webhook enabled.
         */
        public Builder enabled(boolean enabled) {
            Utils.checkNotNull(enabled, "enabled");
            this.enabled = JsonNullable.of(enabled);
            return this;
        }

        /**
         * Is the webhook enabled.
         */
        public Builder enabled(JsonNullable<Boolean> enabled) {
            Utils.checkNotNull(enabled, "enabled");
            this.enabled = enabled;
            return this;
        }
        
        public WebhookPartialUpdateQueryResourceObjectAttributes build() {
            return new WebhookPartialUpdateQueryResourceObjectAttributes(
                name,
                description,
                endpointUrl,
                secretKey,
                enabled);
        }
    }
}

