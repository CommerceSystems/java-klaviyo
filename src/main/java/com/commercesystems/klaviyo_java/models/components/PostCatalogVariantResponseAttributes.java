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


public class PostCatalogVariantResponseAttributes {

    /**
     * The ID of the catalog item variant in an external system.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("external_id")
    private JsonNullable<String> externalId;

    /**
     * The title of the catalog item variant.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private JsonNullable<String> title;

    /**
     * A description of the catalog item variant.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<String> description;

    /**
     * The SKU of the catalog item variant.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sku")
    private JsonNullable<String> sku;

    /**
     * This field controls the visibility of this catalog item variant in product feeds/blocks. This field supports the following values:
     * `1`: a product will not appear in dynamic product recommendation feeds and blocks if it is out of stock.
     * `0` or `2`: a product can appear in dynamic product recommendation feeds and blocks regardless of inventory quantity.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("inventory_policy")
    private JsonNullable<? extends PostCatalogVariantResponseInventoryPolicy> inventoryPolicy;

    /**
     * The quantity of the catalog item variant currently in stock.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("inventory_quantity")
    private JsonNullable<Double> inventoryQuantity;

    /**
     * This field can be used to set the price on the catalog item variant, which is what gets displayed for the item variant when included in emails. For most price-update use cases, you will also want to update the `price` on any parent items using the [Update Catalog Item Endpoint](https://developers.klaviyo.com/en/reference/update_catalog_item).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("price")
    private JsonNullable<Double> price;

    /**
     * URL pointing to the location of the catalog item variant on your website.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url")
    private JsonNullable<String> url;

    /**
     * URL pointing to the location of a full image of the catalog item variant.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("image_full_url")
    private JsonNullable<String> imageFullUrl;

    /**
     * URL pointing to the location of an image thumbnail of the catalog item variant.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("image_thumbnail_url")
    private JsonNullable<String> imageThumbnailUrl;

    /**
     * List of URLs pointing to the locations of images of the catalog item variant.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("images")
    private JsonNullable<? extends List<String>> images;

    /**
     * Flat JSON blob to provide custom metadata about the catalog item variant. May not exceed 100kb.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_metadata")
    private JsonNullable<? extends PostCatalogVariantResponseCustomMetadata> customMetadata;

    /**
     * Boolean value indicating whether the catalog item variant is published.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("published")
    private JsonNullable<Boolean> published;

    /**
     * Date and time when the catalog item  variant was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created")
    private JsonNullable<OffsetDateTime> created;

    /**
     * Date and time when the catalog item variant was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated")
    private JsonNullable<OffsetDateTime> updated;

    @JsonCreator
    public PostCatalogVariantResponseAttributes(
            @JsonProperty("external_id") JsonNullable<String> externalId,
            @JsonProperty("title") JsonNullable<String> title,
            @JsonProperty("description") JsonNullable<String> description,
            @JsonProperty("sku") JsonNullable<String> sku,
            @JsonProperty("inventory_policy") JsonNullable<? extends PostCatalogVariantResponseInventoryPolicy> inventoryPolicy,
            @JsonProperty("inventory_quantity") JsonNullable<Double> inventoryQuantity,
            @JsonProperty("price") JsonNullable<Double> price,
            @JsonProperty("url") JsonNullable<String> url,
            @JsonProperty("image_full_url") JsonNullable<String> imageFullUrl,
            @JsonProperty("image_thumbnail_url") JsonNullable<String> imageThumbnailUrl,
            @JsonProperty("images") JsonNullable<? extends List<String>> images,
            @JsonProperty("custom_metadata") JsonNullable<? extends PostCatalogVariantResponseCustomMetadata> customMetadata,
            @JsonProperty("published") JsonNullable<Boolean> published,
            @JsonProperty("created") JsonNullable<OffsetDateTime> created,
            @JsonProperty("updated") JsonNullable<OffsetDateTime> updated) {
        Utils.checkNotNull(externalId, "externalId");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(sku, "sku");
        Utils.checkNotNull(inventoryPolicy, "inventoryPolicy");
        Utils.checkNotNull(inventoryQuantity, "inventoryQuantity");
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
        this.sku = sku;
        this.inventoryPolicy = inventoryPolicy;
        this.inventoryQuantity = inventoryQuantity;
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
    
    public PostCatalogVariantResponseAttributes() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The ID of the catalog item variant in an external system.
     */
    @JsonIgnore
    public JsonNullable<String> externalId() {
        return externalId;
    }

