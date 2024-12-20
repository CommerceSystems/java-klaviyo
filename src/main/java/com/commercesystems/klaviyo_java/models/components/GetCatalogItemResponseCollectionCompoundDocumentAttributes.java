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
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class GetCatalogItemResponseCollectionCompoundDocumentAttributes {

    /**
     * The ID of the catalog item in an external system.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("external_id")
    private JsonNullable<String> externalId;

    /**
     * The title of the catalog item.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private JsonNullable<String> title;

    /**
     * A description of the catalog item.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<String> description;

    /**
     * This field can be used to set the price on the catalog item, which is what gets displayed for the item when included in emails. For most price-update use cases, you will also want to update the `price` on any child variants, using the [Update Catalog Variant Endpoint](https://developers.klaviyo.com/en/reference/update_catalog_variant).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("price")
    private JsonNullable<Double> price;

    /**
     * URL pointing to the location of the catalog item on your website.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url")
    private JsonNullable<String> url;

    /**
     * URL pointing to the location of a full image of the catalog item.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("image_full_url")
    private JsonNullable<String> imageFullUrl;

    /**
     * URL pointing to the location of an image thumbnail of the catalog item
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("image_thumbnail_url")
    private JsonNullable<String> imageThumbnailUrl;

    /**
     * List of URLs pointing to the locations of images of the catalog item.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("images")
    private JsonNullable<? extends List<String>> images;

    /**
     * Flat JSON blob to provide custom metadata about the catalog item. May not exceed 100kb.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_metadata")
    private JsonNullable<? extends GetCatalogItemResponseCollectionCompoundDocumentCustomMetadata> customMetadata;

    /**
     * Boolean value indicating whether the catalog item is published.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("published")
    private JsonNullable<Boolean> published;

    /**
     * Date and time when the catalog item was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created")
    private JsonNullable<OffsetDateTime> created;

    /**
     * Date and time when the catalog item was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated")
    private JsonNullable<OffsetDateTime> updated;

    @JsonCreator
    public GetCatalogItemResponseCollectionCompoundDocumentAttributes(
            @JsonProperty("external_id") JsonNullable<String> externalId,
            @JsonProperty("title") JsonNullable<String> title,
            @JsonProperty("description") JsonNullable<String> description,
            @JsonProperty("price") JsonNullable<Double> price,
            @JsonProperty("url") JsonNullable<String> url,
            @JsonProperty("image_full_url") JsonNullable<String> imageFullUrl,
            @JsonProperty("image_thumbnail_url") JsonNullable<String> imageThumbnailUrl,
            @JsonProperty("images") JsonNullable<? extends List<String>> images,
            @JsonProperty("custom_metadata") JsonNullable<? extends GetCatalogItemResponseCollectionCompoundDocumentCustomMetadata> customMetadata,
            @JsonProperty("published") JsonNullable<Boolean> published,
            @JsonProperty("created") JsonNullable<OffsetDateTime> created,
            @JsonProperty("updated") JsonNullable<OffsetDateTime> updated) {
        Utils.checkNotNull(externalId, "externalId");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(price, "price");
        Utils.checkNotNull(url, "url");
        Utils.checkNotNull(imageFullUrl, "imageFullUrl");
        Utils.checkNotNull(imageThumbnailUrl, "imageThumbnailUrl");
        Utils.checkNotNull(images, "images");
        Utils.checkNotNull(customMetadata, "customMetadata");
        Utils.checkNotNull(published, "published");
        Utils.checkNotNull(created, "created");
        Utils.checkNotNull(updated, "updated");
        this.externalId = externalId;
        this.title = title;
        this.description = description;
        this.price = price;
        this.url = url;
        this.imageFullUrl = imageFullUrl;
        this.imageThumbnailUrl = imageThumbnailUrl;
        this.images = images;
        this.customMetadata = customMetadata;
        this.published = published;
        this.created = created;
        this.updated = updated;
    }
    
    public GetCatalogItemResponseCollectionCompoundDocumentAttributes() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The ID of the catalog item in an external system.
     */
    @JsonIgnore
    public JsonNullable<String> externalId() {
        return externalId;
    }

    /**
     * The title of the catalog item.
     */
    @JsonIgnore
    public JsonNullable<String> title() {
        return title;
    }

    /**
     * A description of the catalog item.
     */
    @JsonIgnore
    public JsonNullable<String> description() {
        return description;
    }

    /**
     * This field can be used to set the price on the catalog item, which is what gets displayed for the item when included in emails. For most price-update use cases, you will also want to update the `price` on any child variants, using the [Update Catalog Variant Endpoint](https://developers.klaviyo.com/en/reference/update_catalog_variant).
     */
    @JsonIgnore
    public JsonNullable<Double> price() {
        return price;
    }

    /**
     * URL pointing to the location of the catalog item on your website.
     */
    @JsonIgnore
    public JsonNullable<String> url() {
        return url;
    }

    /**
     * URL pointing to the location of a full image of the catalog item.
     */
    @JsonIgnore
    public JsonNullable<String> imageFullUrl() {
        return imageFullUrl;
    }

    /**
     * URL pointing to the location of an image thumbnail of the catalog item
     */
    @JsonIgnore
    public JsonNullable<String> imageThumbnailUrl() {
        return imageThumbnailUrl;
    }

    /**
     * List of URLs pointing to the locations of images of the catalog item.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<String>> images() {
        return (JsonNullable<List<String>>) images;
    }

    /**
     * Flat JSON blob to provide custom metadata about the catalog item. May not exceed 100kb.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<GetCatalogItemResponseCollectionCompoundDocumentCustomMetadata> customMetadata() {
        return (JsonNullable<GetCatalogItemResponseCollectionCompoundDocumentCustomMetadata>) customMetadata;
    }

    /**
     * Boolean value indicating whether the catalog item is published.
     */
    @JsonIgnore
    public JsonNullable<Boolean> published() {
        return published;
    }

    /**
     * Date and time when the catalog item was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> created() {
        return created;
    }

    /**
     * Date and time when the catalog item was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> updated() {
        return updated;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the catalog item in an external system.
     */
    public GetCatalogItemResponseCollectionCompoundDocumentAttributes withExternalId(String externalId) {
        Utils.checkNotNull(externalId, "externalId");
        this.externalId = JsonNullable.of(externalId);
        return this;
    }

    /**
     * The ID of the catalog item in an external system.
     */
    public GetCatalogItemResponseCollectionCompoundDocumentAttributes withExternalId(JsonNullable<String> externalId) {
        Utils.checkNotNull(externalId, "externalId");
        this.externalId = externalId;
        return this;
    }

    /**
     * The title of the catalog item.
     */
    public GetCatalogItemResponseCollectionCompoundDocumentAttributes withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = JsonNullable.of(title);
        return this;
    }

    /**
     * The title of the catalog item.
     */
    public GetCatalogItemResponseCollectionCompoundDocumentAttributes withTitle(JsonNullable<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    /**
     * A description of the catalog item.
     */
    public GetCatalogItemResponseCollectionCompoundDocumentAttributes withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * A description of the catalog item.
     */
    public GetCatalogItemResponseCollectionCompoundDocumentAttributes withDescription(JsonNullable<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * This field can be used to set the price on the catalog item, which is what gets displayed for the item when included in emails. For most price-update use cases, you will also want to update the `price` on any child variants, using the [Update Catalog Variant Endpoint](https://developers.klaviyo.com/en/reference/update_catalog_variant).
     */
    public GetCatalogItemResponseCollectionCompoundDocumentAttributes withPrice(double price) {
        Utils.checkNotNull(price, "price");
        this.price = JsonNullable.of(price);
        return this;
    }

    /**
     * This field can be used to set the price on the catalog item, which is what gets displayed for the item when included in emails. For most price-update use cases, you will also want to update the `price` on any child variants, using the [Update Catalog Variant Endpoint](https://developers.klaviyo.com/en/reference/update_catalog_variant).
     */
    public GetCatalogItemResponseCollectionCompoundDocumentAttributes withPrice(JsonNullable<Double> price) {
        Utils.checkNotNull(price, "price");
        this.price = price;
        return this;
    }

    /**
     * URL pointing to the location of the catalog item on your website.
     */
    public GetCatalogItemResponseCollectionCompoundDocumentAttributes withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = JsonNullable.of(url);
        return this;
    }

    /**
     * URL pointing to the location of the catalog item on your website.
     */
    public GetCatalogItemResponseCollectionCompoundDocumentAttributes withUrl(JsonNullable<String> url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
        return this;
    }

    /**
     * URL pointing to the location of a full image of the catalog item.
     */
    public GetCatalogItemResponseCollectionCompoundDocumentAttributes withImageFullUrl(String imageFullUrl) {
        Utils.checkNotNull(imageFullUrl, "imageFullUrl");
        this.imageFullUrl = JsonNullable.of(imageFullUrl);
        return this;
    }

    /**
     * URL pointing to the location of a full image of the catalog item.
     */
    public GetCatalogItemResponseCollectionCompoundDocumentAttributes withImageFullUrl(JsonNullable<String> imageFullUrl) {
        Utils.checkNotNull(imageFullUrl, "imageFullUrl");
        this.imageFullUrl = imageFullUrl;
        return this;
    }

    /**
     * URL pointing to the location of an image thumbnail of the catalog item
     */
    public GetCatalogItemResponseCollectionCompoundDocumentAttributes withImageThumbnailUrl(String imageThumbnailUrl) {
        Utils.checkNotNull(imageThumbnailUrl, "imageThumbnailUrl");
        this.imageThumbnailUrl = JsonNullable.of(imageThumbnailUrl);
        return this;
    }

    /**
     * URL pointing to the location of an image thumbnail of the catalog item
     */
    public GetCatalogItemResponseCollectionCompoundDocumentAttributes withImageThumbnailUrl(JsonNullable<String> imageThumbnailUrl) {
        Utils.checkNotNull(imageThumbnailUrl, "imageThumbnailUrl");
        this.imageThumbnailUrl = imageThumbnailUrl;
        return this;
    }

    /**
     * List of URLs pointing to the locations of images of the catalog item.
     */
    public GetCatalogItemResponseCollectionCompoundDocumentAttributes withImages(List<String> images) {
        Utils.checkNotNull(images, "images");
        this.images = JsonNullable.of(images);
        return this;
    }

    /**
     * List of URLs pointing to the locations of images of the catalog item.
     */
    public GetCatalogItemResponseCollectionCompoundDocumentAttributes withImages(JsonNullable<? extends List<String>> images) {
        Utils.checkNotNull(images, "images");
        this.images = images;
        return this;
    }

    /**
     * Flat JSON blob to provide custom metadata about the catalog item. May not exceed 100kb.
     */
    public GetCatalogItemResponseCollectionCompoundDocumentAttributes withCustomMetadata(GetCatalogItemResponseCollectionCompoundDocumentCustomMetadata customMetadata) {
        Utils.checkNotNull(customMetadata, "customMetadata");
        this.customMetadata = JsonNullable.of(customMetadata);
        return this;
    }

    /**
     * Flat JSON blob to provide custom metadata about the catalog item. May not exceed 100kb.
     */
    public GetCatalogItemResponseCollectionCompoundDocumentAttributes withCustomMetadata(JsonNullable<? extends GetCatalogItemResponseCollectionCompoundDocumentCustomMetadata> customMetadata) {
        Utils.checkNotNull(customMetadata, "customMetadata");
        this.customMetadata = customMetadata;
        return this;
    }

    /**
     * Boolean value indicating whether the catalog item is published.
     */
    public GetCatalogItemResponseCollectionCompoundDocumentAttributes withPublished(boolean published) {
        Utils.checkNotNull(published, "published");
        this.published = JsonNullable.of(published);
        return this;
    }

    /**
     * Boolean value indicating whether the catalog item is published.
     */
    public GetCatalogItemResponseCollectionCompoundDocumentAttributes withPublished(JsonNullable<Boolean> published) {
        Utils.checkNotNull(published, "published");
        this.published = published;
        return this;
    }

    /**
     * Date and time when the catalog item was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    public GetCatalogItemResponseCollectionCompoundDocumentAttributes withCreated(OffsetDateTime created) {
        Utils.checkNotNull(created, "created");
        this.created = JsonNullable.of(created);
        return this;
    }

    /**
     * Date and time when the catalog item was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    public GetCatalogItemResponseCollectionCompoundDocumentAttributes withCreated(JsonNullable<OffsetDateTime> created) {
        Utils.checkNotNull(created, "created");
        this.created = created;
        return this;
    }

    /**
     * Date and time when the catalog item was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    public GetCatalogItemResponseCollectionCompoundDocumentAttributes withUpdated(OffsetDateTime updated) {
        Utils.checkNotNull(updated, "updated");
        this.updated = JsonNullable.of(updated);
        return this;
    }

    /**
     * Date and time when the catalog item was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    public GetCatalogItemResponseCollectionCompoundDocumentAttributes withUpdated(JsonNullable<OffsetDateTime> updated) {
        Utils.checkNotNull(updated, "updated");
        this.updated = updated;
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
        GetCatalogItemResponseCollectionCompoundDocumentAttributes other = (GetCatalogItemResponseCollectionCompoundDocumentAttributes) o;
        return 
            Objects.deepEquals(this.externalId, other.externalId) &&
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.price, other.price) &&
            Objects.deepEquals(this.url, other.url) &&
            Objects.deepEquals(this.imageFullUrl, other.imageFullUrl) &&
            Objects.deepEquals(this.imageThumbnailUrl, other.imageThumbnailUrl) &&
            Objects.deepEquals(this.images, other.images) &&
            Objects.deepEquals(this.customMetadata, other.customMetadata) &&
            Objects.deepEquals(this.published, other.published) &&
            Objects.deepEquals(this.created, other.created) &&
            Objects.deepEquals(this.updated, other.updated);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            externalId,
            title,
            description,
            price,
            url,
            imageFullUrl,
            imageThumbnailUrl,
            images,
            customMetadata,
            published,
            created,
            updated);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCatalogItemResponseCollectionCompoundDocumentAttributes.class,
                "externalId", externalId,
                "title", title,
                "description", description,
                "price", price,
                "url", url,
                "imageFullUrl", imageFullUrl,
                "imageThumbnailUrl", imageThumbnailUrl,
                "images", images,
                "customMetadata", customMetadata,
                "published", published,
                "created", created,
                "updated", updated);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> externalId = JsonNullable.undefined();
 
        private JsonNullable<String> title = JsonNullable.undefined();
 
        private JsonNullable<String> description = JsonNullable.undefined();
 
        private JsonNullable<Double> price = JsonNullable.undefined();
 
        private JsonNullable<String> url = JsonNullable.undefined();
 
        private JsonNullable<String> imageFullUrl = JsonNullable.undefined();
 
        private JsonNullable<String> imageThumbnailUrl = JsonNullable.undefined();
 
        private JsonNullable<? extends List<String>> images = JsonNullable.undefined();
 
        private JsonNullable<? extends GetCatalogItemResponseCollectionCompoundDocumentCustomMetadata> customMetadata = JsonNullable.undefined();
 
        private JsonNullable<Boolean> published = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> created = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> updated = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the catalog item in an external system.
         */
        public Builder externalId(String externalId) {
            Utils.checkNotNull(externalId, "externalId");
            this.externalId = JsonNullable.of(externalId);
            return this;
        }

        /**
         * The ID of the catalog item in an external system.
         */
        public Builder externalId(JsonNullable<String> externalId) {
            Utils.checkNotNull(externalId, "externalId");
            this.externalId = externalId;
            return this;
        }

        /**
         * The title of the catalog item.
         */
        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = JsonNullable.of(title);
            return this;
        }

        /**
         * The title of the catalog item.
         */
        public Builder title(JsonNullable<String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        /**
         * A description of the catalog item.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        /**
         * A description of the catalog item.
         */
        public Builder description(JsonNullable<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * This field can be used to set the price on the catalog item, which is what gets displayed for the item when included in emails. For most price-update use cases, you will also want to update the `price` on any child variants, using the [Update Catalog Variant Endpoint](https://developers.klaviyo.com/en/reference/update_catalog_variant).
         */
        public Builder price(double price) {
            Utils.checkNotNull(price, "price");
            this.price = JsonNullable.of(price);
            return this;
        }

        /**
         * This field can be used to set the price on the catalog item, which is what gets displayed for the item when included in emails. For most price-update use cases, you will also want to update the `price` on any child variants, using the [Update Catalog Variant Endpoint](https://developers.klaviyo.com/en/reference/update_catalog_variant).
         */
        public Builder price(JsonNullable<Double> price) {
            Utils.checkNotNull(price, "price");
            this.price = price;
            return this;
        }

        /**
         * URL pointing to the location of the catalog item on your website.
         */
        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = JsonNullable.of(url);
            return this;
        }

        /**
         * URL pointing to the location of the catalog item on your website.
         */
        public Builder url(JsonNullable<String> url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }

        /**
         * URL pointing to the location of a full image of the catalog item.
         */
        public Builder imageFullUrl(String imageFullUrl) {
            Utils.checkNotNull(imageFullUrl, "imageFullUrl");
            this.imageFullUrl = JsonNullable.of(imageFullUrl);
            return this;
        }

        /**
         * URL pointing to the location of a full image of the catalog item.
         */
        public Builder imageFullUrl(JsonNullable<String> imageFullUrl) {
            Utils.checkNotNull(imageFullUrl, "imageFullUrl");
            this.imageFullUrl = imageFullUrl;
            return this;
        }

        /**
         * URL pointing to the location of an image thumbnail of the catalog item
         */
        public Builder imageThumbnailUrl(String imageThumbnailUrl) {
            Utils.checkNotNull(imageThumbnailUrl, "imageThumbnailUrl");
            this.imageThumbnailUrl = JsonNullable.of(imageThumbnailUrl);
            return this;
        }

        /**
         * URL pointing to the location of an image thumbnail of the catalog item
         */
        public Builder imageThumbnailUrl(JsonNullable<String> imageThumbnailUrl) {
            Utils.checkNotNull(imageThumbnailUrl, "imageThumbnailUrl");
            this.imageThumbnailUrl = imageThumbnailUrl;
            return this;
        }

        /**
         * List of URLs pointing to the locations of images of the catalog item.
         */
        public Builder images(List<String> images) {
            Utils.checkNotNull(images, "images");
            this.images = JsonNullable.of(images);
            return this;
        }

        /**
         * List of URLs pointing to the locations of images of the catalog item.
         */
        public Builder images(JsonNullable<? extends List<String>> images) {
            Utils.checkNotNull(images, "images");
            this.images = images;
            return this;
        }

        /**
         * Flat JSON blob to provide custom metadata about the catalog item. May not exceed 100kb.
         */
        public Builder customMetadata(GetCatalogItemResponseCollectionCompoundDocumentCustomMetadata customMetadata) {
            Utils.checkNotNull(customMetadata, "customMetadata");
            this.customMetadata = JsonNullable.of(customMetadata);
            return this;
        }

        /**
         * Flat JSON blob to provide custom metadata about the catalog item. May not exceed 100kb.
         */
        public Builder customMetadata(JsonNullable<? extends GetCatalogItemResponseCollectionCompoundDocumentCustomMetadata> customMetadata) {
            Utils.checkNotNull(customMetadata, "customMetadata");
            this.customMetadata = customMetadata;
            return this;
        }

        /**
         * Boolean value indicating whether the catalog item is published.
         */
        public Builder published(boolean published) {
            Utils.checkNotNull(published, "published");
            this.published = JsonNullable.of(published);
            return this;
        }

        /**
         * Boolean value indicating whether the catalog item is published.
         */
        public Builder published(JsonNullable<Boolean> published) {
            Utils.checkNotNull(published, "published");
            this.published = published;
            return this;
        }

        /**
         * Date and time when the catalog item was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
         */
        public Builder created(OffsetDateTime created) {
            Utils.checkNotNull(created, "created");
            this.created = JsonNullable.of(created);
            return this;
        }

        /**
         * Date and time when the catalog item was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
         */
        public Builder created(JsonNullable<OffsetDateTime> created) {
            Utils.checkNotNull(created, "created");
            this.created = created;
            return this;
        }

        /**
         * Date and time when the catalog item was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
         */
        public Builder updated(OffsetDateTime updated) {
            Utils.checkNotNull(updated, "updated");
            this.updated = JsonNullable.of(updated);
            return this;
        }

        /**
         * Date and time when the catalog item was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
         */
        public Builder updated(JsonNullable<OffsetDateTime> updated) {
            Utils.checkNotNull(updated, "updated");
            this.updated = updated;
            return this;
        }
        
        public GetCatalogItemResponseCollectionCompoundDocumentAttributes build() {
            return new GetCatalogItemResponseCollectionCompoundDocumentAttributes(
                externalId,
                title,
                description,
                price,
                url,
                imageFullUrl,
                imageThumbnailUrl,
                images,
                customMetadata,
                published,
                created,
                updated);
        }
    }
}

