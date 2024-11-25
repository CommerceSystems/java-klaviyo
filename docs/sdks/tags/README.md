# Tags
(*tags()*)

## Overview

tags

### Available Operations

* [getTags](#gettags) - Get Tags
* [createTag](#createtag) - Create Tag
* [getTag](#gettag) - Get Tag
* [updateTag](#updatetag) - Update Tag
* [deleteTag](#deletetag) - Delete Tag
* [getTagGroups](#gettaggroups) - Get Tag Groups
* [createTagGroup](#createtaggroup) - Create Tag Group
* [getTagGroup](#gettaggroup) - Get Tag Group
* [updateTagGroup](#updatetaggroup) - Update Tag Group
* [deleteTagGroup](#deletetaggroup) - Delete Tag Group
* [getFlowIdsForTag](#getflowidsfortag) - Get Flow IDs for Tag
* [tagFlows](#tagflows) - Tag Flows
* [removeTagFromFlows](#removetagfromflows) - Remove Tag from Flows
* [getCampaignIdsForTag](#getcampaignidsfortag) - Get Campaign IDs for Tag
* [tagCampaigns](#tagcampaigns) - Tag Campaigns
* [removeTagFromCampaigns](#removetagfromcampaigns) - Remove Tag from Campaigns
* [getListIdsForTag](#getlistidsfortag) - Get List IDs for Tag
* [tagLists](#taglists) - Tag Lists
* [removeTagFromLists](#removetagfromlists) - Remove Tag from Lists
* [getSegmentIdsForTag](#getsegmentidsfortag) - Get Segment IDs for Tag
* [tagSegments](#tagsegments) - Tag Segments
* [removeTagFromSegments](#removetagfromsegments) - Remove Tag from Segments
* [getTagGroupIdForTag](#gettaggroupidfortag) - Get Tag Group ID for Tag
* [getTagIdsForTagGroup](#gettagidsfortaggroup) - Get Tag IDs for Tag Group
* [getTagGroupForTag](#gettaggroupfortag) - Get Tag Group for Tag
* [getTagsForTagGroup](#gettagsfortaggroup) - Get Tags for Tag Group

## getTags

List all tags in an account.

Tags can be filtered by `name`, and sorted by `name` or `id` in ascending or descending order.

Returns a maximum of 50 tags per request, which can be paginated with
[cursor-based pagination](https://developers.klaviyo.com/en/v2022-10-17/reference/api_overview#pagination).<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`tags:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetTagsRequest;
import com.commercesystems.klaviyo_java.models.operations.GetTagsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetTagsRequest req = GetTagsRequest.builder()
                .revision("2024-10-15")
                .build();

        GetTagsResponse res = sdk.tags().getTags()
                .request(req)
                .call();

        if (res.getTagResponseCollectionCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [GetTagsRequest](../../models/operations/GetTagsRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[GetTagsResponse](../../models/operations/GetTagsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## createTag

Create a tag. An account cannot have more than **500** unique tags.

A tag belongs to a single tag group. If the `tag_group_id` is not specified,
the tag is added to the account's default tag group.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`tags:read`
`tags:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.TagCreateQuery;
import com.commercesystems.klaviyo_java.models.components.TagCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.TagCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.TagCreateQueryResourceObjectData;
import com.commercesystems.klaviyo_java.models.components.TagCreateQueryResourceObjectRelationships;
import com.commercesystems.klaviyo_java.models.components.TagEnum;
import com.commercesystems.klaviyo_java.models.components.TagGroup;
import com.commercesystems.klaviyo_java.models.components.TagGroupEnum;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.CreateTagResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        CreateTagResponse res = sdk.tags().createTag()
                .revision("2024-10-15")
                .tagCreateQuery(TagCreateQuery.builder()
                    .data(TagCreateQueryResourceObject.builder()
                        .type(TagEnum.TAG)
                        .attributes(TagCreateQueryResourceObjectAttributes.builder()
                            .name("My Tag")
                            .build())
                        .relationships(TagCreateQueryResourceObjectRelationships.builder()
                            .tagGroup(TagGroup.builder()
                                .data(TagCreateQueryResourceObjectData.builder()
                                    .type(TagGroupEnum.TAG_GROUP)
                                    .id("zyxw9876-vu54-ts32-rq10-zyxwvu654321")
                                    .build())
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postTagResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `revision`                                                  | *String*                                                    | :heavy_check_mark:                                          | API endpoint revision (format: YYYY-MM-DD[.suffix])         |
| `tagCreateQuery`                                            | [TagCreateQuery](../../models/components/TagCreateQuery.md) | :heavy_check_mark:                                          | N/A                                                         |

### Response

**[CreateTagResponse](../../models/operations/CreateTagResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getTag

Retrieve the tag with the given tag ID.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`tags:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetTagRequest;
import com.commercesystems.klaviyo_java.models.operations.GetTagResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetTagRequest req = GetTagRequest.builder()
                .id("abcd1234-ef56-gh78-ij90-abcdef123456")
                .revision("2024-10-15")
                .build();

        GetTagResponse res = sdk.tags().getTag()
                .request(req)
                .call();

        if (res.getTagResponseCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [GetTagRequest](../../models/operations/GetTagRequest.md) | :heavy_check_mark:                                        | The request object to use for the request.                |

### Response

**[GetTagResponse](../../models/operations/GetTagResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## updateTag

Update the tag with the given tag ID.

Only a tag's `name` can be changed. A tag cannot be moved from one tag group to another.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`tags:read`
`tags:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.TagEnum;
import com.commercesystems.klaviyo_java.models.components.TagUpdateQuery;
import com.commercesystems.klaviyo_java.models.components.TagUpdateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.TagUpdateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.UpdateTagResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        UpdateTagResponse res = sdk.tags().updateTag()
                .id("abcd1234-ef56-gh78-ij90-abcdef123456")
                .revision("2024-10-15")
                .tagUpdateQuery(TagUpdateQuery.builder()
                    .data(TagUpdateQueryResourceObject.builder()
                        .type(TagEnum.TAG)
                        .id("abcd1234-ef56-gh78-ij90-abcdef123456")
                        .attributes(TagUpdateQueryResourceObjectAttributes.builder()
                            .name("My Tag")
                            .build())
                        .build())
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 | Example                                                     |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `id`                                                        | *String*                                                    | :heavy_check_mark:                                          | The Tag ID                                                  | abcd1234-ef56-gh78-ij90-abcdef123456                        |
| `revision`                                                  | *String*                                                    | :heavy_check_mark:                                          | API endpoint revision (format: YYYY-MM-DD[.suffix])         |                                                             |
| `tagUpdateQuery`                                            | [TagUpdateQuery](../../models/components/TagUpdateQuery.md) | :heavy_check_mark:                                          | N/A                                                         |                                                             |

### Response

**[UpdateTagResponse](../../models/operations/UpdateTagResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## deleteTag

Delete the tag with the given tag ID. Any associations between the tag and other resources will also be removed.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`tags:read`
`tags:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.DeleteTagResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        DeleteTagResponse res = sdk.tags().deleteTag()
                .id("abcd1234-ef56-gh78-ij90-abcdef123456")
                .revision("2024-10-15")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | The Tag ID                                          | abcd1234-ef56-gh78-ij90-abcdef123456                |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |                                                     |

### Response

**[DeleteTagResponse](../../models/operations/DeleteTagResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getTagGroups

List all tag groups in an account. Every account has one default tag group.

Tag groups can be filtered by `name`, `exclusive`, and `default`, and sorted by `name` or `id` in ascending or descending order.

Returns a maximum of 25 tag groups per request, which can be paginated with
[cursor-based pagination](https://developers.klaviyo.com/en/v2022-10-17/reference/api_overview#pagination).<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`tags:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetTagGroupsRequest;
import com.commercesystems.klaviyo_java.models.operations.GetTagGroupsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetTagGroupsRequest req = GetTagGroupsRequest.builder()
                .revision("2024-10-15")
                .build();

        GetTagGroupsResponse res = sdk.tags().getTagGroups()
                .request(req)
                .call();

        if (res.getTagGroupResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetTagGroupsRequest](../../models/operations/GetTagGroupsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetTagGroupsResponse](../../models/operations/GetTagGroupsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## createTagGroup

Create a tag group. An account cannot have more than **50** unique tag groups.

If `exclusive` is not specified `true` or `false`, the tag group defaults to non-exclusive.

If a tag group is non-exclusive, any given related resource (campaign, flow, etc.)
can be linked to multiple tags from that tag group.
If a tag group is exclusive, any given related resource can only be linked to one tag from that tag group.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`tags:read`
`tags:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.TagGroupCreateQuery;
import com.commercesystems.klaviyo_java.models.components.TagGroupCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.TagGroupCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.TagGroupEnum;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.CreateTagGroupResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        CreateTagGroupResponse res = sdk.tags().createTagGroup()
                .revision("2024-10-15")
                .tagGroupCreateQuery(TagGroupCreateQuery.builder()
                    .data(TagGroupCreateQueryResourceObject.builder()
                        .type(TagGroupEnum.TAG_GROUP)
                        .attributes(TagGroupCreateQueryResourceObjectAttributes.builder()
                            .name("My Tag Group")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postTagGroupResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `revision`                                                            | *String*                                                              | :heavy_check_mark:                                                    | API endpoint revision (format: YYYY-MM-DD[.suffix])                   |
| `tagGroupCreateQuery`                                                 | [TagGroupCreateQuery](../../models/components/TagGroupCreateQuery.md) | :heavy_check_mark:                                                    | N/A                                                                   |

### Response

**[CreateTagGroupResponse](../../models/operations/CreateTagGroupResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getTagGroup

Retrieve the tag group with the given tag group ID.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`tags:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetTagGroupQueryParamFieldsTagGroup;
import com.commercesystems.klaviyo_java.models.operations.GetTagGroupResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetTagGroupResponse res = sdk.tags().getTagGroup()
                .id("zyxw9876-vu54-ts32-rq10-zyxwvu654321")
                .fieldsTagGroup(List.of(
                    GetTagGroupQueryParamFieldsTagGroup.EXCLUSIVE))
                .revision("2024-10-15")
                .call();

        if (res.getTagGroupResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             | Example                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                    | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | The Tag Group ID                                                                                                        | zyxw9876-vu54-ts32-rq10-zyxwvu654321                                                                                    |
| `fieldsTagGroup`                                                                                                        | List\<[GetTagGroupQueryParamFieldsTagGroup](../../models/operations/GetTagGroupQueryParamFieldsTagGroup.md)>            | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets |                                                                                                                         |
| `revision`                                                                                                              | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                     |                                                                                                                         |

### Response

**[GetTagGroupResponse](../../models/operations/GetTagGroupResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## updateTagGroup

Update the tag group with the given tag group ID.

Only a tag group's `name` can be changed. A tag group's `exclusive` or `default` value cannot be changed.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`tags:read`
`tags:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.TagGroupEnum;
import com.commercesystems.klaviyo_java.models.components.TagGroupUpdateQuery;
import com.commercesystems.klaviyo_java.models.components.TagGroupUpdateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.TagGroupUpdateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.UpdateTagGroupResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        UpdateTagGroupResponse res = sdk.tags().updateTagGroup()
                .id("zyxw9876-vu54-ts32-rq10-zyxwvu654321")
                .revision("2024-10-15")
                .tagGroupUpdateQuery(TagGroupUpdateQuery.builder()
                    .data(TagGroupUpdateQueryResourceObject.builder()
                        .type(TagGroupEnum.TAG_GROUP)
                        .id("zyxw9876-vu54-ts32-rq10-zyxwvu654321")
                        .attributes(TagGroupUpdateQueryResourceObjectAttributes.builder()
                            .name("My Tag Group")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.patchTagGroupResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           | Example                                                               |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `id`                                                                  | *String*                                                              | :heavy_check_mark:                                                    | The Tag Group ID                                                      | zyxw9876-vu54-ts32-rq10-zyxwvu654321                                  |
| `revision`                                                            | *String*                                                              | :heavy_check_mark:                                                    | API endpoint revision (format: YYYY-MM-DD[.suffix])                   |                                                                       |
| `tagGroupUpdateQuery`                                                 | [TagGroupUpdateQuery](../../models/components/TagGroupUpdateQuery.md) | :heavy_check_mark:                                                    | N/A                                                                   |                                                                       |

### Response

**[UpdateTagGroupResponse](../../models/operations/UpdateTagGroupResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## deleteTagGroup

Delete the tag group with the given tag group ID.

Any tags inside that tag group, and any associations between those tags and other resources, will also be removed. The default tag group cannot be deleted.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`tags:read`
`tags:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.DeleteTagGroupResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        DeleteTagGroupResponse res = sdk.tags().deleteTagGroup()
                .id("zyxw9876-vu54-ts32-rq10-zyxwvu654321")
                .revision("2024-10-15")
                .call();

        if (res.deleteTagGroupResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | The Tag Group ID                                    | zyxw9876-vu54-ts32-rq10-zyxwvu654321                |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |                                                     |

### Response

**[DeleteTagGroupResponse](../../models/operations/DeleteTagGroupResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getFlowIdsForTag

Returns the IDs of all flows associated with the given tag.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`flows:read`
`tags:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetFlowIdsForTagResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetFlowIdsForTagResponse res = sdk.tags().getFlowIdsForTag()
                .id("abcd1234-ef56-gh78-ij90-abcdef123456")
                .revision("2024-10-15")
                .call();

        if (res.getTagFlowRelationshipsResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | The Tag ID                                          | abcd1234-ef56-gh78-ij90-abcdef123456                |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |                                                     |

### Response

**[GetFlowIdsForTagResponse](../../models/operations/GetFlowIdsForTagResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## tagFlows

Associate a tag with one or more flows. Any flow cannot be associated with more than **100** tags.


Use the request body to pass in the ID(s) of the flow(s) that will be associated with the tag.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`flows:write`
`tags:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.FlowEnum;
import com.commercesystems.klaviyo_java.models.components.TagFlowOp;
import com.commercesystems.klaviyo_java.models.components.TagFlowOpData;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.TagFlowsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        TagFlowsResponse res = sdk.tags().tagFlows()
                .id("abcd1234-ef56-gh78-ij90-abcdef123456")
                .revision("2024-10-15")
                .tagFlowOp(TagFlowOp.builder()
                    .data(List.of(
                        TagFlowOpData.builder()
                            .type(FlowEnum.FLOW)
                            .id("<id>")
                            .build()))
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | The Tag ID                                          | abcd1234-ef56-gh78-ij90-abcdef123456                |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |                                                     |
| `tagFlowOp`                                         | [TagFlowOp](../../models/components/TagFlowOp.md)   | :heavy_check_mark:                                  | N/A                                                 |                                                     |

### Response

**[TagFlowsResponse](../../models/operations/TagFlowsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## removeTagFromFlows

Remove a tag's association with one or more flows.


Use the request body to pass in the ID(s) of the flows(s) whose association with the tag
will be removed.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`flows:write`
`tags:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.FlowEnum;
import com.commercesystems.klaviyo_java.models.components.TagFlowOp;
import com.commercesystems.klaviyo_java.models.components.TagFlowOpData;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.RemoveTagFromFlowsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        RemoveTagFromFlowsResponse res = sdk.tags().removeTagFromFlows()
                .id("abcd1234-ef56-gh78-ij90-abcdef123456")
                .revision("2024-10-15")
                .tagFlowOp(TagFlowOp.builder()
                    .data(List.of(
                        TagFlowOpData.builder()
                            .type(FlowEnum.FLOW)
                            .id("<id>")
                            .build()))
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | The Tag ID                                          | abcd1234-ef56-gh78-ij90-abcdef123456                |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |                                                     |
| `tagFlowOp`                                         | [TagFlowOp](../../models/components/TagFlowOp.md)   | :heavy_check_mark:                                  | N/A                                                 |                                                     |

### Response

**[RemoveTagFromFlowsResponse](../../models/operations/RemoveTagFromFlowsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getCampaignIdsForTag

Returns the IDs of all campaigns associated with the given tag.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`campaigns:read`
`tags:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetCampaignIdsForTagResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCampaignIdsForTagResponse res = sdk.tags().getCampaignIdsForTag()
                .id("abcd1234-ef56-gh78-ij90-abcdef123456")
                .revision("2024-10-15")
                .call();

        if (res.getTagCampaignRelationshipsResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | The Tag ID                                          | abcd1234-ef56-gh78-ij90-abcdef123456                |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |                                                     |

### Response

**[GetCampaignIdsForTagResponse](../../models/operations/GetCampaignIdsForTagResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## tagCampaigns

Associate a tag with one or more campaigns. Any campaign cannot be associated with more than **100** tags.


Use the request body to pass in the ID(s) of the campaign(s) that will be associated with the tag.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`campaigns:write`
`tags:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CampaignEnum;
import com.commercesystems.klaviyo_java.models.components.TagCampaignOp;
import com.commercesystems.klaviyo_java.models.components.TagCampaignOpData;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.TagCampaignsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        TagCampaignsResponse res = sdk.tags().tagCampaigns()
                .id("abcd1234-ef56-gh78-ij90-abcdef123456")
                .revision("2024-10-15")
                .tagCampaignOp(TagCampaignOp.builder()
                    .data(List.of(
                        TagCampaignOpData.builder()
                            .type(CampaignEnum.CAMPAIGN)
                            .id("<id>")
                            .build()))
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               | Example                                                   |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `id`                                                      | *String*                                                  | :heavy_check_mark:                                        | The Tag ID                                                | abcd1234-ef56-gh78-ij90-abcdef123456                      |
| `revision`                                                | *String*                                                  | :heavy_check_mark:                                        | API endpoint revision (format: YYYY-MM-DD[.suffix])       |                                                           |
| `tagCampaignOp`                                           | [TagCampaignOp](../../models/components/TagCampaignOp.md) | :heavy_check_mark:                                        | N/A                                                       |                                                           |

### Response

**[TagCampaignsResponse](../../models/operations/TagCampaignsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## removeTagFromCampaigns

Remove a tag's association with one or more campaigns.


Use the request body to pass in the ID(s) of the campaign(s) whose association with the tag
will be removed.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`campaigns:write`
`tags:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CampaignEnum;
import com.commercesystems.klaviyo_java.models.components.TagCampaignOp;
import com.commercesystems.klaviyo_java.models.components.TagCampaignOpData;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.RemoveTagFromCampaignsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        RemoveTagFromCampaignsResponse res = sdk.tags().removeTagFromCampaigns()
                .id("abcd1234-ef56-gh78-ij90-abcdef123456")
                .revision("2024-10-15")
                .tagCampaignOp(TagCampaignOp.builder()
                    .data(List.of(
                        TagCampaignOpData.builder()
                            .type(CampaignEnum.CAMPAIGN)
                            .id("<id>")
                            .build()))
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               | Example                                                   |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `id`                                                      | *String*                                                  | :heavy_check_mark:                                        | The Tag ID                                                | abcd1234-ef56-gh78-ij90-abcdef123456                      |
| `revision`                                                | *String*                                                  | :heavy_check_mark:                                        | API endpoint revision (format: YYYY-MM-DD[.suffix])       |                                                           |
| `tagCampaignOp`                                           | [TagCampaignOp](../../models/components/TagCampaignOp.md) | :heavy_check_mark:                                        | N/A                                                       |                                                           |

### Response

**[RemoveTagFromCampaignsResponse](../../models/operations/RemoveTagFromCampaignsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getListIdsForTag

Returns the IDs of all lists associated with the given tag.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`lists:read`
`tags:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetListIdsForTagResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetListIdsForTagResponse res = sdk.tags().getListIdsForTag()
                .id("abcd1234-ef56-gh78-ij90-abcdef123456")
                .revision("2024-10-15")
                .call();

        if (res.getTagListRelationshipsResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | The Tag ID                                          | abcd1234-ef56-gh78-ij90-abcdef123456                |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |                                                     |

### Response

**[GetListIdsForTagResponse](../../models/operations/GetListIdsForTagResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## tagLists

Associate a tag with one or more lists. Any list cannot be associated with more than **100** tags.


Use the request body to pass in the ID(s) of the lists(s) that will be associated with the tag.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`lists:write`
`tags:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.ListEnum;
import com.commercesystems.klaviyo_java.models.components.TagListOp;
import com.commercesystems.klaviyo_java.models.components.TagListOpData;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.TagListsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        TagListsResponse res = sdk.tags().tagLists()
                .id("abcd1234-ef56-gh78-ij90-abcdef123456")
                .revision("2024-10-15")
                .tagListOp(TagListOp.builder()
                    .data(List.of(
                        TagListOpData.builder()
                            .type(ListEnum.LIST)
                            .id("<id>")
                            .build()))
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | The Tag ID                                          | abcd1234-ef56-gh78-ij90-abcdef123456                |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |                                                     |
| `tagListOp`                                         | [TagListOp](../../models/components/TagListOp.md)   | :heavy_check_mark:                                  | N/A                                                 |                                                     |

### Response

**[TagListsResponse](../../models/operations/TagListsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## removeTagFromLists

Remove a tag's association with one or more lists.


Use the request body to pass in the ID(s) of the list(s) whose association with the tag
will be removed.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`lists:write`
`tags:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.ListEnum;
import com.commercesystems.klaviyo_java.models.components.TagListOp;
import com.commercesystems.klaviyo_java.models.components.TagListOpData;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.RemoveTagFromListsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        RemoveTagFromListsResponse res = sdk.tags().removeTagFromLists()
                .id("abcd1234-ef56-gh78-ij90-abcdef123456")
                .revision("2024-10-15")
                .tagListOp(TagListOp.builder()
                    .data(List.of(
                        TagListOpData.builder()
                            .type(ListEnum.LIST)
                            .id("<id>")
                            .build()))
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | The Tag ID                                          | abcd1234-ef56-gh78-ij90-abcdef123456                |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |                                                     |
| `tagListOp`                                         | [TagListOp](../../models/components/TagListOp.md)   | :heavy_check_mark:                                  | N/A                                                 |                                                     |

### Response

**[RemoveTagFromListsResponse](../../models/operations/RemoveTagFromListsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getSegmentIdsForTag

Returns the IDs of all segments associated with the given tag.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`segments:read`
`tags:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetSegmentIdsForTagResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetSegmentIdsForTagResponse res = sdk.tags().getSegmentIdsForTag()
                .id("abcd1234-ef56-gh78-ij90-abcdef123456")
                .revision("2024-10-15")
                .call();

        if (res.getTagSegmentRelationshipsResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | The Tag ID                                          | abcd1234-ef56-gh78-ij90-abcdef123456                |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |                                                     |

### Response

**[GetSegmentIdsForTagResponse](../../models/operations/GetSegmentIdsForTagResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## tagSegments

Associate a tag with one or more segments. Any segment cannot be associated with more than **100** tags.


Use the request body to pass in the ID(s) of the segments(s) that will be associated with the tag.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`segments:write`
`tags:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.SegmentEnum;
import com.commercesystems.klaviyo_java.models.components.TagSegmentOp;
import com.commercesystems.klaviyo_java.models.components.TagSegmentOpData;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.TagSegmentsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        TagSegmentsResponse res = sdk.tags().tagSegments()
                .id("abcd1234-ef56-gh78-ij90-abcdef123456")
                .revision("2024-10-15")
                .tagSegmentOp(TagSegmentOp.builder()
                    .data(List.of(
                        TagSegmentOpData.builder()
                            .type(SegmentEnum.SEGMENT)
                            .id("<id>")
                            .build()))
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `id`                                                    | *String*                                                | :heavy_check_mark:                                      | The Tag ID                                              | abcd1234-ef56-gh78-ij90-abcdef123456                    |
| `revision`                                              | *String*                                                | :heavy_check_mark:                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])     |                                                         |
| `tagSegmentOp`                                          | [TagSegmentOp](../../models/components/TagSegmentOp.md) | :heavy_check_mark:                                      | N/A                                                     |                                                         |

### Response

**[TagSegmentsResponse](../../models/operations/TagSegmentsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## removeTagFromSegments

Remove a tag's association with one or more segments.


Use the request body to pass in the ID(s) of the segments(s) whose association with the tag
will be removed.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`segments:write`
`tags:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.SegmentEnum;
import com.commercesystems.klaviyo_java.models.components.TagSegmentOp;
import com.commercesystems.klaviyo_java.models.components.TagSegmentOpData;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.RemoveTagFromSegmentsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        RemoveTagFromSegmentsResponse res = sdk.tags().removeTagFromSegments()
                .id("abcd1234-ef56-gh78-ij90-abcdef123456")
                .revision("2024-10-15")
                .tagSegmentOp(TagSegmentOp.builder()
                    .data(List.of(
                        TagSegmentOpData.builder()
                            .type(SegmentEnum.SEGMENT)
                            .id("<id>")
                            .build()))
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `id`                                                    | *String*                                                | :heavy_check_mark:                                      | The Tag ID                                              | abcd1234-ef56-gh78-ij90-abcdef123456                    |
| `revision`                                              | *String*                                                | :heavy_check_mark:                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])     |                                                         |
| `tagSegmentOp`                                          | [TagSegmentOp](../../models/components/TagSegmentOp.md) | :heavy_check_mark:                                      | N/A                                                     |                                                         |

### Response

**[RemoveTagFromSegmentsResponse](../../models/operations/RemoveTagFromSegmentsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getTagGroupIdForTag

Returns the id of the tag group related to the given tag.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`tags:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetTagGroupIdForTagResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetTagGroupIdForTagResponse res = sdk.tags().getTagGroupIdForTag()
                .id("abcd1234-ef56-gh78-ij90-abcdef123456")
                .revision("2024-10-15")
                .call();

        if (res.getTagTagGroupRelationshipsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | The Tag ID                                          | abcd1234-ef56-gh78-ij90-abcdef123456                |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |                                                     |

### Response

**[GetTagGroupIdForTagResponse](../../models/operations/GetTagGroupIdForTagResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getTagIdsForTagGroup

Returns the tag IDs of all tags inside the given tag group.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`tags:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetTagIdsForTagGroupResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetTagIdsForTagGroupResponse res = sdk.tags().getTagIdsForTagGroup()
                .id("zyxw9876-vu54-ts32-rq10-zyxwvu654321")
                .revision("2024-10-15")
                .call();

        if (res.getTagGroupTagRelationshipsResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | The Tag Group ID                                    | zyxw9876-vu54-ts32-rq10-zyxwvu654321                |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |                                                     |

### Response

**[GetTagIdsForTagGroupResponse](../../models/operations/GetTagIdsForTagGroupResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getTagGroupForTag

Returns the tag group resource for a given tag ID.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`tags:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetTagGroupForTagQueryParamFieldsTagGroup;
import com.commercesystems.klaviyo_java.models.operations.GetTagGroupForTagResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetTagGroupForTagResponse res = sdk.tags().getTagGroupForTag()
                .id("abcd1234-ef56-gh78-ij90-abcdef123456")
                .fieldsTagGroup(List.of(
                    GetTagGroupForTagQueryParamFieldsTagGroup.DEFAULT))
                .revision("2024-10-15")
                .call();

        if (res.getTagGroupResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              | Example                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                                     | *String*                                                                                                                 | :heavy_check_mark:                                                                                                       | The Tag ID                                                                                                               | abcd1234-ef56-gh78-ij90-abcdef123456                                                                                     |
| `fieldsTagGroup`                                                                                                         | List\<[GetTagGroupForTagQueryParamFieldsTagGroup](../../models/operations/GetTagGroupForTagQueryParamFieldsTagGroup.md)> | :heavy_minus_sign:                                                                                                       | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets  |                                                                                                                          |
| `revision`                                                                                                               | *String*                                                                                                                 | :heavy_check_mark:                                                                                                       | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                      |                                                                                                                          |

### Response

**[GetTagGroupForTagResponse](../../models/operations/GetTagGroupForTagResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getTagsForTagGroup

Return the tags for a given tag group ID.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`tags:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetTagsForTagGroupQueryParamFieldsTag;
import com.commercesystems.klaviyo_java.models.operations.GetTagsForTagGroupResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetTagsForTagGroupResponse res = sdk.tags().getTagsForTagGroup()
                .id("zyxw9876-vu54-ts32-rq10-zyxwvu654321")
                .fieldsTag(List.of(
                    GetTagsForTagGroupQueryParamFieldsTag.NAME))
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
| `id`                                                                                                                    | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | The Tag Group ID                                                                                                        | zyxw9876-vu54-ts32-rq10-zyxwvu654321                                                                                    |
| `fieldsTag`                                                                                                             | List\<[GetTagsForTagGroupQueryParamFieldsTag](../../models/operations/GetTagsForTagGroupQueryParamFieldsTag.md)>        | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets |                                                                                                                         |
| `revision`                                                                                                              | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                     |                                                                                                                         |

### Response

**[GetTagsForTagGroupResponse](../../models/operations/GetTagsForTagGroupResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |