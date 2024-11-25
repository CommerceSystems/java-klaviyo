# openapi

Developer-friendly & type-safe Java SDK specifically catered to leverage *openapi* API.

<div align="left">
    <a href="https://www.speakeasy.com/?utm_source=openapi&utm_campaign=java"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
    <a href="https://mit-license.org/">
        <img src="https://img.shields.io/badge/License-MIT-blue.svg" style="width: 100px; height: 28px;" />
    </a>
</div>


<br /><br />
> [!IMPORTANT]
> This SDK is not yet ready for production use. To complete setup please follow the steps outlined in your [workspace](https://app.speakeasy.com/org/cs-pzi/cs). Delete this section before > publishing to a package manager.

<!-- Start Summary [summary] -->
## Summary

Klaviyo API: The Klaviyo REST API. Please visit https://developers.klaviyo.com for more details.
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents

* [SDK Installation](#sdk-installation)
* [SDK Example Usage](#sdk-example-usage)
* [Available Resources and Operations](#available-resources-and-operations)
* [Error Handling](#error-handling)
* [Server Selection](#server-selection)
* [Authentication](#authentication)
<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'com.commercesystems:klaviyo-java:0.0.2'
```

Maven:
```xml
<dependency>
    <groupId>com.commercesystems</groupId>
    <artifactId>klaviyo-java</artifactId>
    <version>0.0.2</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.FieldsAccount;
import com.commercesystems.klaviyo_java.models.operations.GetAccountsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetAccountsResponse res = sdk.accounts().getAccounts()
                .fieldsAccount(List.of(
                    FieldsAccount.CONTACT_INFORMATION_ORGANIZATION_NAME))
                .revision("2024-10-15")
                .call();

        if (res.getAccountResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [accounts()](docs/sdks/accounts/README.md)

* [getAccounts](docs/sdks/accounts/README.md#getaccounts) - Get Accounts
* [getAccount](docs/sdks/accounts/README.md#getaccount) - Get Account

### [campaigns()](docs/sdks/campaigns/README.md)

* [getCampaigns](docs/sdks/campaigns/README.md#getcampaigns) - Get Campaigns
* [createCampaign](docs/sdks/campaigns/README.md#createcampaign) - Create Campaign
* [getCampaign](docs/sdks/campaigns/README.md#getcampaign) - Get Campaign
* [updateCampaign](docs/sdks/campaigns/README.md#updatecampaign) - Update Campaign
* [deleteCampaign](docs/sdks/campaigns/README.md#deletecampaign) - Delete Campaign
* [getCampaignMessage](docs/sdks/campaigns/README.md#getcampaignmessage) - Get Campaign Message
* [updateCampaignMessage](docs/sdks/campaigns/README.md#updatecampaignmessage) - Update Campaign Message
* [getCampaignSendJob](docs/sdks/campaigns/README.md#getcampaignsendjob) - Get Campaign Send Job
* [cancelCampaignSend](docs/sdks/campaigns/README.md#cancelcampaignsend) - Cancel Campaign Send
* [getCampaignRecipientEstimationJob](docs/sdks/campaigns/README.md#getcampaignrecipientestimationjob) - Get Campaign Recipient Estimation Job
* [getCampaignRecipientEstimation](docs/sdks/campaigns/README.md#getcampaignrecipientestimation) - Get Campaign Recipient Estimation
* [createCampaignClone](docs/sdks/campaigns/README.md#createcampaignclone) - Create Campaign Clone
* [assignTemplateToCampaignMessage](docs/sdks/campaigns/README.md#assigntemplatetocampaignmessage) - Assign Template to Campaign Message
* [sendCampaign](docs/sdks/campaigns/README.md#sendcampaign) - Send Campaign
* [refreshCampaignRecipientEstimation](docs/sdks/campaigns/README.md#refreshcampaignrecipientestimation) - Refresh Campaign Recipient Estimation
* [getCampaignIdForCampaignMessage](docs/sdks/campaigns/README.md#getcampaignidforcampaignmessage) - Get Campaign ID for Campaign Message
* [getCampaignForCampaignMessage](docs/sdks/campaigns/README.md#getcampaignforcampaignmessage) - Get Campaign for Campaign Message
* [getTemplateIdForCampaignMessage](docs/sdks/campaigns/README.md#gettemplateidforcampaignmessage) - Get Template ID for Campaign Message
* [getTemplateForCampaignMessage](docs/sdks/campaigns/README.md#gettemplateforcampaignmessage) - Get Template for Campaign Message
* [getTagIdsForCampaign](docs/sdks/campaigns/README.md#gettagidsforcampaign) - Get Tag IDs for Campaign
* [getCampaignTags](docs/sdks/campaigns/README.md#getcampaigntags) - Get Campaign Tags
* [getMessageIdsForCampaign](docs/sdks/campaigns/README.md#getmessageidsforcampaign) - Get Message IDs for Campaign
* [getMessagesForCampaign](docs/sdks/campaigns/README.md#getmessagesforcampaign) - Get Messages for Campaign

### [catalogs()](docs/sdks/catalogs/README.md)

* [getCatalogItems](docs/sdks/catalogs/README.md#getcatalogitems) - Get Catalog Items
* [createCatalogItem](docs/sdks/catalogs/README.md#createcatalogitem) - Create Catalog Item
* [getCatalogItem](docs/sdks/catalogs/README.md#getcatalogitem) - Get Catalog Item
* [updateCatalogItem](docs/sdks/catalogs/README.md#updatecatalogitem) - Update Catalog Item
* [deleteCatalogItem](docs/sdks/catalogs/README.md#deletecatalogitem) - Delete Catalog Item
* [getCatalogVariants](docs/sdks/catalogs/README.md#getcatalogvariants) - Get Catalog Variants
* [createCatalogVariant](docs/sdks/catalogs/README.md#createcatalogvariant) - Create Catalog Variant
* [getCatalogVariant](docs/sdks/catalogs/README.md#getcatalogvariant) - Get Catalog Variant
* [updateCatalogVariant](docs/sdks/catalogs/README.md#updatecatalogvariant) - Update Catalog Variant
* [deleteCatalogVariant](docs/sdks/catalogs/README.md#deletecatalogvariant) - Delete Catalog Variant
* [getCatalogCategories](docs/sdks/catalogs/README.md#getcatalogcategories) - Get Catalog Categories
* [createCatalogCategory](docs/sdks/catalogs/README.md#createcatalogcategory) - Create Catalog Category
* [getCatalogCategory](docs/sdks/catalogs/README.md#getcatalogcategory) - Get Catalog Category
* [updateCatalogCategory](docs/sdks/catalogs/README.md#updatecatalogcategory) - Update Catalog Category
* [deleteCatalogCategory](docs/sdks/catalogs/README.md#deletecatalogcategory) - Delete Catalog Category
* [getBulkCreateCatalogItemsJobs](docs/sdks/catalogs/README.md#getbulkcreatecatalogitemsjobs) - Get Bulk Create Catalog Items Jobs
* [bulkCreateCatalogItems](docs/sdks/catalogs/README.md#bulkcreatecatalogitems) - Bulk Create Catalog Items
* [getBulkCreateCatalogItemsJob](docs/sdks/catalogs/README.md#getbulkcreatecatalogitemsjob) - Get Bulk Create Catalog Items Job
* [getBulkUpdateCatalogItemsJobs](docs/sdks/catalogs/README.md#getbulkupdatecatalogitemsjobs) - Get Bulk Update Catalog Items Jobs
* [bulkUpdateCatalogItems](docs/sdks/catalogs/README.md#bulkupdatecatalogitems) - Bulk Update Catalog Items
* [getBulkUpdateCatalogItemsJob](docs/sdks/catalogs/README.md#getbulkupdatecatalogitemsjob) - Get Bulk Update Catalog Items Job
* [getBulkDeleteCatalogItemsJobs](docs/sdks/catalogs/README.md#getbulkdeletecatalogitemsjobs) - Get Bulk Delete Catalog Items Jobs
* [bulkDeleteCatalogItems](docs/sdks/catalogs/README.md#bulkdeletecatalogitems) - Bulk Delete Catalog Items
* [getBulkDeleteCatalogItemsJob](docs/sdks/catalogs/README.md#getbulkdeletecatalogitemsjob) - Get Bulk Delete Catalog Items Job
* [getCreateVariantsJobs](docs/sdks/catalogs/README.md#getcreatevariantsjobs) - Get Create Variants Jobs
* [bulkCreateCatalogVariants](docs/sdks/catalogs/README.md#bulkcreatecatalogvariants) - Bulk Create Catalog Variants
* [getCreateVariantsJob](docs/sdks/catalogs/README.md#getcreatevariantsjob) - Get Create Variants Job
* [getUpdateVariantsJobs](docs/sdks/catalogs/README.md#getupdatevariantsjobs) - Get Update Variants Jobs
* [bulkUpdateCatalogVariants](docs/sdks/catalogs/README.md#bulkupdatecatalogvariants) - Bulk Update Catalog Variants
* [getUpdateVariantsJob](docs/sdks/catalogs/README.md#getupdatevariantsjob) - Get Update Variants Job
* [getDeleteVariantsJobs](docs/sdks/catalogs/README.md#getdeletevariantsjobs) - Get Delete Variants Jobs
* [bulkDeleteCatalogVariants](docs/sdks/catalogs/README.md#bulkdeletecatalogvariants) - Bulk Delete Catalog Variants
* [getDeleteVariantsJob](docs/sdks/catalogs/README.md#getdeletevariantsjob) - Get Delete Variants Job
* [getCreateCategoriesJobs](docs/sdks/catalogs/README.md#getcreatecategoriesjobs) - Get Create Categories Jobs
* [bulkCreateCatalogCategories](docs/sdks/catalogs/README.md#bulkcreatecatalogcategories) - Bulk Create Catalog Categories
* [getCreateCategoriesJob](docs/sdks/catalogs/README.md#getcreatecategoriesjob) - Get Create Categories Job
* [getUpdateCategoriesJobs](docs/sdks/catalogs/README.md#getupdatecategoriesjobs) - Get Update Categories Jobs
* [bulkUpdateCatalogCategories](docs/sdks/catalogs/README.md#bulkupdatecatalogcategories) - Bulk Update Catalog Categories
* [getUpdateCategoriesJob](docs/sdks/catalogs/README.md#getupdatecategoriesjob) - Get Update Categories Job
* [getDeleteCategoriesJobs](docs/sdks/catalogs/README.md#getdeletecategoriesjobs) - Get Delete Categories Jobs
* [bulkDeleteCatalogCategories](docs/sdks/catalogs/README.md#bulkdeletecatalogcategories) - Bulk Delete Catalog Categories
* [getDeleteCategoriesJob](docs/sdks/catalogs/README.md#getdeletecategoriesjob) - Get Delete Categories Job
* [createBackInStockSubscription](docs/sdks/catalogs/README.md#createbackinstocksubscription) - Create Back In Stock Subscription
* [getItemsForCatalogCategory](docs/sdks/catalogs/README.md#getitemsforcatalogcategory) - Get Items for Catalog Category
* [getVariantsForCatalogItem](docs/sdks/catalogs/README.md#getvariantsforcatalogitem) - Get Variants for Catalog Item
* [getCategoriesForCatalogItem](docs/sdks/catalogs/README.md#getcategoriesforcatalogitem) - Get Categories for Catalog Item
* [getItemIdsForCatalogCategory](docs/sdks/catalogs/README.md#getitemidsforcatalogcategory) - Get Item IDs for Catalog Category
* [addItemsToCatalogCategory](docs/sdks/catalogs/README.md#additemstocatalogcategory) - Add Items to Catalog Category
* [updateItemsForCatalogCategory](docs/sdks/catalogs/README.md#updateitemsforcatalogcategory) - Update Items for Catalog Category
* [removeItemsFromCatalogCategory](docs/sdks/catalogs/README.md#removeitemsfromcatalogcategory) - Remove Items from Catalog Category
* [getCategoryIdsForCatalogItem](docs/sdks/catalogs/README.md#getcategoryidsforcatalogitem) - Get Category IDs for Catalog Item
* [addCategoryToCatalogItem](docs/sdks/catalogs/README.md#addcategorytocatalogitem) - Add Category to Catalog Item
* [updateCategoriesForCatalogItem](docs/sdks/catalogs/README.md#updatecategoriesforcatalogitem) - Update Categories for Catalog Item
* [removeCategoriesFromCatalogItem](docs/sdks/catalogs/README.md#removecategoriesfromcatalogitem) - Remove Categories from Catalog Item

### [client()](docs/sdks/client/README.md)

* [createClientSubscription](docs/sdks/client/README.md#createclientsubscription) - Create Client Subscription
* [createClientPushToken](docs/sdks/client/README.md#createclientpushtoken) - Create or Update Client Push Token
* [unregisterClientPushToken](docs/sdks/client/README.md#unregisterclientpushtoken) - Unregister Client Push Token
* [createClientEvent](docs/sdks/client/README.md#createclientevent) - Create Client Event
* [createClientProfile](docs/sdks/client/README.md#createclientprofile) - Create or Update Client Profile
* [bulkCreateClientEvents](docs/sdks/client/README.md#bulkcreateclientevents) - Bulk Create Client Events
* [createClientBackInStockSubscription](docs/sdks/client/README.md#createclientbackinstocksubscription) - Create Client Back In Stock Subscription

### [coupons()](docs/sdks/coupons/README.md)

* [getCoupons](docs/sdks/coupons/README.md#getcoupons) - Get Coupons
* [createCoupon](docs/sdks/coupons/README.md#createcoupon) - Create Coupon
* [getCoupon](docs/sdks/coupons/README.md#getcoupon) - Get Coupon
* [updateCoupon](docs/sdks/coupons/README.md#updatecoupon) - Update Coupon
* [deleteCoupon](docs/sdks/coupons/README.md#deletecoupon) - Delete Coupon
* [getCouponCodes](docs/sdks/coupons/README.md#getcouponcodes) - Get Coupon Codes
* [createCouponCode](docs/sdks/coupons/README.md#createcouponcode) - Create Coupon Code
* [getCouponCode](docs/sdks/coupons/README.md#getcouponcode) - Get Coupon Code
* [updateCouponCode](docs/sdks/coupons/README.md#updatecouponcode) - Update Coupon Code
* [deleteCouponCode](docs/sdks/coupons/README.md#deletecouponcode) - Delete Coupon Code
* [getBulkCreateCouponCodeJobs](docs/sdks/coupons/README.md#getbulkcreatecouponcodejobs) - Get Bulk Create Coupon Code Jobs
* [bulkCreateCouponCodes](docs/sdks/coupons/README.md#bulkcreatecouponcodes) - Bulk Create Coupon Codes
* [getBulkCreateCouponCodesJob](docs/sdks/coupons/README.md#getbulkcreatecouponcodesjob) - Get Bulk Create Coupon Codes Job
* [getCouponForCouponCode](docs/sdks/coupons/README.md#getcouponforcouponcode) - Get Coupon For Coupon Code
* [getCouponIdForCouponCode](docs/sdks/coupons/README.md#getcouponidforcouponcode) - Get Coupon ID for Coupon Code
* [getCouponCodesForCoupon](docs/sdks/coupons/README.md#getcouponcodesforcoupon) - Get Coupon Codes For Coupon
* [getCodeIdsForCoupon](docs/sdks/coupons/README.md#getcodeidsforcoupon) - Get Code IDs for Coupon

### [dataPrivacy()](docs/sdks/dataprivacy/README.md)

* [requestProfileDeletion](docs/sdks/dataprivacy/README.md#requestprofiledeletion) - Request Profile Deletion

### [events()](docs/sdks/events/README.md)

* [getEvents](docs/sdks/events/README.md#getevents) - Get Events
* [createEvent](docs/sdks/events/README.md#createevent) - Create Event
* [getEvent](docs/sdks/events/README.md#getevent) - Get Event
* [bulkCreateEvents](docs/sdks/events/README.md#bulkcreateevents) - Bulk Create Events
* [getMetricIdForEvent](docs/sdks/events/README.md#getmetricidforevent) - Get Metric ID for Event
* [getEventMetric](docs/sdks/events/README.md#geteventmetric) - Get Event Metric
* [getProfileIdForEvent](docs/sdks/events/README.md#getprofileidforevent) - Get Profile ID for Event
* [getEventProfile](docs/sdks/events/README.md#geteventprofile) - Get Event Profile

### [flows()](docs/sdks/flows/README.md)

* [getFlows](docs/sdks/flows/README.md#getflows) - Get Flows
* [getFlow](docs/sdks/flows/README.md#getflow) - Get Flow
* [updateFlow](docs/sdks/flows/README.md#updateflow) - Update Flow Status
* [deleteFlow](docs/sdks/flows/README.md#deleteflow) - Delete Flow
* [getFlowAction](docs/sdks/flows/README.md#getflowaction) - Get Flow Action
* [getFlowMessage](docs/sdks/flows/README.md#getflowmessage) - Get Flow Message
* [getActionsForFlow](docs/sdks/flows/README.md#getactionsforflow) - Get Actions for Flow
* [getActionIdsForFlow](docs/sdks/flows/README.md#getactionidsforflow) - Get Action IDs for Flow
* [getTagIdsForFlow](docs/sdks/flows/README.md#gettagidsforflow) - Get Tag IDs for Flow
* [getFlowTags](docs/sdks/flows/README.md#getflowtags) - Get Flow Tags
* [getFlowActionFlow](docs/sdks/flows/README.md#getflowactionflow) - Get Flow For Flow Action
* [getFlowIdForFlowAction](docs/sdks/flows/README.md#getflowidforflowaction) - Get Flow ID for Flow Action
* [getMessagesForFlowAction](docs/sdks/flows/README.md#getmessagesforflowaction) - Get Messages for Flow Action
* [getMessageIdsForFlowAction](docs/sdks/flows/README.md#getmessageidsforflowaction) - Get Message IDs for Flow Action
* [getFlowMessageAction](docs/sdks/flows/README.md#getflowmessageaction) - Get Flow Action For Message
* [getActionIdForFlowMessage](docs/sdks/flows/README.md#getactionidforflowmessage) - Get Action ID for Flow Message
* [getTemplateIdForFlowMessage](docs/sdks/flows/README.md#gettemplateidforflowmessage) - Get Template ID for Flow Message
* [getTemplateForFlowMessage](docs/sdks/flows/README.md#gettemplateforflowmessage) - Get Template for Flow Message

### [forms()](docs/sdks/forms/README.md)

* [getForms](docs/sdks/forms/README.md#getforms) - Get Forms
* [getForm](docs/sdks/forms/README.md#getform) - Get Form
* [getFormVersion](docs/sdks/forms/README.md#getformversion) - Get Form Version
* [getVersionsForForm](docs/sdks/forms/README.md#getversionsforform) - Get Versions for Form
* [getVersionIdsForForm](docs/sdks/forms/README.md#getversionidsforform) - Get Version IDs for Form
* [getFormIdForFormVersion](docs/sdks/forms/README.md#getformidforformversion) - Get Form ID for Form Version
* [getFormForFormVersion](docs/sdks/forms/README.md#getformforformversion) - Get Form for Form Version

### [images()](docs/sdks/images/README.md)

* [getImages](docs/sdks/images/README.md#getimages) - Get Images
* [uploadImageFromUrl](docs/sdks/images/README.md#uploadimagefromurl) - Upload Image From URL
* [getImage](docs/sdks/images/README.md#getimage) - Get Image
* [updateImage](docs/sdks/images/README.md#updateimage) - Update Image
* [uploadImageFromFile](docs/sdks/images/README.md#uploadimagefromfile) - Upload Image From File


### [lists()](docs/sdks/lists/README.md)

* [getLists](docs/sdks/lists/README.md#getlists) - Get Lists
* [createList](docs/sdks/lists/README.md#createlist) - Create List
* [getList](docs/sdks/lists/README.md#getlist) - Get List
* [updateList](docs/sdks/lists/README.md#updatelist) - Update List
* [deleteList](docs/sdks/lists/README.md#deletelist) - Delete List
* [getTagIdsForList](docs/sdks/lists/README.md#gettagidsforlist) - Get Tag IDs for List
* [getListTags](docs/sdks/lists/README.md#getlisttags) - Get List Tags
* [getProfileIdsForList](docs/sdks/lists/README.md#getprofileidsforlist) - Get Profile IDs for List
* [createListRelationships](docs/sdks/lists/README.md#createlistrelationships) - Add Profile To List
* [deleteListRelationships](docs/sdks/lists/README.md#deletelistrelationships) - Remove Profile From List
* [getListProfiles](docs/sdks/lists/README.md#getlistprofiles) - Get List Profiles
* [getListRelationshipsFlowTriggers](docs/sdks/lists/README.md#getlistrelationshipsflowtriggers) - Get List Relationships Flow Triggers
* [getListFlowTriggers](docs/sdks/lists/README.md#getlistflowtriggers) - Get List Flow Triggers

### [metrics()](docs/sdks/metrics/README.md)

* [getMetrics](docs/sdks/metrics/README.md#getmetrics) - Get Metrics
* [getMetric](docs/sdks/metrics/README.md#getmetric) - Get Metric
* [getMetricProperty](docs/sdks/metrics/README.md#getmetricproperty) - Get Metric Property
* [queryMetricAggregates](docs/sdks/metrics/README.md#querymetricaggregates) - Query Metric Aggregates
* [getMetricRelationshipsFlowTriggers](docs/sdks/metrics/README.md#getmetricrelationshipsflowtriggers) - Get Metric Relationships Flow Triggers
* [getMetricFlowTriggers](docs/sdks/metrics/README.md#getmetricflowtriggers) - Get Metric Flow Triggers
* [getMetricIdForMetricProperty](docs/sdks/metrics/README.md#getmetricidformetricproperty) - Get Metric ID for Metric Property
* [getPropertiesForMetric](docs/sdks/metrics/README.md#getpropertiesformetric) - Get Properties for Metric
* [getPropertyIdsForMetric](docs/sdks/metrics/README.md#getpropertyidsformetric) - Get Property IDs for Metric
* [getMetricForMetricProperty](docs/sdks/metrics/README.md#getmetricformetricproperty) - Get Metric for Metric Property

### [profiles()](docs/sdks/profiles/README.md)

* [getProfiles](docs/sdks/profiles/README.md#getprofiles) - Get Profiles
* [createProfile](docs/sdks/profiles/README.md#createprofile) - Create Profile
* [getProfile](docs/sdks/profiles/README.md#getprofile) - Get Profile
* [updateProfile](docs/sdks/profiles/README.md#updateprofile) - Update Profile
* [getBulkImportProfilesJobs](docs/sdks/profiles/README.md#getbulkimportprofilesjobs) - Get Bulk Import Profiles Jobs
* [spawnBulkProfileImportJob](docs/sdks/profiles/README.md#spawnbulkprofileimportjob) - Spawn Bulk Profile Import Job
* [getBulkImportProfilesJob](docs/sdks/profiles/README.md#getbulkimportprofilesjob) - Get Bulk Import Profiles Job
* [getBulkSuppressProfilesJobs](docs/sdks/profiles/README.md#getbulksuppressprofilesjobs) - Get Bulk Suppress Profiles Jobs
* [bulkSuppressProfiles](docs/sdks/profiles/README.md#bulksuppressprofiles) - Bulk Suppress Profiles
* [getBulkSuppressProfilesJob](docs/sdks/profiles/README.md#getbulksuppressprofilesjob) - Get Bulk Suppress Profiles Job
* [getBulkUnsuppressProfilesJobs](docs/sdks/profiles/README.md#getbulkunsuppressprofilesjobs) - Get Bulk Unsuppress Profiles Jobs
* [bulkUnsuppressProfiles](docs/sdks/profiles/README.md#bulkunsuppressprofiles) - Bulk Unsuppress Profiles
* [getBulkUnsuppressProfilesJob](docs/sdks/profiles/README.md#getbulkunsuppressprofilesjob) - Get Bulk Unsuppress Profiles Job
* [createOrUpdateProfile](docs/sdks/profiles/README.md#createorupdateprofile) - Create or Update Profile
* [mergeProfiles](docs/sdks/profiles/README.md#mergeprofiles) - Merge Profiles
* [bulkSubscribeProfiles](docs/sdks/profiles/README.md#bulksubscribeprofiles) - Bulk Subscribe Profiles
* [bulkUnsubscribeProfiles](docs/sdks/profiles/README.md#bulkunsubscribeprofiles) - Bulk Unsubscribe Profiles
* [createPushToken](docs/sdks/profiles/README.md#createpushtoken) - Create or Update Push Token
* [getListsForProfile](docs/sdks/profiles/README.md#getlistsforprofile) - Get Lists for Profile
* [getListIdsForProfile](docs/sdks/profiles/README.md#getlistidsforprofile) - Get List IDs for Profile
* [getSegmentsForProfile](docs/sdks/profiles/README.md#getsegmentsforprofile) - Get Segments for Profile
* [getSegmentIdsForProfile](docs/sdks/profiles/README.md#getsegmentidsforprofile) - Get Segment IDs for Profile
* [getListForBulkImportProfilesJob](docs/sdks/profiles/README.md#getlistforbulkimportprofilesjob) - Get List for Bulk Import Profiles Job
* [getListIdsForBulkImportProfilesJob](docs/sdks/profiles/README.md#getlistidsforbulkimportprofilesjob) - Get List IDs for Bulk Import Profiles Job
* [getProfilesForBulkImportProfilesJob](docs/sdks/profiles/README.md#getprofilesforbulkimportprofilesjob) - Get Profiles for Bulk Import Profiles Job
* [getProfileIdsForBulkImportProfilesJob](docs/sdks/profiles/README.md#getprofileidsforbulkimportprofilesjob) - Get Profile IDs for Bulk Import Profiles Job
* [getErrorsForBulkImportProfilesJob](docs/sdks/profiles/README.md#geterrorsforbulkimportprofilesjob) - Get Errors for Bulk Import Profiles Job

### [reporting()](docs/sdks/reporting/README.md)

* [queryCampaignValues](docs/sdks/reporting/README.md#querycampaignvalues) - Query Campaign Values
* [queryFlowValues](docs/sdks/reporting/README.md#queryflowvalues) - Query Flow Values
* [queryFlowSeries](docs/sdks/reporting/README.md#queryflowseries) - Query Flow Series
* [queryFormValues](docs/sdks/reporting/README.md#queryformvalues) - Query Form Values
* [queryFormSeries](docs/sdks/reporting/README.md#queryformseries) - Query Form Series
* [querySegmentValues](docs/sdks/reporting/README.md#querysegmentvalues) - Query Segment Values
* [querySegmentSeries](docs/sdks/reporting/README.md#querysegmentseries) - Query Segment Series

### [reviews()](docs/sdks/reviews/README.md)

* [getReviews](docs/sdks/reviews/README.md#getreviews) - Get Reviews
* [getReview](docs/sdks/reviews/README.md#getreview) - Get Review

### [segments()](docs/sdks/segments/README.md)

* [getSegments](docs/sdks/segments/README.md#getsegments) - Get Segments
* [createSegment](docs/sdks/segments/README.md#createsegment) - Create Segment
* [getSegment](docs/sdks/segments/README.md#getsegment) - Get Segment
* [updateSegment](docs/sdks/segments/README.md#updatesegment) - Update Segment
* [deleteSegment](docs/sdks/segments/README.md#deletesegment) - Delete Segment
* [getTagIdsForSegment](docs/sdks/segments/README.md#gettagidsforsegment) - Get Tag IDs for Segment
* [getTagsForSegment](docs/sdks/segments/README.md#gettagsforsegment) - Get Tags for Segment
* [getProfileIdsForSegment](docs/sdks/segments/README.md#getprofileidsforsegment) - Get Profile IDs for Segment
* [getProfilesForSegment](docs/sdks/segments/README.md#getprofilesforsegment) - Get Profiles for Segment
* [getSegmentRelationshipsFlowTriggers](docs/sdks/segments/README.md#getsegmentrelationshipsflowtriggers) - Get Segment Relationships Flow Triggers
* [getSegmentFlowTriggers](docs/sdks/segments/README.md#getsegmentflowtriggers) - Get Segment Flow Triggers

### [tags()](docs/sdks/tags/README.md)

* [getTags](docs/sdks/tags/README.md#gettags) - Get Tags
* [createTag](docs/sdks/tags/README.md#createtag) - Create Tag
* [getTag](docs/sdks/tags/README.md#gettag) - Get Tag
* [updateTag](docs/sdks/tags/README.md#updatetag) - Update Tag
* [deleteTag](docs/sdks/tags/README.md#deletetag) - Delete Tag
* [getTagGroups](docs/sdks/tags/README.md#gettaggroups) - Get Tag Groups
* [createTagGroup](docs/sdks/tags/README.md#createtaggroup) - Create Tag Group
* [getTagGroup](docs/sdks/tags/README.md#gettaggroup) - Get Tag Group
* [updateTagGroup](docs/sdks/tags/README.md#updatetaggroup) - Update Tag Group
* [deleteTagGroup](docs/sdks/tags/README.md#deletetaggroup) - Delete Tag Group
* [getFlowIdsForTag](docs/sdks/tags/README.md#getflowidsfortag) - Get Flow IDs for Tag
* [tagFlows](docs/sdks/tags/README.md#tagflows) - Tag Flows
* [removeTagFromFlows](docs/sdks/tags/README.md#removetagfromflows) - Remove Tag from Flows
* [getCampaignIdsForTag](docs/sdks/tags/README.md#getcampaignidsfortag) - Get Campaign IDs for Tag
* [tagCampaigns](docs/sdks/tags/README.md#tagcampaigns) - Tag Campaigns
* [removeTagFromCampaigns](docs/sdks/tags/README.md#removetagfromcampaigns) - Remove Tag from Campaigns
* [getListIdsForTag](docs/sdks/tags/README.md#getlistidsfortag) - Get List IDs for Tag
* [tagLists](docs/sdks/tags/README.md#taglists) - Tag Lists
* [removeTagFromLists](docs/sdks/tags/README.md#removetagfromlists) - Remove Tag from Lists
* [getSegmentIdsForTag](docs/sdks/tags/README.md#getsegmentidsfortag) - Get Segment IDs for Tag
* [tagSegments](docs/sdks/tags/README.md#tagsegments) - Tag Segments
* [removeTagFromSegments](docs/sdks/tags/README.md#removetagfromsegments) - Remove Tag from Segments
* [getTagGroupIdForTag](docs/sdks/tags/README.md#gettaggroupidfortag) - Get Tag Group ID for Tag
* [getTagIdsForTagGroup](docs/sdks/tags/README.md#gettagidsfortaggroup) - Get Tag IDs for Tag Group
* [getTagGroupForTag](docs/sdks/tags/README.md#gettaggroupfortag) - Get Tag Group for Tag
* [getTagsForTagGroup](docs/sdks/tags/README.md#gettagsfortaggroup) - Get Tags for Tag Group

### [templates()](docs/sdks/templates/README.md)

* [getTemplates](docs/sdks/templates/README.md#gettemplates) - Get Templates
* [createTemplate](docs/sdks/templates/README.md#createtemplate) - Create Template
* [getTemplate](docs/sdks/templates/README.md#gettemplate) - Get Template
* [updateTemplate](docs/sdks/templates/README.md#updatetemplate) - Update Template
* [deleteTemplate](docs/sdks/templates/README.md#deletetemplate) - Delete Template
* [getAllUniversalContent](docs/sdks/templates/README.md#getalluniversalcontent) - Get All Universal Content
* [createUniversalContent](docs/sdks/templates/README.md#createuniversalcontent) - Create Universal Content
* [getUniversalContent](docs/sdks/templates/README.md#getuniversalcontent) - Get Universal Content
* [updateUniversalContent](docs/sdks/templates/README.md#updateuniversalcontent) - Update Universal Content
* [deleteUniversalContent](docs/sdks/templates/README.md#deleteuniversalcontent) - Delete Universal Content
* [renderTemplate](docs/sdks/templates/README.md#rendertemplate) - Render Template
* [cloneTemplate](docs/sdks/templates/README.md#clonetemplate) - Clone Template

### [trackingSettings()](docs/sdks/trackingsettings/README.md)

* [getTrackingSettings](docs/sdks/trackingsettings/README.md#gettrackingsettings) - Get Tracking Settings
* [getTrackingSetting](docs/sdks/trackingsettings/README.md#gettrackingsetting) - Get Tracking Setting
* [updateTrackingSetting](docs/sdks/trackingsettings/README.md#updatetrackingsetting) - Update Tracking Setting

### [webhooks()](docs/sdks/webhooks/README.md)

* [getWebhooks](docs/sdks/webhooks/README.md#getwebhooks) - Get Webhooks
* [createWebhook](docs/sdks/webhooks/README.md#createwebhook) - Create Webhook
* [getWebhook](docs/sdks/webhooks/README.md#getwebhook) - Get Webhook
* [updateWebhook](docs/sdks/webhooks/README.md#updatewebhook) - Update Webhook
* [deleteWebhook](docs/sdks/webhooks/README.md#deletewebhook) - Delete Webhook
* [getWebhookTopics](docs/sdks/webhooks/README.md#getwebhooktopics) - Get Webhook Topics
* [getWebhookTopic](docs/sdks/webhooks/README.md#getwebhooktopic) - Get Webhook Topic

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.

By default, an API error will throw a `models/errors/APIException` exception. When custom error responses are specified for an operation, the SDK may also throw their associated exception. You can refer to respective *Errors* tables in SDK docs for more details on possible exception types for each operation. For example, the `getAccounts` method throws the following exceptions:

| Error Type                | Status Code | Content Type             |
| ------------------------- | ----------- | ------------------------ |
| models/errors/ClientError | 4XX         | application/vnd.api+json |
| models/errors/ServerError | 5XX         | application/vnd.api+json |

### Example

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.FieldsAccount;
import com.commercesystems.klaviyo_java.models.operations.GetAccountsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetAccountsResponse res = sdk.accounts().getAccounts()
                .fieldsAccount(List.of(
                    FieldsAccount.CONTACT_INFORMATION_ORGANIZATION_NAME))
                .revision("2024-10-15")
                .call();

        if (res.getAccountResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Override Server URL Per-Client

The default server can also be overridden globally using the `.serverURL(String serverUrl)` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.FieldsAccount;
import com.commercesystems.klaviyo_java.models.operations.GetAccountsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .serverURL("https://a.klaviyo.com")
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetAccountsResponse res = sdk.accounts().getAccounts()
                .fieldsAccount(List.of(
                    FieldsAccount.CONTACT_INFORMATION_ORGANIZATION_NAME))
                .revision("2024-10-15")
                .call();

        if (res.getAccountResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Server Selection [server] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name            | Type   | Scheme  |
| --------------- | ------ | ------- |
| `klaviyoAPIKey` | apiKey | API key |

To authenticate with the API the `klaviyoAPIKey` parameter must be set when initializing the SDK client instance. For example:
```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.FieldsAccount;
import com.commercesystems.klaviyo_java.models.operations.GetAccountsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetAccountsResponse res = sdk.accounts().getAccounts()
                .fieldsAccount(List.of(
                    FieldsAccount.CONTACT_INFORMATION_ORGANIZATION_NAME))
                .revision("2024-10-15")
                .call();

        if (res.getAccountResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Authentication [security] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. Any manual changes added to internal files will be overwritten on the next generation. 
We look forward to hearing your feedback. Feel free to open a PR or an issue with a proof of concept and we'll do our best to include it in a future release. 

### SDK Created by [Speakeasy](https://www.speakeasy.com/?utm_source=openapi&utm_campaign=java)
