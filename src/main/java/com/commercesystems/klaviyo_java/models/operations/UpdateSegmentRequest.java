/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.SegmentPartialUpdateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.SpeakeasyMetadata;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class UpdateSegmentRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @SpeakeasyMetadata("request:mediaType=application/vnd.api+json")
    private SegmentPartialUpdateQuery segmentPartialUpdateQuery;

    @JsonCreator
    public UpdateSegmentRequest(
            String id,
            String revision,
            SegmentPartialUpdateQuery segmentPartialUpdateQuery) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(revision, "revision");
        Utils.checkNotNull(segmentPartialUpdateQuery, "segmentPartialUpdateQuery");
        this.id = id;
        this.revision = revision;
        this.segmentPartialUpdateQuery = segmentPartialUpdateQuery;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @JsonIgnore
    public String revision() {
        return revision;
    }

    @JsonIgnore
    public SegmentPartialUpdateQuery segmentPartialUpdateQuery() {
        return segmentPartialUpdateQuery;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UpdateSegmentRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public UpdateSegmentRequest withRevision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public UpdateSegmentRequest withSegmentPartialUpdateQuery(SegmentPartialUpdateQuery segmentPartialUpdateQuery) {
        Utils.checkNotNull(segmentPartialUpdateQuery, "segmentPartialUpdateQuery");
        this.segmentPartialUpdateQuery = segmentPartialUpdateQuery;
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
        UpdateSegmentRequest other = (UpdateSegmentRequest) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.revision, other.revision) &&
            Objects.deepEquals(this.segmentPartialUpdateQuery, other.segmentPartialUpdateQuery);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            revision,
            segmentPartialUpdateQuery);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateSegmentRequest.class,
                "id", id,
                "revision", revision,
                "segmentPartialUpdateQuery", segmentPartialUpdateQuery);
    }
    
    public final static class Builder {
 
        private String id;
 
        private String revision;
 
        private SegmentPartialUpdateQuery segmentPartialUpdateQuery;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * API endpoint revision (format: YYYY-MM-DD[.suffix])
         */
        public Builder revision(String revision) {
            Utils.checkNotNull(revision, "revision");
            this.revision = revision;
            return this;
        }

        public Builder segmentPartialUpdateQuery(SegmentPartialUpdateQuery segmentPartialUpdateQuery) {
            Utils.checkNotNull(segmentPartialUpdateQuery, "segmentPartialUpdateQuery");
            this.segmentPartialUpdateQuery = segmentPartialUpdateQuery;
            return this;
        }
        
        public UpdateSegmentRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new UpdateSegmentRequest(
                id,
                revision,
                segmentPartialUpdateQuery);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}

