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
import java.time.OffsetDateTime;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class FlowMessageResponseObjectResourceAttributes {

    @JsonProperty("name")
    private String name;

    @JsonProperty("channel")
    private String channel;

    @JsonProperty("content")
    private FlowMessageResponseObjectResourceContent content;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created")
    private JsonNullable<OffsetDateTime> created;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated")
    private JsonNullable<OffsetDateTime> updated;

    @JsonCreator
    public FlowMessageResponseObjectResourceAttributes(
            @JsonProperty("name") String name,
            @JsonProperty("channel") String channel,
            @JsonProperty("content") FlowMessageResponseObjectResourceContent content,
            @JsonProperty("created") JsonNullable<OffsetDateTime> created,
            @JsonProperty("updated") JsonNullable<OffsetDateTime> updated) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(channel, "channel");
        Utils.checkNotNull(content, "content");
        Utils.checkNotNull(created, "created");
        Utils.checkNotNull(updated, "updated");
        this.name = name;
        this.channel = channel;
        this.content = content;
        this.created = created;
        this.updated = updated;
    }
    
    public FlowMessageResponseObjectResourceAttributes(
            String name,
            String channel,
            FlowMessageResponseObjectResourceContent content) {
        this(name, channel, content, JsonNullable.undefined(), JsonNullable.undefined());
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public String channel() {
        return channel;
    }

    @JsonIgnore
    public FlowMessageResponseObjectResourceContent content() {
        return content;
    }

    @JsonIgnore
    public JsonNullable<OffsetDateTime> created() {
        return created;
    }

    @JsonIgnore
    public JsonNullable<OffsetDateTime> updated() {
        return updated;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public FlowMessageResponseObjectResourceAttributes withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public FlowMessageResponseObjectResourceAttributes withChannel(String channel) {
        Utils.checkNotNull(channel, "channel");
        this.channel = channel;
        return this;
    }

    public FlowMessageResponseObjectResourceAttributes withContent(FlowMessageResponseObjectResourceContent content) {
        Utils.checkNotNull(content, "content");
        this.content = content;
        return this;
    }

    public FlowMessageResponseObjectResourceAttributes withCreated(OffsetDateTime created) {
        Utils.checkNotNull(created, "created");
        this.created = JsonNullable.of(created);
        return this;
    }

    public FlowMessageResponseObjectResourceAttributes withCreated(JsonNullable<OffsetDateTime> created) {
        Utils.checkNotNull(created, "created");
        this.created = created;
        return this;
    }

    public FlowMessageResponseObjectResourceAttributes withUpdated(OffsetDateTime updated) {
        Utils.checkNotNull(updated, "updated");
        this.updated = JsonNullable.of(updated);
        return this;
    }

    public FlowMessageResponseObjectResourceAttributes withUpdated(JsonNullable<OffsetDateTime> updated) {
        Utils.checkNotNull(updated, "updated");
        this.updated = updated;
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
        FlowMessageResponseObjectResourceAttributes other = (FlowMessageResponseObjectResourceAttributes) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.channel, other.channel) &&
            Objects.deepEquals(this.content, other.content) &&
            Objects.deepEquals(this.created, other.created) &&
            Objects.deepEquals(this.updated, other.updated);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            channel,
            content,
            created,
            updated);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FlowMessageResponseObjectResourceAttributes.class,
                "name", name,
                "channel", channel,
                "content", content,
                "created", created,
                "updated", updated);
    }
    
    public final static class Builder {
 
        private String name;
 
        private String channel;
 
        private FlowMessageResponseObjectResourceContent content;
 
        private JsonNullable<OffsetDateTime> created = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> updated = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder channel(String channel) {
            Utils.checkNotNull(channel, "channel");
            this.channel = channel;
            return this;
        }

        public Builder content(FlowMessageResponseObjectResourceContent content) {
            Utils.checkNotNull(content, "content");
            this.content = content;
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
        
        public FlowMessageResponseObjectResourceAttributes build() {
            return new FlowMessageResponseObjectResourceAttributes(
                name,
                channel,
                content,
                created,
                updated);
        }
    }
}

