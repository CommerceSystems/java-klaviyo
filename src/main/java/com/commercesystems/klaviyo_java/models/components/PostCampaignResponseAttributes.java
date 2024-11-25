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


public class PostCampaignResponseAttributes {

    /**
     * The campaign name
     */
    @JsonProperty("name")
    private String name;

    /**
     * The current status of the campaign
     */
    @JsonProperty("status")
    private String status;

    /**
     * Whether the campaign has been archived or not
     */
    @JsonProperty("archived")
    private boolean archived;

    @JsonProperty("audiences")
    private AudiencesSubObject audiences;

    /**
     * Options to use when sending a campaign
     */
    @JsonProperty("send_options")
    private PostCampaignResponseSendOptions sendOptions;

    /**
     * The tracking options associated with the campaign
     */
    @JsonProperty("tracking_options")
    private PostCampaignResponseTrackingOptions trackingOptions;

    @JsonProperty("send_strategy")
    private SendStrategySubObject sendStrategy;

    /**
     * The datetime when the campaign was created
     */
    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    /**
     * The datetime when the campaign was scheduled for future sending
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scheduled_at")
    private JsonNullable<OffsetDateTime> scheduledAt;

    /**
     * The datetime when the campaign was last updated by a user or the system
     */
    @JsonProperty("updated_at")
    private OffsetDateTime updatedAt;

    /**
     * The datetime when the campaign will be / was sent or None if not yet scheduled by a send_job.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("send_time")
    private JsonNullable<OffsetDateTime> sendTime;

    @JsonCreator
    public PostCampaignResponseAttributes(
            @JsonProperty("name") String name,
            @JsonProperty("status") String status,
            @JsonProperty("archived") boolean archived,
            @JsonProperty("audiences") AudiencesSubObject audiences,
            @JsonProperty("send_options") PostCampaignResponseSendOptions sendOptions,
            @JsonProperty("tracking_options") PostCampaignResponseTrackingOptions trackingOptions,
            @JsonProperty("send_strategy") SendStrategySubObject sendStrategy,
            @JsonProperty("created_at") OffsetDateTime createdAt,
            @JsonProperty("scheduled_at") JsonNullable<OffsetDateTime> scheduledAt,
            @JsonProperty("updated_at") OffsetDateTime updatedAt,
            @JsonProperty("send_time") JsonNullable<OffsetDateTime> sendTime) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(archived, "archived");
        Utils.checkNotNull(audiences, "audiences");
        Utils.checkNotNull(sendOptions, "sendOptions");
        Utils.checkNotNull(trackingOptions, "trackingOptions");
        Utils.checkNotNull(sendStrategy, "sendStrategy");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(scheduledAt, "scheduledAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(sendTime, "sendTime");
        this.name = name;
        this.status = status;
        this.archived = archived;
        this.audiences = audiences;
        this.sendOptions = sendOptions;
        this.trackingOptions = trackingOptions;
        this.sendStrategy = sendStrategy;
        this.createdAt = createdAt;
        this.scheduledAt = scheduledAt;
        this.updatedAt = updatedAt;
        this.sendTime = sendTime;
    }
    
    public PostCampaignResponseAttributes(
            String name,
            String status,
            boolean archived,
            AudiencesSubObject audiences,
            PostCampaignResponseSendOptions sendOptions,
            PostCampaignResponseTrackingOptions trackingOptions,
            SendStrategySubObject sendStrategy,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt) {
        this(name, status, archived, audiences, sendOptions, trackingOptions, sendStrategy, createdAt, JsonNullable.undefined(), updatedAt, JsonNullable.undefined());
    }

    /**
     * The campaign name
     */
    @JsonIgnore
    public String name() {
        return name;
    }

    /**
     * The current status of the campaign
     */
    @JsonIgnore
    public String status() {
        return status;
    }

    /**
     * Whether the campaign has been archived or not
     */
    @JsonIgnore
    public boolean archived() {
        return archived;
    }

    @JsonIgnore
    public AudiencesSubObject audiences() {
        return audiences;
    }

    /**
     * Options to use when sending a campaign
     */
    @JsonIgnore
    public PostCampaignResponseSendOptions sendOptions() {
        return sendOptions;
    }

