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


@JsonDeserialize(using = PostUniversalContentResponseDefinition._Deserializer.class)
public class PostUniversalContentResponseDefinition {

    @JsonValue
    private TypedObject value;
    
    private PostUniversalContentResponseDefinition(TypedObject value) {
        this.value = value;
    }

    public static PostUniversalContentResponseDefinition of(ButtonBlock value) {
        Utils.checkNotNull(value, "value");
        return new PostUniversalContentResponseDefinition(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ButtonBlock>(){}));
    }

    public static PostUniversalContentResponseDefinition of(DropShadowBlock value) {
        Utils.checkNotNull(value, "value");
        return new PostUniversalContentResponseDefinition(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DropShadowBlock>(){}));
    }

    public static PostUniversalContentResponseDefinition of(HeaderBlock value) {
        Utils.checkNotNull(value, "value");
        return new PostUniversalContentResponseDefinition(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<HeaderBlock>(){}));
    }

    public static PostUniversalContentResponseDefinition of(HorizontalRuleBlock value) {
        Utils.checkNotNull(value, "value");
        return new PostUniversalContentResponseDefinition(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<HorizontalRuleBlock>(){}));
    }

    public static PostUniversalContentResponseDefinition of(HTMLBlock value) {
        Utils.checkNotNull(value, "value");
        return new PostUniversalContentResponseDefinition(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<HTMLBlock>(){}));
    }

    public static PostUniversalContentResponseDefinition of(ImageBlock value) {
        Utils.checkNotNull(value, "value");
        return new PostUniversalContentResponseDefinition(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ImageBlock>(){}));
    }

    public static PostUniversalContentResponseDefinition of(ProductBlock value) {
        Utils.checkNotNull(value, "value");
        return new PostUniversalContentResponseDefinition(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ProductBlock>(){}));
    }

    public static PostUniversalContentResponseDefinition of(ReviewBlock value) {
        Utils.checkNotNull(value, "value");
        return new PostUniversalContentResponseDefinition(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ReviewBlock>(){}));
    }

    public static PostUniversalContentResponseDefinition of(SocialBlock value) {
        Utils.checkNotNull(value, "value");
        return new PostUniversalContentResponseDefinition(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SocialBlock>(){}));
    }

    public static PostUniversalContentResponseDefinition of(SpacerBlock value) {
        Utils.checkNotNull(value, "value");
        return new PostUniversalContentResponseDefinition(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SpacerBlock>(){}));
    }

    public static PostUniversalContentResponseDefinition of(SplitBlock value) {
        Utils.checkNotNull(value, "value");
        return new PostUniversalContentResponseDefinition(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SplitBlock>(){}));
    }

    public static PostUniversalContentResponseDefinition of(TableBlock value) {
        Utils.checkNotNull(value, "value");
        return new PostUniversalContentResponseDefinition(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<TableBlock>(){}));
    }

    public static PostUniversalContentResponseDefinition of(TextBlock value) {
        Utils.checkNotNull(value, "value");
        return new PostUniversalContentResponseDefinition(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<TextBlock>(){}));
    }

    public static PostUniversalContentResponseDefinition of(UnsupportedBlock value) {
        Utils.checkNotNull(value, "value");
        return new PostUniversalContentResponseDefinition(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<UnsupportedBlock>(){}));
    }

    public static PostUniversalContentResponseDefinition of(VideoBlock value) {
        Utils.checkNotNull(value, "value");
        return new PostUniversalContentResponseDefinition(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<VideoBlock>(){}));
    }

    public static PostUniversalContentResponseDefinition of(Section value) {
        Utils.checkNotNull(value, "value");
        return new PostUniversalContentResponseDefinition(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Section>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.ButtonBlock}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.DropShadowBlock}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.HeaderBlock}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.HorizontalRuleBlock}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.HTMLBlock}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.ImageBlock}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.ProductBlock}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.ReviewBlock}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.SocialBlock}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.SpacerBlock}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.SplitBlock}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.TableBlock}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.TextBlock}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.UnsupportedBlock}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.VideoBlock}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.Section}</li>
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
        PostUniversalContentResponseDefinition other = (PostUniversalContentResponseDefinition) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<PostUniversalContentResponseDefinition> {

        public _Deserializer() {
            super(PostUniversalContentResponseDefinition.class, false,
                  TypeReferenceWithShape.of(new TypeReference<Section>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<VideoBlock>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<UnsupportedBlock>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<TextBlock>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<TableBlock>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SplitBlock>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SpacerBlock>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SocialBlock>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ReviewBlock>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ProductBlock>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ImageBlock>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<HTMLBlock>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<HorizontalRuleBlock>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<HeaderBlock>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<DropShadowBlock>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ButtonBlock>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostUniversalContentResponseDefinition.class,
                "value", value);
    }
 
}
