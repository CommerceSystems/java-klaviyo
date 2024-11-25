# Templates
(*templates()*)

## Overview

templates

### Available Operations

* [getTemplates](#gettemplates) - Get Templates
* [createTemplate](#createtemplate) - Create Template
* [getTemplate](#gettemplate) - Get Template
* [updateTemplate](#updatetemplate) - Update Template
* [deleteTemplate](#deletetemplate) - Delete Template
* [getAllUniversalContent](#getalluniversalcontent) - Get All Universal Content
* [createUniversalContent](#createuniversalcontent) - Create Universal Content
* [getUniversalContent](#getuniversalcontent) - Get Universal Content
* [updateUniversalContent](#updateuniversalcontent) - Update Universal Content
* [deleteUniversalContent](#deleteuniversalcontent) - Delete Universal Content
* [renderTemplate](#rendertemplate) - Render Template
* [cloneTemplate](#clonetemplate) - Clone Template

## getTemplates

Get all templates in an account.

Filter to request a subset of all templates. Templates can be sorted by the following fields, in ascending and descending order: `id`, `name`, `created`, `updated`

Returns a maximum of 10 results per page.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`templates:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetTemplatesRequest;
import com.commercesystems.klaviyo_java.models.operations.GetTemplatesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetTemplatesRequest req = GetTemplatesRequest.builder()
                .revision("2024-10-15")
                .build();

        GetTemplatesResponse res = sdk.templates().getTemplates()
                .request(req)
                .call();

        if (res.getTemplateResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetTemplatesRequest](../../models/operations/GetTemplatesRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetTemplatesResponse](../../models/operations/GetTemplatesResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## createTemplate

Create a new custom HTML template.

If there are 1,000 or more templates in an account, creation will fail as there is a limit of 1,000 templates
that can be created via the API.

Request specific fields using [sparse fieldsets](https://developers.klaviyo.com/en/reference/api_overview#sparse-fieldsets).<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`templates:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.TemplateCreateQuery;
import com.commercesystems.klaviyo_java.models.components.TemplateCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.TemplateCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.TemplateEnum;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.CreateTemplateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        CreateTemplateResponse res = sdk.templates().createTemplate()
                .revision("2024-10-15")
                .templateCreateQuery(TemplateCreateQuery.builder()
                    .data(TemplateCreateQueryResourceObject.builder()
                        .type(TemplateEnum.TEMPLATE)
                        .attributes(TemplateCreateQueryResourceObjectAttributes.builder()
                            .name("Monthly Newsletter Template")
                            .editorType("<value>")
                            .html("\n            <html>
                                            <body>
                                                hello world
                                            </body>
                                        </html>
                                    ")
                            .text("hello world")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postTemplateResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `revision`                                                            | *String*                                                              | :heavy_check_mark:                                                    | API endpoint revision (format: YYYY-MM-DD[.suffix])                   |
| `templateCreateQuery`                                                 | [TemplateCreateQuery](../../models/components/TemplateCreateQuery.md) | :heavy_check_mark:                                                    | N/A                                                                   |

### Response

**[CreateTemplateResponse](../../models/operations/CreateTemplateResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getTemplate

Get a template with the given template ID.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`templates:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetTemplateQueryParamFieldsTemplate;
import com.commercesystems.klaviyo_java.models.operations.GetTemplateResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetTemplateResponse res = sdk.templates().getTemplate()
                .id("<id>")
                .fieldsTemplate(List.of(
                    GetTemplateQueryParamFieldsTemplate.UPDATED))
                .revision("2024-10-15")
                .call();

        if (res.getTemplateResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                    | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | The ID of template                                                                                                      |
| `fieldsTemplate`                                                                                                        | List\<[GetTemplateQueryParamFieldsTemplate](../../models/operations/GetTemplateQueryParamFieldsTemplate.md)>            | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets |
| `revision`                                                                                                              | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                     |

### Response

**[GetTemplateResponse](../../models/operations/GetTemplateResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## updateTemplate

Update a template with the given template ID. Does not currently update drag & drop templates.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`templates:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.TemplateEnum;
import com.commercesystems.klaviyo_java.models.components.TemplateUpdateQuery;
import com.commercesystems.klaviyo_java.models.components.TemplateUpdateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.TemplateUpdateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.UpdateTemplateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        UpdateTemplateResponse res = sdk.templates().updateTemplate()
                .id("<id>")
                .revision("2024-10-15")
                .templateUpdateQuery(TemplateUpdateQuery.builder()
                    .data(TemplateUpdateQueryResourceObject.builder()
                        .type(TemplateEnum.TEMPLATE)
                        .id("<id>")
                        .attributes(TemplateUpdateQueryResourceObjectAttributes.builder()
                            .name("Monthly Newsletter Template")
                            .html("\n              <html>
                                              <body>
                                                  hello world
                                              </body>
                                          </html>
                                      ")
                            .text("hello world")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.patchTemplateResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `id`                                                                  | *String*                                                              | :heavy_check_mark:                                                    | The ID of template                                                    |
| `revision`                                                            | *String*                                                              | :heavy_check_mark:                                                    | API endpoint revision (format: YYYY-MM-DD[.suffix])                   |
| `templateUpdateQuery`                                                 | [TemplateUpdateQuery](../../models/components/TemplateUpdateQuery.md) | :heavy_check_mark:                                                    | N/A                                                                   |

### Response

**[UpdateTemplateResponse](../../models/operations/UpdateTemplateResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## deleteTemplate

Delete a template with the given template ID.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`templates:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.DeleteTemplateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        DeleteTemplateResponse res = sdk.templates().deleteTemplate()
                .id("<id>")
                .revision("2024-10-15")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | The ID of template                                  |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |

### Response

**[DeleteTemplateResponse](../../models/operations/DeleteTemplateResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getAllUniversalContent

Get all universal content in an account.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`templates:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetAllUniversalContentRequest;
import com.commercesystems.klaviyo_java.models.operations.GetAllUniversalContentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetAllUniversalContentRequest req = GetAllUniversalContentRequest.builder()
                .revision("2024-10-15")
                .build();

        GetAllUniversalContentResponse res = sdk.templates().getAllUniversalContent()
                .request(req)
                .call();

        if (res.getUniversalContentResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetAllUniversalContentRequest](../../models/operations/GetAllUniversalContentRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetAllUniversalContentResponse](../../models/operations/GetAllUniversalContentResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## createUniversalContent

Create universal content. Only text blocks, which can include text or HTML, are supported at this time.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`templates:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.BlockDisplayOptions;
import com.commercesystems.klaviyo_java.models.components.BlockEnum;
import com.commercesystems.klaviyo_java.models.components.TemplateUniversalContentEnum;
import com.commercesystems.klaviyo_java.models.components.TextBlock;
import com.commercesystems.klaviyo_java.models.components.TextBlockData;
import com.commercesystems.klaviyo_java.models.components.TextBlockStyles;
import com.commercesystems.klaviyo_java.models.components.TextEnum;
import com.commercesystems.klaviyo_java.models.components.UniversalContentCreateQuery;
import com.commercesystems.klaviyo_java.models.components.UniversalContentCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.UniversalContentCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.UniversalContentCreateQueryResourceObjectDefinition;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.CreateUniversalContentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        CreateUniversalContentResponse res = sdk.templates().createUniversalContent()
                .revision("2024-10-15")
                .universalContentCreateQuery(UniversalContentCreateQuery.builder()
                    .data(UniversalContentCreateQueryResourceObject.builder()
                        .type(TemplateUniversalContentEnum.TEMPLATE_UNIVERSAL_CONTENT)
                        .attributes(UniversalContentCreateQueryResourceObjectAttributes.builder()
                            .name("<value>")
                            .definition(UniversalContentCreateQueryResourceObjectDefinition.of(TextBlock.builder()
                                .contentType(BlockEnum.BLOCK)
                                .type(TextEnum.TEXT)
                                .data(TextBlockData.builder()
                                    .content("<value>")
                                    .displayOptions(BlockDisplayOptions.builder()
                                        .build())
                                    .styles(TextBlockStyles.builder()
                                        .build())
                                    .build())
                                .build()))
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postUniversalContentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `revision`                                                                            | *String*                                                                              | :heavy_check_mark:                                                                    | API endpoint revision (format: YYYY-MM-DD[.suffix])                                   |
| `universalContentCreateQuery`                                                         | [UniversalContentCreateQuery](../../models/components/UniversalContentCreateQuery.md) | :heavy_check_mark:                                                                    | Create a template universal content                                                   |

### Response

**[CreateUniversalContentResponse](../../models/operations/CreateUniversalContentResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getUniversalContent

Get the universal content with the given ID.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`templates:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetUniversalContentResponse;
import com.commercesystems.klaviyo_java.models.operations.QueryParamFieldsTemplateUniversalContent;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetUniversalContentResponse res = sdk.templates().getUniversalContent()
                .id("01HWWWKAW4RHXQJCMW4R2KRYR4")
                .fieldsTemplateUniversalContent(List.of(
                    QueryParamFieldsTemplateUniversalContent.DEFINITION_CONTENT_TYPE))
                .revision("2024-10-15")
                .call();

        if (res.getUniversalContentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             | Example                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                    | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | The ID of the universal content                                                                                         | 01HWWWKAW4RHXQJCMW4R2KRYR4                                                                                              |
| `fieldsTemplateUniversalContent`                                                                                        | List\<[QueryParamFieldsTemplateUniversalContent](../../models/operations/QueryParamFieldsTemplateUniversalContent.md)>  | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets |                                                                                                                         |
| `revision`                                                                                                              | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                     |                                                                                                                         |

### Response

**[GetUniversalContentResponse](../../models/operations/GetUniversalContentResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## updateUniversalContent

Update universal content. The `definition` field can only be updated for text blocks at this time.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`templates:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.TemplateUniversalContentEnum;
import com.commercesystems.klaviyo_java.models.components.UniversalContentPartialUpdateQuery;
import com.commercesystems.klaviyo_java.models.components.UniversalContentPartialUpdateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.UniversalContentPartialUpdateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.UpdateUniversalContentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        UpdateUniversalContentResponse res = sdk.templates().updateUniversalContent()
                .id("01HWWWKAW4RHXQJCMW4R2KRYR4")
                .revision("2024-10-15")
                .universalContentPartialUpdateQuery(UniversalContentPartialUpdateQuery.builder()
                    .data(UniversalContentPartialUpdateQueryResourceObject.builder()
                        .type(TemplateUniversalContentEnum.TEMPLATE_UNIVERSAL_CONTENT)
                        .id("01HWWWKAW4RHXQJCMW4R2KRYR4")
                        .attributes(UniversalContentPartialUpdateQueryResourceObjectAttributes.builder()
                            .build())
                        .build())
                    .build())
                .call();

        if (res.patchUniversalContentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         | Example                                                                                             |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `id`                                                                                                | *String*                                                                                            | :heavy_check_mark:                                                                                  | The ID of the template universal content                                                            | 01HWWWKAW4RHXQJCMW4R2KRYR4                                                                          |
| `revision`                                                                                          | *String*                                                                                            | :heavy_check_mark:                                                                                  | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                 |                                                                                                     |
| `universalContentPartialUpdateQuery`                                                                | [UniversalContentPartialUpdateQuery](../../models/components/UniversalContentPartialUpdateQuery.md) | :heavy_check_mark:                                                                                  | Update a universal content by ID                                                                    |                                                                                                     |

### Response

**[UpdateUniversalContentResponse](../../models/operations/UpdateUniversalContentResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## deleteUniversalContent

Delete the universal content with the given ID.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`templates:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.DeleteUniversalContentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        DeleteUniversalContentResponse res = sdk.templates().deleteUniversalContent()
                .id("01HWWWKAW4RHXQJCMW4R2KRYR4")
                .revision("2024-10-15")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | The ID of the template universal content            | 01HWWWKAW4RHXQJCMW4R2KRYR4                          |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |                                                     |

### Response

**[DeleteUniversalContentResponse](../../models/operations/DeleteUniversalContentResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## renderTemplate

Render a template with the given template ID and context attribute. Returns the HTML and plain text versions of the email template.

**Request body parameters** (nested under `attributes`):

* `return_fields`: Request specific fields using [sparse fieldsets](https://developers.klaviyo.com/en/reference/api_overview#sparse-fieldsets).

* `context`: This is the context your email template will be rendered with. You must pass in a `context` object as a JSON object.

Email templates are rendered with contexts in a similar manner to Django templates. Nested template variables can be referenced via dot notation. Template variables without corresponding `context` values are treated as `FALSE` and output nothing.

Ex. `{ "name" : "George Washington", "state" : "VA" }`<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`templates:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.Context;
import com.commercesystems.klaviyo_java.models.components.TemplateEnum;
import com.commercesystems.klaviyo_java.models.components.TemplateRenderQuery;
import com.commercesystems.klaviyo_java.models.components.TemplateRenderQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.TemplateRenderQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.RenderTemplateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        RenderTemplateResponse res = sdk.templates().renderTemplate()
                .revision("2024-10-15")
                .templateRenderQuery(TemplateRenderQuery.builder()
                    .data(TemplateRenderQueryResourceObject.builder()
                        .type(TemplateEnum.TEMPLATE)
                        .id("<id>")
                        .attributes(TemplateRenderQueryResourceObjectAttributes.builder()
                            .context(Context.builder()
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postTemplateResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `revision`                                                            | *String*                                                              | :heavy_check_mark:                                                    | API endpoint revision (format: YYYY-MM-DD[.suffix])                   |
| `templateRenderQuery`                                                 | [TemplateRenderQuery](../../models/components/TemplateRenderQuery.md) | :heavy_check_mark:                                                    | N/A                                                                   |

### Response

**[RenderTemplateResponse](../../models/operations/RenderTemplateResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## cloneTemplate

Create a clone of a template with the given template ID.

If there are 1,000 or more templates in an account, cloning will fail as there is a limit of 1,000 templates
that can be created via the API.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`templates:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.TemplateCloneQuery;
import com.commercesystems.klaviyo_java.models.components.TemplateCloneQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.TemplateCloneQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.TemplateEnum;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.CloneTemplateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        CloneTemplateResponse res = sdk.templates().cloneTemplate()
                .revision("2024-10-15")
                .templateCloneQuery(TemplateCloneQuery.builder()
                    .data(TemplateCloneQueryResourceObject.builder()
                        .type(TemplateEnum.TEMPLATE)
                        .id("<id>")
                        .attributes(TemplateCloneQueryResourceObjectAttributes.builder()
                            .name("Clone of Monthly Newsletter Template")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postTemplateResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `revision`                                                          | *String*                                                            | :heavy_check_mark:                                                  | API endpoint revision (format: YYYY-MM-DD[.suffix])                 |
| `templateCloneQuery`                                                | [TemplateCloneQuery](../../models/components/TemplateCloneQuery.md) | :heavy_check_mark:                                                  | N/A                                                                 |

### Response

**[CloneTemplateResponse](../../models/operations/CloneTemplateResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |