# Profiles
(*profiles()*)

## Overview

profiles

### Available Operations

* [getProfiles](#getprofiles) - Get Profiles
* [createProfile](#createprofile) - Create Profile
* [getProfile](#getprofile) - Get Profile
* [updateProfile](#updateprofile) - Update Profile
* [getBulkImportProfilesJobs](#getbulkimportprofilesjobs) - Get Bulk Import Profiles Jobs
* [spawnBulkProfileImportJob](#spawnbulkprofileimportjob) - Spawn Bulk Profile Import Job
* [getBulkImportProfilesJob](#getbulkimportprofilesjob) - Get Bulk Import Profiles Job
* [getBulkSuppressProfilesJobs](#getbulksuppressprofilesjobs) - Get Bulk Suppress Profiles Jobs
* [bulkSuppressProfiles](#bulksuppressprofiles) - Bulk Suppress Profiles
* [getBulkSuppressProfilesJob](#getbulksuppressprofilesjob) - Get Bulk Suppress Profiles Job
* [getBulkUnsuppressProfilesJobs](#getbulkunsuppressprofilesjobs) - Get Bulk Unsuppress Profiles Jobs
* [bulkUnsuppressProfiles](#bulkunsuppressprofiles) - Bulk Unsuppress Profiles
* [getBulkUnsuppressProfilesJob](#getbulkunsuppressprofilesjob) - Get Bulk Unsuppress Profiles Job
* [createOrUpdateProfile](#createorupdateprofile) - Create or Update Profile
* [mergeProfiles](#mergeprofiles) - Merge Profiles
* [bulkSubscribeProfiles](#bulksubscribeprofiles) - Bulk Subscribe Profiles
* [bulkUnsubscribeProfiles](#bulkunsubscribeprofiles) - Bulk Unsubscribe Profiles
* [createPushToken](#createpushtoken) - Create or Update Push Token
* [getListsForProfile](#getlistsforprofile) - Get Lists for Profile
* [getListIdsForProfile](#getlistidsforprofile) - Get List IDs for Profile
* [getSegmentsForProfile](#getsegmentsforprofile) - Get Segments for Profile
* [getSegmentIdsForProfile](#getsegmentidsforprofile) - Get Segment IDs for Profile
* [getListForBulkImportProfilesJob](#getlistforbulkimportprofilesjob) - Get List for Bulk Import Profiles Job
* [getListIdsForBulkImportProfilesJob](#getlistidsforbulkimportprofilesjob) - Get List IDs for Bulk Import Profiles Job
* [getProfilesForBulkImportProfilesJob](#getprofilesforbulkimportprofilesjob) - Get Profiles for Bulk Import Profiles Job
* [getProfileIdsForBulkImportProfilesJob](#getprofileidsforbulkimportprofilesjob) - Get Profile IDs for Bulk Import Profiles Job
* [getErrorsForBulkImportProfilesJob](#geterrorsforbulkimportprofilesjob) - Get Errors for Bulk Import Profiles Job

## getProfiles

Get all profiles in an account.

Profiles can be sorted by the following fields in ascending and descending order: `id`, `created`, `updated`, `email`, `subscriptions.email.marketing.suppression.timestamp`, `subscriptions.email.marketing.list_suppressions.timestamp`<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`<br><br>Rate limits when using the `additional-fields[profile]=predictive_analytics` parameter in your API request:<br>Burst: `10/s`<br>Steady: `150/m`<br><br>To learn more about how the `additional-fields` parameter impacts rate limits, check out our [Rate limits, status codes, and errors](https://developers.klaviyo.com/en/v2024-10-15/docs/rate_limits_and_error_handling) guide.

**Scopes:**
`profiles:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetProfilesRequest;
import com.commercesystems.klaviyo_java.models.operations.GetProfilesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetProfilesRequest req = GetProfilesRequest.builder()
                .revision("2024-10-15")
                .build();

        GetProfilesResponse res = sdk.profiles().getProfiles()
                .request(req)
                .call();

        if (res.getProfileResponseCollectionCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetProfilesRequest](../../models/operations/GetProfilesRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetProfilesResponse](../../models/operations/GetProfilesResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## createProfile

Create a new profile.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`profiles:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.Latitude;
import com.commercesystems.klaviyo_java.models.components.Longitude;
import com.commercesystems.klaviyo_java.models.components.ProfileCreateQuery;
import com.commercesystems.klaviyo_java.models.components.ProfileCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.ProfileCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.ProfileCreateQueryResourceObjectProperties;
import com.commercesystems.klaviyo_java.models.components.ProfileEnum;
import com.commercesystems.klaviyo_java.models.components.ProfileLocation;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.CreateProfileQueryParamAdditionalFieldsProfile;
import com.commercesystems.klaviyo_java.models.operations.CreateProfileResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        CreateProfileResponse res = sdk.profiles().createProfile()
                .additionalFieldsProfile(List.of(
                    CreateProfileQueryParamAdditionalFieldsProfile.PREDICTIVE_ANALYTICS))
                .revision("2024-10-15")
                .profileCreateQuery(ProfileCreateQuery.builder()
                    .data(ProfileCreateQueryResourceObject.builder()
                        .type(ProfileEnum.PROFILE)
                        .attributes(ProfileCreateQueryResourceObjectAttributes.builder()
                            .email("sarah.mason@klaviyo-demo.com")
                            .phoneNumber("+15005550006")
                            .firstName("Sarah")
                            .lastName("Mason")
                            .organization("Example Corporation")
                            .locale("en-US")
                            .title("Regional Manager")
                            .image("https://images.pexels.com/photos/3760854/pexels-photo-3760854.jpeg")
                            .location(ProfileLocation.builder()
                                .address1("89 E 42nd St")
                                .address2("1st floor")
                                .city("New York")
                                .country("United States")
                                .latitude(Latitude.of("40.7128"))
                                .longitude(Longitude.of("74.0060"))
                                .region("NY")
                                .zip("10017")
                                .timezone("America/New_York")
                                .ip("127.0.0.1")
                                .build())
                            .properties(ProfileCreateQueryResourceObjectProperties.builder()
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postProfileResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `additionalFieldsProfile`                                                                                                          | List\<[CreateProfileQueryParamAdditionalFieldsProfile](../../models/operations/CreateProfileQueryParamAdditionalFieldsProfile.md)> | :heavy_minus_sign:                                                                                                                 | Request additional fields not included by default in the response. Supported values: 'subscriptions', 'predictive_analytics'       |
| `revision`                                                                                                                         | *String*                                                                                                                           | :heavy_check_mark:                                                                                                                 | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                |
| `profileCreateQuery`                                                                                                               | [ProfileCreateQuery](../../models/components/ProfileCreateQuery.md)                                                                | :heavy_check_mark:                                                                                                                 | N/A                                                                                                                                |

### Response

**[CreateProfileResponse](../../models/operations/CreateProfileResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getProfile

Get the profile with the given profile ID.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`<br><br>Rate limits when using the `include=list` parameter in your API request:<br>Burst: `1/s`<br>Steady: `15/m`<br><br>Rate limits when using the `include=segment` parameter in your API request:<br>Burst: `1/s`<br>Steady: `15/m`<br><br>To learn more about how the `include` parameter impacts rate limits, check out our [Rate limits, status codes, and errors](https://developers.klaviyo.com/en/v2024-10-15/docs/rate_limits_and_error_handling) guide.

**Scopes:**
`profiles:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetProfileRequest;
import com.commercesystems.klaviyo_java.models.operations.GetProfileResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetProfileRequest req = GetProfileRequest.builder()
                .id("<id>")
                .revision("2024-10-15")
                .build();

        GetProfileResponse res = sdk.profiles().getProfile()
                .request(req)
                .call();

        if (res.getProfileResponseCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetProfileRequest](../../models/operations/GetProfileRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetProfileResponse](../../models/operations/GetProfileResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## updateProfile

Update the profile with the given profile ID.

Note that setting a field to `null` will clear out the field, whereas not including a field in your request will leave it unchanged.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`profiles:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.Append;
import com.commercesystems.klaviyo_java.models.components.Latitude;
import com.commercesystems.klaviyo_java.models.components.Longitude;
import com.commercesystems.klaviyo_java.models.components.ProfileEnum;
import com.commercesystems.klaviyo_java.models.components.ProfileLocation;
import com.commercesystems.klaviyo_java.models.components.ProfileMeta;
import com.commercesystems.klaviyo_java.models.components.ProfileMetaPatchProperties;
import com.commercesystems.klaviyo_java.models.components.ProfilePartialUpdateQuery;
import com.commercesystems.klaviyo_java.models.components.ProfilePartialUpdateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.ProfilePartialUpdateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.ProfilePartialUpdateQueryResourceObjectProperties;
import com.commercesystems.klaviyo_java.models.components.Unappend;
import com.commercesystems.klaviyo_java.models.components.Unset;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.UpdateProfileQueryParamAdditionalFieldsProfile;
import com.commercesystems.klaviyo_java.models.operations.UpdateProfileResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        UpdateProfileResponse res = sdk.profiles().updateProfile()
                .id("01GDDKASAP8TKDDA2GRZDSVP4H")
                .additionalFieldsProfile(List.of(
                    UpdateProfileQueryParamAdditionalFieldsProfile.PREDICTIVE_ANALYTICS))
                .revision("2024-10-15")
                .profilePartialUpdateQuery(ProfilePartialUpdateQuery.builder()
                    .data(ProfilePartialUpdateQueryResourceObject.builder()
                        .type(ProfileEnum.PROFILE)
                        .id("01GDDKASAP8TKDDA2GRZDSVP4H")
                        .attributes(ProfilePartialUpdateQueryResourceObjectAttributes.builder()
                            .email("sarah.mason@klaviyo-demo.com")
                            .phoneNumber("+15005550006")
                            .firstName("Sarah")
                            .lastName("Mason")
                            .organization("Example Corporation")
                            .locale("en-US")
                            .title("Regional Manager")
                            .image("https://images.pexels.com/photos/3760854/pexels-photo-3760854.jpeg")
                            .location(ProfileLocation.builder()
                                .address1("89 E 42nd St")
                                .address2("1st floor")
                                .city("New York")
                                .country("United States")
                                .latitude(Latitude.of("40.7128"))
                                .longitude(Longitude.of("74.0060"))
                                .region("NY")
                                .zip("10017")
                                .timezone("America/New_York")
                                .ip("127.0.0.1")
                                .build())
                            .properties(ProfilePartialUpdateQueryResourceObjectProperties.builder()
                                .build())
                            .build())
                        .meta(ProfileMeta.builder()
                            .patchProperties(ProfileMetaPatchProperties.builder()
                                .append(Append.builder()
                                    .build())
                                .unappend(Unappend.builder()
                                    .build())
                                .unset(Unset.of("skus"))
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.patchProfileResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        | Example                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                               | *String*                                                                                                                           | :heavy_check_mark:                                                                                                                 | Primary key that uniquely identifies this profile. Generated by Klaviyo.                                                           | 01GDDKASAP8TKDDA2GRZDSVP4H                                                                                                         |
| `additionalFieldsProfile`                                                                                                          | List\<[UpdateProfileQueryParamAdditionalFieldsProfile](../../models/operations/UpdateProfileQueryParamAdditionalFieldsProfile.md)> | :heavy_minus_sign:                                                                                                                 | Request additional fields not included by default in the response. Supported values: 'subscriptions', 'predictive_analytics'       |                                                                                                                                    |
| `revision`                                                                                                                         | *String*                                                                                                                           | :heavy_check_mark:                                                                                                                 | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                |                                                                                                                                    |
| `profilePartialUpdateQuery`                                                                                                        | [ProfilePartialUpdateQuery](../../models/components/ProfilePartialUpdateQuery.md)                                                  | :heavy_check_mark:                                                                                                                 | N/A                                                                                                                                |                                                                                                                                    |

### Response

**[UpdateProfileResponse](../../models/operations/UpdateProfileResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getBulkImportProfilesJobs

Get all bulk profile import jobs.

Returns a maximum of 100 jobs per request.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`lists:read`
`profiles:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetBulkImportProfilesJobsRequest;
import com.commercesystems.klaviyo_java.models.operations.GetBulkImportProfilesJobsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetBulkImportProfilesJobsRequest req = GetBulkImportProfilesJobsRequest.builder()
                .revision("2024-10-15")
                .build();

        GetBulkImportProfilesJobsResponse res = sdk.profiles().getBulkImportProfilesJobs()
                .request(req)
                .call();

        if (res.getProfileImportJobResponseCollectionCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetBulkImportProfilesJobsRequest](../../models/operations/GetBulkImportProfilesJobsRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetBulkImportProfilesJobsResponse](../../models/operations/GetBulkImportProfilesJobsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## spawnBulkProfileImportJob

Create a bulk profile import job to create or update a batch of profiles.

Accepts up to 10,000 profiles per request. The maximum allowed payload size is 5MB.

To learn more, see our [Bulk Profile Import API guide](https://developers.klaviyo.com/en/docs/use_klaviyos_bulk_profile_import_api).<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`lists:write`
`profiles:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.Append;
import com.commercesystems.klaviyo_java.models.components.Latitude;
import com.commercesystems.klaviyo_java.models.components.ListEnum;
import com.commercesystems.klaviyo_java.models.components.Lists;
import com.commercesystems.klaviyo_java.models.components.Longitude;
import com.commercesystems.klaviyo_java.models.components.ProfileBulkImportJobEnum;
import com.commercesystems.klaviyo_java.models.components.ProfileEnum;
import com.commercesystems.klaviyo_java.models.components.ProfileImportJobCreateQuery;
import com.commercesystems.klaviyo_java.models.components.ProfileImportJobCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.ProfileImportJobCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.ProfileImportJobCreateQueryResourceObjectData;
import com.commercesystems.klaviyo_java.models.components.ProfileImportJobCreateQueryResourceObjectRelationships;
import com.commercesystems.klaviyo_java.models.components.ProfileLocation;
import com.commercesystems.klaviyo_java.models.components.ProfileMeta;
import com.commercesystems.klaviyo_java.models.components.ProfileMetaPatchProperties;
import com.commercesystems.klaviyo_java.models.components.ProfileUpsertQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.ProfileUpsertQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.ProfileUpsertQueryResourceObjectProperties;
import com.commercesystems.klaviyo_java.models.components.Profiles;
import com.commercesystems.klaviyo_java.models.components.Unappend;
import com.commercesystems.klaviyo_java.models.components.Unset;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.SpawnBulkProfileImportJobResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        SpawnBulkProfileImportJobResponse res = sdk.profiles().spawnBulkProfileImportJob()
                .revision("2024-10-15")
                .profileImportJobCreateQuery(ProfileImportJobCreateQuery.builder()
                    .data(ProfileImportJobCreateQueryResourceObject.builder()
                        .type(ProfileBulkImportJobEnum.PROFILE_BULK_IMPORT_JOB)
                        .attributes(ProfileImportJobCreateQueryResourceObjectAttributes.builder()
                            .profiles(Profiles.builder()
                                .data(List.of(
                                    ProfileUpsertQueryResourceObject.builder()
                                        .type(ProfileEnum.PROFILE)
                                        .attributes(ProfileUpsertQueryResourceObjectAttributes.builder()
                                            .email("sarah.mason@klaviyo-demo.com")
                                            .phoneNumber("+15005550006")
                                            .anonymousId("01GDDKASAP8TKDDA2GRZDSVP4H")
                                            .firstName("Sarah")
                                            .lastName("Mason")
                                            .organization("Example Corporation")
                                            .locale("en-US")
                                            .title("Regional Manager")
                                            .image("https://images.pexels.com/photos/3760854/pexels-photo-3760854.jpeg")
                                            .location(ProfileLocation.builder()
                                                .address1("89 E 42nd St")
                                                .address2("1st floor")
                                                .city("New York")
                                                .country("United States")
                                                .latitude(Latitude.of("40.7128"))
                                                .longitude(Longitude.of("74.0060"))
                                                .region("NY")
                                                .zip("10017")
                                                .timezone("America/New_York")
                                                .ip("127.0.0.1")
                                                .build())
                                            .properties(ProfileUpsertQueryResourceObjectProperties.builder()
                                                .build())
                                            .build())
                                        .meta(ProfileMeta.builder()
                                            .patchProperties(ProfileMetaPatchProperties.builder()
                                                .append(Append.builder()
                                                    .build())
                                                .unappend(Unappend.builder()
                                                    .build())
                                                .unset(Unset.of("skus"))
                                                .build())
                                            .build())
                                        .build()))
                                .build())
                            .build())
                        .relationships(ProfileImportJobCreateQueryResourceObjectRelationships.builder()
                            .lists(Lists.builder()
                                .data(List.of(
                                    ProfileImportJobCreateQueryResourceObjectData.builder()
                                        .type(ListEnum.LIST)
                                        .id("VRgFBd")
                                        .build()))
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postProfileImportJobResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `revision`                                                                            | *String*                                                                              | :heavy_check_mark:                                                                    | API endpoint revision (format: YYYY-MM-DD[.suffix])                                   |
| `profileImportJobCreateQuery`                                                         | [ProfileImportJobCreateQuery](../../models/components/ProfileImportJobCreateQuery.md) | :heavy_check_mark:                                                                    | N/A                                                                                   |

### Response

**[SpawnBulkProfileImportJobResponse](../../models/operations/SpawnBulkProfileImportJobResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getBulkImportProfilesJob

Get a bulk profile import job with the given job ID.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`lists:read`
`profiles:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetBulkImportProfilesJobRequest;
import com.commercesystems.klaviyo_java.models.operations.GetBulkImportProfilesJobResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetBulkImportProfilesJobRequest req = GetBulkImportProfilesJobRequest.builder()
                .jobId("01GSQPBF74KQ5YTDEPP41T1BZH")
                .revision("2024-10-15")
                .build();

        GetBulkImportProfilesJobResponse res = sdk.profiles().getBulkImportProfilesJob()
                .request(req)
                .call();

        if (res.getProfileImportJobResponseCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetBulkImportProfilesJobRequest](../../models/operations/GetBulkImportProfilesJobRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetBulkImportProfilesJobResponse](../../models/operations/GetBulkImportProfilesJobResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getBulkSuppressProfilesJobs

Get the status of all bulk profile suppression jobs.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`subscriptions:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetBulkSuppressProfilesJobsRequest;
import com.commercesystems.klaviyo_java.models.operations.GetBulkSuppressProfilesJobsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetBulkSuppressProfilesJobsRequest req = GetBulkSuppressProfilesJobsRequest.builder()
                .revision("2024-10-15")
                .build();

        GetBulkSuppressProfilesJobsResponse res = sdk.profiles().getBulkSuppressProfilesJobs()
                .request(req)
                .call();

        if (res.getBulkProfileSuppressionsCreateJobResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [GetBulkSuppressProfilesJobsRequest](../../models/operations/GetBulkSuppressProfilesJobsRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[GetBulkSuppressProfilesJobsResponse](../../models/operations/GetBulkSuppressProfilesJobsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## bulkSuppressProfiles

Manually suppress profiles by email address or specify a segment/list ID to suppress all current members of a segment/list.

Suppressed profiles cannot receive email marketing, independent of their consent status. To learn more, see our guides on [email suppressions](https://help.klaviyo.com/hc/en-us/articles/115005246108#what-is-a-suppressed-profile-1) and [collecting consent](https://developers.klaviyo.com/en/docs/collect_email_and_sms_consent_via_api).

Email address per request limit: 100<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`profiles:write`
`subscriptions:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.ListEnum;
import com.commercesystems.klaviyo_java.models.components.ProfileEnum;
import com.commercesystems.klaviyo_java.models.components.ProfileSuppressionBulkCreateJobEnum;
import com.commercesystems.klaviyo_java.models.components.ProfileSuppressionCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.ProfileSuppressionCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.Segment;
import com.commercesystems.klaviyo_java.models.components.SegmentEnum;
import com.commercesystems.klaviyo_java.models.components.SuppressionCreateJobCreateQuery;
import com.commercesystems.klaviyo_java.models.components.SuppressionCreateJobCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.SuppressionCreateJobCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.SuppressionCreateJobCreateQueryResourceObjectData;
import com.commercesystems.klaviyo_java.models.components.SuppressionCreateJobCreateQueryResourceObjectProfiles;
import com.commercesystems.klaviyo_java.models.components.SuppressionCreateJobCreateQueryResourceObjectRelationships;
import com.commercesystems.klaviyo_java.models.components.SuppressionCreateJobCreateQueryResourceObjectRelationshipsData;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.BulkSuppressProfilesResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        BulkSuppressProfilesResponse res = sdk.profiles().bulkSuppressProfiles()
                .revision("2024-10-15")
                .suppressionCreateJobCreateQuery(SuppressionCreateJobCreateQuery.builder()
                    .data(SuppressionCreateJobCreateQueryResourceObject.builder()
                        .type(ProfileSuppressionBulkCreateJobEnum.PROFILE_SUPPRESSION_BULK_CREATE_JOB)
                        .attributes(SuppressionCreateJobCreateQueryResourceObjectAttributes.builder()
                            .profiles(SuppressionCreateJobCreateQueryResourceObjectProfiles.builder()
                                .data(List.of(
                                    ProfileSuppressionCreateQueryResourceObject.builder()
                                        .type(ProfileEnum.PROFILE)
                                        .attributes(ProfileSuppressionCreateQueryResourceObjectAttributes.builder()
                                            .email("matt-kemp@klaviyo-demo.com")
                                            .build())
                                        .build()))
                                .build())
                            .build())
                        .relationships(SuppressionCreateJobCreateQueryResourceObjectRelationships.builder()
                            .list(com.commercesystems.klaviyo_java.models.components.List.builder()
                                .data(SuppressionCreateJobCreateQueryResourceObjectData.builder()
                                    .type(ListEnum.LIST)
                                    .id("Y6nRLr")
                                    .build())
                                .build())
                            .segment(Segment.builder()
                                .data(SuppressionCreateJobCreateQueryResourceObjectRelationshipsData.builder()
                                    .type(SegmentEnum.SEGMENT)
                                    .id("Y6nRLr")
                                    .build())
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postBulkProfileSuppressionsCreateJobResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                 | Type                                                                                                                                                                                      | Required                                                                                                                                                                                  | Description                                                                                                                                                                               |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `revision`                                                                                                                                                                                | *String*                                                                                                                                                                                  | :heavy_check_mark:                                                                                                                                                                        | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                                       |
| `suppressionCreateJobCreateQuery`                                                                                                                                                         | [SuppressionCreateJobCreateQuery](../../models/components/SuppressionCreateJobCreateQuery.md)                                                                                             | :heavy_check_mark:                                                                                                                                                                        | Suppresses one or more profiles from receiving marketing. Currently, supports email only. If a profile is not found with the given email, one will be created and immediately suppressed. |

### Response

**[BulkSuppressProfilesResponse](../../models/operations/BulkSuppressProfilesResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getBulkSuppressProfilesJob

Get the bulk suppress profiles job with the given job ID.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`subscriptions:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetBulkSuppressProfilesJobResponse;
import com.commercesystems.klaviyo_java.models.operations.QueryParamFieldsProfileSuppressionBulkCreateJob;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetBulkSuppressProfilesJobResponse res = sdk.profiles().getBulkSuppressProfilesJob()
                .jobId("01GSQPBF74KQ5YTDEPP41T1BZH")
                .fieldsProfileSuppressionBulkCreateJob(List.of(
                    QueryParamFieldsProfileSuppressionBulkCreateJob.STATUS))
                .revision("2024-10-15")
                .call();

        if (res.getBulkProfileSuppressionsCreateJobResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          | Example                                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `jobId`                                                                                                                              | *String*                                                                                                                             | :heavy_check_mark:                                                                                                                   | ID of the job to retrieve.                                                                                                           | 01GSQPBF74KQ5YTDEPP41T1BZH                                                                                                           |
| `fieldsProfileSuppressionBulkCreateJob`                                                                                              | List\<[QueryParamFieldsProfileSuppressionBulkCreateJob](../../models/operations/QueryParamFieldsProfileSuppressionBulkCreateJob.md)> | :heavy_minus_sign:                                                                                                                   | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets              |                                                                                                                                      |
| `revision`                                                                                                                           | *String*                                                                                                                             | :heavy_check_mark:                                                                                                                   | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                  |                                                                                                                                      |

### Response

**[GetBulkSuppressProfilesJobResponse](../../models/operations/GetBulkSuppressProfilesJobResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getBulkUnsuppressProfilesJobs

Get all bulk unsuppress profiles jobs.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`subscriptions:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetBulkUnsuppressProfilesJobsRequest;
import com.commercesystems.klaviyo_java.models.operations.GetBulkUnsuppressProfilesJobsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetBulkUnsuppressProfilesJobsRequest req = GetBulkUnsuppressProfilesJobsRequest.builder()
                .revision("2024-10-15")
                .build();

        GetBulkUnsuppressProfilesJobsResponse res = sdk.profiles().getBulkUnsuppressProfilesJobs()
                .request(req)
                .call();

        if (res.getBulkProfileSuppressionsRemoveJobResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [GetBulkUnsuppressProfilesJobsRequest](../../models/operations/GetBulkUnsuppressProfilesJobsRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[GetBulkUnsuppressProfilesJobsResponse](../../models/operations/GetBulkUnsuppressProfilesJobsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## bulkUnsuppressProfiles

Manually unsuppress profiles by email address or specify a segment/list ID to unsuppress all current members of a segment/list.

This only removes suppressions with reason USER_SUPPRESSED ; unsubscribed profiles and suppressed profiles with reason INVALID_EMAIL or HARD_BOUNCE remain unchanged. To learn more, see our guides on [email suppressions](https://help.klaviyo.com/hc/en-us/articles/115005246108#what-is-a-suppressed-profile-1) and [collecting consent](https://developers.klaviyo.com/en/docs/collect_email_and_sms_consent_via_api).

Email address per request limit: 100<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`subscriptions:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.ListEnum;
import com.commercesystems.klaviyo_java.models.components.ProfileEnum;
import com.commercesystems.klaviyo_java.models.components.ProfileSuppressionBulkDeleteJobEnum;
import com.commercesystems.klaviyo_java.models.components.ProfileSuppressionDeleteQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.ProfileSuppressionDeleteQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.SegmentEnum;
import com.commercesystems.klaviyo_java.models.components.SuppressionDeleteJobCreateQuery;
import com.commercesystems.klaviyo_java.models.components.SuppressionDeleteJobCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.SuppressionDeleteJobCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.SuppressionDeleteJobCreateQueryResourceObjectData;
import com.commercesystems.klaviyo_java.models.components.SuppressionDeleteJobCreateQueryResourceObjectList;
import com.commercesystems.klaviyo_java.models.components.SuppressionDeleteJobCreateQueryResourceObjectProfiles;
import com.commercesystems.klaviyo_java.models.components.SuppressionDeleteJobCreateQueryResourceObjectRelationships;
import com.commercesystems.klaviyo_java.models.components.SuppressionDeleteJobCreateQueryResourceObjectRelationshipsData;
import com.commercesystems.klaviyo_java.models.components.SuppressionDeleteJobCreateQueryResourceObjectSegment;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.BulkUnsuppressProfilesResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        BulkUnsuppressProfilesResponse res = sdk.profiles().bulkUnsuppressProfiles()
                .revision("2024-10-15")
                .suppressionDeleteJobCreateQuery(SuppressionDeleteJobCreateQuery.builder()
                    .data(SuppressionDeleteJobCreateQueryResourceObject.builder()
                        .type(ProfileSuppressionBulkDeleteJobEnum.PROFILE_SUPPRESSION_BULK_DELETE_JOB)
                        .attributes(SuppressionDeleteJobCreateQueryResourceObjectAttributes.builder()
                            .profiles(SuppressionDeleteJobCreateQueryResourceObjectProfiles.builder()
                                .data(List.of(
                                    ProfileSuppressionDeleteQueryResourceObject.builder()
                                        .type(ProfileEnum.PROFILE)
                                        .attributes(ProfileSuppressionDeleteQueryResourceObjectAttributes.builder()
                                            .email("matt-kemp@klaviyo-demo.com")
                                            .build())
                                        .build()))
                                .build())
                            .build())
                        .relationships(SuppressionDeleteJobCreateQueryResourceObjectRelationships.builder()
                            .list(SuppressionDeleteJobCreateQueryResourceObjectList.builder()
                                .data(SuppressionDeleteJobCreateQueryResourceObjectData.builder()
                                    .type(ListEnum.LIST)
                                    .id("Y6nRLr")
                                    .build())
                                .build())
                            .segment(SuppressionDeleteJobCreateQueryResourceObjectSegment.builder()
                                .data(SuppressionDeleteJobCreateQueryResourceObjectRelationshipsData.builder()
                                    .type(SegmentEnum.SEGMENT)
                                    .id("Y6nRLr")
                                    .build())
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postBulkProfileSuppressionsRemoveJobResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                            | Type                                                                                                                                                                 | Required                                                                                                                                                             | Description                                                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `revision`                                                                                                                                                           | *String*                                                                                                                                                             | :heavy_check_mark:                                                                                                                                                   | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                  |
| `suppressionDeleteJobCreateQuery`                                                                                                                                    | [SuppressionDeleteJobCreateQuery](../../models/components/SuppressionDeleteJobCreateQuery.md)                                                                        | :heavy_check_mark:                                                                                                                                                   | Unsuppresses one or more profiles from receiving marketing. Currently, supports email only. If a profile is not<br/>found with the given email, no action will be taken. |

### Response

**[BulkUnsuppressProfilesResponse](../../models/operations/BulkUnsuppressProfilesResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getBulkUnsuppressProfilesJob

Get the bulk unsuppress profiles job with the given job ID.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`subscriptions:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetBulkUnsuppressProfilesJobResponse;
import com.commercesystems.klaviyo_java.models.operations.QueryParamFieldsProfileSuppressionBulkDeleteJob;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetBulkUnsuppressProfilesJobResponse res = sdk.profiles().getBulkUnsuppressProfilesJob()
                .jobId("01GSQPBF74KQ5YTDEPP41T1BZH")
                .fieldsProfileSuppressionBulkDeleteJob(List.of(
                    QueryParamFieldsProfileSuppressionBulkDeleteJob.COMPLETED_COUNT))
                .revision("2024-10-15")
                .call();

        if (res.getBulkProfileSuppressionsRemoveJobResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          | Example                                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `jobId`                                                                                                                              | *String*                                                                                                                             | :heavy_check_mark:                                                                                                                   | ID of the job to retrieve.                                                                                                           | 01GSQPBF74KQ5YTDEPP41T1BZH                                                                                                           |
| `fieldsProfileSuppressionBulkDeleteJob`                                                                                              | List\<[QueryParamFieldsProfileSuppressionBulkDeleteJob](../../models/operations/QueryParamFieldsProfileSuppressionBulkDeleteJob.md)> | :heavy_minus_sign:                                                                                                                   | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets              |                                                                                                                                      |
| `revision`                                                                                                                           | *String*                                                                                                                             | :heavy_check_mark:                                                                                                                   | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                  |                                                                                                                                      |

### Response

**[GetBulkUnsuppressProfilesJobResponse](../../models/operations/GetBulkUnsuppressProfilesJobResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## createOrUpdateProfile

Given a set of profile attributes and optionally an ID, create or update a profile.

Returns 201 if a new profile was created, 200 if an existing profile was updated.

Note that setting a field to `null` will clear out the field, whereas not including a field in your request will leave it unchanged.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`profiles:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.Append;
import com.commercesystems.klaviyo_java.models.components.Latitude;
import com.commercesystems.klaviyo_java.models.components.Longitude;
import com.commercesystems.klaviyo_java.models.components.ProfileEnum;
import com.commercesystems.klaviyo_java.models.components.ProfileLocation;
import com.commercesystems.klaviyo_java.models.components.ProfileMeta;
import com.commercesystems.klaviyo_java.models.components.ProfileMetaPatchProperties;
import com.commercesystems.klaviyo_java.models.components.ProfileUpsertQuery;
import com.commercesystems.klaviyo_java.models.components.ProfileUpsertQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.ProfileUpsertQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.ProfileUpsertQueryResourceObjectProperties;
import com.commercesystems.klaviyo_java.models.components.Unappend;
import com.commercesystems.klaviyo_java.models.components.Unset;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.CreateOrUpdateProfileQueryParamAdditionalFieldsProfile;
import com.commercesystems.klaviyo_java.models.operations.CreateOrUpdateProfileResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        CreateOrUpdateProfileResponse res = sdk.profiles().createOrUpdateProfile()
                .additionalFieldsProfile(List.of(
                    CreateOrUpdateProfileQueryParamAdditionalFieldsProfile.SUBSCRIPTIONS))
                .revision("2024-10-15")
                .profileUpsertQuery(ProfileUpsertQuery.builder()
                    .data(ProfileUpsertQueryResourceObject.builder()
                        .type(ProfileEnum.PROFILE)
                        .attributes(ProfileUpsertQueryResourceObjectAttributes.builder()
                            .email("sarah.mason@klaviyo-demo.com")
                            .phoneNumber("+15005550006")
                            .anonymousId("01GDDKASAP8TKDDA2GRZDSVP4H")
                            .firstName("Sarah")
                            .lastName("Mason")
                            .organization("Example Corporation")
                            .locale("en-US")
                            .title("Regional Manager")
                            .image("https://images.pexels.com/photos/3760854/pexels-photo-3760854.jpeg")
                            .location(ProfileLocation.builder()
                                .address1("89 E 42nd St")
                                .address2("1st floor")
                                .city("New York")
                                .country("United States")
                                .latitude(Latitude.of("40.7128"))
                                .longitude(Longitude.of("74.0060"))
                                .region("NY")
                                .zip("10017")
                                .timezone("America/New_York")
                                .ip("127.0.0.1")
                                .build())
                            .properties(ProfileUpsertQueryResourceObjectProperties.builder()
                                .build())
                            .build())
                        .meta(ProfileMeta.builder()
                            .patchProperties(ProfileMetaPatchProperties.builder()
                                .append(Append.builder()
                                    .build())
                                .unappend(Unappend.builder()
                                    .build())
                                .unset(Unset.of("skus"))
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postProfileResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `additionalFieldsProfile`                                                                                                                          | List\<[CreateOrUpdateProfileQueryParamAdditionalFieldsProfile](../../models/operations/CreateOrUpdateProfileQueryParamAdditionalFieldsProfile.md)> | :heavy_minus_sign:                                                                                                                                 | Request additional fields not included by default in the response. Supported values: 'subscriptions', 'predictive_analytics'                       |
| `revision`                                                                                                                                         | *String*                                                                                                                                           | :heavy_check_mark:                                                                                                                                 | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                |
| `profileUpsertQuery`                                                                                                                               | [ProfileUpsertQuery](../../models/components/ProfileUpsertQuery.md)                                                                                | :heavy_check_mark:                                                                                                                                 | N/A                                                                                                                                                |

### Response

**[CreateOrUpdateProfileResponse](../../models/operations/CreateOrUpdateProfileResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## mergeProfiles

Merge a given related profile into a profile with the given profile ID.

The profile provided under `relationships` (the "source" profile) will be merged into the profile provided by the ID in the base data object (the "destination" profile).
This endpoint queues an asynchronous task which will merge data from the source profile into the destination profile, deleting the source profile in the process. This endpoint accepts only one source profile.

To learn more about how profile data is preserved or overwritten during a merge, please [visit our Help Center](https://help.klaviyo.com/hc/en-us/articles/115005073847#merge-2-profiles3).<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`profiles:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.ProfileEnum;
import com.commercesystems.klaviyo_java.models.components.ProfileMergeEnum;
import com.commercesystems.klaviyo_java.models.components.ProfileMergeQuery;
import com.commercesystems.klaviyo_java.models.components.ProfileMergeQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.ProfileMergeQueryResourceObjectData;
import com.commercesystems.klaviyo_java.models.components.ProfileMergeQueryResourceObjectProfiles;
import com.commercesystems.klaviyo_java.models.components.ProfileMergeQueryResourceObjectRelationships;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.MergeProfilesResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        MergeProfilesResponse res = sdk.profiles().mergeProfiles()
                .revision("2024-10-15")
                .profileMergeQuery(ProfileMergeQuery.builder()
                    .data(ProfileMergeQueryResourceObject.builder()
                        .type(ProfileMergeEnum.PROFILE_MERGE)
                        .id("01GDDKASAP8TKDDA2GRZDSVP4H")
                        .relationships(ProfileMergeQueryResourceObjectRelationships.builder()
                            .profiles(ProfileMergeQueryResourceObjectProfiles.builder()
                                .data(List.of(
                                    ProfileMergeQueryResourceObjectData.builder()
                                        .type(ProfileEnum.PROFILE)
                                        .id("01GDDKASAP8TKDDA2GRZDSVP4I")
                                        .build()))
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postProfileMergeResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `revision`                                                        | *String*                                                          | :heavy_check_mark:                                                | API endpoint revision (format: YYYY-MM-DD[.suffix])               |
| `profileMergeQuery`                                               | [ProfileMergeQuery](../../models/components/ProfileMergeQuery.md) | :heavy_check_mark:                                                | N/A                                                               |

### Response

**[MergeProfilesResponse](../../models/operations/MergeProfilesResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## bulkSubscribeProfiles

Subscribe one or more profiles to email marketing, SMS marketing, or both. If the provided list has double opt-in enabled, profiles will receive a message requiring their confirmation before subscribing. Otherwise, profiles will be immediately subscribed without receiving a confirmation message.
Learn more about [consent in this guide](https://developers.klaviyo.com/en/docs/collect_email_and_sms_consent_via_api).

If a list is not provided, the opt-in process used will be determined by the [account-level default opt-in setting](https://www.klaviyo.com/settings/account/api-keys).

To add someone to a list without changing their subscription status, use [Add Profile to List](https://developers.klaviyo.com/en/reference/create_list_relationships).

This API will remove any `UNSUBSCRIBE`, `SPAM_REPORT` or `USER_SUPPRESSED` suppressions from the provided profiles. Learn more about [suppressed profiles](https://help.klaviyo.com/hc/en-us/articles/115005246108-Understanding-suppressed-email-profiles#what-is-a-suppressed-profile-1).

Maximum number of profiles can be submitted for subscription: 1000

This endpoint now supports a `historical_import` flag. If this flag is set `true`, profiles being subscribed will bypass double opt-in emails and be subscribed immediately. They will also bypass any associated "Added to list" flows. This is useful for importing historical data where you have already collected consent. If `historical_import` is set to true, the `consented_at` field is required and must be in the past.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`lists:write`
`profiles:write`
`subscriptions:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.EmailSubscriptionParameters;
import com.commercesystems.klaviyo_java.models.components.ListEnum;
import com.commercesystems.klaviyo_java.models.components.ProfileEnum;
import com.commercesystems.klaviyo_java.models.components.ProfileSubscriptionBulkCreateJobEnum;
import com.commercesystems.klaviyo_java.models.components.ProfileSubscriptionCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.ProfileSubscriptionCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.SMSSubscriptionParameters;
import com.commercesystems.klaviyo_java.models.components.SubscriptionChannels;
import com.commercesystems.klaviyo_java.models.components.SubscriptionCreateJobCreateQuery;
import com.commercesystems.klaviyo_java.models.components.SubscriptionCreateJobCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.SubscriptionCreateJobCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.SubscriptionCreateJobCreateQueryResourceObjectData;
import com.commercesystems.klaviyo_java.models.components.SubscriptionCreateJobCreateQueryResourceObjectList;
import com.commercesystems.klaviyo_java.models.components.SubscriptionCreateJobCreateQueryResourceObjectProfiles;
import com.commercesystems.klaviyo_java.models.components.SubscriptionCreateJobCreateQueryResourceObjectRelationships;
import com.commercesystems.klaviyo_java.models.components.SubscriptionParameters;
import com.commercesystems.klaviyo_java.models.components.SubscriptionParametersConsent;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.BulkSubscribeProfilesResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        BulkSubscribeProfilesResponse res = sdk.profiles().bulkSubscribeProfiles()
                .revision("2024-10-15")
                .subscriptionCreateJobCreateQuery(SubscriptionCreateJobCreateQuery.builder()
                    .data(SubscriptionCreateJobCreateQueryResourceObject.builder()
                        .type(ProfileSubscriptionBulkCreateJobEnum.PROFILE_SUBSCRIPTION_BULK_CREATE_JOB)
                        .attributes(SubscriptionCreateJobCreateQueryResourceObjectAttributes.builder()
                            .profiles(SubscriptionCreateJobCreateQueryResourceObjectProfiles.builder()
                                .data(List.of(
                                    ProfileSubscriptionCreateQueryResourceObject.builder()
                                        .type(ProfileEnum.PROFILE)
                                        .attributes(ProfileSubscriptionCreateQueryResourceObjectAttributes.builder()
                                            .email("matt-kemp@klaviyo-demo.com")
                                            .phoneNumber("+15005550006")
                                            .subscriptions(SubscriptionChannels.builder()
                                                .email(EmailSubscriptionParameters.builder()
                                                    .marketing(SubscriptionParameters.builder()
                                                        .consent(SubscriptionParametersConsent.SUBSCRIBED)
                                                        .build())
                                                    .build())
                                                .sms(SMSSubscriptionParameters.builder()
                                                    .marketing(SubscriptionParameters.builder()
                                                        .consent(SubscriptionParametersConsent.SUBSCRIBED)
                                                        .build())
                                                    .transactional(SubscriptionParameters.builder()
                                                        .consent(SubscriptionParametersConsent.SUBSCRIBED)
                                                        .build())
                                                    .build())
                                                .build())
                                            .build())
                                        .id("01GDDKASAP8TKDDA2GRZDSVP4H")
                                        .build()))
                                .build())
                            .customSource("Marketing Event")
                            .build())
                        .relationships(SubscriptionCreateJobCreateQueryResourceObjectRelationships.builder()
                            .list(SubscriptionCreateJobCreateQueryResourceObjectList.builder()
                                .data(SubscriptionCreateJobCreateQueryResourceObjectData.builder()
                                    .type(ListEnum.LIST)
                                    .id("Y6nRLr")
                                    .build())
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                                                                               | Type                                                                                                                                                                                                                                                                                                                                                    | Required                                                                                                                                                                                                                                                                                                                                                | Description                                                                                                                                                                                                                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `revision`                                                                                                                                                                                                                                                                                                                                              | *String*                                                                                                                                                                                                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                                                                                                                                                                                                     |
| `subscriptionCreateJobCreateQuery`                                                                                                                                                                                                                                                                                                                      | [SubscriptionCreateJobCreateQuery](../../models/components/SubscriptionCreateJobCreateQuery.md)                                                                                                                                                                                                                                                         | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                      | Subscribes one or more profiles to marketing. Currently, supports email and SMS only. All profiles will be added to the provided list. Either email or phone number is required. Both may be specified to subscribe to both channels.<br/>If a profile cannot be found matching the given identifier(s), a new profile will be created and then subscribed. |

### Response

**[BulkSubscribeProfilesResponse](../../models/operations/BulkSubscribeProfilesResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## bulkUnsubscribeProfiles

Unsubscribe one or more profiles to email marketing, SMS marketing, or both. Learn more about [consent in this guide](https://developers.klaviyo.com/en/docs/collect_email_and_sms_consent_via_api).

To remove someone from a list without changing their subscription status, use [Remove Profile from List](https://developers.klaviyo.com/en/reference/delete_list_relationships).

Maximum number of profile can be submitted for unsubscription: 100<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`lists:write`
`profiles:write`
`subscriptions:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.ListEnum;
import com.commercesystems.klaviyo_java.models.components.ProfileEnum;
import com.commercesystems.klaviyo_java.models.components.ProfileSubscriptionBulkDeleteJobEnum;
import com.commercesystems.klaviyo_java.models.components.ProfileSubscriptionDeleteQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.ProfileSubscriptionDeleteQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.SubscriptionDeleteJobCreateQuery;
import com.commercesystems.klaviyo_java.models.components.SubscriptionDeleteJobCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.SubscriptionDeleteJobCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.SubscriptionDeleteJobCreateQueryResourceObjectData;
import com.commercesystems.klaviyo_java.models.components.SubscriptionDeleteJobCreateQueryResourceObjectList;
import com.commercesystems.klaviyo_java.models.components.SubscriptionDeleteJobCreateQueryResourceObjectProfiles;
import com.commercesystems.klaviyo_java.models.components.SubscriptionDeleteJobCreateQueryResourceObjectRelationships;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.BulkUnsubscribeProfilesResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        BulkUnsubscribeProfilesResponse res = sdk.profiles().bulkUnsubscribeProfiles()
                .revision("2024-10-15")
                .subscriptionDeleteJobCreateQuery(SubscriptionDeleteJobCreateQuery.builder()
                    .data(SubscriptionDeleteJobCreateQueryResourceObject.builder()
                        .type(ProfileSubscriptionBulkDeleteJobEnum.PROFILE_SUBSCRIPTION_BULK_DELETE_JOB)
                        .attributes(SubscriptionDeleteJobCreateQueryResourceObjectAttributes.builder()
                            .profiles(SubscriptionDeleteJobCreateQueryResourceObjectProfiles.builder()
                                .data(List.of(
                                    ProfileSubscriptionDeleteQueryResourceObject.builder()
                                        .type(ProfileEnum.PROFILE)
                                        .attributes(ProfileSubscriptionDeleteQueryResourceObjectAttributes.builder()
                                            .email("matt-kemp@klaviyo-demo.com")
                                            .phoneNumber("+15005550006")
                                            .build())
                                        .build()))
                                .build())
                            .build())
                        .relationships(SubscriptionDeleteJobCreateQueryResourceObjectRelationships.builder()
                            .list(SubscriptionDeleteJobCreateQueryResourceObjectList.builder()
                                .data(SubscriptionDeleteJobCreateQueryResourceObjectData.builder()
                                    .type(ListEnum.LIST)
                                    .id("Y6nRLr")
                                    .build())
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `revision`                                                                                                                                                                                                                                                                                                   | *String*                                                                                                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                                                                                                           | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                                                                                                                                                          |
| `subscriptionDeleteJobCreateQuery`                                                                                                                                                                                                                                                                           | [SubscriptionDeleteJobCreateQuery](../../models/components/SubscriptionDeleteJobCreateQuery.md)                                                                                                                                                                                                              | :heavy_check_mark:                                                                                                                                                                                                                                                                                           | Unsubscribes one or more profiles from marketing. Currently, supports email and SMS only. All profiles will be removed from the provided list.<br/>Either email or phone number is required. If a profile cannot be found matching the given identifier(s), a new profile will be created and then unsubscribed. |

### Response

**[BulkUnsubscribeProfilesResponse](../../models/operations/BulkUnsubscribeProfilesResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## createPushToken

Create or update a push token.

This endpoint can be used to migrate push tokens from another platform to Klaviyo. Please use our mobile SDKs ([iOS](https://github.com/klaviyo/klaviyo-swift-sdk) and [Android](https://github.com/klaviyo/klaviyo-android-sdk)) to create push tokens from users' devices.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`profiles:write`
`push-tokens:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.Append;
import com.commercesystems.klaviyo_java.models.components.Background;
import com.commercesystems.klaviyo_java.models.components.DeviceMetadata;
import com.commercesystems.klaviyo_java.models.components.EnablementStatus;
import com.commercesystems.klaviyo_java.models.components.Environment;
import com.commercesystems.klaviyo_java.models.components.KlaviyoSDK;
import com.commercesystems.klaviyo_java.models.components.Latitude;
import com.commercesystems.klaviyo_java.models.components.Longitude;
import com.commercesystems.klaviyo_java.models.components.OsName;
import com.commercesystems.klaviyo_java.models.components.Platform;
import com.commercesystems.klaviyo_java.models.components.ProfileEnum;
import com.commercesystems.klaviyo_java.models.components.ProfileLocation;
import com.commercesystems.klaviyo_java.models.components.ProfileMeta;
import com.commercesystems.klaviyo_java.models.components.ProfileMetaPatchProperties;
import com.commercesystems.klaviyo_java.models.components.PushProfileUpsertQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.PushProfileUpsertQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.PushProfileUpsertQueryResourceObjectProperties;
import com.commercesystems.klaviyo_java.models.components.PushTokenCreateQuery;
import com.commercesystems.klaviyo_java.models.components.PushTokenCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.PushTokenCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.PushTokenCreateQueryResourceObjectProfile;
import com.commercesystems.klaviyo_java.models.components.PushTokenEnum;
import com.commercesystems.klaviyo_java.models.components.Unappend;
import com.commercesystems.klaviyo_java.models.components.Unset;
import com.commercesystems.klaviyo_java.models.components.Vendor;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.CreatePushTokenResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        CreatePushTokenResponse res = sdk.profiles().createPushToken()
                .revision("2024-10-15")
                .pushTokenCreateQuery(PushTokenCreateQuery.builder()
                    .data(PushTokenCreateQueryResourceObject.builder()
                        .type(PushTokenEnum.PUSH_TOKEN)
                        .attributes(PushTokenCreateQueryResourceObjectAttributes.builder()
                            .token("1234567890")
                            .platform(Platform.ANDROID)
                            .vendor(Vendor.APNS)
                            .profile(PushTokenCreateQueryResourceObjectProfile.builder()
                                .data(PushProfileUpsertQueryResourceObject.builder()
                                    .type(ProfileEnum.PROFILE)
                                    .attributes(PushProfileUpsertQueryResourceObjectAttributes.builder()
                                        .phoneNumber("+15005550006")
                                        .anonymousId("01GDDKASAP8TKDDA2GRZDSVP4H")
                                        .firstName("Sarah")
                                        .lastName("Mason")
                                        .organization("Example Corporation")
                                        .locale("en-US")
                                        .title("Regional Manager")
                                        .image("https://images.pexels.com/photos/3760854/pexels-photo-3760854.jpeg")
                                        .location(ProfileLocation.builder()
                                            .address1("89 E 42nd St")
                                            .address2("1st floor")
                                            .city("New York")
                                            .country("United States")
                                            .latitude(Latitude.of("40.7128"))
                                            .longitude(Longitude.of("74.0060"))
                                            .region("NY")
                                            .zip("10017")
                                            .timezone("America/New_York")
                                            .ip("127.0.0.1")
                                            .build())
                                        .properties(PushProfileUpsertQueryResourceObjectProperties.builder()
                                            .build())
                                        .meta(ProfileMeta.builder()
                                            .patchProperties(ProfileMetaPatchProperties.builder()
                                                .append(Append.builder()
                                                    .build())
                                                .unappend(Unappend.builder()
                                                    .build())
                                                .unset(Unset.of("skus"))
                                                .build())
                                            .build())
                                        .email("sarah.mason@klaviyo-demo.com")
                                        .build())
                                    .build())
                                .build())
                            .enablementStatus(EnablementStatus.AUTHORIZED)
                            .background(Background.AVAILABLE)
                            .deviceMetadata(DeviceMetadata.builder()
                                .deviceId("1234567890")
                                .klaviyoSDK(KlaviyoSDK.SWIFT)
                                .sdkVersion("1.0.0")
                                .deviceModel("iPhone12,1")
                                .osName(OsName.IOS)
                                .osVersion("14.0")
                                .manufacturer("Apple")
                                .appName("Klaviyo")
                                .appVersion("1.0.0")
                                .appBuild("1")
                                .appId("com.klaviyo.app")
                                .environment(Environment.RELEASE)
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `revision`                                                              | *String*                                                                | :heavy_check_mark:                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                     |
| `pushTokenCreateQuery`                                                  | [PushTokenCreateQuery](../../models/components/PushTokenCreateQuery.md) | :heavy_check_mark:                                                      | N/A                                                                     |

### Response

**[CreatePushTokenResponse](../../models/operations/CreatePushTokenResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getListsForProfile

Get list memberships for a profile with the given profile ID.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`lists:read`
`profiles:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetListsForProfileQueryParamFieldsList;
import com.commercesystems.klaviyo_java.models.operations.GetListsForProfileResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetListsForProfileResponse res = sdk.profiles().getListsForProfile()
                .id("<id>")
                .fieldsList(List.of(
                    GetListsForProfileQueryParamFieldsList.NAME))
                .revision("2024-10-15")
                .call();

        if (res.getListResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                    | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | N/A                                                                                                                     |
| `fieldsList`                                                                                                            | List\<[GetListsForProfileQueryParamFieldsList](../../models/operations/GetListsForProfileQueryParamFieldsList.md)>      | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets |
| `revision`                                                                                                              | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                     |

### Response

**[GetListsForProfileResponse](../../models/operations/GetListsForProfileResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getListIdsForProfile

Get list memberships for a profile with the given profile ID.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`lists:read`
`profiles:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetListIdsForProfileResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetListIdsForProfileResponse res = sdk.profiles().getListIdsForProfile()
                .id("<id>")
                .revision("2024-10-15")
                .call();

        if (res.getProfileListRelationshipsResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | N/A                                                 |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |

### Response

**[GetListIdsForProfileResponse](../../models/operations/GetListIdsForProfileResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getSegmentsForProfile

Get segment memberships for a profile with the given profile ID.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`profiles:read`
`segments:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetSegmentsForProfileResponse;
import com.commercesystems.klaviyo_java.models.operations.QueryParamFieldsSegment;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetSegmentsForProfileResponse res = sdk.profiles().getSegmentsForProfile()
                .id("<id>")
                .fieldsSegment(List.of(
                    QueryParamFieldsSegment.DEFINITION_CONDITION_GROUPS))
                .revision("2024-10-15")
                .call();

        if (res.getSegmentResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                    | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | N/A                                                                                                                     |
| `fieldsSegment`                                                                                                         | List\<[QueryParamFieldsSegment](../../models/operations/QueryParamFieldsSegment.md)>                                    | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets |
| `revision`                                                                                                              | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                     |

### Response

**[GetSegmentsForProfileResponse](../../models/operations/GetSegmentsForProfileResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getSegmentIdsForProfile

Get segment membership relationships for a profile with the given profile ID.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`profiles:read`
`segments:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetSegmentIdsForProfileResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetSegmentIdsForProfileResponse res = sdk.profiles().getSegmentIdsForProfile()
                .id("<id>")
                .revision("2024-10-15")
                .call();

        if (res.getProfileSegmentRelationshipsResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | N/A                                                 |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |

### Response

**[GetSegmentIdsForProfileResponse](../../models/operations/GetSegmentIdsForProfileResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getListForBulkImportProfilesJob

Get list for the bulk profile import job with the given ID.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`lists:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetListForBulkImportProfilesJobQueryParamFieldsList;
import com.commercesystems.klaviyo_java.models.operations.GetListForBulkImportProfilesJobResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetListForBulkImportProfilesJobResponse res = sdk.profiles().getListForBulkImportProfilesJob()
                .id("<id>")
                .fieldsList(List.of(
                    GetListForBulkImportProfilesJobQueryParamFieldsList.OPT_IN_PROCESS))
                .revision("2024-10-15")
                .call();

        if (res.getListResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                         | *String*                                                                                                                                     | :heavy_check_mark:                                                                                                                           | N/A                                                                                                                                          |
| `fieldsList`                                                                                                                                 | List\<[GetListForBulkImportProfilesJobQueryParamFieldsList](../../models/operations/GetListForBulkImportProfilesJobQueryParamFieldsList.md)> | :heavy_minus_sign:                                                                                                                           | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                      |
| `revision`                                                                                                                                   | *String*                                                                                                                                     | :heavy_check_mark:                                                                                                                           | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                          |

### Response

**[GetListForBulkImportProfilesJobResponse](../../models/operations/GetListForBulkImportProfilesJobResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getListIdsForBulkImportProfilesJob

Get list relationship for the bulk profile import job with the given ID.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`lists:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetListIdsForBulkImportProfilesJobResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetListIdsForBulkImportProfilesJobResponse res = sdk.profiles().getListIdsForBulkImportProfilesJob()
                .id("<id>")
                .revision("2024-10-15")
                .call();

        if (res.getProfileImportJobListRelationshipsResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | N/A                                                 |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |

### Response

**[GetListIdsForBulkImportProfilesJobResponse](../../models/operations/GetListIdsForBulkImportProfilesJobResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getProfilesForBulkImportProfilesJob

Get profiles for the bulk profile import job with the given ID.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`profiles:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetProfilesForBulkImportProfilesJobRequest;
import com.commercesystems.klaviyo_java.models.operations.GetProfilesForBulkImportProfilesJobResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetProfilesForBulkImportProfilesJobRequest req = GetProfilesForBulkImportProfilesJobRequest.builder()
                .id("<id>")
                .revision("2024-10-15")
                .build();

        GetProfilesForBulkImportProfilesJobResponse res = sdk.profiles().getProfilesForBulkImportProfilesJob()
                .request(req)
                .call();

        if (res.getProfileResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [GetProfilesForBulkImportProfilesJobRequest](../../models/operations/GetProfilesForBulkImportProfilesJobRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |

### Response

**[GetProfilesForBulkImportProfilesJobResponse](../../models/operations/GetProfilesForBulkImportProfilesJobResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getProfileIdsForBulkImportProfilesJob

Get profile relationships for the bulk profile import job with the given ID.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`profiles:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetProfileIdsForBulkImportProfilesJobResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetProfileIdsForBulkImportProfilesJobResponse res = sdk.profiles().getProfileIdsForBulkImportProfilesJob()
                .id("<id>")
                .pageCursor("<value>")
                .pageSize(20L)
                .revision("2024-10-15")
                .call();

        if (res.getProfileImportJobProfileRelationshipsResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                              | *String*                                                                                                          | :heavy_check_mark:                                                                                                | N/A                                                                                                               |
| `pageCursor`                                                                                                      | *Optional\<String>*                                                                                               | :heavy_minus_sign:                                                                                                | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination |
| `pageSize`                                                                                                        | *Optional\<Long>*                                                                                                 | :heavy_minus_sign:                                                                                                | Default: 20. Min: 1. Max: 100.                                                                                    |
| `revision`                                                                                                        | *String*                                                                                                          | :heavy_check_mark:                                                                                                | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                               |

### Response

**[GetProfileIdsForBulkImportProfilesJobResponse](../../models/operations/GetProfileIdsForBulkImportProfilesJobResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getErrorsForBulkImportProfilesJob

Get import errors for the bulk profile import job with the given ID.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`profiles:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetErrorsForBulkImportProfilesJobRequest;
import com.commercesystems.klaviyo_java.models.operations.GetErrorsForBulkImportProfilesJobResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetErrorsForBulkImportProfilesJobRequest req = GetErrorsForBulkImportProfilesJobRequest.builder()
                .id("<id>")
                .revision("2024-10-15")
                .build();

        GetErrorsForBulkImportProfilesJobResponse res = sdk.profiles().getErrorsForBulkImportProfilesJob()
                .request(req)
                .call();

        if (res.getImportErrorResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [GetErrorsForBulkImportProfilesJobRequest](../../models/operations/GetErrorsForBulkImportProfilesJobRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |

### Response

**[GetErrorsForBulkImportProfilesJobResponse](../../models/operations/GetErrorsForBulkImportProfilesJobResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |