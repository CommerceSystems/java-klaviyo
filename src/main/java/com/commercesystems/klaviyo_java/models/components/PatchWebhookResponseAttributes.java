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
import java.time.OffsetDateTime;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class PatchWebhookResponseAttributes {

    /**
     * A name for the webhook.
     */
    @JsonProperty("name")
    private String name;

    /**
     * A description for the webhook.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<String> description;

    /**
     * The url to send webhook requests to, truncated for security.
     */
    @JsonProperty("endpoint_url")
    private String endpointUrl;

    /**
     * Is the webhook enabled.
     */
    @JsonProperty("enabled")
    private boolean enabled;

    /**
     * Date and time when the webhook was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)
     */
    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    /**
     * Date and time when the webhook was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)
     */
    @JsonProperty("updated_at")
    private OffsetDateTime updatedAt;

    @JsonCreator
    public PatchWebhookResponseAttributes(
            @JsonProperty("name") String name,
            @JsonProperty("description") JsonNullable<String> description,
            @JsonProperty("endpoint_url") String endpointUrl,
            @JsonProperty("enabled") boolean enabled,
            @JsonProperty("created_at") OffsetDateTime createdAt,
            @JsonProperty("updated_at") OffsetDateTime updatedAt) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(endpointUrl, "endpointUrl");
        Utils.checkNotNull(enabled, "enabled");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.name = name;
        this.description = description;
        this.endpointUrl = endpointUrl;
        this.enabled = enabled;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    
    public PatchWebhookResponseAttributes(
            String name,
            String endpointUrl,
            boolean enabled,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt) {
        this(name, JsonNullable.undefined(), endpointUrl, enabled, createdAt, updatedAt);
    }

    /**
     * A name for the webhook.
     */
    @JsonIgnore
    public String name() {
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
     * The url to send webhook requests to, truncated for security.
     */
    @JsonIgnore
    public String endpointUrl() {
        return endpointUrl;
    }

    /**
     * Is the webhook enabled.
     */
    @JsonIgnore
    public boolean enabled() {
        return enabled;
    }

    /**
     * Date and time when the webhook was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)
     */
    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    /**
     * Date and time when the webhook was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)
     */
    @JsonIgnore
    public OffsetDateTime updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A name for the webhook.
     */
    public PatchWebhookResponseAttributes withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * A description for the webhook.
     */
    public PatchWebhookResponseAttributes withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * A description for the webhook.
     */
    public PatchWebhookResponseAttributes withDescription(JsonNullable<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * The url to send webhook requests to, truncated for security.
     */
    public PatchWebhookResponseAttributes withEndpointUrl(String endpointUrl) {
        Utils.checkNotNull(endpointUrl, "endpointUrl");
        this.endpointUrl = endpointUrl;
        return this;
    }

    /**
     * Is the webhook enabled.
     */
    public PatchWebhookResponseAttributes withEnabled(boolean enabled) {
        Utils.checkNotNull(enabled, "enabled");
        this.enabled = enabled;
        return this;
    }

    /**
     * Date and time when the webhook was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)
     */
    public PatchWebhookResponseAttributes withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Date and time when the webhook was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)
     */
    public PatchWebhookResponseAttributes withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
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
        PatchWebhookResponseAttributes other = (PatchWebhookResponseAttributes) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.endpointUrl, other.endpointUrl) &&
            Objects.deepEquals(this.enabled, other.enabled) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            description,
            endpointUrl,
            enabled,
            createdAt,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchWebhookResponseAttributes.class,
                "name", name,
                "description", description,
                "endpointUrl", endpointUrl,
                "enabled", enabled,
                "createdAt", createdAt,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private String name;
 
        private JsonNullable<String> description = JsonNullable.undefined();
 
        private String endpointUrl;
 
        private Boolean enabled;
 
        private OffsetDateTime createdAt;
 
        private OffsetDateTime updatedAt;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A name for the webhook.
         */
        public Builder name(String name) {
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
         * The url to send webhook requests to, truncated for security.
         */
        public Builder endpointUrl(String endpointUrl) {
            Utils.checkNotNull(endpointUrl, "endpointUrl");
            this.endpointUrl = endpointUrl;
            return this;
        }

        /**
         * Is the webhook enabled.
         */
        public Builder enabled(boolean enabled) {
            Utils.checkNotNull(enabled, "enabled");
            this.enabled = enabled;
            return this;
        }

        /**
         * Date and time when the webhook was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)
         */
        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Date and time when the webhook was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)
         */
        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }
        
        public PatchWebhookResponseAttributes build() {
            return new PatchWebhookResponseAttributes(
                name,
                description,
                endpointUrl,
                enabled,
                createdAt,
                updatedAt);
        }
    }
}

