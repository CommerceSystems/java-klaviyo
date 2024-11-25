/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.EventCreateQueryV2;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.SpeakeasyMetadata;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CreateClientEventRequest {

    /**
     * Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=company_id")
    private String companyId;

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @SpeakeasyMetadata("request:mediaType=application/vnd.api+json")
    private EventCreateQueryV2 eventCreateQueryV2;

    @JsonCreator
    public CreateClientEventRequest(
            String companyId,
            String revision,
            EventCreateQueryV2 eventCreateQueryV2) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(revision, "revision");
        Utils.checkNotNull(eventCreateQueryV2, "eventCreateQueryV2");
        this.companyId = companyId;
        this.revision = revision;
        this.eventCreateQueryV2 = eventCreateQueryV2;
    }

    /**
     * Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details.
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @JsonIgnore
    public String revision() {
        return revision;
    }

    @JsonIgnore
    public EventCreateQueryV2 eventCreateQueryV2() {
        return eventCreateQueryV2;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details.
     */
    public CreateClientEventRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public CreateClientEventRequest withRevision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public CreateClientEventRequest withEventCreateQueryV2(EventCreateQueryV2 eventCreateQueryV2) {
        Utils.checkNotNull(eventCreateQueryV2, "eventCreateQueryV2");
        this.eventCreateQueryV2 = eventCreateQueryV2;
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
        CreateClientEventRequest other = (CreateClientEventRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.revision, other.revision) &&
            Objects.deepEquals(this.eventCreateQueryV2, other.eventCreateQueryV2);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            revision,
            eventCreateQueryV2);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateClientEventRequest.class,
                "companyId", companyId,
                "revision", revision,
                "eventCreateQueryV2", eventCreateQueryV2);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String revision;
 
        private EventCreateQueryV2 eventCreateQueryV2;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details.
         */
        public Builder companyId(String companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
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

        public Builder eventCreateQueryV2(EventCreateQueryV2 eventCreateQueryV2) {
            Utils.checkNotNull(eventCreateQueryV2, "eventCreateQueryV2");
            this.eventCreateQueryV2 = eventCreateQueryV2;
            return this;
        }
        
        public CreateClientEventRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new CreateClientEventRequest(
                companyId,
                revision,
                eventCreateQueryV2);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}

