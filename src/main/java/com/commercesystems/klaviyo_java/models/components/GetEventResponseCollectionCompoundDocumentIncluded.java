/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;


import com.commercesystems.klaviyo_java.utils.OneOfDeserializer;
import com.commercesystems.klaviyo_java.utils.TypedObject;
import com.commercesystems.klaviyo_java.utils.Utils.JsonShape;
import com.commercesystems.klaviyo_java.utils.Utils.TypeReferenceWithShape;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;


@JsonDeserialize(using = GetEventResponseCollectionCompoundDocumentIncluded._Deserializer.class)
public class GetEventResponseCollectionCompoundDocumentIncluded {

    @JsonValue
    private TypedObject value;
    
    private GetEventResponseCollectionCompoundDocumentIncluded(TypedObject value) {
        this.value = value;
    }

    public static GetEventResponseCollectionCompoundDocumentIncluded of(AttributionResponseObjectResource value) {
        Utils.checkNotNull(value, "value");
        return new GetEventResponseCollectionCompoundDocumentIncluded(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<AttributionResponseObjectResource>(){}));
    }

    public static GetEventResponseCollectionCompoundDocumentIncluded of(MetricResponseObjectResource value) {
        Utils.checkNotNull(value, "value");
        return new GetEventResponseCollectionCompoundDocumentIncluded(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<MetricResponseObjectResource>(){}));
    }

    public static GetEventResponseCollectionCompoundDocumentIncluded of(ProfileResponseObjectResource value) {
        Utils.checkNotNull(value, "value");
        return new GetEventResponseCollectionCompoundDocumentIncluded(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ProfileResponseObjectResource>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.AttributionResponseObjectResource}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.MetricResponseObjectResource}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.ProfileResponseObjectResource}</li>
     * </ul>
     * 
     * <p>Use {@code instanceof} to determine what type is returned. For example:
     * 
     * <pre>
     * if (obj.value() instanceof String) {
     *     String answer = (String) obj.value();
     *     System.out.println("answer=" + answer);
     * }
     * </pre>
     * 
     * @return value of oneOf type
     **/ 
    public java.lang.Object value() {
        return value.value();
    }    
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetEventResponseCollectionCompoundDocumentIncluded other = (GetEventResponseCollectionCompoundDocumentIncluded) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<GetEventResponseCollectionCompoundDocumentIncluded> {

        public _Deserializer() {
            super(GetEventResponseCollectionCompoundDocumentIncluded.class, false,
                  TypeReferenceWithShape.of(new TypeReference<ProfileResponseObjectResource>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<MetricResponseObjectResource>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<AttributionResponseObjectResource>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetEventResponseCollectionCompoundDocumentIncluded.class,
                "value", value);
    }
 
}