    /**
     * The tracking options associated with the campaign
     */
    @JsonIgnore
    public PostCampaignResponseTrackingOptions trackingOptions() {
        return trackingOptions;
    }

    @JsonIgnore
    public SendStrategySubObject sendStrategy() {
        return sendStrategy;
    }

    /**
     * The datetime when the campaign was created
     */
    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    /**
     * The datetime when the campaign was scheduled for future sending
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> scheduledAt() {
        return scheduledAt;
    }

    /**
     * The datetime when the campaign was last updated by a user or the system
     */
    @JsonIgnore
    public OffsetDateTime updatedAt() {
        return updatedAt;
    }

    /**
     * The datetime when the campaign will be / was sent or None if not yet scheduled by a send_job.
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> sendTime() {
        return sendTime;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The campaign name
     */
    public PostCampaignResponseAttributes withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The current status of the campaign
     */
    public PostCampaignResponseAttributes withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Whether the campaign has been archived or not
     */
    public PostCampaignResponseAttributes withArchived(boolean archived) {
        Utils.checkNotNull(archived, "archived");
        this.archived = archived;
        return this;
    }

    public PostCampaignResponseAttributes withAudiences(AudiencesSubObject audiences) {
        Utils.checkNotNull(audiences, "audiences");
        this.audiences = audiences;
        return this;
    }

    /**
     * Options to use when sending a campaign
     */
    public PostCampaignResponseAttributes withSendOptions(PostCampaignResponseSendOptions sendOptions) {
        Utils.checkNotNull(sendOptions, "sendOptions");
        this.sendOptions = sendOptions;
        return this;
    }

    /**
     * The tracking options associated with the campaign
     */
    public PostCampaignResponseAttributes withTrackingOptions(PostCampaignResponseTrackingOptions trackingOptions) {
        Utils.checkNotNull(trackingOptions, "trackingOptions");
        this.trackingOptions = trackingOptions;
        return this;
    }

    public PostCampaignResponseAttributes withSendStrategy(SendStrategySubObject sendStrategy) {
        Utils.checkNotNull(sendStrategy, "sendStrategy");
        this.sendStrategy = sendStrategy;
        return this;
    }

    /**
     * The datetime when the campaign was created
     */
    public PostCampaignResponseAttributes withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The datetime when the campaign was scheduled for future sending
     */
    public PostCampaignResponseAttributes withScheduledAt(OffsetDateTime scheduledAt) {
        Utils.checkNotNull(scheduledAt, "scheduledAt");
        this.scheduledAt = JsonNullable.of(scheduledAt);
        return this;
    }

    /**
     * The datetime when the campaign was scheduled for future sending
     */
    public PostCampaignResponseAttributes withScheduledAt(JsonNullable<OffsetDateTime> scheduledAt) {
        Utils.checkNotNull(scheduledAt, "scheduledAt");
        this.scheduledAt = scheduledAt;
        return this;
    }

    /**
     * The datetime when the campaign was last updated by a user or the system
     */
    public PostCampaignResponseAttributes withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The datetime when the campaign will be / was sent or None if not yet scheduled by a send_job.
     */
    public PostCampaignResponseAttributes withSendTime(OffsetDateTime sendTime) {
        Utils.checkNotNull(sendTime, "sendTime");
        this.sendTime = JsonNullable.of(sendTime);
        return this;
    }