    /**
     * The title of the catalog item variant.
     */
    @JsonIgnore
    public JsonNullable<String> title() {
        return title;
    }

    /**
     * A description of the catalog item variant.
     */
    @JsonIgnore
    public JsonNullable<String> description() {
        return description;
    }

    /**
     * The SKU of the catalog item variant.
     */
    @JsonIgnore
    public JsonNullable<String> sku() {
        return sku;
    }

    /**
     * This field controls the visibility of this catalog item variant in product feeds/blocks. This field supports the following values:
     * `1`: a product will not appear in dynamic product recommendation feeds and blocks if it is out of stock.
     * `0` or `2`: a product can appear in dynamic product recommendation feeds and blocks regardless of inventory quantity.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<PostCatalogVariantResponseInventoryPolicy> inventoryPolicy() {
        return (JsonNullable<PostCatalogVariantResponseInventoryPolicy>) inventoryPolicy;
    }

    /**
     * The quantity of the catalog item variant currently in stock.
     */
    @JsonIgnore
    public JsonNullable<Double> inventoryQuantity() {
        return inventoryQuantity;
    }

    /**
     * This field can be used to set the price on the catalog item variant, which is what gets displayed for the item variant when included in emails. For most price-update use cases, you will also want to update the `price` on any parent items using the [Update Catalog Item Endpoint](https://developers.klaviyo.com/en/reference/update_catalog_item).
     */
    @JsonIgnore
    public JsonNullable<Double> price() {
        return price;
    }

    /**
     * URL pointing to the location of the catalog item variant on your website.
     */
    @JsonIgnore
    public JsonNullable<String> url() {
        return url;
    }

    /**
     * URL pointing to the location of a full image of the catalog item variant.
     */
    @JsonIgnore
    public JsonNullable<String> imageFullUrl() {
        return imageFullUrl;
    }

    /**
     * URL pointing to the location of an image thumbnail of the catalog item variant.
     */
    @JsonIgnore
    public JsonNullable<String> imageThumbnailUrl() {
        return imageThumbnailUrl;
    }

    /**
     * List of URLs pointing to the locations of images of the catalog item variant.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<String>> images() {
        return (JsonNullable<List<String>>) images;
    }

    /**
     * Flat JSON blob to provide custom metadata about the catalog item variant. May not exceed 100kb.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<PostCatalogVariantResponseCustomMetadata> customMetadata() {
        return (JsonNullable<PostCatalogVariantResponseCustomMetadata>) customMetadata;
    }

    /**
     * Boolean value indicating whether the catalog item variant is published.
     */
    @JsonIgnore
    public JsonNullable<Boolean> published() {
        return published;
    }

    /**
     * Date and time when the catalog item  variant was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> created() {
        return created;
    }

    /**
     * Date and time when the catalog item variant was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> updated() {
        return updated;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the catalog item variant in an external system.
     */
    public PostCatalogVariantResponseAttributes withExternalId(String externalId) {
        Utils.checkNotNull(externalId, "externalId");
        this.externalId = JsonNullable.of(externalId);
        return this;
    }

    /**
     * The ID of the catalog item variant in an external system.
     */
    public PostCatalogVariantResponseAttributes withExternalId(JsonNullable<String> externalId) {
        Utils.checkNotNull(externalId, "externalId");
        this.externalId = externalId;
        return this;
    }

