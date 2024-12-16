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
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;


@JsonDeserialize(using = Conditions._Deserializer.class)
public class Conditions {

    @JsonValue
    private TypedObject value;
    
    private Conditions(TypedObject value) {
        this.value = value;
    }

    public static Conditions of(ProfileHasGroupMembershipCondition value) {
        Utils.checkNotNull(value, "value");
        return new Conditions(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ProfileHasGroupMembershipCondition>(){}));
    }

    public static Conditions of(ProfileNoGroupMembershipCondition value) {
        Utils.checkNotNull(value, "value");
        return new Conditions(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ProfileNoGroupMembershipCondition>(){}));
    }

    public static Conditions of(ProfileMetricCondition value) {
        Utils.checkNotNull(value, "value");
        return new Conditions(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ProfileMetricCondition>(){}));
    }

    public static Conditions of(ProfileMarketingConsentCondition value) {
        Utils.checkNotNull(value, "value");
        return new Conditions(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ProfileMarketingConsentCondition>(){}));
    }

    public static Conditions of(ProfilePostalCodeDistanceCondition value) {
        Utils.checkNotNull(value, "value");
        return new Conditions(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ProfilePostalCodeDistanceCondition>(){}));
    }

    public static Conditions of(ProfilePropertyCondition value) {
        Utils.checkNotNull(value, "value");
        return new Conditions(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ProfilePropertyCondition>(){}));
    }

    public static Conditions of(ProfileRegionCondition value) {
        Utils.checkNotNull(value, "value");
        return new Conditions(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ProfileRegionCondition>(){}));
    }

    public static Conditions of(ProfilePredictiveAnalyticsNumericCondition value) {
        Utils.checkNotNull(value, "value");
        return new Conditions(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ProfilePredictiveAnalyticsNumericCondition>(){}));
    }

    public static Conditions of(ProfilePredictiveAnalyticsStringCondition value) {
        Utils.checkNotNull(value, "value");
        return new Conditions(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ProfilePredictiveAnalyticsStringCondition>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.ProfileHasGroupMembershipCondition}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.ProfileNoGroupMembershipCondition}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.ProfileMetricCondition}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.ProfileMarketingConsentCondition}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.ProfilePostalCodeDistanceCondition}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.ProfilePropertyCondition}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.ProfileRegionCondition}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.ProfilePredictiveAnalyticsNumericCondition}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.ProfilePredictiveAnalyticsStringCondition}</li>
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
        Conditions other = (Conditions) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<Conditions> {

        public _Deserializer() {
            super(Conditions.class, false, // non-strict mode
                    TypeReferenceWithShape.of(new TypeReference<ProfileMetricCondition>() {}, JsonShape.DEFAULT),
                    TypeReferenceWithShape.of(new TypeReference<ProfilePostalCodeDistanceCondition>() {}, JsonShape.DEFAULT),
                    TypeReferenceWithShape.of(new TypeReference<ProfileHasGroupMembershipCondition>() {}, JsonShape.DEFAULT),
                    TypeReferenceWithShape.of(new TypeReference<ProfilePredictiveAnalyticsStringCondition>() {}, JsonShape.DEFAULT),
                    TypeReferenceWithShape.of(new TypeReference<ProfilePredictiveAnalyticsNumericCondition>() {}, JsonShape.DEFAULT),
                    TypeReferenceWithShape.of(new TypeReference<ProfileRegionCondition>() {}, JsonShape.DEFAULT),
                    TypeReferenceWithShape.of(new TypeReference<ProfilePropertyCondition>() {}, JsonShape.DEFAULT),
                    TypeReferenceWithShape.of(new TypeReference<ProfileNoGroupMembershipCondition>() {}, JsonShape.DEFAULT),
                    TypeReferenceWithShape.of(new TypeReference<ProfileMarketingConsentCondition>() {}, JsonShape.DEFAULT));
        }

        @Override
        public Conditions deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            try {
                return super.deserialize(p, ctxt); // Try the standard logic
            } catch (JsonMappingException e) {
                // Log a warning for unmatched types and ignore them
                System.err.println("WARNING: Unmatched type encountered during deserialization. Skipping: " + e.getMessage());
                return null; // Return null for unmatched types
            }
        }
    }

    
    @Override
    public String toString() {
        return Utils.toString(Conditions.class,
                "value", value);
    }
 
}
