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


public class GetFlowResponseCollectionCompoundDocumentRelationships {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("flow-actions")
    private Optional<? extends FlowActions> flowActions;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    private Optional<? extends GetFlowResponseCollectionCompoundDocumentTags> tags;

    @JsonCreator
    public GetFlowResponseCollectionCompoundDocumentRelationships(
            @JsonProperty("flow-actions") Optional<? extends FlowActions> flowActions,
            @JsonProperty("tags") Optional<? extends GetFlowResponseCollectionCompoundDocumentTags> tags) {
        Utils.checkNotNull(flowActions, "flowActions");
        Utils.checkNotNull(tags, "tags");
        this.flowActions = flowActions;
        this.tags = tags;
    }
    
    public GetFlowResponseCollectionCompoundDocumentRelationships() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<FlowActions> flowActions() {
        return (Optional<FlowActions>) flowActions;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetFlowResponseCollectionCompoundDocumentTags> tags() {
        return (Optional<GetFlowResponseCollectionCompoundDocumentTags>) tags;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetFlowResponseCollectionCompoundDocumentRelationships withFlowActions(FlowActions flowActions) {
        Utils.checkNotNull(flowActions, "flowActions");
        this.flowActions = Optional.ofNullable(flowActions);
        return this;
    }

    public GetFlowResponseCollectionCompoundDocumentRelationships withFlowActions(Optional<? extends FlowActions> flowActions) {
        Utils.checkNotNull(flowActions, "flowActions");
        this.flowActions = flowActions;
        return this;
    }

    public GetFlowResponseCollectionCompoundDocumentRelationships withTags(GetFlowResponseCollectionCompoundDocumentTags tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = Optional.ofNullable(tags);
        return this;
    }

    public GetFlowResponseCollectionCompoundDocumentRelationships withTags(Optional<? extends GetFlowResponseCollectionCompoundDocumentTags> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = tags;
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
        GetFlowResponseCollectionCompoundDocumentRelationships other = (GetFlowResponseCollectionCompoundDocumentRelationships) o;
        return 
            Objects.deepEquals(this.flowActions, other.flowActions) &&
            Objects.deepEquals(this.tags, other.tags);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            flowActions,
            tags);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetFlowResponseCollectionCompoundDocumentRelationships.class,
                "flowActions", flowActions,
                "tags", tags);
    }
    
    public final static class Builder {
 
        private Optional<? extends FlowActions> flowActions = Optional.empty();
 
        private Optional<? extends GetFlowResponseCollectionCompoundDocumentTags> tags = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder flowActions(FlowActions flowActions) {
            Utils.checkNotNull(flowActions, "flowActions");
            this.flowActions = Optional.ofNullable(flowActions);
            return this;
        }

        public Builder flowActions(Optional<? extends FlowActions> flowActions) {
            Utils.checkNotNull(flowActions, "flowActions");
            this.flowActions = flowActions;
            return this;
        }

        public Builder tags(GetFlowResponseCollectionCompoundDocumentTags tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = Optional.ofNullable(tags);
            return this;
        }

        public Builder tags(Optional<? extends GetFlowResponseCollectionCompoundDocumentTags> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = tags;
            return this;
        }
        
        public GetFlowResponseCollectionCompoundDocumentRelationships build() {
            return new GetFlowResponseCollectionCompoundDocumentRelationships(
                flowActions,
                tags);
        }
    }
}
