/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;


import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class MobilePushMessageContent {

    @JsonProperty("title")
    private String title;

    @JsonProperty("body")
    private String body;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sound")
    private Optional<Boolean> sound;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("badge")
    private Optional<Boolean> badge;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("media_url")
    private JsonNullable<String> mediaUrl;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dynamic_image")
    private JsonNullable<String> dynamicImage;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ios_link")
    private JsonNullable<String> iosLink;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("android_link")
    private JsonNullable<String> androidLink;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("on_open")
    private Optional<String> onOpen;

    @JsonCreator
    public MobilePushMessageContent(
            @JsonProperty("title") String title,
            @JsonProperty("body") String body,
            @JsonProperty("sound") Optional<Boolean> sound,
            @JsonProperty("badge") Optional<Boolean> badge,
            @JsonProperty("media_url") JsonNullable<String> mediaUrl,
            @JsonProperty("dynamic_image") JsonNullable<String> dynamicImage,
            @JsonProperty("ios_link") JsonNullable<String> iosLink,
            @JsonProperty("android_link") JsonNullable<String> androidLink,
            @JsonProperty("on_open") Optional<String> onOpen) {
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(body, "body");
        Utils.checkNotNull(sound, "sound");
        Utils.checkNotNull(badge, "badge");
        Utils.checkNotNull(mediaUrl, "mediaUrl");
        Utils.checkNotNull(dynamicImage, "dynamicImage");
        Utils.checkNotNull(iosLink, "iosLink");
        Utils.checkNotNull(androidLink, "androidLink");
        Utils.checkNotNull(onOpen, "onOpen");
        this.title = title;
        this.body = body;
        this.sound = sound;
        this.badge = badge;
        this.mediaUrl = mediaUrl;
        this.dynamicImage = dynamicImage;
        this.iosLink = iosLink;
        this.androidLink = androidLink;
        this.onOpen = onOpen;
    }
    
    public MobilePushMessageContent(
            String title,
            String body) {
        this(title, body, Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty());
    }

    @JsonIgnore
    public String title() {
        return title;
    }

    @JsonIgnore
    public String body() {
        return body;
    }

    @JsonIgnore
    public Optional<Boolean> sound() {
        return sound;
    }

    @JsonIgnore
    public Optional<Boolean> badge() {
        return badge;
    }

    @JsonIgnore
    public JsonNullable<String> mediaUrl() {
        return mediaUrl;
    }

    @JsonIgnore
    public JsonNullable<String> dynamicImage() {
        return dynamicImage;
    }

    @JsonIgnore
    public JsonNullable<String> iosLink() {
        return iosLink;
    }

    @JsonIgnore
    public JsonNullable<String> androidLink() {
        return androidLink;
    }

    @JsonIgnore
    public Optional<String> onOpen() {
        return onOpen;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public MobilePushMessageContent withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    public MobilePushMessageContent withBody(String body) {
        Utils.checkNotNull(body, "body");
        this.body = body;
        return this;
    }

    public MobilePushMessageContent withSound(boolean sound) {
        Utils.checkNotNull(sound, "sound");
        this.sound = Optional.ofNullable(sound);
        return this;
    }

    public MobilePushMessageContent withSound(Optional<Boolean> sound) {
        Utils.checkNotNull(sound, "sound");
        this.sound = sound;
        return this;
    }

    public MobilePushMessageContent withBadge(boolean badge) {
        Utils.checkNotNull(badge, "badge");
        this.badge = Optional.ofNullable(badge);
        return this;
    }

    public MobilePushMessageContent withBadge(Optional<Boolean> badge) {
        Utils.checkNotNull(badge, "badge");
        this.badge = badge;
        return this;
    }

    public MobilePushMessageContent withMediaUrl(String mediaUrl) {
        Utils.checkNotNull(mediaUrl, "mediaUrl");
        this.mediaUrl = JsonNullable.of(mediaUrl);
        return this;
    }

    public MobilePushMessageContent withMediaUrl(JsonNullable<String> mediaUrl) {
        Utils.checkNotNull(mediaUrl, "mediaUrl");
        this.mediaUrl = mediaUrl;
        return this;
    }

    public MobilePushMessageContent withDynamicImage(String dynamicImage) {
        Utils.checkNotNull(dynamicImage, "dynamicImage");
        this.dynamicImage = JsonNullable.of(dynamicImage);
        return this;
    }

    public MobilePushMessageContent withDynamicImage(JsonNullable<String> dynamicImage) {
        Utils.checkNotNull(dynamicImage, "dynamicImage");
        this.dynamicImage = dynamicImage;
        return this;
    }

    public MobilePushMessageContent withIosLink(String iosLink) {
        Utils.checkNotNull(iosLink, "iosLink");
        this.iosLink = JsonNullable.of(iosLink);
        return this;
    }

    public MobilePushMessageContent withIosLink(JsonNullable<String> iosLink) {
        Utils.checkNotNull(iosLink, "iosLink");
        this.iosLink = iosLink;
        return this;
    }

    public MobilePushMessageContent withAndroidLink(String androidLink) {
        Utils.checkNotNull(androidLink, "androidLink");
        this.androidLink = JsonNullable.of(androidLink);
        return this;
    }

    public MobilePushMessageContent withAndroidLink(JsonNullable<String> androidLink) {
        Utils.checkNotNull(androidLink, "androidLink");
        this.androidLink = androidLink;
        return this;
    }

    public MobilePushMessageContent withOnOpen(String onOpen) {
        Utils.checkNotNull(onOpen, "onOpen");
        this.onOpen = Optional.ofNullable(onOpen);
        return this;
    }

    public MobilePushMessageContent withOnOpen(Optional<String> onOpen) {
        Utils.checkNotNull(onOpen, "onOpen");
        this.onOpen = onOpen;
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
        MobilePushMessageContent other = (MobilePushMessageContent) o;
        return 
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.body, other.body) &&
            Objects.deepEquals(this.sound, other.sound) &&
            Objects.deepEquals(this.badge, other.badge) &&
            Objects.deepEquals(this.mediaUrl, other.mediaUrl) &&
            Objects.deepEquals(this.dynamicImage, other.dynamicImage) &&
            Objects.deepEquals(this.iosLink, other.iosLink) &&
            Objects.deepEquals(this.androidLink, other.androidLink) &&
            Objects.deepEquals(this.onOpen, other.onOpen);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            title,
            body,
            sound,
            badge,
            mediaUrl,
            dynamicImage,
            iosLink,
            androidLink,
            onOpen);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MobilePushMessageContent.class,
                "title", title,
                "body", body,
                "sound", sound,
                "badge", badge,
                "mediaUrl", mediaUrl,
                "dynamicImage", dynamicImage,
                "iosLink", iosLink,
                "androidLink", androidLink,
                "onOpen", onOpen);
    }
    
    public final static class Builder {
 
        private String title;
 
        private String body;
 
        private Optional<Boolean> sound;
 
        private Optional<Boolean> badge;
 
        private JsonNullable<String> mediaUrl = JsonNullable.undefined();
 
        private JsonNullable<String> dynamicImage = JsonNullable.undefined();
 
        private JsonNullable<String> iosLink = JsonNullable.undefined();
 
        private JsonNullable<String> androidLink = JsonNullable.undefined();
 
        private Optional<String> onOpen;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        public Builder body(String body) {
            Utils.checkNotNull(body, "body");
            this.body = body;
            return this;
        }

        public Builder sound(boolean sound) {
            Utils.checkNotNull(sound, "sound");
            this.sound = Optional.ofNullable(sound);
            return this;
        }

        public Builder sound(Optional<Boolean> sound) {
            Utils.checkNotNull(sound, "sound");
            this.sound = sound;
            return this;
        }

        public Builder badge(boolean badge) {
            Utils.checkNotNull(badge, "badge");
            this.badge = Optional.ofNullable(badge);
            return this;
        }

        public Builder badge(Optional<Boolean> badge) {
            Utils.checkNotNull(badge, "badge");
            this.badge = badge;
            return this;
        }

        public Builder mediaUrl(String mediaUrl) {
            Utils.checkNotNull(mediaUrl, "mediaUrl");
            this.mediaUrl = JsonNullable.of(mediaUrl);
            return this;
        }

        public Builder mediaUrl(JsonNullable<String> mediaUrl) {
            Utils.checkNotNull(mediaUrl, "mediaUrl");
            this.mediaUrl = mediaUrl;
            return this;
        }

        public Builder dynamicImage(String dynamicImage) {
            Utils.checkNotNull(dynamicImage, "dynamicImage");
            this.dynamicImage = JsonNullable.of(dynamicImage);
            return this;
        }

        public Builder dynamicImage(JsonNullable<String> dynamicImage) {
            Utils.checkNotNull(dynamicImage, "dynamicImage");
            this.dynamicImage = dynamicImage;
            return this;
        }

        public Builder iosLink(String iosLink) {
            Utils.checkNotNull(iosLink, "iosLink");
            this.iosLink = JsonNullable.of(iosLink);
            return this;
        }

        public Builder iosLink(JsonNullable<String> iosLink) {
            Utils.checkNotNull(iosLink, "iosLink");
            this.iosLink = iosLink;
            return this;
        }

        public Builder androidLink(String androidLink) {
            Utils.checkNotNull(androidLink, "androidLink");
            this.androidLink = JsonNullable.of(androidLink);
            return this;
        }

        public Builder androidLink(JsonNullable<String> androidLink) {
            Utils.checkNotNull(androidLink, "androidLink");
            this.androidLink = androidLink;
            return this;
        }

        public Builder onOpen(String onOpen) {
            Utils.checkNotNull(onOpen, "onOpen");
            this.onOpen = Optional.ofNullable(onOpen);
            return this;
        }

        public Builder onOpen(Optional<String> onOpen) {
            Utils.checkNotNull(onOpen, "onOpen");
            this.onOpen = onOpen;
            return this;
        }
        
        public MobilePushMessageContent build() {
            if (sound == null) {
                sound = _SINGLETON_VALUE_Sound.value();
            }
            if (badge == null) {
                badge = _SINGLETON_VALUE_Badge.value();
            }
            if (onOpen == null) {
                onOpen = _SINGLETON_VALUE_OnOpen.value();
            }            return new MobilePushMessageContent(
                title,
                body,
                sound,
                badge,
                mediaUrl,
                dynamicImage,
                iosLink,
                androidLink,
                onOpen);
        }

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_Sound =
                new LazySingletonValue<>(
                        "sound",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_Badge =
                new LazySingletonValue<>(
                        "badge",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_OnOpen =
                new LazySingletonValue<>(
                        "on_open",
                        "\"home\"",
                        new TypeReference<Optional<String>>() {});
    }
}

