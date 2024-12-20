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


public class PostListCreateResponseRelationships {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("profiles")
    private Optional<? extends PostListCreateResponseProfiles> profiles;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    private Optional<? extends PostListCreateResponseTags> tags;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("flow-triggers")
    private Optional<? extends PostListCreateResponseFlowTriggers> flowTriggers;

    @JsonCreator
    public PostListCreateResponseRelationships(
            @JsonProperty("profiles") Optional<? extends PostListCreateResponseProfiles> profiles,
            @JsonProperty("tags") Optional<? extends PostListCreateResponseTags> tags,
            @JsonProperty("flow-triggers") Optional<? extends PostListCreateResponseFlowTriggers> flowTriggers) {
        Utils.checkNotNull(profiles, "profiles");
        Utils.checkNotNull(tags, "tags");
        Utils.checkNotNull(flowTriggers, "flowTriggers");
        this.profiles = profiles;
        this.tags = tags;
        this.flowTriggers = flowTriggers;
    }
    
    public PostListCreateResponseRelationships() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostListCreateResponseProfiles> profiles() {
        return (Optional<PostListCreateResponseProfiles>) profiles;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostListCreateResponseTags> tags() {
        return (Optional<PostListCreateResponseTags>) tags;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostListCreateResponseFlowTriggers> flowTriggers() {
        return (Optional<PostListCreateResponseFlowTriggers>) flowTriggers;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PostListCreateResponseRelationships withProfiles(PostListCreateResponseProfiles profiles) {
        Utils.checkNotNull(profiles, "profiles");
        this.profiles = Optional.ofNullable(profiles);
        return this;
    }

    public PostListCreateResponseRelationships withProfiles(Optional<? extends PostListCreateResponseProfiles> profiles) {
        Utils.checkNotNull(profiles, "profiles");
        this.profiles = profiles;
        return this;
    }

    public PostListCreateResponseRelationships withTags(PostListCreateResponseTags tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = Optional.ofNullable(tags);
        return this;
    }

    public PostListCreateResponseRelationships withTags(Optional<? extends PostListCreateResponseTags> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = tags;
        return this;
    }

    public PostListCreateResponseRelationships withFlowTriggers(PostListCreateResponseFlowTriggers flowTriggers) {
        Utils.checkNotNull(flowTriggers, "flowTriggers");
        this.flowTriggers = Optional.ofNullable(flowTriggers);
        return this;
    }

    public PostListCreateResponseRelationships withFlowTriggers(Optional<? extends PostListCreateResponseFlowTriggers> flowTriggers) {
        Utils.checkNotNull(flowTriggers, "flowTriggers");
        this.flowTriggers = flowTriggers;
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
        PostListCreateResponseRelationships other = (PostListCreateResponseRelationships) o;
        return 
            Objects.deepEquals(this.profiles, other.profiles) &&
            Objects.deepEquals(this.tags, other.tags) &&
            Objects.deepEquals(this.flowTriggers, other.flowTriggers);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            profiles,
            tags,
            flowTriggers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostListCreateResponseRelationships.class,
                "profiles", profiles,
                "tags", tags,
                "flowTriggers", flowTriggers);
    }
    
    public final static class Builder {
 
        private Optional<? extends PostListCreateResponseProfiles> profiles = Optional.empty();
 
        private Optional<? extends PostListCreateResponseTags> tags = Optional.empty();
 
        private Optional<? extends PostListCreateResponseFlowTriggers> flowTriggers = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder profiles(PostListCreateResponseProfiles profiles) {
            Utils.checkNotNull(profiles, "profiles");
            this.profiles = Optional.ofNullable(profiles);
            return this;
        }

        public Builder profiles(Optional<? extends PostListCreateResponseProfiles> profiles) {
            Utils.checkNotNull(profiles, "profiles");
            this.profiles = profiles;
            return this;
        }

        public Builder tags(PostListCreateResponseTags tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = Optional.ofNullable(tags);
            return this;
        }

        public Builder tags(Optional<? extends PostListCreateResponseTags> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = tags;
            return this;
        }

        public Builder flowTriggers(PostListCreateResponseFlowTriggers flowTriggers) {
            Utils.checkNotNull(flowTriggers, "flowTriggers");
            this.flowTriggers = Optional.ofNullable(flowTriggers);
            return this;
        }

        public Builder flowTriggers(Optional<? extends PostListCreateResponseFlowTriggers> flowTriggers) {
            Utils.checkNotNull(flowTriggers, "flowTriggers");
            this.flowTriggers = flowTriggers;
            return this;
        }
        
        public PostListCreateResponseRelationships build() {
            return new PostListCreateResponseRelationships(
                profiles,
                tags,
                flowTriggers);
        }
    }
}

