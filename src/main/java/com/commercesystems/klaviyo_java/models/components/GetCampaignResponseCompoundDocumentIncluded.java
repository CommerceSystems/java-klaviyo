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


@JsonDeserialize(using = GetCampaignResponseCompoundDocumentIncluded._Deserializer.class)
public class GetCampaignResponseCompoundDocumentIncluded {

    @JsonValue
    private TypedObject value;
    
    private GetCampaignResponseCompoundDocumentIncluded(TypedObject value) {
        this.value = value;
    }

    public static GetCampaignResponseCompoundDocumentIncluded of(CampaignMessageResponseObjectResource value) {
        Utils.checkNotNull(value, "value");
        return new GetCampaignResponseCompoundDocumentIncluded(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<CampaignMessageResponseObjectResource>(){}));
    }

    public static GetCampaignResponseCompoundDocumentIncluded of(TagResponseObjectResource value) {
        Utils.checkNotNull(value, "value");
        return new GetCampaignResponseCompoundDocumentIncluded(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<TagResponseObjectResource>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.CampaignMessageResponseObjectResource}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.TagResponseObjectResource}</li>
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
        GetCampaignResponseCompoundDocumentIncluded other = (GetCampaignResponseCompoundDocumentIncluded) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<GetCampaignResponseCompoundDocumentIncluded> {

        public _Deserializer() {
            super(GetCampaignResponseCompoundDocumentIncluded.class, false,
                  TypeReferenceWithShape.of(new TypeReference<TagResponseObjectResource>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<CampaignMessageResponseObjectResource>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCampaignResponseCompoundDocumentIncluded.class,
                "value", value);
    }
 
}
