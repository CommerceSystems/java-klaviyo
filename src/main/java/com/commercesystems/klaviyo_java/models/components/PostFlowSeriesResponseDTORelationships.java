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


public class PostFlowSeriesResponseDTORelationships {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("flows")
    private Optional<? extends PostFlowSeriesResponseDTOFlows> flows;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("flow-messages")
    private Optional<? extends PostFlowSeriesResponseDTOFlowMessages> flowMessages;

    @JsonCreator
    public PostFlowSeriesResponseDTORelationships(
            @JsonProperty("flows") Optional<? extends PostFlowSeriesResponseDTOFlows> flows,
            @JsonProperty("flow-messages") Optional<? extends PostFlowSeriesResponseDTOFlowMessages> flowMessages) {
        Utils.checkNotNull(flows, "flows");
        Utils.checkNotNull(flowMessages, "flowMessages");
        this.flows = flows;
        this.flowMessages = flowMessages;
    }
    
    public PostFlowSeriesResponseDTORelationships() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostFlowSeriesResponseDTOFlows> flows() {
        return (Optional<PostFlowSeriesResponseDTOFlows>) flows;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostFlowSeriesResponseDTOFlowMessages> flowMessages() {
        return (Optional<PostFlowSeriesResponseDTOFlowMessages>) flowMessages;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PostFlowSeriesResponseDTORelationships withFlows(PostFlowSeriesResponseDTOFlows flows) {
        Utils.checkNotNull(flows, "flows");
        this.flows = Optional.ofNullable(flows);
        return this;
    }

    public PostFlowSeriesResponseDTORelationships withFlows(Optional<? extends PostFlowSeriesResponseDTOFlows> flows) {
        Utils.checkNotNull(flows, "flows");
        this.flows = flows;
        return this;
    }

    public PostFlowSeriesResponseDTORelationships withFlowMessages(PostFlowSeriesResponseDTOFlowMessages flowMessages) {
        Utils.checkNotNull(flowMessages, "flowMessages");
        this.flowMessages = Optional.ofNullable(flowMessages);
        return this;
    }

    public PostFlowSeriesResponseDTORelationships withFlowMessages(Optional<? extends PostFlowSeriesResponseDTOFlowMessages> flowMessages) {
        Utils.checkNotNull(flowMessages, "flowMessages");
        this.flowMessages = flowMessages;
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
        PostFlowSeriesResponseDTORelationships other = (PostFlowSeriesResponseDTORelationships) o;
        return 
            Objects.deepEquals(this.flows, other.flows) &&
            Objects.deepEquals(this.flowMessages, other.flowMessages);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            flows,
            flowMessages);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostFlowSeriesResponseDTORelationships.class,
                "flows", flows,
                "flowMessages", flowMessages);
    }
    
    public final static class Builder {
 
        private Optional<? extends PostFlowSeriesResponseDTOFlows> flows = Optional.empty();
 
        private Optional<? extends PostFlowSeriesResponseDTOFlowMessages> flowMessages = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder flows(PostFlowSeriesResponseDTOFlows flows) {
            Utils.checkNotNull(flows, "flows");
            this.flows = Optional.ofNullable(flows);
            return this;
        }

        public Builder flows(Optional<? extends PostFlowSeriesResponseDTOFlows> flows) {
            Utils.checkNotNull(flows, "flows");
            this.flows = flows;
            return this;
        }

        public Builder flowMessages(PostFlowSeriesResponseDTOFlowMessages flowMessages) {
            Utils.checkNotNull(flowMessages, "flowMessages");
            this.flowMessages = Optional.ofNullable(flowMessages);
            return this;
        }

        public Builder flowMessages(Optional<? extends PostFlowSeriesResponseDTOFlowMessages> flowMessages) {
            Utils.checkNotNull(flowMessages, "flowMessages");
            this.flowMessages = flowMessages;
            return this;
        }
        
        public PostFlowSeriesResponseDTORelationships build() {
            return new PostFlowSeriesResponseDTORelationships(
                flows,
                flowMessages);
        }
    }
}

