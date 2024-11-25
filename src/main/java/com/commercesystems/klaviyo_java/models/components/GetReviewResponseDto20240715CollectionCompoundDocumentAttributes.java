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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class GetReviewResponseDto20240715CollectionCompoundDocumentAttributes {

    /**
     * The email of the author of this review
     */
    @JsonProperty("email")
    private String email;

    /**
     * The status of this review
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private JsonNullable<? extends GetReviewResponseDto20240715CollectionCompoundDocumentStatus> status;

    /**
     * The verification status of this review (aka whether or not we have confirmation that the customer bought the product)
     */
    @JsonProperty("verified")
    private boolean verified;

    /**
     * The type of this review — either a review, question, or rating
     */
    @JsonProperty("review_type")
    private ReviewType reviewType;

    /**
     * The datetime when this review was created
     */
    @JsonProperty("created")
    private OffsetDateTime created;

    /**
     * The datetime when this review was updated
     */
    @JsonProperty("updated")
    private OffsetDateTime updated;

    /**
     * The list of images submitted with this review (represented as a list of urls). If there are no images, this field will be an empty list.
     */
    @JsonProperty("images")
    private List<String> images;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("product")
    private Optional<? extends ReviewProductDTO> product;

    /**
     * The rating of this review on a scale from 1-5. If the review type is "question", this field will be null.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("rating")
    private JsonNullable<Long> rating;

    /**
     * The author of this review
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("author")
    private JsonNullable<String> author;

    /**
     * The content of this review
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("content")
    private JsonNullable<String> content;

    /**
     * The title of this review
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private JsonNullable<String> title;

    /**
     * A quote from this review that summarizes the content
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("smart_quote")
    private JsonNullable<String> smartQuote;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("public_reply")
    private Optional<? extends ReviewPublicReply> publicReply;

    @JsonCreator
    public GetReviewResponseDto20240715CollectionCompoundDocumentAttributes(
            @JsonProperty("email") String email,
            @JsonProperty("status") JsonNullable<? extends GetReviewResponseDto20240715CollectionCompoundDocumentStatus> status,
            @JsonProperty("verified") boolean verified,
            @JsonProperty("review_type") ReviewType reviewType,
            @JsonProperty("created") OffsetDateTime created,
            @JsonProperty("updated") OffsetDateTime updated,
            @JsonProperty("images") List<String> images,
            @JsonProperty("product") Optional<? extends ReviewProductDTO> product,
            @JsonProperty("rating") JsonNullable<Long> rating,
            @JsonProperty("author") JsonNullable<String> author,
            @JsonProperty("content") JsonNullable<String> content,
            @JsonProperty("title") JsonNullable<String> title,
            @JsonProperty("smart_quote") JsonNullable<String> smartQuote,
            @JsonProperty("public_reply") Optional<? extends ReviewPublicReply> publicReply) {
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(verified, "verified");
        Utils.checkNotNull(reviewType, "reviewType");
        Utils.checkNotNull(created, "created");
        Utils.checkNotNull(updated, "updated");
        Utils.checkNotNull(images, "images");
        Utils.checkNotNull(product, "product");
        Utils.checkNotNull(rating, "rating");
        Utils.checkNotNull(author, "author");
        Utils.checkNotNull(content, "content");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(smartQuote, "smartQuote");
        Utils.checkNotNull(publicReply, "publicReply");
        this.email = email;
        this.status = status;
        this.verified = verified;
        this.reviewType = reviewType;
        this.created = created;
        this.updated = updated;
        this.images = images;
        this.product = product;
        this.rating = rating;
        this.author = author;
        this.content = content;
        this.title = title;
        this.smartQuote = smartQuote;
        this.publicReply = publicReply;
    }
    
    public GetReviewResponseDto20240715CollectionCompoundDocumentAttributes(
            String email,
            boolean verified,
            ReviewType reviewType,
            OffsetDateTime created,
            OffsetDateTime updated,
            List<String> images) {
        this(email, JsonNullable.undefined(), verified, reviewType, created, updated, images, Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * The email of the author of this review
     */
    @JsonIgnore
    public String email() {
        return email;
    }

    /**
     * The status of this review
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<GetReviewResponseDto20240715CollectionCompoundDocumentStatus> status() {
        return (JsonNullable<GetReviewResponseDto20240715CollectionCompoundDocumentStatus>) status;
    }

    /**
     * The verification status of this review (aka whether or not we have confirmation that the customer bought the product)
     */
    @JsonIgnore
    public boolean verified() {
        return verified;
    }

    /**
     * The type of this review — either a review, question, or rating
     */
    @JsonIgnore
    public ReviewType reviewType() {
        return reviewType;
    }

    /**
     * The datetime when this review was created
     */
    @JsonIgnore
    public OffsetDateTime created() {
        return created;
    }

    /**
     * The datetime when this review was updated
     */
    @JsonIgnore
    public OffsetDateTime updated() {
        return updated;
    }

    /**
     * The list of images submitted with this review (represented as a list of urls). If there are no images, this field will be an empty list.
     */
    @JsonIgnore
    public List<String> images() {
        return images;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ReviewProductDTO> product() {
        return (Optional<ReviewProductDTO>) product;
    }

    /**
     * The rating of this review on a scale from 1-5. If the review type is "question", this field will be null.
     */
    @JsonIgnore
    public JsonNullable<Long> rating() {
        return rating;
    }

    /**
     * The author of this review
     */
    @JsonIgnore
    public JsonNullable<String> author() {
        return author;
    }

    /**
     * The content of this review
     */
    @JsonIgnore
    public JsonNullable<String> content() {
        return content;
    }

    /**
     * The title of this review
     */
    @JsonIgnore
    public JsonNullable<String> title() {
        return title;
    }

    /**
     * A quote from this review that summarizes the content
     */
    @JsonIgnore
    public JsonNullable<String> smartQuote() {
        return smartQuote;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ReviewPublicReply> publicReply() {
        return (Optional<ReviewPublicReply>) publicReply;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The email of the author of this review
     */
    public GetReviewResponseDto20240715CollectionCompoundDocumentAttributes withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    /**
     * The status of this review
     */
    public GetReviewResponseDto20240715CollectionCompoundDocumentAttributes withStatus(GetReviewResponseDto20240715CollectionCompoundDocumentStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = JsonNullable.of(status);
        return this;
    }

    /**
     * The status of this review
     */
    public GetReviewResponseDto20240715CollectionCompoundDocumentAttributes withStatus(JsonNullable<? extends GetReviewResponseDto20240715CollectionCompoundDocumentStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * The verification status of this review (aka whether or not we have confirmation that the customer bought the product)
     */
    public GetReviewResponseDto20240715CollectionCompoundDocumentAttributes withVerified(boolean verified) {
        Utils.checkNotNull(verified, "verified");
        this.verified = verified;
        return this;
    }

    /**
     * The type of this review — either a review, question, or rating
     */
    public GetReviewResponseDto20240715CollectionCompoundDocumentAttributes withReviewType(ReviewType reviewType) {
        Utils.checkNotNull(reviewType, "reviewType");
        this.reviewType = reviewType;
        return this;
    }

    /**
     * The datetime when this review was created
     */
    public GetReviewResponseDto20240715CollectionCompoundDocumentAttributes withCreated(OffsetDateTime created) {
        Utils.checkNotNull(created, "created");
        this.created = created;
        return this;
    }

    /**
     * The datetime when this review was updated
     */
    public GetReviewResponseDto20240715CollectionCompoundDocumentAttributes withUpdated(OffsetDateTime updated) {
        Utils.checkNotNull(updated, "updated");
        this.updated = updated;
        return this;
    }

    /**
     * The list of images submitted with this review (represented as a list of urls). If there are no images, this field will be an empty list.
     */
    public GetReviewResponseDto20240715CollectionCompoundDocumentAttributes withImages(List<String> images) {
        Utils.checkNotNull(images, "images");
        this.images = images;
        return this;
    }

    public GetReviewResponseDto20240715CollectionCompoundDocumentAttributes withProduct(ReviewProductDTO product) {
        Utils.checkNotNull(product, "product");
        this.product = Optional.ofNullable(product);
        return this;
    }

    public GetReviewResponseDto20240715CollectionCompoundDocumentAttributes withProduct(Optional<? extends ReviewProductDTO> product) {
        Utils.checkNotNull(product, "product");
        this.product = product;
        return this;
    }

    /**
     * The rating of this review on a scale from 1-5. If the review type is "question", this field will be null.
     */
    public GetReviewResponseDto20240715CollectionCompoundDocumentAttributes withRating(long rating) {
        Utils.checkNotNull(rating, "rating");
        this.rating = JsonNullable.of(rating);
        return this;
    }

    /**
     * The rating of this review on a scale from 1-5. If the review type is "question", this field will be null.
     */
    public GetReviewResponseDto20240715CollectionCompoundDocumentAttributes withRating(JsonNullable<Long> rating) {
        Utils.checkNotNull(rating, "rating");
        this.rating = rating;
        return this;
    }

    /**
     * The author of this review
     */
    public GetReviewResponseDto20240715CollectionCompoundDocumentAttributes withAuthor(String author) {
        Utils.checkNotNull(author, "author");
        this.author = JsonNullable.of(author);
        return this;
    }

    /**
     * The author of this review
     */
    public GetReviewResponseDto20240715CollectionCompoundDocumentAttributes withAuthor(JsonNullable<String> author) {
        Utils.checkNotNull(author, "author");
        this.author = author;
        return this;
    }

    /**
     * The content of this review
     */
    public GetReviewResponseDto20240715CollectionCompoundDocumentAttributes withContent(String content) {
        Utils.checkNotNull(content, "content");
        this.content = JsonNullable.of(content);
        return this;
    }

    /**
     * The content of this review
     */
    public GetReviewResponseDto20240715CollectionCompoundDocumentAttributes withContent(JsonNullable<String> content) {
        Utils.checkNotNull(content, "content");
        this.content = content;
        return this;
    }

    /**
     * The title of this review
     */
    public GetReviewResponseDto20240715CollectionCompoundDocumentAttributes withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = JsonNullable.of(title);
        return this;
    }

    /**
     * The title of this review
     */
    public GetReviewResponseDto20240715CollectionCompoundDocumentAttributes withTitle(JsonNullable<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    /**
     * A quote from this review that summarizes the content
     */
    public GetReviewResponseDto20240715CollectionCompoundDocumentAttributes withSmartQuote(String smartQuote) {
        Utils.checkNotNull(smartQuote, "smartQuote");
        this.smartQuote = JsonNullable.of(smartQuote);
        return this;
    }

    /**
     * A quote from this review that summarizes the content
     */
    public GetReviewResponseDto20240715CollectionCompoundDocumentAttributes withSmartQuote(JsonNullable<String> smartQuote) {
        Utils.checkNotNull(smartQuote, "smartQuote");
        this.smartQuote = smartQuote;
        return this;
    }

    public GetReviewResponseDto20240715CollectionCompoundDocumentAttributes withPublicReply(ReviewPublicReply publicReply) {
        Utils.checkNotNull(publicReply, "publicReply");
        this.publicReply = Optional.ofNullable(publicReply);
        return this;
    }

    public GetReviewResponseDto20240715CollectionCompoundDocumentAttributes withPublicReply(Optional<? extends ReviewPublicReply> publicReply) {
        Utils.checkNotNull(publicReply, "publicReply");
        this.publicReply = publicReply;
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
        GetReviewResponseDto20240715CollectionCompoundDocumentAttributes other = (GetReviewResponseDto20240715CollectionCompoundDocumentAttributes) o;
        return 
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.verified, other.verified) &&
            Objects.deepEquals(this.reviewType, other.reviewType) &&
            Objects.deepEquals(this.created, other.created) &&
            Objects.deepEquals(this.updated, other.updated) &&
            Objects.deepEquals(this.images, other.images) &&
            Objects.deepEquals(this.product, other.product) &&
            Objects.deepEquals(this.rating, other.rating) &&
            Objects.deepEquals(this.author, other.author) &&
            Objects.deepEquals(this.content, other.content) &&
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.smartQuote, other.smartQuote) &&
            Objects.deepEquals(this.publicReply, other.publicReply);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            email,
            status,
            verified,
            reviewType,
            created,
            updated,
            images,
            product,
            rating,
            author,
            content,
            title,
            smartQuote,
            publicReply);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetReviewResponseDto20240715CollectionCompoundDocumentAttributes.class,
                "email", email,
                "status", status,
                "verified", verified,
                "reviewType", reviewType,
                "created", created,
                "updated", updated,
                "images", images,
                "product", product,
                "rating", rating,
                "author", author,
                "content", content,
                "title", title,
                "smartQuote", smartQuote,
                "publicReply", publicReply);
    }
    
    public final static class Builder {
 
        private String email;
 
        private JsonNullable<? extends GetReviewResponseDto20240715CollectionCompoundDocumentStatus> status = JsonNullable.undefined();
 
        private Boolean verified;
 
        private ReviewType reviewType;
 
        private OffsetDateTime created;
 
        private OffsetDateTime updated;
 
        private List<String> images;
 
        private Optional<? extends ReviewProductDTO> product = Optional.empty();
 
        private JsonNullable<Long> rating = JsonNullable.undefined();
 
        private JsonNullable<String> author = JsonNullable.undefined();
 
        private JsonNullable<String> content = JsonNullable.undefined();
 
        private JsonNullable<String> title = JsonNullable.undefined();
 
        private JsonNullable<String> smartQuote = JsonNullable.undefined();
 
        private Optional<? extends ReviewPublicReply> publicReply = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The email of the author of this review
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        /**
         * The status of this review
         */
        public Builder status(GetReviewResponseDto20240715CollectionCompoundDocumentStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = JsonNullable.of(status);
            return this;
        }

        /**
         * The status of this review
         */
        public Builder status(JsonNullable<? extends GetReviewResponseDto20240715CollectionCompoundDocumentStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * The verification status of this review (aka whether or not we have confirmation that the customer bought the product)
         */
        public Builder verified(boolean verified) {
            Utils.checkNotNull(verified, "verified");
            this.verified = verified;
            return this;
        }

        /**
         * The type of this review — either a review, question, or rating
         */
        public Builder reviewType(ReviewType reviewType) {
            Utils.checkNotNull(reviewType, "reviewType");
            this.reviewType = reviewType;
            return this;
        }

        /**
         * The datetime when this review was created
         */
        public Builder created(OffsetDateTime created) {
            Utils.checkNotNull(created, "created");
            this.created = created;
            return this;
        }

        /**
         * The datetime when this review was updated
         */
        public Builder updated(OffsetDateTime updated) {
            Utils.checkNotNull(updated, "updated");
            this.updated = updated;
            return this;
        }

        /**
         * The list of images submitted with this review (represented as a list of urls). If there are no images, this field will be an empty list.
         */
        public Builder images(List<String> images) {
            Utils.checkNotNull(images, "images");
            this.images = images;
            return this;
        }

        public Builder product(ReviewProductDTO product) {
            Utils.checkNotNull(product, "product");
            this.product = Optional.ofNullable(product);
            return this;
        }

        public Builder product(Optional<? extends ReviewProductDTO> product) {
            Utils.checkNotNull(product, "product");
            this.product = product;
            return this;
        }

        /**
         * The rating of this review on a scale from 1-5. If the review type is "question", this field will be null.
         */
        public Builder rating(long rating) {
            Utils.checkNotNull(rating, "rating");
            this.rating = JsonNullable.of(rating);
            return this;
        }

        /**
         * The rating of this review on a scale from 1-5. If the review type is "question", this field will be null.
         */
        public Builder rating(JsonNullable<Long> rating) {
            Utils.checkNotNull(rating, "rating");
            this.rating = rating;
            return this;
        }

        /**
         * The author of this review
         */
        public Builder author(String author) {
            Utils.checkNotNull(author, "author");
            this.author = JsonNullable.of(author);
            return this;
        }

        /**
         * The author of this review
         */
        public Builder author(JsonNullable<String> author) {
            Utils.checkNotNull(author, "author");
            this.author = author;
            return this;
        }

        /**
         * The content of this review
         */
        public Builder content(String content) {
            Utils.checkNotNull(content, "content");
            this.content = JsonNullable.of(content);
            return this;
        }

        /**
         * The content of this review
         */
        public Builder content(JsonNullable<String> content) {
            Utils.checkNotNull(content, "content");
            this.content = content;
            return this;
        }

        /**
         * The title of this review
         */
        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = JsonNullable.of(title);
            return this;
        }

        /**
         * The title of this review
         */
        public Builder title(JsonNullable<String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        /**
         * A quote from this review that summarizes the content
         */
        public Builder smartQuote(String smartQuote) {
            Utils.checkNotNull(smartQuote, "smartQuote");
            this.smartQuote = JsonNullable.of(smartQuote);
            return this;
        }

        /**
         * A quote from this review that summarizes the content
         */
        public Builder smartQuote(JsonNullable<String> smartQuote) {
            Utils.checkNotNull(smartQuote, "smartQuote");
            this.smartQuote = smartQuote;
            return this;
        }

        public Builder publicReply(ReviewPublicReply publicReply) {
            Utils.checkNotNull(publicReply, "publicReply");
            this.publicReply = Optional.ofNullable(publicReply);
            return this;
        }

        public Builder publicReply(Optional<? extends ReviewPublicReply> publicReply) {
            Utils.checkNotNull(publicReply, "publicReply");
            this.publicReply = publicReply;
            return this;
        }
        
        public GetReviewResponseDto20240715CollectionCompoundDocumentAttributes build() {
            return new GetReviewResponseDto20240715CollectionCompoundDocumentAttributes(
                email,
                status,
                verified,
                reviewType,
                created,
                updated,
                images,
                product,
                rating,
                author,
                content,
                title,
                smartQuote,
                publicReply);
        }
    }
}

