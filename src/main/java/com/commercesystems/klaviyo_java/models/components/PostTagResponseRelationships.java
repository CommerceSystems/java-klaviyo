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


public class PostTagResponseRelationships {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tag-group")
    private Optional<? extends PostTagResponseTagGroup> tagGroup;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lists")
    private Optional<? extends PostTagResponseLists> lists;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("segments")
    private Optional<? extends PostTagResponseSegments> segments;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("campaigns")
    private Optional<? extends PostTagResponseCampaigns> campaigns;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("flows")
    private Optional<? extends PostTagResponseFlows> flows;

    @JsonCreator
    public PostTagResponseRelationships(
            @JsonProperty("tag-group") Optional<? extends PostTagResponseTagGroup> tagGroup,
            @JsonProperty("lists") Optional<? extends PostTagResponseLists> lists,
            @JsonProperty("segments") Optional<? extends PostTagResponseSegments> segments,
            @JsonProperty("campaigns") Optional<? extends PostTagResponseCampaigns> campaigns,
            @JsonProperty("flows") Optional<? extends PostTagResponseFlows> flows) {
        Utils.checkNotNull(tagGroup, "tagGroup");
        Utils.checkNotNull(lists, "lists");
        Utils.checkNotNull(segments, "segments");
        Utils.checkNotNull(campaigns, "campaigns");
        Utils.checkNotNull(flows, "flows");
        this.tagGroup = tagGroup;
        this.lists = lists;
        this.segments = segments;
        this.campaigns = campaigns;
        this.flows = flows;
    }
    
    public PostTagResponseRelationships() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostTagResponseTagGroup> tagGroup() {
        return (Optional<PostTagResponseTagGroup>) tagGroup;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostTagResponseLists> lists() {
        return (Optional<PostTagResponseLists>) lists;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostTagResponseSegments> segments() {
        return (Optional<PostTagResponseSegments>) segments;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostTagResponseCampaigns> campaigns() {
        return (Optional<PostTagResponseCampaigns>) campaigns;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostTagResponseFlows> flows() {
        return (Optional<PostTagResponseFlows>) flows;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PostTagResponseRelationships withTagGroup(PostTagResponseTagGroup tagGroup) {
        Utils.checkNotNull(tagGroup, "tagGroup");
        this.tagGroup = Optional.ofNullable(tagGroup);
        return this;
    }

    public PostTagResponseRelationships withTagGroup(Optional<? extends PostTagResponseTagGroup> tagGroup) {
        Utils.checkNotNull(tagGroup, "tagGroup");
        this.tagGroup = tagGroup;
        return this;
    }

    public PostTagResponseRelationships withLists(PostTagResponseLists lists) {
        Utils.checkNotNull(lists, "lists");
        this.lists = Optional.ofNullable(lists);
        return this;
    }

    public PostTagResponseRelationships withLists(Optional<? extends PostTagResponseLists> lists) {
        Utils.checkNotNull(lists, "lists");
        this.lists = lists;
        return this;
    }

    public PostTagResponseRelationships withSegments(PostTagResponseSegments segments) {
        Utils.checkNotNull(segments, "segments");
        this.segments = Optional.ofNullable(segments);
        return this;
    }

    public PostTagResponseRelationships withSegments(Optional<? extends PostTagResponseSegments> segments) {
        Utils.checkNotNull(segments, "segments");
        this.segments = segments;
        return this;
    }

    public PostTagResponseRelationships withCampaigns(PostTagResponseCampaigns campaigns) {
        Utils.checkNotNull(campaigns, "campaigns");
        this.campaigns = Optional.ofNullable(campaigns);
        return this;
    }

    public PostTagResponseRelationships withCampaigns(Optional<? extends PostTagResponseCampaigns> campaigns) {
        Utils.checkNotNull(campaigns, "campaigns");
        this.campaigns = campaigns;
        return this;
    }

    public PostTagResponseRelationships withFlows(PostTagResponseFlows flows) {
        Utils.checkNotNull(flows, "flows");
        this.flows = Optional.ofNullable(flows);
        return this;
    }

    public PostTagResponseRelationships withFlows(Optional<? extends PostTagResponseFlows> flows) {
        Utils.checkNotNull(flows, "flows");
        this.flows = flows;
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
        PostTagResponseRelationships other = (PostTagResponseRelationships) o;
        return 
            Objects.deepEquals(this.tagGroup, other.tagGroup) &&
            Objects.deepEquals(this.lists, other.lists) &&
            Objects.deepEquals(this.segments, other.segments) &&
            Objects.deepEquals(this.campaigns, other.campaigns) &&
            Objects.deepEquals(this.flows, other.flows);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            tagGroup,
            lists,
            segments,
            campaigns,
            flows);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostTagResponseRelationships.class,
                "tagGroup", tagGroup,
                "lists", lists,
                "segments", segments,
                "campaigns", campaigns,
                "flows", flows);
    }
    
    public final static class Builder {
 
        private Optional<? extends PostTagResponseTagGroup> tagGroup = Optional.empty();
 
        private Optional<? extends PostTagResponseLists> lists = Optional.empty();
 
        private Optional<? extends PostTagResponseSegments> segments = Optional.empty();
 
        private Optional<? extends PostTagResponseCampaigns> campaigns = Optional.empty();
 
        private Optional<? extends PostTagResponseFlows> flows = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder tagGroup(PostTagResponseTagGroup tagGroup) {
            Utils.checkNotNull(tagGroup, "tagGroup");
            this.tagGroup = Optional.ofNullable(tagGroup);
            return this;
        }

        public Builder tagGroup(Optional<? extends PostTagResponseTagGroup> tagGroup) {
            Utils.checkNotNull(tagGroup, "tagGroup");
            this.tagGroup = tagGroup;
            return this;
        }

        public Builder lists(PostTagResponseLists lists) {
            Utils.checkNotNull(lists, "lists");
            this.lists = Optional.ofNullable(lists);
            return this;
        }

        public Builder lists(Optional<? extends PostTagResponseLists> lists) {
            Utils.checkNotNull(lists, "lists");
            this.lists = lists;
            return this;
        }

        public Builder segments(PostTagResponseSegments segments) {
            Utils.checkNotNull(segments, "segments");
            this.segments = Optional.ofNullable(segments);
            return this;
        }

        public Builder segments(Optional<? extends PostTagResponseSegments> segments) {
            Utils.checkNotNull(segments, "segments");
            this.segments = segments;
            return this;
        }

        public Builder campaigns(PostTagResponseCampaigns campaigns) {
            Utils.checkNotNull(campaigns, "campaigns");
            this.campaigns = Optional.ofNullable(campaigns);
            return this;
        }

        public Builder campaigns(Optional<? extends PostTagResponseCampaigns> campaigns) {
            Utils.checkNotNull(campaigns, "campaigns");
            this.campaigns = campaigns;
            return this;
        }

        public Builder flows(PostTagResponseFlows flows) {
            Utils.checkNotNull(flows, "flows");
            this.flows = Optional.ofNullable(flows);
            return this;
        }

        public Builder flows(Optional<? extends PostTagResponseFlows> flows) {
            Utils.checkNotNull(flows, "flows");
            this.flows = flows;
            return this;
        }
        
        public PostTagResponseRelationships build() {
            return new PostTagResponseRelationships(
                tagGroup,
                lists,
                segments,
                campaigns,
                flows);
        }
    }
}