    /**
     * The datetime when the campaign will be / was sent or None if not yet scheduled by a send_job.
     */
    public PostCampaignResponseAttributes withSendTime(JsonNullable<OffsetDateTime> sendTime) {
        Utils.checkNotNull(sendTime, "sendTime");
        this.sendTime = sendTime;
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
        PostCampaignResponseAttributes other = (PostCampaignResponseAttributes) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.archived, other.archived) &&
            Objects.deepEquals(this.audiences, other.audiences) &&
            Objects.deepEquals(this.sendOptions, other.sendOptions) &&
            Objects.deepEquals(this.trackingOptions, other.trackingOptions) &&
            Objects.deepEquals(this.sendStrategy, other.sendStrategy) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.scheduledAt, other.scheduledAt) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            Objects.deepEquals(this.sendTime, other.sendTime);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            status,
            archived,
            audiences,
            sendOptions,
            trackingOptions,
            sendStrategy,
            createdAt,
            scheduledAt,
            updatedAt,
            sendTime);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostCampaignResponseAttributes.class,
                "name", name,
                "status", status,
                "archived", archived,
                "audiences", audiences,
                "sendOptions", sendOptions,
                "trackingOptions", trackingOptions,
                "sendStrategy", sendStrategy,
                "createdAt", createdAt,
                "scheduledAt", scheduledAt,
                "updatedAt", updatedAt,
                "sendTime", sendTime);
    }
    
    public final static class Builder {
 
        private String name;
 
        private String status;
 
        private Boolean archived;
 
        private AudiencesSubObject audiences;
 
        private PostCampaignResponseSendOptions sendOptions;
 
        private PostCampaignResponseTrackingOptions trackingOptions;
 
        private SendStrategySubObject sendStrategy;
 
        private OffsetDateTime createdAt;
 
        private JsonNullable<OffsetDateTime> scheduledAt = JsonNullable.undefined();
 
        private OffsetDateTime updatedAt;
 
        private JsonNullable<OffsetDateTime> sendTime = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The campaign name
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The current status of the campaign
         */
        public Builder status(String status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * Whether the campaign has been archived or not
         */
        public Builder archived(boolean archived) {
            Utils.checkNotNull(archived, "archived");
            this.archived = archived;
            return this;
        }

        public Builder audiences(AudiencesSubObject audiences) {
            Utils.checkNotNull(audiences, "audiences");
            this.audiences = audiences;
            return this;
        }

        /**
         * Options to use when sending a campaign
         */
        public Builder sendOptions(PostCampaignResponseSendOptions sendOptions) {
            Utils.checkNotNull(sendOptions, "sendOptions");
            this.sendOptions = sendOptions;
            return this;
        }

        /**
         * The tracking options associated with the campaign
         */
        public Builder trackingOptions(PostCampaignResponseTrackingOptions trackingOptions) {
            Utils.checkNotNull(trackingOptions, "trackingOptions");
            this.trackingOptions = trackingOptions;
            return this;
        }

        public Builder sendStrategy(SendStrategySubObject sendStrategy) {
            Utils.checkNotNull(sendStrategy, "sendStrategy");
            this.sendStrategy = sendStrategy;
            return this;
        }

        /**
         * The datetime when the campaign was created
         */
        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        /**
         * The datetime when the campaign was scheduled for future sending
         */
        public Builder scheduledAt(OffsetDateTime scheduledAt) {
            Utils.checkNotNull(scheduledAt, "scheduledAt");
            this.scheduledAt = JsonNullable.of(scheduledAt);
            return this;
        }

        /**
         * The datetime when the campaign was scheduled for future sending
         */
        public Builder scheduledAt(JsonNullable<OffsetDateTime> scheduledAt) {
            Utils.checkNotNull(scheduledAt, "scheduledAt");
            this.scheduledAt = scheduledAt;
            return this;
        }

        /**
         * The datetime when the campaign was last updated by a user or the system
         */
        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * The datetime when the campaign will be / was sent or None if not yet scheduled by a send_job.
         */
        public Builder sendTime(OffsetDateTime sendTime) {
            Utils.checkNotNull(sendTime, "sendTime");
            this.sendTime = JsonNullable.of(sendTime);
            return this;
        }

        /**
         * The datetime when the campaign will be / was sent or None if not yet scheduled by a send_job.
         */
        public Builder sendTime(JsonNullable<OffsetDateTime> sendTime) {
            Utils.checkNotNull(sendTime, "sendTime");
            this.sendTime = sendTime;
            return this;
        }
        
        public PostCampaignResponseAttributes build() {
            return new PostCampaignResponseAttributes(
                name,
                status,
                archived,
                audiences,
                sendOptions,
                trackingOptions,
                sendStrategy,
                createdAt,
                scheduledAt,
                updatedAt,
                sendTime);
        }
    }
}
