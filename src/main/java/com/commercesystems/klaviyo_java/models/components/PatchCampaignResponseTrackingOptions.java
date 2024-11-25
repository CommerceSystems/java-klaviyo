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

/**
 * PatchCampaignResponseTrackingOptions - The tracking options associated with the campaign
 */

@JsonDeserialize(using = PatchCampaignResponseTrackingOptions._Deserializer.class)
public class PatchCampaignResponseTrackingOptions {

    @JsonValue
    private TypedObject value;
    
    private PatchCampaignResponseTrackingOptions(TypedObject value) {
        this.value = value;
    }

    public static PatchCampaignResponseTrackingOptions of(EmailTrackingOptionsSubObject value) {
        Utils.checkNotNull(value, "value");
        return new PatchCampaignResponseTrackingOptions(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<EmailTrackingOptionsSubObject>(){}));
    }

    public static PatchCampaignResponseTrackingOptions of(SMSTrackingOptionsSubObject value) {
        Utils.checkNotNull(value, "value");
        return new PatchCampaignResponseTrackingOptions(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SMSTrackingOptionsSubObject>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.EmailTrackingOptionsSubObject}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.SMSTrackingOptionsSubObject}</li>
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
        PatchCampaignResponseTrackingOptions other = (PatchCampaignResponseTrackingOptions) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<PatchCampaignResponseTrackingOptions> {

        public _Deserializer() {
            super(PatchCampaignResponseTrackingOptions.class, false,
                  TypeReferenceWithShape.of(new TypeReference<EmailTrackingOptionsSubObject>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SMSTrackingOptionsSubObject>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchCampaignResponseTrackingOptions.class,
                "value", value);
    }
 
}
