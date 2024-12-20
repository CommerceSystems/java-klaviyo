/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.EventsBulkCreateJob;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.SpeakeasyMetadata;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class BulkCreateEventsRequest {

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @SpeakeasyMetadata("request:mediaType=application/vnd.api+json")
    private EventsBulkCreateJob eventsBulkCreateJob;

    @JsonCreator
    public BulkCreateEventsRequest(
            String revision,
            EventsBulkCreateJob eventsBulkCreateJob) {
        Utils.checkNotNull(revision, "revision");
        Utils.checkNotNull(eventsBulkCreateJob, "eventsBulkCreateJob");
        this.revision = revision;
        this.eventsBulkCreateJob = eventsBulkCreateJob;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @JsonIgnore
    public String revision() {
        return revision;
    }

    @JsonIgnore
    public EventsBulkCreateJob eventsBulkCreateJob() {
        return eventsBulkCreateJob;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public BulkCreateEventsRequest withRevision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public BulkCreateEventsRequest withEventsBulkCreateJob(EventsBulkCreateJob eventsBulkCreateJob) {
        Utils.checkNotNull(eventsBulkCreateJob, "eventsBulkCreateJob");
        this.eventsBulkCreateJob = eventsBulkCreateJob;
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
        BulkCreateEventsRequest other = (BulkCreateEventsRequest) o;
        return 
            Objects.deepEquals(this.revision, other.revision) &&
            Objects.deepEquals(this.eventsBulkCreateJob, other.eventsBulkCreateJob);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            revision,
            eventsBulkCreateJob);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BulkCreateEventsRequest.class,
                "revision", revision,
                "eventsBulkCreateJob", eventsBulkCreateJob);
    }
    
    public final static class Builder {
 
        private String revision;
 
        private EventsBulkCreateJob eventsBulkCreateJob;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API endpoint revision (format: YYYY-MM-DD[.suffix])
         */
        public Builder revision(String revision) {
            Utils.checkNotNull(revision, "revision");
            this.revision = revision;
            return this;
        }

        public Builder eventsBulkCreateJob(EventsBulkCreateJob eventsBulkCreateJob) {
            Utils.checkNotNull(eventsBulkCreateJob, "eventsBulkCreateJob");
            this.eventsBulkCreateJob = eventsBulkCreateJob;
            return this;
        }
        
        public BulkCreateEventsRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new BulkCreateEventsRequest(
                revision,
                eventsBulkCreateJob);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}

