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
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class GetFlowActionResponseCollectionAttributes {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("action_type")
    private JsonNullable<String> actionType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private JsonNullable<String> status;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created")
    private JsonNullable<OffsetDateTime> created;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated")
    private JsonNullable<OffsetDateTime> updated;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("settings")
    private JsonNullable<? extends GetFlowActionResponseCollectionSettings> settings;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tracking_options")
    private JsonNullable<? extends GetFlowActionResponseCollectionTrackingOptions> trackingOptions;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("send_options")
    private Optional<? extends SendOptions> sendOptions;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("render_options")
    private Optional<? extends SMSRenderOptions> renderOptions;

    @JsonCreator
    public GetFlowActionResponseCollectionAttributes(
            @JsonProperty("action_type") JsonNullable<String> actionType,
            @JsonProperty("status") JsonNullable<String> status,
            @JsonProperty("created") JsonNullable<OffsetDateTime> created,
            @JsonProperty("updated") JsonNullable<OffsetDateTime> updated,
            @JsonProperty("settings") JsonNullable<? extends GetFlowActionResponseCollectionSettings> settings,
            @JsonProperty("tracking_options") JsonNullable<? extends GetFlowActionResponseCollectionTrackingOptions> trackingOptions,
            @JsonProperty("send_options") Optional<? extends SendOptions> sendOptions,
            @JsonProperty("render_options") Optional<? extends SMSRenderOptions> renderOptions) {
        Utils.checkNotNull(actionType, "actionType");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(created, "created");
        Utils.checkNotNull(updated, "updated");
        Utils.checkNotNull(settings, "settings");
        Utils.checkNotNull(trackingOptions, "trackingOptions");
        Utils.checkNotNull(sendOptions, "sendOptions");
        Utils.checkNotNull(renderOptions, "renderOptions");
        this.actionType = actionType;
        this.status = status;
        this.created = created;
        this.updated = updated;
        this.settings = settings;
        this.trackingOptions = trackingOptions;
        this.sendOptions = sendOptions;
        this.renderOptions = renderOptions;
    }
    
    public GetFlowActionResponseCollectionAttributes() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public JsonNullable<String> actionType() {
        return actionType;
    }

    @JsonIgnore
    public JsonNullable<String> status() {
        return status;
    }

    @JsonIgnore
    public JsonNullable<OffsetDateTime> created() {
        return created;
    }

    @JsonIgnore
    public JsonNullable<OffsetDateTime> updated() {
        return updated;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<GetFlowActionResponseCollectionSettings> settings() {
        return (JsonNullable<GetFlowActionResponseCollectionSettings>) settings;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<GetFlowActionResponseCollectionTrackingOptions> trackingOptions() {
        return (JsonNullable<GetFlowActionResponseCollectionTrackingOptions>) trackingOptions;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SendOptions> sendOptions() {
        return (Optional<SendOptions>) sendOptions;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SMSRenderOptions> renderOptions() {
        return (Optional<SMSRenderOptions>) renderOptions;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetFlowActionResponseCollectionAttributes withActionType(String actionType) {
        Utils.checkNotNull(actionType, "actionType");
        this.actionType = JsonNullable.of(actionType);
        return this;
    }

    public GetFlowActionResponseCollectionAttributes withActionType(JsonNullable<String> actionType) {
        Utils.checkNotNull(actionType, "actionType");
        this.actionType = actionType;
        return this;
    }

    public GetFlowActionResponseCollectionAttributes withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = JsonNullable.of(status);
        return this;
    }

    public GetFlowActionResponseCollectionAttributes withStatus(JsonNullable<String> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public GetFlowActionResponseCollectionAttributes withCreated(OffsetDateTime created) {
        Utils.checkNotNull(created, "created");
        this.created = JsonNullable.of(created);
        return this;
    }

    public GetFlowActionResponseCollectionAttributes withCreated(JsonNullable<OffsetDateTime> created) {
        Utils.checkNotNull(created, "created");
        this.created = created;
        return this;
    }

    public GetFlowActionResponseCollectionAttributes withUpdated(OffsetDateTime updated) {
        Utils.checkNotNull(updated, "updated");
        this.updated = JsonNullable.of(updated);
        return this;
    }

    public GetFlowActionResponseCollectionAttributes withUpdated(JsonNullable<OffsetDateTime> updated) {
        Utils.checkNotNull(updated, "updated");
        this.updated = updated;
        return this;
    }

    public GetFlowActionResponseCollectionAttributes withSettings(GetFlowActionResponseCollectionSettings settings) {
        Utils.checkNotNull(settings, "settings");
        this.settings = JsonNullable.of(settings);
        return this;
    }

    public GetFlowActionResponseCollectionAttributes withSettings(JsonNullable<? extends GetFlowActionResponseCollectionSettings> settings) {
        Utils.checkNotNull(settings, "settings");
        this.settings = settings;
        return this;
    }

    public GetFlowActionResponseCollectionAttributes withTrackingOptions(GetFlowActionResponseCollectionTrackingOptions trackingOptions) {
        Utils.checkNotNull(trackingOptions, "trackingOptions");
        this.trackingOptions = JsonNullable.of(trackingOptions);
        return this;
    }

    public GetFlowActionResponseCollectionAttributes withTrackingOptions(JsonNullable<? extends GetFlowActionResponseCollectionTrackingOptions> trackingOptions) {
        Utils.checkNotNull(trackingOptions, "trackingOptions");
        this.trackingOptions = trackingOptions;
        return this;
    }

    public GetFlowActionResponseCollectionAttributes withSendOptions(SendOptions sendOptions) {
        Utils.checkNotNull(sendOptions, "sendOptions");
        this.sendOptions = Optional.ofNullable(sendOptions);
        return this;
    }

    public GetFlowActionResponseCollectionAttributes withSendOptions(Optional<? extends SendOptions> sendOptions) {
        Utils.checkNotNull(sendOptions, "sendOptions");
        this.sendOptions = sendOptions;
        return this;
    }

    public GetFlowActionResponseCollectionAttributes withRenderOptions(SMSRenderOptions renderOptions) {
        Utils.checkNotNull(renderOptions, "renderOptions");
        this.renderOptions = Optional.ofNullable(renderOptions);
        return this;
    }

    public GetFlowActionResponseCollectionAttributes withRenderOptions(Optional<? extends SMSRenderOptions> renderOptions) {
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
        GetFlowActionResponseCollectionAttributes other = (GetFlowActionResponseCollectionAttributes) o;
        return 
            Objects.deepEquals(this.actionType, other.actionType) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.created, other.created) &&
            Objects.deepEquals(this.updated, other.updated) &&
            Objects.deepEquals(this.settings, other.settings) &&
            Objects.deepEquals(this.trackingOptions, other.trackingOptions) &&
            Objects.deepEquals(this.sendOptions, other.sendOptions) &&
            Objects.deepEquals(this.renderOptions, other.renderOptions);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            actionType,
            status,
            created,
            updated,
            settings,
            trackingOptions,
            sendOptions,
            renderOptions);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetFlowActionResponseCollectionAttributes.class,
                "actionType", actionType,
                "status", status,
                "created", created,
                "updated", updated,
                "settings", settings,
                "trackingOptions", trackingOptions,
                "sendOptions", sendOptions,
                "renderOptions", renderOptions);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> actionType = JsonNullable.undefined();
 
        private JsonNullable<String> status = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> created = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> updated = JsonNullable.undefined();
 
        private JsonNullable<? extends GetFlowActionResponseCollectionSettings> settings = JsonNullable.undefined();
 
        private JsonNullable<? extends GetFlowActionResponseCollectionTrackingOptions> trackingOptions = JsonNullable.undefined();
 
        private Optional<? extends SendOptions> sendOptions = Optional.empty();
 
        private Optional<? extends SMSRenderOptions> renderOptions = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder actionType(String actionType) {
            Utils.checkNotNull(actionType, "actionType");
            this.actionType = JsonNullable.of(actionType);
            return this;
        }

        public Builder actionType(JsonNullable<String> actionType) {
            Utils.checkNotNull(actionType, "actionType");
            this.actionType = actionType;
            return this;
        }

        public Builder status(String status) {
            Utils.checkNotNull(status, "status");
            this.status = JsonNullable.of(status);
            return this;
        }

        public Builder status(JsonNullable<String> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder created(OffsetDateTime created) {
            Utils.checkNotNull(created, "created");
            this.created = JsonNullable.of(created);
            return this;
        }

        public Builder created(JsonNullable<OffsetDateTime> created) {
            Utils.checkNotNull(created, "created");
            this.created = created;
            return this;
        }

        public Builder updated(OffsetDateTime updated) {
            Utils.checkNotNull(updated, "updated");
            this.updated = JsonNullable.of(updated);
            return this;
        }

        public Builder updated(JsonNullable<OffsetDateTime> updated) {
            Utils.checkNotNull(updated, "updated");
            this.updated = updated;
            return this;
        }

        public Builder settings(GetFlowActionResponseCollectionSettings settings) {
            Utils.checkNotNull(settings, "settings");
            this.settings = JsonNullable.of(settings);
            return this;
        }

        public Builder settings(JsonNullable<? extends GetFlowActionResponseCollectionSettings> settings) {
            Utils.checkNotNull(settings, "settings");
            this.settings = settings;
            return this;
        }

        public Builder trackingOptions(GetFlowActionResponseCollectionTrackingOptions trackingOptions) {
            Utils.checkNotNull(trackingOptions, "trackingOptions");
            this.trackingOptions = JsonNullable.of(trackingOptions);
            return this;
        }

        public Builder trackingOptions(JsonNullable<? extends GetFlowActionResponseCollectionTrackingOptions> trackingOptions) {
            Utils.checkNotNull(trackingOptions, "trackingOptions");
            this.trackingOptions = trackingOptions;
            return this;
        }

        public Builder sendOptions(SendOptions sendOptions) {
            Utils.checkNotNull(sendOptions, "sendOptions");
            this.sendOptions = Optional.ofNullable(sendOptions);
            return this;
        }

        public Builder sendOptions(Optional<? extends SendOptions> sendOptions) {
            Utils.checkNotNull(sendOptions, "sendOptions");
            this.sendOptions = sendOptions;
            return this;
        }

        public Builder renderOptions(SMSRenderOptions renderOptions) {
            Utils.checkNotNull(renderOptions, "renderOptions");
            this.renderOptions = Optional.ofNullable(renderOptions);
            return this;
        }

        public Builder renderOptions(Optional<? extends SMSRenderOptions> renderOptions) {
            Utils.checkNotNull(renderOptions, "renderOptions");
            this.renderOptions = renderOptions;
            return this;
        }
        
        public GetFlowActionResponseCollectionAttributes build() {
            return new GetFlowActionResponseCollectionAttributes(
                actionType,
                status,
                created,
                updated,
                settings,
                trackingOptions,
                sendOptions,
                renderOptions);
        }
    }
}