    /**
     * The title of the catalog item variant.
     */
    public PostCatalogVariantResponseAttributes withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = JsonNullable.of(title);
        return this;
    }

    /**
     * The title of the catalog item variant.
     */
    public PostCatalogVariantResponseAttributes withTitle(JsonNullable<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    /**
     * A description of the catalog item variant.
     */
    public PostCatalogVariantResponseAttributes withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * A description of the catalog item variant.
     */
    public PostCatalogVariantResponseAttributes withDescription(JsonNullable<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * The SKU of the catalog item variant.
     */
    public PostCatalogVariantResponseAttributes withSku(String sku) {
        Utils.checkNotNull(sku, "sku");
        this.sku = JsonNullable.of(sku);
        return this;
    }

    /**
     * The SKU of the catalog item variant.
     */
    public PostCatalogVariantResponseAttributes withSku(JsonNullable<String> sku) {
        Utils.checkNotNull(sku, "sku");
        this.sku = sku;
        return this;
    }

    /**
     * This field controls the visibility of this catalog item variant in product feeds/blocks. This field supports the following values:
     * `1`: a product will not appear in dynamic product recommendation feeds and blocks if it is out of stock.
     * `0` or `2`: a product can appear in dynamic product recommendation feeds and blocks regardless of inventory quantity.
     */
    public PostCatalogVariantResponseAttributes withInventoryPolicy(PostCatalogVariantResponseInventoryPolicy inventoryPolicy) {
        Utils.checkNotNull(inventoryPolicy, "inventoryPolicy");
        this.inventoryPolicy = JsonNullable.of(inventoryPolicy);
        return this;
    }

    /**
     * This field controls the visibility of this catalog item variant in product feeds/blocks. This field supports the following values:
     * `1`: a product will not appear in dynamic product recommendation feeds and blocks if it is out of stock.
     * `0` or `2`: a product can appear in dynamic product recommendation feeds and blocks regardless of inventory quantity.
     */
    public PostCatalogVariantResponseAttributes withInventoryPolicy(JsonNullable<? extends PostCatalogVariantResponseInventoryPolicy> inventoryPolicy) {
        Utils.checkNotNull(inventoryPolicy, "inventoryPolicy");
        this.inventoryPolicy = inventoryPolicy;
        return this;
    }

    /**
     * The quantity of the catalog item variant currently in stock.
     */
    public PostCatalogVariantResponseAttributes withInventoryQuantity(double inventoryQuantity) {
        Utils.checkNotNull(inventoryQuantity, "inventoryQuantity");
        this.inventoryQuantity = JsonNullable.of(inventoryQuantity);
        return this;
    }

    /**
     * The quantity of the catalog item variant currently in stock.
     */
    public PostCatalogVariantResponseAttributes withInventoryQuantity(JsonNullable<Double> inventoryQuantity) {
        Utils.checkNotNull(inventoryQuantity, "inventoryQuantity");
        this.inventoryQuantity = inventoryQuantity;
        return this;
    }

    /**
     * This field can be used to set the price on the catalog item variant, which is what gets displayed for the item variant when included in emails. For most price-update use cases, you will also want to update the `price` on any parent items using the [Update Catalog Item Endpoint](https://developers.klaviyo.com/en/reference/update_catalog_item).
     */
    public PostCatalogVariantResponseAttributes withPrice(double price) {
        Utils.checkNotNull(price, "price");
        this.price = JsonNullable.of(price);
        return this;
    }

    /**
     * This field can be used to set the price on the catalog item variant, which is what gets displayed for the item variant when included in emails. For most price-update use cases, you will also want to update the `price` on any parent items using the [Update Catalog Item Endpoint](https://developers.klaviyo.com/en/reference/update_catalog_item).
     */
    public PostCatalogVariantResponseAttributes withPrice(JsonNullable<Double> price) {
        Utils.checkNotNull(price, "price");
        this.price = price;
        return this;
    }

    /**
     * URL pointing to the location of the catalog item variant on your website.
     */
    public PostCatalogVariantResponseAttributes withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = JsonNullable.of(url);
        return this;
    }

    /**
     * URL pointing to the location of the catalog item variant on your website.
     */
    public PostCatalogVariantResponseAttributes withUrl(JsonNullable<String> url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
        return this;
    }

    /**
     * URL pointing to the location of a full image of the catalog item variant.
     */
    public PostCatalogVariantResponseAttributes withImageFullUrl(String imageFullUrl) {
        Utils.checkNotNull(imageFullUrl, "imageFullUrl");
        this.imageFullUrl = JsonNullable.of(imageFullUrl);
        return this;
    }

    /**
     * URL pointing to the location of a full image of the catalog item variant.
     */
    public PostCatalogVariantResponseAttributes withImageFullUrl(JsonNullable<String> imageFullUrl) {
        Utils.checkNotNull(imageFullUrl, "imageFullUrl");
        this.imageFullUrl = imageFullUrl;
        return this;
    }

    /**
     * URL pointing to the location of an image thumbnail of the catalog item variant.
     */
    public PostCatalogVariantResponseAttributes withImageThumbnailUrl(String imageThumbnailUrl) {
        Utils.checkNotNull(imageThumbnailUrl, "imageThumbnailUrl");
        this.imageThumbnailUrl = JsonNullable.of(imageThumbnailUrl);
        return this;
    }

    /**
     * URL pointing to the location of an image thumbnail of the catalog item variant.
     */
    public PostCatalogVariantResponseAttributes withImageThumbnailUrl(JsonNullable<String> imageThumbnailUrl) {
        Utils.checkNotNull(imageThumbnailUrl, "imageThumbnailUrl");
        this.imageThumbnailUrl = imageThumbnailUrl;
        return this;
    }

    /**
     * List of URLs pointing to the locations of images of the catalog item variant.
     */
    public PostCatalogVariantResponseAttributes withImages(List<String> images) {
        Utils.checkNotNull(images, "images");
        this.images = JsonNullable.of(images);
        return this;
    }

    /**
     * List of URLs pointing to the locations of images of the catalog item variant.
     */
    public PostCatalogVariantResponseAttributes withImages(JsonNullable<? extends List<String>> images) {
        Utils.checkNotNull(images, "images");
        this.images = images;
        return this;
    }

    /**
     * Flat JSON blob to provide custom metadata about the catalog item variant. May not exceed 100kb.
     */
    public PostCatalogVariantResponseAttributes withCustomMetadata(PostCatalogVariantResponseCustomMetadata customMetadata) {
        Utils.checkNotNull(customMetadata, "customMetadata");
        this.customMetadata = JsonNullable.of(customMetadata);
        return this;
    }

    /**
     * Flat JSON blob to provide custom metadata about the catalog item variant. May not exceed 100kb.
     */
    public PostCatalogVariantResponseAttributes withCustomMetadata(JsonNullable<? extends PostCatalogVariantResponseCustomMetadata> customMetadata) {
        Utils.checkNotNull(customMetadata, "customMetadata");
        this.customMetadata = customMetadata;
        return this;
    }

    /**
     * Boolean value indicating whether the catalog item variant is published.
     */
    public PostCatalogVariantResponseAttributes withPublished(boolean published) {
        Utils.checkNotNull(published, "published");
        this.published = JsonNullable.of(published);
        return this;
    }

    /**
     * Boolean value indicating whether the catalog item variant is published.
     */
    public PostCatalogVariantResponseAttributes withPublished(JsonNullable<Boolean> published) {
        Utils.checkNotNull(published, "published");
        this.published = published;
        return this;
    }

    /**
     * Date and time when the catalog item  variant was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    public PostCatalogVariantResponseAttributes withCreated(OffsetDateTime created) {
        Utils.checkNotNull(created, "created");
        this.created = JsonNullable.of(created);
        return this;
    }

    /**
     * Date and time when the catalog item  variant was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    public PostCatalogVariantResponseAttributes withCreated(JsonNullable<OffsetDateTime> created) {
        Utils.checkNotNull(created, "created");
        this.created = created;
        return this;
    }

    /**
     * Date and time when the catalog item variant was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    public PostCatalogVariantResponseAttributes withUpdated(OffsetDateTime updated) {
        Utils.checkNotNull(updated, "updated");
        this.updated = JsonNullable.of(updated);
        return this;
    }

    /**
     * Date and time when the catalog item variant was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    public PostCatalogVariantResponseAttributes withUpdated(JsonNullable<OffsetDateTime> updated) {
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
        PostCatalogVariantResponseAttributes other = (PostCatalogVariantResponseAttributes) o;
        return 
            Objects.deepEquals(this.externalId, other.externalId) &&
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.sku, other.sku) &&
            Objects.deepEquals(this.inventoryPolicy, other.inventoryPolicy) &&
            Objects.deepEquals(this.inventoryQuantity, other.inventoryQuantity) &&
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
            sku,
            inventoryPolicy,
            inventoryQuantity,
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
        return Utils.toString(PostCatalogVariantResponseAttributes.class,
                "externalId", externalId,
                "title", title,
                "description", description,
                "sku", sku,
                "inventoryPolicy", inventoryPolicy,
                "inventoryQuantity", inventoryQuantity,
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
 
        private JsonNullable<String> sku = JsonNullable.undefined();
 
        private JsonNullable<? extends PostCatalogVariantResponseInventoryPolicy> inventoryPolicy = JsonNullable.undefined();
 
        private JsonNullable<Double> inventoryQuantity = JsonNullable.undefined();
 
        private JsonNullable<Double> price = JsonNullable.undefined();
 
        private JsonNullable<String> url = JsonNullable.undefined();
 
        private JsonNullable<String> imageFullUrl = JsonNullable.undefined();
 
        private JsonNullable<String> imageThumbnailUrl = JsonNullable.undefined();
 
        private JsonNullable<? extends List<String>> images = JsonNullable.undefined();
 
        private JsonNullable<? extends PostCatalogVariantResponseCustomMetadata> customMetadata = JsonNullable.undefined();
 
        private JsonNullable<Boolean> published = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> created = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> updated = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the catalog item variant in an external system.
         */
        public Builder externalId(String externalId) {
            Utils.checkNotNull(externalId, "externalId");
            this.externalId = JsonNullable.of(externalId);
            return this;
        }

        /**
         * The ID of the catalog item variant in an external system.
         */
        public Builder externalId(JsonNullable<String> externalId) {
            Utils.checkNotNull(externalId, "externalId");
            this.externalId = externalId;
            return this;
        }

        /**
         * The title of the catalog item variant.
         */
        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = JsonNullable.of(title);
            return this;
        }

        /**
         * The title of the catalog item variant.
         */
        public Builder title(JsonNullable<String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        /**
         * A description of the catalog item variant.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        /**
         * A description of the catalog item variant.
         */
        public Builder description(JsonNullable<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * The SKU of the catalog item variant.
         */
        public Builder sku(String sku) {
            Utils.checkNotNull(sku, "sku");
            this.sku = JsonNullable.of(sku);
            return this;
        }

        /**
         * The SKU of the catalog item variant.
         */
        public Builder sku(JsonNullable<String> sku) {
            Utils.checkNotNull(sku, "sku");
            this.sku = sku;
            return this;
        }

        /**
         * This field controls the visibility of this catalog item variant in product feeds/blocks. This field supports the following values:
         * `1`: a product will not appear in dynamic product recommendation feeds and blocks if it is out of stock.
         * `0` or `2`: a product can appear in dynamic product recommendation feeds and blocks regardless of inventory quantity.
         */
        public Builder inventoryPolicy(PostCatalogVariantResponseInventoryPolicy inventoryPolicy) {
            Utils.checkNotNull(inventoryPolicy, "inventoryPolicy");
            this.inventoryPolicy = JsonNullable.of(inventoryPolicy);
            return this;
        }

        /**
         * This field controls the visibility of this catalog item variant in product feeds/blocks. This field supports the following values:
         * `1`: a product will not appear in dynamic product recommendation feeds and blocks if it is out of stock.
         * `0` or `2`: a product can appear in dynamic product recommendation feeds and blocks regardless of inventory quantity.
         */
        public Builder inventoryPolicy(JsonNullable<? extends PostCatalogVariantResponseInventoryPolicy> inventoryPolicy) {
            Utils.checkNotNull(inventoryPolicy, "inventoryPolicy");
            this.inventoryPolicy = inventoryPolicy;
            return this;
        }

        /**
         * The quantity of the catalog item variant currently in stock.
         */
        public Builder inventoryQuantity(double inventoryQuantity) {
            Utils.checkNotNull(inventoryQuantity, "inventoryQuantity");
            this.inventoryQuantity = JsonNullable.of(inventoryQuantity);
            return this;
        }

        /**
         * The quantity of the catalog item variant currently in stock.
         */
        public Builder inventoryQuantity(JsonNullable<Double> inventoryQuantity) {
            Utils.checkNotNull(inventoryQuantity, "inventoryQuantity");
            this.inventoryQuantity = inventoryQuantity;
            return this;
        }

        /**
         * This field can be used to set the price on the catalog item variant, which is what gets displayed for the item variant when included in emails. For most price-update use cases, you will also want to update the `price` on any parent items using the [Update Catalog Item Endpoint](https://developers.klaviyo.com/en/reference/update_catalog_item).
         */
        public Builder price(double price) {
            Utils.checkNotNull(price, "price");
            this.price = JsonNullable.of(price);
            return this;
        }

        /**
         * This field can be used to set the price on the catalog item variant, which is what gets displayed for the item variant when included in emails. For most price-update use cases, you will also want to update the `price` on any parent items using the [Update Catalog Item Endpoint](https://developers.klaviyo.com/en/reference/update_catalog_item).
         */
        public Builder price(JsonNullable<Double> price) {
            Utils.checkNotNull(price, "price");
            this.price = price;
            return this;
        }

        /**
         * URL pointing to the location of the catalog item variant on your website.
         */
        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = JsonNullable.of(url);
            return this;
        }

        /**
         * URL pointing to the location of the catalog item variant on your website.
         */
        public Builder url(JsonNullable<String> url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }

        /**
         * URL pointing to the location of a full image of the catalog item variant.
         */
        public Builder imageFullUrl(String imageFullUrl) {
            Utils.checkNotNull(imageFullUrl, "imageFullUrl");
            this.imageFullUrl = JsonNullable.of(imageFullUrl);
            return this;
        }

        /**
         * URL pointing to the location of a full image of the catalog item variant.
         */
        public Builder imageFullUrl(JsonNullable<String> imageFullUrl) {
            Utils.checkNotNull(imageFullUrl, "imageFullUrl");
            this.imageFullUrl = imageFullUrl;
            return this;
        }

        /**
         * URL pointing to the location of an image thumbnail of the catalog item variant.
         */
        public Builder imageThumbnailUrl(String imageThumbnailUrl) {
            Utils.checkNotNull(imageThumbnailUrl, "imageThumbnailUrl");
            this.imageThumbnailUrl = JsonNullable.of(imageThumbnailUrl);
            return this;
        }

        /**
         * URL pointing to the location of an image thumbnail of the catalog item variant.
         */
        public Builder imageThumbnailUrl(JsonNullable<String> imageThumbnailUrl) {
            Utils.checkNotNull(imageThumbnailUrl, "imageThumbnailUrl");
            this.imageThumbnailUrl = imageThumbnailUrl;
            return this;
        }

        /**
         * List of URLs pointing to the locations of images of the catalog item variant.
         */
        public Builder images(List<String> images) {
            Utils.checkNotNull(images, "images");
            this.images = JsonNullable.of(images);
            return this;
        }

        /**
         * List of URLs pointing to the locations of images of the catalog item variant.
         */
        public Builder images(JsonNullable<? extends List<String>> images) {
            Utils.checkNotNull(images, "images");
            this.images = images;
            return this;
        }

        /**
         * Flat JSON blob to provide custom metadata about the catalog item variant. May not exceed 100kb.
         */
        public Builder customMetadata(PostCatalogVariantResponseCustomMetadata customMetadata) {
            Utils.checkNotNull(customMetadata, "customMetadata");
            this.customMetadata = JsonNullable.of(customMetadata);
            return this;
        }

        /**
         * Flat JSON blob to provide custom metadata about the catalog item variant. May not exceed 100kb.
         */
        public Builder customMetadata(JsonNullable<? extends PostCatalogVariantResponseCustomMetadata> customMetadata) {
            Utils.checkNotNull(customMetadata, "customMetadata");
            this.customMetadata = customMetadata;
            return this;
        }

        /**
         * Boolean value indicating whether the catalog item variant is published.
         */
        public Builder published(boolean published) {
            Utils.checkNotNull(published, "published");
            this.published = JsonNullable.of(published);
            return this;
        }

        /**
         * Boolean value indicating whether the catalog item variant is published.
         */
        public Builder published(JsonNullable<Boolean> published) {
            Utils.checkNotNull(published, "published");
            this.published = published;
            return this;
        }

        /**
         * Date and time when the catalog item  variant was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
         */
        public Builder created(OffsetDateTime created) {
            Utils.checkNotNull(created, "created");
            this.created = JsonNullable.of(created);
            return this;
        }

        /**
         * Date and time when the catalog item  variant was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
         */
        public Builder created(JsonNullable<OffsetDateTime> created) {
            Utils.checkNotNull(created, "created");
            this.created = created;
            return this;
        }

        /**
         * Date and time when the catalog item variant was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
         */
        public Builder updated(OffsetDateTime updated) {
            Utils.checkNotNull(updated, "updated");
            this.updated = JsonNullable.of(updated);
            return this;
        }

        /**
         * Date and time when the catalog item variant was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
         */
        public Builder updated(JsonNullable<OffsetDateTime> updated) {
            Utils.checkNotNull(updated, "updated");
            this.updated = updated;
            return this;
        }
        
        public PostCatalogVariantResponseAttributes build() {
            return new PostCatalogVariantResponseAttributes(
                externalId,
                title,
                description,
                sku,
                inventoryPolicy,
                inventoryQuantity,
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

