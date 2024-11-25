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
import java.time.OffsetDateTime;
import java.util.Objects;


public class CustomTimeframe {

    @JsonProperty("start")
    private OffsetDateTime start;

    @JsonProperty("end")
    private OffsetDateTime end;

    @JsonCreator
    public CustomTimeframe(
            @JsonProperty("start") OffsetDateTime start,
            @JsonProperty("end") OffsetDateTime end) {
        Utils.checkNotNull(start, "start");
        Utils.checkNotNull(end, "end");
        this.start = start;
        this.end = end;
    }

    @JsonIgnore
    public OffsetDateTime start() {
        return start;
    }

    @JsonIgnore
    public OffsetDateTime end() {
        return end;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CustomTimeframe withStart(OffsetDateTime start) {
        Utils.checkNotNull(start, "start");
        this.start = start;
        return this;
    }

    public CustomTimeframe withEnd(OffsetDateTime end) {
        Utils.checkNotNull(end, "end");
        this.end = end;
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
        CustomTimeframe other = (CustomTimeframe) o;
        return 
            Objects.deepEquals(this.start, other.start) &&
            Objects.deepEquals(this.end, other.end);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            start,
            end);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CustomTimeframe.class,
                "start", start,
                "end", end);
    }
    
    public final static class Builder {
 
        private OffsetDateTime start;
 
        private OffsetDateTime end;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder start(OffsetDateTime start) {
            Utils.checkNotNull(start, "start");
            this.start = start;
            return this;
        }

        public Builder end(OffsetDateTime end) {
            Utils.checkNotNull(end, "end");
            this.end = end;
            return this;
        }
        
        public CustomTimeframe build() {
            return new CustomTimeframe(
                start,
                end);
        }
    }
}
