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
import java.time.OffsetDateTime;
import java.util.Objects;


public class ReviewPublicReply {

    /**
     * The content of the public reply
     */
    @JsonProperty("content")
    private String content;

    /**
     * The author of the public reply
     */
    @JsonProperty("author")
    private String author;

    /**
     * The datetime when this public reply was updated
     */
    @JsonProperty("updated")
    private OffsetDateTime updated;

    @JsonCreator
    public ReviewPublicReply(
            @JsonProperty("content") String content,
            @JsonProperty("author") String author,
            @JsonProperty("updated") OffsetDateTime updated) {
        Utils.checkNotNull(content, "content");
        Utils.checkNotNull(author, "author");
        Utils.checkNotNull(updated, "updated");
        this.content = content;
        this.author = author;
        this.updated = updated;
    }

    /**
     * The content of the public reply
     */
    @JsonIgnore
    public String content() {
        return content;
    }

    /**
     * The author of the public reply
     */
    @JsonIgnore
    public String author() {
        return author;
    }

    /**
     * The datetime when this public reply was updated
     */
    @JsonIgnore
    public OffsetDateTime updated() {
        return updated;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The content of the public reply
     */
    public ReviewPublicReply withContent(String content) {
        Utils.checkNotNull(content, "content");
        this.content = content;
        return this;
    }

    /**
     * The author of the public reply
     */
    public ReviewPublicReply withAuthor(String author) {
        Utils.checkNotNull(author, "author");
        this.author = author;
        return this;
    }

    /**
     * The datetime when this public reply was updated
     */
    public ReviewPublicReply withUpdated(OffsetDateTime updated) {
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
        ReviewPublicReply other = (ReviewPublicReply) o;
        return 
            Objects.deepEquals(this.content, other.content) &&
            Objects.deepEquals(this.author, other.author) &&
            Objects.deepEquals(this.updated, other.updated);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            content,
            author,
            updated);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReviewPublicReply.class,
                "content", content,
                "author", author,
                "updated", updated);
    }
    
    public final static class Builder {
 
        private String content;
 
        private String author;
 
        private OffsetDateTime updated;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The content of the public reply
         */
        public Builder content(String content) {
            Utils.checkNotNull(content, "content");
            this.content = content;
            return this;
        }

        /**
         * The author of the public reply
         */
        public Builder author(String author) {
            Utils.checkNotNull(author, "author");
            this.author = author;
            return this;
        }

        /**
         * The datetime when this public reply was updated
         */
        public Builder updated(OffsetDateTime updated) {
            Utils.checkNotNull(updated, "updated");
            this.updated = updated;
            return this;
        }
        
        public ReviewPublicReply build() {
            return new ReviewPublicReply(
                content,
                author,
                updated);
        }
    }
}

