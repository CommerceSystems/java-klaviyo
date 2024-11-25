# Lists
(*lists()*)

## Overview

lists

### Available Operations

* [getLists](#getlists) - Get Lists
* [createList](#createlist) - Create List
* [getList](#getlist) - Get List
* [updateList](#updatelist) - Update List
* [deleteList](#deletelist) - Delete List
* [getTagIdsForList](#gettagidsforlist) - Get Tag IDs for List
* [getListTags](#getlisttags) - Get List Tags
* [getProfileIdsForList](#getprofileidsforlist) - Get Profile IDs for List
* [createListRelationships](#createlistrelationships) - Add Profile To List
* [deleteListRelationships](#deletelistrelationships) - Remove Profile From List
* [getListProfiles](#getlistprofiles) - Get List Profiles
* [getListRelationshipsFlowTriggers](#getlistrelationshipsflowtriggers) - Get List Relationships Flow Triggers
* [getListFlowTriggers](#getlistflowtriggers) - Get List Flow Triggers

## getLists

Get all lists in an account.

Filter to request a subset of all lists. Lists can be filtered by `id`, `name`, `created`, and `updated` fields.

Returns a maximum of 10 results per page.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`lists:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetListsRequest;
import com.commercesystems.klaviyo_java.models.operations.GetListsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetListsRequest req = GetListsRequest.builder()
                .revision("2024-10-15")
                .build();

        GetListsResponse res = sdk.lists().getLists()
                .request(req)
                .call();

        if (res.getListListResponseCollectionCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [GetListsRequest](../../models/operations/GetListsRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[GetListsResponse](../../models/operations/GetListsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## createList

Create a new list.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`<br>Daily: `150/d`

**Scopes:**
`lists:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.ListCreateQuery;
import com.commercesystems.klaviyo_java.models.components.ListCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.ListCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.ListEnum;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.CreateListResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        CreateListResponse res = sdk.lists().createList()
                .revision("2024-10-15")
                .listCreateQuery(ListCreateQuery.builder()
                    .data(ListCreateQueryResourceObject.builder()
                        .type(ListEnum.LIST)
                        .attributes(ListCreateQueryResourceObjectAttributes.builder()
                            .name("Newsletter")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postListCreateResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `revision`                                                    | *String*                                                      | :heavy_check_mark:                                            | API endpoint revision (format: YYYY-MM-DD[.suffix])           |
| `listCreateQuery`                                             | [ListCreateQuery](../../models/components/ListCreateQuery.md) | :heavy_check_mark:                                            | N/A                                                           |

### Response

**[CreateListResponse](../../models/operations/CreateListResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getList

Get a list with the given list ID.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`<br><br>Rate limits when using the `additional-fields[list]=profile_count` parameter in your API request:<br>Burst: `1/s`<br>Steady: `15/m`<br><br>To learn more about how the `additional-fields` parameter impacts rate limits, check out our [Rate limits, status codes, and errors](https://developers.klaviyo.com/en/v2024-10-15/docs/rate_limits_and_error_handling) guide.

**Scopes:**
`lists:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetListRequest;
import com.commercesystems.klaviyo_java.models.operations.GetListResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetListRequest req = GetListRequest.builder()
                .id("Y6nRLr")
                .revision("2024-10-15")
                .build();

        GetListResponse res = sdk.lists().getList()
                .request(req)
                .call();

        if (res.getListRetrieveResponseCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [GetListRequest](../../models/operations/GetListRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[GetListResponse](../../models/operations/GetListResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## updateList

Update the name of a list with the given list ID.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`lists:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.ListEnum;
import com.commercesystems.klaviyo_java.models.components.ListPartialUpdateQuery;
import com.commercesystems.klaviyo_java.models.components.ListPartialUpdateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.ListPartialUpdateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.UpdateListResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        UpdateListResponse res = sdk.lists().updateList()
                .id("Y6nRLr")
                .revision("2024-10-15")
                .listPartialUpdateQuery(ListPartialUpdateQuery.builder()
                    .data(ListPartialUpdateQueryResourceObject.builder()
                        .type(ListEnum.LIST)
                        .id("Y6nRLr")
                        .attributes(ListPartialUpdateQueryResourceObjectAttributes.builder()
                            .name("Newsletter")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.patchListPartialUpdateResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 | Example                                                                     |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `id`                                                                        | *String*                                                                    | :heavy_check_mark:                                                          | Primary key that uniquely identifies this list. Generated by Klaviyo.       | Y6nRLr                                                                      |
| `revision`                                                                  | *String*                                                                    | :heavy_check_mark:                                                          | API endpoint revision (format: YYYY-MM-DD[.suffix])                         |                                                                             |
| `listPartialUpdateQuery`                                                    | [ListPartialUpdateQuery](../../models/components/ListPartialUpdateQuery.md) | :heavy_check_mark:                                                          | N/A                                                                         |                                                                             |

### Response

**[UpdateListResponse](../../models/operations/UpdateListResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## deleteList

Delete a list with the given list ID.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`lists:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.DeleteListResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        DeleteListResponse res = sdk.lists().deleteList()
                .id("Y6nRLr")
                .revision("2024-10-15")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           | Example                                                               |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `id`                                                                  | *String*                                                              | :heavy_check_mark:                                                    | Primary key that uniquely identifies this list. Generated by Klaviyo. | Y6nRLr                                                                |
| `revision`                                                            | *String*                                                              | :heavy_check_mark:                                                    | API endpoint revision (format: YYYY-MM-DD[.suffix])                   |                                                                       |

### Response

**[DeleteListResponse](../../models/operations/DeleteListResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getTagIdsForList

Returns the tag IDs of all tags associated with the given list.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`lists:read`
`tags:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetTagIdsForListResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetTagIdsForListResponse res = sdk.lists().getTagIdsForList()
                .id("<id>")
                .revision("2024-10-15")
                .call();

        if (res.getListTagRelationshipListResponseCollection().isPresent()) {
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

**[GetTagIdsForListResponse](../../models/operations/GetTagIdsForListResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getListTags

Return all tags associated with the given list ID.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`lists:read`
`tags:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetListTagsQueryParamFieldsTag;
import com.commercesystems.klaviyo_java.models.operations.GetListTagsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetListTagsResponse res = sdk.lists().getListTags()
                .id("Y6nRLr")
                .fieldsTag(List.of(
                    GetListTagsQueryParamFieldsTag.NAME))
                .revision("2024-10-15")
                .call();

        if (res.getTagResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             | Example                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                    | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | Primary key that uniquely identifies this list. Generated by Klaviyo.                                                   | Y6nRLr                                                                                                                  |
| `fieldsTag`                                                                                                             | List\<[GetListTagsQueryParamFieldsTag](../../models/operations/GetListTagsQueryParamFieldsTag.md)>                      | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets |                                                                                                                         |
| `revision`                                                                                                              | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                     |                                                                                                                         |

### Response

**[GetListTagsResponse](../../models/operations/GetListTagsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getProfileIdsForList

Get profile membership [relationships](https://developers.klaviyo.com/en/reference/api_overview#relationships) for a list with the given list ID.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`lists:read`
`profiles:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetProfileIdsForListRequest;
import com.commercesystems.klaviyo_java.models.operations.GetProfileIdsForListResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetProfileIdsForListRequest req = GetProfileIdsForListRequest.builder()
                .id("Y6nRLr")
                .revision("2024-10-15")
                .build();

        GetProfileIdsForListResponse res = sdk.lists().getProfileIdsForList()
                .request(req)
                .call();

        if (res.getListRelationshipsResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetProfileIdsForListRequest](../../models/operations/GetProfileIdsForListRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetProfileIdsForListResponse](../../models/operations/GetProfileIdsForListResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## createListRelationships

Add a profile to a list with the given list ID.

It is recommended that you use the [Subscribe Profiles endpoint](https://developers.klaviyo.com/en/reference/subscribe_profiles) if you're trying to give a profile [consent](https://developers.klaviyo.com/en/docs/collect_email_and_sms_consent_via_api) to receive email marketing, SMS marketing, or both.

This endpoint accepts a maximum of 1000 profiles per call.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`lists:write`
`profiles:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.ListMembersAddQuery;
import com.commercesystems.klaviyo_java.models.components.ListMembersAddQueryData;
import com.commercesystems.klaviyo_java.models.components.ProfileEnum;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.CreateListRelationshipsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        CreateListRelationshipsResponse res = sdk.lists().createListRelationships()
                .id("<id>")
                .revision("2024-10-15")
                .listMembersAddQuery(ListMembersAddQuery.builder()
                    .data(List.of(
                        ListMembersAddQueryData.builder()
                            .type(ProfileEnum.PROFILE)
                            .id("<id>")
                            .build()))
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `id`                                                                  | *String*                                                              | :heavy_check_mark:                                                    | N/A                                                                   |
| `revision`                                                            | *String*                                                              | :heavy_check_mark:                                                    | API endpoint revision (format: YYYY-MM-DD[.suffix])                   |
| `listMembersAddQuery`                                                 | [ListMembersAddQuery](../../models/components/ListMembersAddQuery.md) | :heavy_check_mark:                                                    | N/A                                                                   |

### Response

**[CreateListRelationshipsResponse](../../models/operations/CreateListRelationshipsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## deleteListRelationships

Remove a profile from a list with the given list ID.

The provided profile will no longer receive marketing from this particular list once removed.

Removing a profile from a list will not impact the profile's [consent](https://developers.klaviyo.com/en/docs/collect_email_and_sms_consent_via_api) status or subscription status in general.
To update a profile's subscription status, please use the [Unsubscribe Profiles endpoint](https://developers.klaviyo.com/en/reference/unsubscribe_profiles).

This endpoint accepts a maximum of 1000 profiles per call.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`lists:write`
`profiles:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.ListMembersDeleteQuery;
import com.commercesystems.klaviyo_java.models.components.ListMembersDeleteQueryData;
import com.commercesystems.klaviyo_java.models.components.ProfileEnum;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.DeleteListRelationshipsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        DeleteListRelationshipsResponse res = sdk.lists().deleteListRelationships()
                .id("<id>")
                .revision("2024-10-15")
                .listMembersDeleteQuery(ListMembersDeleteQuery.builder()
                    .data(List.of(
                        ListMembersDeleteQueryData.builder()
                            .type(ProfileEnum.PROFILE)
                            .id("<id>")
                            .build()))
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `id`                                                                        | *String*                                                                    | :heavy_check_mark:                                                          | N/A                                                                         |
| `revision`                                                                  | *String*                                                                    | :heavy_check_mark:                                                          | API endpoint revision (format: YYYY-MM-DD[.suffix])                         |
| `listMembersDeleteQuery`                                                    | [ListMembersDeleteQuery](../../models/components/ListMembersDeleteQuery.md) | :heavy_check_mark:                                                          | N/A                                                                         |

### Response

**[DeleteListRelationshipsResponse](../../models/operations/DeleteListRelationshipsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getListProfiles

Get all profiles within a list with the given list ID.

Filter to request a subset of all profiles. Profiles can be filtered by `email`, `phone_number`, `push_token`, and `joined_group_at` fields. Profiles can be sorted by the following fields, in ascending and descending order: `joined_group_at`<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`<br><br>Rate limits when using the `additional-fields[profile]=predictive_analytics` parameter in your API request:<br>Burst: `10/s`<br>Steady: `150/m`<br><br>To learn more about how the `additional-fields` parameter impacts rate limits, check out our [Rate limits, status codes, and errors](https://developers.klaviyo.com/en/v2024-10-15/docs/rate_limits_and_error_handling) guide.

**Scopes:**
`lists:read`
`profiles:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetListProfilesRequest;
import com.commercesystems.klaviyo_java.models.operations.GetListProfilesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetListProfilesRequest req = GetListProfilesRequest.builder()
                .id("Y6nRLr")
                .revision("2024-10-15")
                .build();

        GetListProfilesResponse res = sdk.lists().getListProfiles()
                .request(req)
                .call();

        if (res.getListMemberResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetListProfilesRequest](../../models/operations/GetListProfilesRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetListProfilesResponse](../../models/operations/GetListProfilesResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getListRelationshipsFlowTriggers

Get all flow [relationships](https://developers.klaviyo.com/en/reference/api_overview#relationships) where the given list is being used as the trigger.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`flows:read`
`lists:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetListRelationshipsFlowTriggersResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetListRelationshipsFlowTriggersResponse res = sdk.lists().getListRelationshipsFlowTriggers()
                .id("Y6nRLr")
                .revision("2024-10-15")
                .call();

        if (res.getListFlowTriggersRelationshipsResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           | Example                                                               |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `id`                                                                  | *String*                                                              | :heavy_check_mark:                                                    | Primary key that uniquely identifies this list. Generated by Klaviyo. | Y6nRLr                                                                |
| `revision`                                                            | *String*                                                              | :heavy_check_mark:                                                    | API endpoint revision (format: YYYY-MM-DD[.suffix])                   |                                                                       |

### Response

**[GetListRelationshipsFlowTriggersResponse](../../models/operations/GetListRelationshipsFlowTriggersResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getListFlowTriggers

Get all flows where the given lsit ID is being used as the trigger.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`flows:read`
`lists:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetListFlowTriggersQueryParamFieldsFlow;
import com.commercesystems.klaviyo_java.models.operations.GetListFlowTriggersResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetListFlowTriggersResponse res = sdk.lists().getListFlowTriggers()
                .id("Y6nRLr")
                .fieldsFlow(List.of(
                    GetListFlowTriggersQueryParamFieldsFlow.ARCHIVED))
                .revision("2024-10-15")
                .call();

        if (res.getFlowResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             | Example                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                    | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | Primary key that uniquely identifies this list. Generated by Klaviyo.                                                   | Y6nRLr                                                                                                                  |
| `fieldsFlow`                                                                                                            | List\<[GetListFlowTriggersQueryParamFieldsFlow](../../models/operations/GetListFlowTriggersQueryParamFieldsFlow.md)>    | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets |                                                                                                                         |
| `revision`                                                                                                              | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                     |                                                                                                                         |

### Response

**[GetListFlowTriggersResponse](../../models/operations/GetListFlowTriggersResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |