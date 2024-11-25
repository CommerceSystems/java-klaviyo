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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class GetSegmentRetrieveResponseCompoundDocumentAttributes {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("profile_count")
    private JsonNullable<Long> profileCount;

    @JsonCreator
    public GetSegmentRetrieveResponseCompoundDocumentAttributes(
            @JsonProperty("profile_count") JsonNullable<Long> profileCount) {
        Utils.checkNotNull(profileCount, "profileCount");
        this.profileCount = profileCount;
    }
    
    public GetSegmentRetrieveResponseCompoundDocumentAttributes() {
        this(JsonNullable.undefined());
    }

    @JsonIgnore
    public JsonNullable<Long> profileCount() {
        return profileCount;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetSegmentRetrieveResponseCompoundDocumentAttributes withProfileCount(long profileCount) {
        Utils.checkNotNull(profileCount, "profileCount");
        this.profileCount = JsonNullable.of(profileCount);
        return this;
    }

    public GetSegmentRetrieveResponseCompoundDocumentAttributes withProfileCount(JsonNullable<Long> profileCount) {
        Utils.checkNotNull(profileCount, "profileCount");
        this.profileCount = profileCount;
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
        GetSegmentRetrieveResponseCompoundDocumentAttributes other = (GetSegmentRetrieveResponseCompoundDocumentAttributes) o;
        return 
            Objects.deepEquals(this.profileCount, other.profileCount);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            profileCount);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetSegmentRetrieveResponseCompoundDocumentAttributes.class,
                "profileCount", profileCount);
    }
    
    public final static class Builder {
 
        private JsonNullable<Long> profileCount = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder profileCount(long profileCount) {
            Utils.checkNotNull(profileCount, "profileCount");
            this.profileCount = JsonNullable.of(profileCount);
            return this;
        }

        public Builder profileCount(JsonNullable<Long> profileCount) {
            Utils.checkNotNull(profileCount, "profileCount");
            this.profileCount = profileCount;
            return this;
        }
        
        public GetSegmentRetrieveResponseCompoundDocumentAttributes build() {
            return new GetSegmentRetrieveResponseCompoundDocumentAttributes(
                profileCount);
        }
    }
}

