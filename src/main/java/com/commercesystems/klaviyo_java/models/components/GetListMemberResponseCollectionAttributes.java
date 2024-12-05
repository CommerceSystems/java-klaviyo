package com.commercesystems.klaviyo_java.models.components;

import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Optional;

public class GetListMemberResponseCollectionAttributes {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subscriptions")
    private Optional<? extends Subscriptions> subscriptions;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("predictive_analytics")
    private Optional<? extends PredictiveAnalytics> predictiveAnalytics;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<String> email;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone_number")
    private Optional<String> phoneNumber;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("external_id")
    private Optional<String> externalId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("first_name")
    private Optional<String> firstName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last_name")
    private Optional<String> lastName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("organization")
    private Optional<String> organization;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("locale")
    private Optional<String> locale;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private Optional<String> title;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("image")
    private Optional<String> image;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created")
    private Optional<String> created;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated")
    private Optional<String> updated;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last_event_date")
    private Optional<String> lastEventDate;

    @JsonCreator
    public GetListMemberResponseCollectionAttributes(
            @JsonProperty("subscriptions") Optional<? extends Subscriptions> subscriptions,
            @JsonProperty("predictive_analytics") Optional<? extends PredictiveAnalytics> predictiveAnalytics,
            @JsonProperty("email") Optional<String> email,
            @JsonProperty("phone_number") Optional<String> phoneNumber,
            @JsonProperty("external_id") Optional<String> externalId,
            @JsonProperty("first_name") Optional<String> firstName,
            @JsonProperty("last_name") Optional<String> lastName,
            @JsonProperty("organization") Optional<String> organization,
            @JsonProperty("locale") Optional<String> locale,
            @JsonProperty("title") Optional<String> title,
            @JsonProperty("image") Optional<String> image,
            @JsonProperty("created") Optional<String> created,
            @JsonProperty("updated") Optional<String> updated,
            @JsonProperty("last_event_date") Optional<String> lastEventDate) {
        Utils.checkNotNull(subscriptions, "subscriptions");
        Utils.checkNotNull(predictiveAnalytics, "predictiveAnalytics");
        this.subscriptions = subscriptions;
        this.predictiveAnalytics = predictiveAnalytics;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.externalId = externalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.organization = organization;
        this.locale = locale;
        this.title = title;
        this.image = image;
        this.created = created;
        this.updated = updated;
        this.lastEventDate = lastEventDate;
    }

    public GetListMemberResponseCollectionAttributes() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),
                Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),
                Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Subscriptions> subscriptions() {
        return (Optional<Subscriptions>) subscriptions;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PredictiveAnalytics> predictiveAnalytics() {
        return (Optional<PredictiveAnalytics>) predictiveAnalytics;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public Optional<String> getPhoneNumber() {
        return phoneNumber;
    }

    public Optional<String> getExternalId() {
        return externalId;
    }

    public Optional<String> getFirstName() {
        return firstName;
    }

    public Optional<String> getLastName() {
        return lastName;
    }

    public Optional<String> getOrganization() {
        return organization;
    }

    public Optional<String> getLocale() {
        return locale;
    }

    public Optional<String> getTitle() {
        return title;
    }

    public Optional<String> getImage() {
        return image;
    }

    public Optional<String> getCreated() {
        return created;
    }

    public Optional<String> getUpdated() {
        return updated;
    }

    public Optional<String> getLastEventDate() {
        return lastEventDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetListMemberResponseCollectionAttributes other = (GetListMemberResponseCollectionAttributes) o;
        return Objects.deepEquals(this.subscriptions, other.subscriptions) &&
                Objects.deepEquals(this.predictiveAnalytics, other.predictiveAnalytics) &&
                Objects.deepEquals(this.email, other.email) &&
                Objects.deepEquals(this.phoneNumber, other.phoneNumber) &&
                Objects.deepEquals(this.externalId, other.externalId) &&
                Objects.deepEquals(this.firstName, other.firstName) &&
                Objects.deepEquals(this.lastName, other.lastName) &&
                Objects.deepEquals(this.organization, other.organization) &&
                Objects.deepEquals(this.locale, other.locale) &&
                Objects.deepEquals(this.title, other.title) &&
                Objects.deepEquals(this.image, other.image) &&
                Objects.deepEquals(this.created, other.created) &&
                Objects.deepEquals(this.updated, other.updated) &&
                Objects.deepEquals(this.lastEventDate, other.lastEventDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptions, predictiveAnalytics, email, phoneNumber, externalId, firstName, lastName,
                organization, locale, title, image, created, updated, lastEventDate);
    }

    @Override
    public String toString() {
        return Utils.toString(GetListMemberResponseCollectionAttributes.class,
                "subscriptions", subscriptions,
                "predictiveAnalytics", predictiveAnalytics,
                "email", email,
                "phoneNumber", phoneNumber,
                "externalId", externalId,
                "firstName", firstName,
                "lastName", lastName,
                "organization", organization,
                "locale", locale,
                "title", title,
                "image", image,
                "created", created,
                "updated", updated,
                "lastEventDate", lastEventDate);
    }
}
