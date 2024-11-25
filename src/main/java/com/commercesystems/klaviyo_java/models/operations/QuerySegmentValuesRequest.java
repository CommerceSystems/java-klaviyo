/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.SegmentValuesRequestDTO;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.SpeakeasyMetadata;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class QuerySegmentValuesRequest {

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @SpeakeasyMetadata("request:mediaType=application/vnd.api+json")
    private SegmentValuesRequestDTO segmentValuesRequestDTO;

    @JsonCreator
    public QuerySegmentValuesRequest(
            String revision,
            SegmentValuesRequestDTO segmentValuesRequestDTO) {
        Utils.checkNotNull(revision, "revision");
        Utils.checkNotNull(segmentValuesRequestDTO, "segmentValuesRequestDTO");
        this.revision = revision;
        this.segmentValuesRequestDTO = segmentValuesRequestDTO;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @JsonIgnore
    public String revision() {
        return revision;
    }

    @JsonIgnore
    public SegmentValuesRequestDTO segmentValuesRequestDTO() {
        return segmentValuesRequestDTO;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public QuerySegmentValuesRequest withRevision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public QuerySegmentValuesRequest withSegmentValuesRequestDTO(SegmentValuesRequestDTO segmentValuesRequestDTO) {
        Utils.checkNotNull(segmentValuesRequestDTO, "segmentValuesRequestDTO");
        this.segmentValuesRequestDTO = segmentValuesRequestDTO;
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
        QuerySegmentValuesRequest other = (QuerySegmentValuesRequest) o;
        return 
            Objects.deepEquals(this.revision, other.revision) &&
            Objects.deepEquals(this.segmentValuesRequestDTO, other.segmentValuesRequestDTO);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            revision,
            segmentValuesRequestDTO);
    }
    
    @Override
    public String toString() {
        return Utils.toString(QuerySegmentValuesRequest.class,
                "revision", revision,
                "segmentValuesRequestDTO", segmentValuesRequestDTO);
    }
    
    public final static class Builder {
 
        private String revision;
 
        private SegmentValuesRequestDTO segmentValuesRequestDTO;  
        
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

        public Builder segmentValuesRequestDTO(SegmentValuesRequestDTO segmentValuesRequestDTO) {
            Utils.checkNotNull(segmentValuesRequestDTO, "segmentValuesRequestDTO");
            this.segmentValuesRequestDTO = segmentValuesRequestDTO;
            return this;
        }
        
        public QuerySegmentValuesRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new QuerySegmentValuesRequest(
                revision,
                segmentValuesRequestDTO);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}

