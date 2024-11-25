/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;


import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class ErrorSource {

    /**
     * A pointer to the source of the error in the request payload.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pointer")
    private Optional<String> pointer;

    @JsonCreator
    public ErrorSource(
            @JsonProperty("pointer") Optional<String> pointer) {
        Utils.checkNotNull(pointer, "pointer");
        this.pointer = pointer;
    }
    
    public ErrorSource() {
        this(Optional.empty());
    }

    /**
     * A pointer to the source of the error in the request payload.
     */
    @JsonIgnore
    public Optional<String> pointer() {
        return pointer;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A pointer to the source of the error in the request payload.
     */
    public ErrorSource withPointer(String pointer) {
        Utils.checkNotNull(pointer, "pointer");
        this.pointer = Optional.ofNullable(pointer);
        return this;
    }

    /**
     * A pointer to the source of the error in the request payload.
     */
    public ErrorSource withPointer(Optional<String> pointer) {
        Utils.checkNotNull(pointer, "pointer");
        this.pointer = pointer;
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
        ErrorSource other = (ErrorSource) o;
        return 
            Objects.deepEquals(this.pointer, other.pointer);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            pointer);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ErrorSource.class,
                "pointer", pointer);
    }
    
    public final static class Builder {
 
        private Optional<String> pointer;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A pointer to the source of the error in the request payload.
         */
        public Builder pointer(String pointer) {
            Utils.checkNotNull(pointer, "pointer");
            this.pointer = Optional.ofNullable(pointer);
            return this;
        }

        /**
         * A pointer to the source of the error in the request payload.
         */
        public Builder pointer(Optional<String> pointer) {
            Utils.checkNotNull(pointer, "pointer");
            this.pointer = pointer;
            return this;
        }
        
        public ErrorSource build() {
            if (pointer == null) {
                pointer = _SINGLETON_VALUE_Pointer.value();
            }            return new ErrorSource(
                pointer);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_Pointer =
                new LazySingletonValue<>(
                        "pointer",
                        "\"/data\"",
                        new TypeReference<Optional<String>>() {});
    }
}
