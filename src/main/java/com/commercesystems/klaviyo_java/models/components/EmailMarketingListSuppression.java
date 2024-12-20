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
import java.time.OffsetDateTime;
import java.util.Objects;


public class EmailMarketingListSuppression {

    /**
     * The ID of list to which the suppression applies.
     */
    @JsonProperty("list_id")
    private String listId;

    /**
     * The reason the profile was suppressed from the list.
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * The timestamp when the profile was suppressed from the list, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    @JsonProperty("timestamp")
    private OffsetDateTime timestamp;

    @JsonCreator
    public EmailMarketingListSuppression(
            @JsonProperty("list_id") String listId,
            @JsonProperty("reason") String reason,
            @JsonProperty("timestamp") OffsetDateTime timestamp) {
        Utils.checkNotNull(listId, "listId");
        Utils.checkNotNull(reason, "reason");
        Utils.checkNotNull(timestamp, "timestamp");
        this.listId = listId;
        this.reason = reason;
        this.timestamp = timestamp;
    }

    /**
     * The ID of list to which the suppression applies.
     */
    @JsonIgnore
    public String listId() {
        return listId;
    }

    /**
     * The reason the profile was suppressed from the list.
     */
    @JsonIgnore
    public String reason() {
        return reason;
    }

    /**
     * The timestamp when the profile was suppressed from the list, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    @JsonIgnore
    public OffsetDateTime timestamp() {
        return timestamp;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of list to which the suppression applies.
     */
    public EmailMarketingListSuppression withListId(String listId) {
        Utils.checkNotNull(listId, "listId");
        this.listId = listId;
        return this;
    }

    /**
     * The reason the profile was suppressed from the list.
     */
    public EmailMarketingListSuppression withReason(String reason) {
        Utils.checkNotNull(reason, "reason");
        this.reason = reason;
        return this;
    }

    /**
     * The timestamp when the profile was suppressed from the list, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    public EmailMarketingListSuppression withTimestamp(OffsetDateTime timestamp) {
        Utils.checkNotNull(timestamp, "timestamp");
        this.timestamp = timestamp;
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
        EmailMarketingListSuppression other = (EmailMarketingListSuppression) o;
        return 
            Objects.deepEquals(this.listId, other.listId) &&
            Objects.deepEquals(this.reason, other.reason) &&
            Objects.deepEquals(this.timestamp, other.timestamp);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            listId,
            reason,
            timestamp);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EmailMarketingListSuppression.class,
                "listId", listId,
                "reason", reason,
                "timestamp", timestamp);
    }
    
    public final static class Builder {
 
        private String listId;
 
        private String reason;
 
        private OffsetDateTime timestamp;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of list to which the suppression applies.
         */
        public Builder listId(String listId) {
            Utils.checkNotNull(listId, "listId");
            this.listId = listId;
            return this;
        }

        /**
         * The reason the profile was suppressed from the list.
         */
        public Builder reason(String reason) {
            Utils.checkNotNull(reason, "reason");
            this.reason = reason;
            return this;
        }

        /**
         * The timestamp when the profile was suppressed from the list, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
         */
        public Builder timestamp(OffsetDateTime timestamp) {
            Utils.checkNotNull(timestamp, "timestamp");
            this.timestamp = timestamp;
            return this;
        }
        
        public EmailMarketingListSuppression build() {
            return new EmailMarketingListSuppression(
                listId,
                reason,
                timestamp);
        }
    }
}

