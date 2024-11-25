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


@JsonDeserialize(using = GetFlowActionResponseCollectionTrackingOptions._Deserializer.class)
public class GetFlowActionResponseCollectionTrackingOptions {

    @JsonValue
    private TypedObject value;
    
    private GetFlowActionResponseCollectionTrackingOptions(TypedObject value) {
        this.value = value;
    }

    public static GetFlowActionResponseCollectionTrackingOptions of(GetFlowActionResponseCollectionTrackingOptionsEmailTrackingOptions value) {
        Utils.checkNotNull(value, "value");
        return new GetFlowActionResponseCollectionTrackingOptions(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<GetFlowActionResponseCollectionTrackingOptionsEmailTrackingOptions>(){}));
    }

    public static GetFlowActionResponseCollectionTrackingOptions of(GetFlowActionResponseCollectionTrackingOptionsSMSTrackingOptions value) {
        Utils.checkNotNull(value, "value");
        return new GetFlowActionResponseCollectionTrackingOptions(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<GetFlowActionResponseCollectionTrackingOptionsSMSTrackingOptions>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.GetFlowActionResponseCollectionTrackingOptionsEmailTrackingOptions}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.GetFlowActionResponseCollectionTrackingOptionsSMSTrackingOptions}</li>
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
        GetFlowActionResponseCollectionTrackingOptions other = (GetFlowActionResponseCollectionTrackingOptions) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<GetFlowActionResponseCollectionTrackingOptions> {

        public _Deserializer() {
            super(GetFlowActionResponseCollectionTrackingOptions.class, false,
                  TypeReferenceWithShape.of(new TypeReference<GetFlowActionResponseCollectionTrackingOptionsEmailTrackingOptions>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<GetFlowActionResponseCollectionTrackingOptionsSMSTrackingOptions>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetFlowActionResponseCollectionTrackingOptions.class,
                "value", value);
    }
 
}
