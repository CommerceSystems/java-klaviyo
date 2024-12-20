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


public class UniversalContentCreateQueryResourceObjectAttributes {

    /**
     * The name for this universal content
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("definition")
    private UniversalContentCreateQueryResourceObjectDefinition definition;

    @JsonCreator
    public UniversalContentCreateQueryResourceObjectAttributes(
            @JsonProperty("name") String name,
            @JsonProperty("definition") UniversalContentCreateQueryResourceObjectDefinition definition) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(definition, "definition");
        this.name = name;
        this.definition = definition;
    }

    /**
     * The name for this universal content
     */
    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public UniversalContentCreateQueryResourceObjectDefinition definition() {
        return definition;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The name for this universal content
     */
    public UniversalContentCreateQueryResourceObjectAttributes withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public UniversalContentCreateQueryResourceObjectAttributes withDefinition(UniversalContentCreateQueryResourceObjectDefinition definition) {
        Utils.checkNotNull(definition, "definition");
        this.definition = definition;
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
        UniversalContentCreateQueryResourceObjectAttributes other = (UniversalContentCreateQueryResourceObjectAttributes) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.definition, other.definition);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            definition);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UniversalContentCreateQueryResourceObjectAttributes.class,
                "name", name,
                "definition", definition);
    }
    
    public final static class Builder {
 
        private String name;
 
        private UniversalContentCreateQueryResourceObjectDefinition definition;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The name for this universal content
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder definition(UniversalContentCreateQueryResourceObjectDefinition definition) {
            Utils.checkNotNull(definition, "definition");
            this.definition = definition;
            return this;
        }
        
        public UniversalContentCreateQueryResourceObjectAttributes build() {
            return new UniversalContentCreateQueryResourceObjectAttributes(
                name,
                definition);
        }
    }
}

