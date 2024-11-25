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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class SendOptionsEmailSendOptionsSubObject {

    /**
     * Use smart sending. Defaults to True
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("use_smart_sending")
    private JsonNullable<Boolean> useSmartSending;

    @JsonCreator
    public SendOptionsEmailSendOptionsSubObject(
            @JsonProperty("use_smart_sending") JsonNullable<Boolean> useSmartSending) {
        Utils.checkNotNull(useSmartSending, "useSmartSending");
        this.useSmartSending = useSmartSending;
    }
    
    public SendOptionsEmailSendOptionsSubObject() {
        this(JsonNullable.undefined());
    }

    /**
     * Use smart sending. Defaults to True
     */
    @JsonIgnore
    public JsonNullable<Boolean> useSmartSending() {
        return useSmartSending;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Use smart sending. Defaults to True
     */
    public SendOptionsEmailSendOptionsSubObject withUseSmartSending(boolean useSmartSending) {
        Utils.checkNotNull(useSmartSending, "useSmartSending");
        this.useSmartSending = JsonNullable.of(useSmartSending);
        return this;
    }

    /**
     * Use smart sending. Defaults to True
     */
    public SendOptionsEmailSendOptionsSubObject withUseSmartSending(JsonNullable<Boolean> useSmartSending) {
        Utils.checkNotNull(useSmartSending, "useSmartSending");
        this.useSmartSending = useSmartSending;
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
        SendOptionsEmailSendOptionsSubObject other = (SendOptionsEmailSendOptionsSubObject) o;
        return 
            Objects.deepEquals(this.useSmartSending, other.useSmartSending);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            useSmartSending);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SendOptionsEmailSendOptionsSubObject.class,
                "useSmartSending", useSmartSending);
    }
    
    public final static class Builder {
 
        private JsonNullable<Boolean> useSmartSending = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Use smart sending. Defaults to True
         */
        public Builder useSmartSending(boolean useSmartSending) {
            Utils.checkNotNull(useSmartSending, "useSmartSending");
            this.useSmartSending = JsonNullable.of(useSmartSending);
            return this;
        }

        /**
         * Use smart sending. Defaults to True
         */
        public Builder useSmartSending(JsonNullable<Boolean> useSmartSending) {
            Utils.checkNotNull(useSmartSending, "useSmartSending");
            this.useSmartSending = useSmartSending;
            return this;
        }
        
        public SendOptionsEmailSendOptionsSubObject build() {
            return new SendOptionsEmailSendOptionsSubObject(
                useSmartSending);
        }
    }
}

