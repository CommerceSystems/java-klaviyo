# Images
(*images()*)

## Overview

images

### Available Operations

* [getImages](#getimages) - Get Images
* [uploadImageFromUrl](#uploadimagefromurl) - Upload Image From URL
* [getImage](#getimage) - Get Image
* [updateImage](#updateimage) - Update Image
* [uploadImageFromFile](#uploadimagefromfile) - Upload Image From File

## getImages

Get all images in an account.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`images:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetImagesRequest;
import com.commercesystems.klaviyo_java.models.operations.GetImagesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetImagesRequest req = GetImagesRequest.builder()
                .revision("2024-10-15")
                .build();

        GetImagesResponse res = sdk.images().getImages()
                .request(req)
                .call();

        if (res.getImageResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [GetImagesRequest](../../models/operations/GetImagesRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetImagesResponse](../../models/operations/GetImagesResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## uploadImageFromUrl

Import an image from a url or data uri.

If you want to upload an image from a file, use the Upload Image From File endpoint instead.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `100/m`<br>Daily: `100/d`

**Scopes:**
`images:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.ImageCreateQuery;
import com.commercesystems.klaviyo_java.models.components.ImageCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.ImageCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.ImageEnum;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.UploadImageFromUrlResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        UploadImageFromUrlResponse res = sdk.images().uploadImageFromUrl()
                .revision("2024-10-15")
                .imageCreateQuery(ImageCreateQuery.builder()
                    .data(ImageCreateQueryResourceObject.builder()
                        .type(ImageEnum.IMAGE)
                        .attributes(ImageCreateQueryResourceObjectAttributes.builder()
                            .importFromUrl("https://www.example.com/example.jpg")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postImageResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `revision`                                                      | *String*                                                        | :heavy_check_mark:                                              | API endpoint revision (format: YYYY-MM-DD[.suffix])             |
| `imageCreateQuery`                                              | [ImageCreateQuery](../../models/components/ImageCreateQuery.md) | :heavy_check_mark:                                              | N/A                                                             |

### Response

**[UploadImageFromUrlResponse](../../models/operations/UploadImageFromUrlResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getImage

Get the image with the given image ID.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`images:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetImageResponse;
import com.commercesystems.klaviyo_java.models.operations.QueryParamFieldsImage;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetImageResponse res = sdk.images().getImage()
                .id("7")
                .fieldsImage(List.of(
                    QueryParamFieldsImage.UPDATED_AT))
                .revision("2024-10-15")
                .call();

        if (res.getImageResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             | Example                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                    | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | The ID of the image                                                                                                     | 7                                                                                                                       |
| `fieldsImage`                                                                                                           | List\<[QueryParamFieldsImage](../../models/operations/QueryParamFieldsImage.md)>                                        | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets |                                                                                                                         |
| `revision`                                                                                                              | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                     |                                                                                                                         |

### Response

**[GetImageResponse](../../models/operations/GetImageResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## updateImage

Update the image with the given image ID.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`images:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.ImageEnum;
import com.commercesystems.klaviyo_java.models.components.ImagePartialUpdateQuery;
import com.commercesystems.klaviyo_java.models.components.ImagePartialUpdateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.ImagePartialUpdateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.UpdateImageResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        UpdateImageResponse res = sdk.images().updateImage()
                .id("7")
                .revision("2024-10-15")
                .imagePartialUpdateQuery(ImagePartialUpdateQuery.builder()
                    .data(ImagePartialUpdateQueryResourceObject.builder()
                        .type(ImageEnum.IMAGE)
                        .id("7")
                        .attributes(ImagePartialUpdateQueryResourceObjectAttributes.builder()
                            .build())
                        .build())
                    .build())
                .call();

        if (res.patchImageResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   | Example                                                                       |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `id`                                                                          | *String*                                                                      | :heavy_check_mark:                                                            | The ID of the image                                                           | 7                                                                             |
| `revision`                                                                    | *String*                                                                      | :heavy_check_mark:                                                            | API endpoint revision (format: YYYY-MM-DD[.suffix])                           |                                                                               |
| `imagePartialUpdateQuery`                                                     | [ImagePartialUpdateQuery](../../models/components/ImagePartialUpdateQuery.md) | :heavy_check_mark:                                                            | N/A                                                                           |                                                                               |

### Response

**[UpdateImageResponse](../../models/operations/UpdateImageResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## uploadImageFromFile

Upload an image from a file.

If you want to import an image from an existing url or a data uri, use the Upload Image From URL endpoint instead.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `100/m`<br>Daily: `100/d`

**Scopes:**
`images:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.File;
import com.commercesystems.klaviyo_java.models.components.ImageUploadQuery;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.UploadImageFromFileResponse;
import java.lang.Exception;
import java.nio.charset.StandardCharsets;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        UploadImageFromFileResponse res = sdk.images().uploadImageFromFile()
                .revision("2024-10-15")
                .imageUploadQuery(ImageUploadQuery.builder()
                    .file(File.builder()
                        .fileName("example.file")
                        .content("0x6017A46ea2".getBytes(StandardCharsets.UTF_8))
                        .build())
                    .build())
                .call();

        if (res.postImageResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `revision`                                                      | *String*                                                        | :heavy_check_mark:                                              | API endpoint revision (format: YYYY-MM-DD[.suffix])             |
| `imageUploadQuery`                                              | [ImageUploadQuery](../../models/components/ImageUploadQuery.md) | :heavy_check_mark:                                              | N/A                                                             |

### Response

**[UploadImageFromFileResponse](../../models/operations/UploadImageFromFileResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |