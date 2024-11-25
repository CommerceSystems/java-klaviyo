/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;


import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class GetCouponCodeResponseCollectionCompoundDocumentDataData {

    @JsonProperty("type")
    private CouponEnum type;

    @JsonProperty("id")
    private String id;

    @JsonCreator
    public GetCouponCodeResponseCollectionCompoundDocumentDataData(
            @JsonProperty("type") CouponEnum type,
            @JsonProperty("id") String id) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(id, "id");
        this.type = type;
        this.id = id;
    }

    @JsonIgnore
    public CouponEnum type() {
        return type;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetCouponCodeResponseCollectionCompoundDocumentDataData withType(CouponEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public GetCouponCodeResponseCollectionCompoundDocumentDataData withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
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
        GetCouponCodeResponseCollectionCompoundDocumentDataData other = (GetCouponCodeResponseCollectionCompoundDocumentDataData) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCouponCodeResponseCollectionCompoundDocumentDataData.class,
                "type", type,
                "id", id);
    }
    
    public final static class Builder {
 
        private CouponEnum type;
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(CouponEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public GetCouponCodeResponseCollectionCompoundDocumentDataData build() {
            return new GetCouponCodeResponseCollectionCompoundDocumentDataData(
                type,
                id);
        }
    }
}

