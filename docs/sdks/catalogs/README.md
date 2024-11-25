# Catalogs
(*catalogs()*)

## Overview

catalogs

### Available Operations

* [getCatalogItems](#getcatalogitems) - Get Catalog Items
* [createCatalogItem](#createcatalogitem) - Create Catalog Item
* [getCatalogItem](#getcatalogitem) - Get Catalog Item
* [updateCatalogItem](#updatecatalogitem) - Update Catalog Item
* [deleteCatalogItem](#deletecatalogitem) - Delete Catalog Item
* [getCatalogVariants](#getcatalogvariants) - Get Catalog Variants
* [createCatalogVariant](#createcatalogvariant) - Create Catalog Variant
* [getCatalogVariant](#getcatalogvariant) - Get Catalog Variant
* [updateCatalogVariant](#updatecatalogvariant) - Update Catalog Variant
* [deleteCatalogVariant](#deletecatalogvariant) - Delete Catalog Variant
* [getCatalogCategories](#getcatalogcategories) - Get Catalog Categories
* [createCatalogCategory](#createcatalogcategory) - Create Catalog Category
* [getCatalogCategory](#getcatalogcategory) - Get Catalog Category
* [updateCatalogCategory](#updatecatalogcategory) - Update Catalog Category
* [deleteCatalogCategory](#deletecatalogcategory) - Delete Catalog Category
* [getBulkCreateCatalogItemsJobs](#getbulkcreatecatalogitemsjobs) - Get Bulk Create Catalog Items Jobs
* [bulkCreateCatalogItems](#bulkcreatecatalogitems) - Bulk Create Catalog Items
* [getBulkCreateCatalogItemsJob](#getbulkcreatecatalogitemsjob) - Get Bulk Create Catalog Items Job
* [getBulkUpdateCatalogItemsJobs](#getbulkupdatecatalogitemsjobs) - Get Bulk Update Catalog Items Jobs
* [bulkUpdateCatalogItems](#bulkupdatecatalogitems) - Bulk Update Catalog Items
* [getBulkUpdateCatalogItemsJob](#getbulkupdatecatalogitemsjob) - Get Bulk Update Catalog Items Job
* [getBulkDeleteCatalogItemsJobs](#getbulkdeletecatalogitemsjobs) - Get Bulk Delete Catalog Items Jobs
* [bulkDeleteCatalogItems](#bulkdeletecatalogitems) - Bulk Delete Catalog Items
* [getBulkDeleteCatalogItemsJob](#getbulkdeletecatalogitemsjob) - Get Bulk Delete Catalog Items Job
* [getCreateVariantsJobs](#getcreatevariantsjobs) - Get Create Variants Jobs
* [bulkCreateCatalogVariants](#bulkcreatecatalogvariants) - Bulk Create Catalog Variants
* [getCreateVariantsJob](#getcreatevariantsjob) - Get Create Variants Job
* [getUpdateVariantsJobs](#getupdatevariantsjobs) - Get Update Variants Jobs
* [bulkUpdateCatalogVariants](#bulkupdatecatalogvariants) - Bulk Update Catalog Variants
* [getUpdateVariantsJob](#getupdatevariantsjob) - Get Update Variants Job
* [getDeleteVariantsJobs](#getdeletevariantsjobs) - Get Delete Variants Jobs
* [bulkDeleteCatalogVariants](#bulkdeletecatalogvariants) - Bulk Delete Catalog Variants
* [getDeleteVariantsJob](#getdeletevariantsjob) - Get Delete Variants Job
* [getCreateCategoriesJobs](#getcreatecategoriesjobs) - Get Create Categories Jobs
* [bulkCreateCatalogCategories](#bulkcreatecatalogcategories) - Bulk Create Catalog Categories
* [getCreateCategoriesJob](#getcreatecategoriesjob) - Get Create Categories Job
* [getUpdateCategoriesJobs](#getupdatecategoriesjobs) - Get Update Categories Jobs
* [bulkUpdateCatalogCategories](#bulkupdatecatalogcategories) - Bulk Update Catalog Categories
* [getUpdateCategoriesJob](#getupdatecategoriesjob) - Get Update Categories Job
* [getDeleteCategoriesJobs](#getdeletecategoriesjobs) - Get Delete Categories Jobs
* [bulkDeleteCatalogCategories](#bulkdeletecatalogcategories) - Bulk Delete Catalog Categories
* [getDeleteCategoriesJob](#getdeletecategoriesjob) - Get Delete Categories Job
* [createBackInStockSubscription](#createbackinstocksubscription) - Create Back In Stock Subscription
* [getItemsForCatalogCategory](#getitemsforcatalogcategory) - Get Items for Catalog Category
* [getVariantsForCatalogItem](#getvariantsforcatalogitem) - Get Variants for Catalog Item
* [getCategoriesForCatalogItem](#getcategoriesforcatalogitem) - Get Categories for Catalog Item
* [getItemIdsForCatalogCategory](#getitemidsforcatalogcategory) - Get Item IDs for Catalog Category
* [addItemsToCatalogCategory](#additemstocatalogcategory) - Add Items to Catalog Category
* [updateItemsForCatalogCategory](#updateitemsforcatalogcategory) - Update Items for Catalog Category
* [removeItemsFromCatalogCategory](#removeitemsfromcatalogcategory) - Remove Items from Catalog Category
* [getCategoryIdsForCatalogItem](#getcategoryidsforcatalogitem) - Get Category IDs for Catalog Item
* [addCategoryToCatalogItem](#addcategorytocatalogitem) - Add Category to Catalog Item
* [updateCategoriesForCatalogItem](#updatecategoriesforcatalogitem) - Update Categories for Catalog Item
* [removeCategoriesFromCatalogItem](#removecategoriesfromcatalogitem) - Remove Categories from Catalog Item

## getCatalogItems

Get all catalog items in an account.

Catalog items can be sorted by the following fields, in ascending and descending order:
`created`

Currently, the only supported integration type is `$custom`, and the only supported catalog type is `$default`.

Returns a maximum of 100 items per request.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetCatalogItemsRequest;
import com.commercesystems.klaviyo_java.models.operations.GetCatalogItemsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCatalogItemsRequest req = GetCatalogItemsRequest.builder()
                .revision("2024-10-15")
                .build();

        GetCatalogItemsResponse res = sdk.catalogs().getCatalogItems()
                .request(req)
                .call();

        if (res.getCatalogItemResponseCollectionCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetCatalogItemsRequest](../../models/operations/GetCatalogItemsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetCatalogItemsResponse](../../models/operations/GetCatalogItemsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## createCatalogItem

Create a new catalog item.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`catalogs:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogItemCreateQuery;
import com.commercesystems.klaviyo_java.models.components.CatalogItemCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CatalogItemCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CatalogItemCreateQueryResourceObjectCustomMetadata;
import com.commercesystems.klaviyo_java.models.components.CatalogItemCreateQueryResourceObjectData;
import com.commercesystems.klaviyo_java.models.components.CatalogItemCreateQueryResourceObjectRelationships;
import com.commercesystems.klaviyo_java.models.components.CatalogItemEnum;
import com.commercesystems.klaviyo_java.models.components.Categories;
import com.commercesystems.klaviyo_java.models.components.IntegrationType;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.CreateCatalogItemResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        CreateCatalogItemResponse res = sdk.catalogs().createCatalogItem()
                .revision("2024-10-15")
                .catalogItemCreateQuery(CatalogItemCreateQuery.builder()
                    .data(CatalogItemCreateQueryResourceObject.builder()
                        .type(CatalogItemEnum.CATALOG_ITEM)
                        .attributes(CatalogItemCreateQueryResourceObjectAttributes.builder()
                            .externalId("SAMPLE-DATA-ITEM-1")
                            .title("Ocean Blue Shirt (Sample)")
                            .description("Ocean blue cotton shirt with a narrow collar and buttons down the front and long sleeves. Comfortable fit and titled kaleidoscope patterns.")
                            .url("https://via.placeholder.com/150")
                            .integrationType(IntegrationType.DOLLAR_CUSTOM)
                            .price(42d)
                            .catalogType("$default")
                            .imageFullUrl("https://via.placeholder.com/300")
                            .imageThumbnailUrl("https://via.placeholder.com/150")
                            .images(List.of(
                                "https://via.placeholder.com/150"))
                            .customMetadata(CatalogItemCreateQueryResourceObjectCustomMetadata.builder()
                                .build())
                            .published(true)
                            .build())
                        .relationships(CatalogItemCreateQueryResourceObjectRelationships.builder()
                            .categories(Categories.builder()
                                .data(List.of(
                                    CatalogItemCreateQueryResourceObjectData.builder()
                                        .type(CatalogCategoryEnum.CATALOG_CATEGORY)
                                        .id("$custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL")
                                        .build()))
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postCatalogItemResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `revision`                                                                  | *String*                                                                    | :heavy_check_mark:                                                          | API endpoint revision (format: YYYY-MM-DD[.suffix])                         |
| `catalogItemCreateQuery`                                                    | [CatalogItemCreateQuery](../../models/components/CatalogItemCreateQuery.md) | :heavy_check_mark:                                                          | N/A                                                                         |

### Response

**[CreateCatalogItemResponse](../../models/operations/CreateCatalogItemResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getCatalogItem

Get a specific catalog item with the given item ID.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetCatalogItemRequest;
import com.commercesystems.klaviyo_java.models.operations.GetCatalogItemResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCatalogItemRequest req = GetCatalogItemRequest.builder()
                .id("$custom:::$default:::SAMPLE-DATA-ITEM-1")
                .revision("2024-10-15")
                .build();

        GetCatalogItemResponse res = sdk.catalogs().getCatalogItem()
                .request(req)
                .call();

        if (res.getCatalogItemResponseCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetCatalogItemRequest](../../models/operations/GetCatalogItemRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetCatalogItemResponse](../../models/operations/GetCatalogItemResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## updateCatalogItem

Update a catalog item with the given item ID.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`catalogs:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogItemEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogItemUpdateQuery;
import com.commercesystems.klaviyo_java.models.components.CatalogItemUpdateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CatalogItemUpdateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CatalogItemUpdateQueryResourceObjectCategories;
import com.commercesystems.klaviyo_java.models.components.CatalogItemUpdateQueryResourceObjectCustomMetadata;
import com.commercesystems.klaviyo_java.models.components.CatalogItemUpdateQueryResourceObjectData;
import com.commercesystems.klaviyo_java.models.components.CatalogItemUpdateQueryResourceObjectRelationships;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.UpdateCatalogItemResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        UpdateCatalogItemResponse res = sdk.catalogs().updateCatalogItem()
                .id("$custom:::$default:::SAMPLE-DATA-ITEM-1")
                .revision("2024-10-15")
                .catalogItemUpdateQuery(CatalogItemUpdateQuery.builder()
                    .data(CatalogItemUpdateQueryResourceObject.builder()
                        .type(CatalogItemEnum.CATALOG_ITEM)
                        .id("$custom:::$default:::SAMPLE-DATA-ITEM-1")
                        .attributes(CatalogItemUpdateQueryResourceObjectAttributes.builder()
                            .title("Ocean Blue Shirt (Sample)")
                            .price(42d)
                            .description("A description of the catalog item.")
                            .url("https://via.placeholder.com/150")
                            .imageFullUrl("https://via.placeholder.com/300")
                            .imageThumbnailUrl("https://via.placeholder.com/150")
                            .images(List.of(
                                "https://via.placeholder.com/150"))
                            .customMetadata(CatalogItemUpdateQueryResourceObjectCustomMetadata.builder()
                                .build())
                            .published(true)
                            .build())
                        .relationships(CatalogItemUpdateQueryResourceObjectRelationships.builder()
                            .categories(CatalogItemUpdateQueryResourceObjectCategories.builder()
                                .data(List.of(
                                    CatalogItemUpdateQueryResourceObjectData.builder()
                                        .type(CatalogCategoryEnum.CATALOG_CATEGORY)
                                        .id("$custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL")
                                        .build()))
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.patchCatalogItemResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                           | Type                                                                                                                                                                                                                | Required                                                                                                                                                                                                            | Description                                                                                                                                                                                                         | Example                                                                                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                                                  | The catalog item ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`. | $custom:::$default:::SAMPLE-DATA-ITEM-1                                                                                                                                                                             |
| `revision`                                                                                                                                                                                                          | *String*                                                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                                                  | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                                                                 |                                                                                                                                                                                                                     |
| `catalogItemUpdateQuery`                                                                                                                                                                                            | [CatalogItemUpdateQuery](../../models/components/CatalogItemUpdateQuery.md)                                                                                                                                         | :heavy_check_mark:                                                                                                                                                                                                  | N/A                                                                                                                                                                                                                 |                                                                                                                                                                                                                     |

### Response

**[UpdateCatalogItemResponse](../../models/operations/UpdateCatalogItemResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## deleteCatalogItem

Delete a catalog item with the given item ID.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`catalogs:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.DeleteCatalogItemResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        DeleteCatalogItemResponse res = sdk.catalogs().deleteCatalogItem()
                .id("$custom:::$default:::SAMPLE-DATA-ITEM-1")
                .revision("2024-10-15")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                           | Type                                                                                                                                                                                                                | Required                                                                                                                                                                                                            | Description                                                                                                                                                                                                         | Example                                                                                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                                                  | The catalog item ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`. | $custom:::$default:::SAMPLE-DATA-ITEM-1                                                                                                                                                                             |
| `revision`                                                                                                                                                                                                          | *String*                                                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                                                  | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                                                                 |                                                                                                                                                                                                                     |

### Response

**[DeleteCatalogItemResponse](../../models/operations/DeleteCatalogItemResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getCatalogVariants

Get all variants in an account.

Variants can be sorted by the following fields, in ascending and descending order:
`created`

Currently, the only supported integration type is `$custom`, and the only supported catalog type is `$default`.

Returns a maximum of 100 variants per request.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetCatalogVariantsRequest;
import com.commercesystems.klaviyo_java.models.operations.GetCatalogVariantsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCatalogVariantsRequest req = GetCatalogVariantsRequest.builder()
                .revision("2024-10-15")
                .build();

        GetCatalogVariantsResponse res = sdk.catalogs().getCatalogVariants()
                .request(req)
                .call();

        if (res.getCatalogVariantResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetCatalogVariantsRequest](../../models/operations/GetCatalogVariantsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetCatalogVariantsResponse](../../models/operations/GetCatalogVariantsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## createCatalogVariant

Create a new variant for a related catalog item.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`catalogs:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CatalogItemEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantCreateQuery;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantCreateQueryResourceObjectCustomMetadata;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantCreateQueryResourceObjectData;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantCreateQueryResourceObjectIntegrationType;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantCreateQueryResourceObjectInventoryPolicy;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantCreateQueryResourceObjectRelationships;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantEnum;
import com.commercesystems.klaviyo_java.models.components.Item;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.CreateCatalogVariantResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        CreateCatalogVariantResponse res = sdk.catalogs().createCatalogVariant()
                .revision("2024-10-15")
                .catalogVariantCreateQuery(CatalogVariantCreateQuery.builder()
                    .data(CatalogVariantCreateQueryResourceObject.builder()
                        .type(CatalogVariantEnum.CATALOG_VARIANT)
                        .attributes(CatalogVariantCreateQueryResourceObjectAttributes.builder()
                            .externalId("SAMPLE-DATA-ITEM-1-VARIANT-MEDIUM")
                            .title("Ocean Blue Shirt (Sample) Variant Medium")
                            .description("Ocean blue cotton shirt with a narrow collar and buttons down the front and long sleeves. Comfortable fit and titled kaleidoscope patterns.")
                            .sku("OBS-MD")
                            .inventoryQuantity(25d)
                            .price(42d)
                            .url("https://via.placeholder.com/150")
                            .catalogType("$default")
                            .integrationType(CatalogVariantCreateQueryResourceObjectIntegrationType.DOLLAR_CUSTOM)
                            .inventoryPolicy(CatalogVariantCreateQueryResourceObjectInventoryPolicy.TWO)
                            .imageFullUrl("https://via.placeholder.com/300")
                            .imageThumbnailUrl("https://via.placeholder.com/150")
                            .images(List.of(
                                "https://via.placeholder.com/150"))
                            .customMetadata(CatalogVariantCreateQueryResourceObjectCustomMetadata.builder()
                                .build())
                            .published(true)
                            .build())
                        .relationships(CatalogVariantCreateQueryResourceObjectRelationships.builder()
                            .item(Item.builder()
                                .data(CatalogVariantCreateQueryResourceObjectData.builder()
                                    .type(CatalogItemEnum.CATALOG_ITEM)
                                    .id("$custom:::$default:::SAMPLE-DATA-ITEM-1")
                                    .build())
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postCatalogVariantResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `revision`                                                                        | *String*                                                                          | :heavy_check_mark:                                                                | API endpoint revision (format: YYYY-MM-DD[.suffix])                               |
| `catalogVariantCreateQuery`                                                       | [CatalogVariantCreateQuery](../../models/components/CatalogVariantCreateQuery.md) | :heavy_check_mark:                                                                | N/A                                                                               |

### Response

**[CreateCatalogVariantResponse](../../models/operations/CreateCatalogVariantResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getCatalogVariant

Get a catalog item variant with the given variant ID.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetCatalogVariantQueryParamFieldsCatalogVariant;
import com.commercesystems.klaviyo_java.models.operations.GetCatalogVariantResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCatalogVariantResponse res = sdk.catalogs().getCatalogVariant()
                .id("$custom:::$default:::SAMPLE-DATA-ITEM-1-VARIANT-MEDIUM")
                .fieldsCatalogVariant(List.of(
                    GetCatalogVariantQueryParamFieldsCatalogVariant.IMAGE_FULL_URL))
                .revision("2024-10-15")
                .call();

        if (res.getCatalogVariantResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                              | Type                                                                                                                                                                                                                   | Required                                                                                                                                                                                                               | Description                                                                                                                                                                                                            | Example                                                                                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                                                                                   | *String*                                                                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                                                     | The catalog variant ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`. | $custom:::$default:::SAMPLE-DATA-ITEM-1-VARIANT-MEDIUM                                                                                                                                                                 |
| `fieldsCatalogVariant`                                                                                                                                                                                                 | List\<[GetCatalogVariantQueryParamFieldsCatalogVariant](../../models/operations/GetCatalogVariantQueryParamFieldsCatalogVariant.md)>                                                                                   | :heavy_minus_sign:                                                                                                                                                                                                     | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                                                                                                |                                                                                                                                                                                                                        |
| `revision`                                                                                                                                                                                                             | *String*                                                                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                                                     | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                                                                    |                                                                                                                                                                                                                        |

### Response

**[GetCatalogVariantResponse](../../models/operations/GetCatalogVariantResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## updateCatalogVariant

Update a catalog item variant with the given variant ID.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`catalogs:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantUpdateQuery;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantUpdateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantUpdateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantUpdateQueryResourceObjectCustomMetadata;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantUpdateQueryResourceObjectInventoryPolicy;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.UpdateCatalogVariantResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        UpdateCatalogVariantResponse res = sdk.catalogs().updateCatalogVariant()
                .id("$custom:::$default:::SAMPLE-DATA-ITEM-1-VARIANT-MEDIUM")
                .revision("2024-10-15")
                .catalogVariantUpdateQuery(CatalogVariantUpdateQuery.builder()
                    .data(CatalogVariantUpdateQueryResourceObject.builder()
                        .type(CatalogVariantEnum.CATALOG_VARIANT)
                        .id("$custom:::$default:::SAMPLE-DATA-ITEM-1-VARIANT-MEDIUM")
                        .attributes(CatalogVariantUpdateQueryResourceObjectAttributes.builder()
                            .title("Ocean Blue Shirt (Sample) Variant Medium")
                            .description("Ocean blue cotton shirt with a narrow collar and buttons down the front and long sleeves. Comfortable fit and titled kaleidoscope patterns.")
                            .sku("OBS-MD")
                            .inventoryPolicy(CatalogVariantUpdateQueryResourceObjectInventoryPolicy.TWO)
                            .inventoryQuantity(25d)
                            .price(42d)
                            .url("https://via.placeholder.com/150")
                            .imageFullUrl("https://via.placeholder.com/300")
                            .imageThumbnailUrl("https://via.placeholder.com/150")
                            .images(List.of(
                                "https://via.placeholder.com/150"))
                            .customMetadata(CatalogVariantUpdateQueryResourceObjectCustomMetadata.builder()
                                .build())
                            .published(true)
                            .build())
                        .build())
                    .build())
                .call();

        if (res.patchCatalogVariantResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                              | Type                                                                                                                                                                                                                   | Required                                                                                                                                                                                                               | Description                                                                                                                                                                                                            | Example                                                                                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                                                                                   | *String*                                                                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                                                     | The catalog variant ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`. | $custom:::$default:::SAMPLE-DATA-ITEM-1-VARIANT-MEDIUM                                                                                                                                                                 |
| `revision`                                                                                                                                                                                                             | *String*                                                                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                                                     | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                                                                    |                                                                                                                                                                                                                        |
| `catalogVariantUpdateQuery`                                                                                                                                                                                            | [CatalogVariantUpdateQuery](../../models/components/CatalogVariantUpdateQuery.md)                                                                                                                                      | :heavy_check_mark:                                                                                                                                                                                                     | N/A                                                                                                                                                                                                                    |                                                                                                                                                                                                                        |

### Response

**[UpdateCatalogVariantResponse](../../models/operations/UpdateCatalogVariantResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## deleteCatalogVariant

Delete a catalog item variant with the given variant ID.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`catalogs:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.DeleteCatalogVariantResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        DeleteCatalogVariantResponse res = sdk.catalogs().deleteCatalogVariant()
                .id("$custom:::$default:::SAMPLE-DATA-ITEM-1-VARIANT-MEDIUM")
                .revision("2024-10-15")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                              | Type                                                                                                                                                                                                                   | Required                                                                                                                                                                                                               | Description                                                                                                                                                                                                            | Example                                                                                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                                                                                   | *String*                                                                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                                                     | The catalog variant ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`. | $custom:::$default:::SAMPLE-DATA-ITEM-1-VARIANT-MEDIUM                                                                                                                                                                 |
| `revision`                                                                                                                                                                                                             | *String*                                                                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                                                     | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                                                                    |                                                                                                                                                                                                                        |

### Response

**[DeleteCatalogVariantResponse](../../models/operations/DeleteCatalogVariantResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getCatalogCategories

Get all catalog categories in an account.

Catalog categories can be sorted by the following fields, in ascending and descending order:
`created`

Currently, the only supported integration type is `$custom`, and the only supported catalog type is `$default`.

Returns a maximum of 100 categories per request.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetCatalogCategoriesRequest;
import com.commercesystems.klaviyo_java.models.operations.GetCatalogCategoriesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCatalogCategoriesRequest req = GetCatalogCategoriesRequest.builder()
                .revision("2024-10-15")
                .build();

        GetCatalogCategoriesResponse res = sdk.catalogs().getCatalogCategories()
                .request(req)
                .call();

        if (res.getCatalogCategoryResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetCatalogCategoriesRequest](../../models/operations/GetCatalogCategoriesRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetCatalogCategoriesResponse](../../models/operations/GetCatalogCategoriesResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## createCatalogCategory

Create a new catalog category.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`catalogs:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryCreateQuery;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryCreateQueryResourceObjectData;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryCreateQueryResourceObjectIntegrationType;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryCreateQueryResourceObjectRelationships;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogItemEnum;
import com.commercesystems.klaviyo_java.models.components.Items;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.CreateCatalogCategoryResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        CreateCatalogCategoryResponse res = sdk.catalogs().createCatalogCategory()
                .revision("2024-10-15")
                .catalogCategoryCreateQuery(CatalogCategoryCreateQuery.builder()
                    .data(CatalogCategoryCreateQueryResourceObject.builder()
                        .type(CatalogCategoryEnum.CATALOG_CATEGORY)
                        .attributes(CatalogCategoryCreateQueryResourceObjectAttributes.builder()
                            .externalId("SAMPLE-DATA-CATEGORY-APPAREL")
                            .name("Sample Data Category Apparel")
                            .integrationType(CatalogCategoryCreateQueryResourceObjectIntegrationType.DOLLAR_CUSTOM)
                            .catalogType("$default")
                            .build())
                        .relationships(CatalogCategoryCreateQueryResourceObjectRelationships.builder()
                            .items(Items.builder()
                                .data(List.of(
                                    CatalogCategoryCreateQueryResourceObjectData.builder()
                                        .type(CatalogItemEnum.CATALOG_ITEM)
                                        .id("$custom:::$default:::SAMPLE-DATA-ITEM-1")
                                        .build()))
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postCatalogCategoryResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `revision`                                                                          | *String*                                                                            | :heavy_check_mark:                                                                  | API endpoint revision (format: YYYY-MM-DD[.suffix])                                 |
| `catalogCategoryCreateQuery`                                                        | [CatalogCategoryCreateQuery](../../models/components/CatalogCategoryCreateQuery.md) | :heavy_check_mark:                                                                  | N/A                                                                                 |

### Response

**[CreateCatalogCategoryResponse](../../models/operations/CreateCatalogCategoryResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getCatalogCategory

Get a catalog category with the given category ID.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetCatalogCategoryResponse;
import com.commercesystems.klaviyo_java.models.operations.QueryParamFieldsCatalogCategory;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCatalogCategoryResponse res = sdk.catalogs().getCatalogCategory()
                .id("$custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL")
                .fieldsCatalogCategory(List.of(
                    QueryParamFieldsCatalogCategory.EXTERNAL_ID))
                .revision("2024-10-15")
                .call();

        if (res.getCatalogCategoryResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                               | Type                                                                                                                                                                                                                    | Required                                                                                                                                                                                                                | Description                                                                                                                                                                                                             | Example                                                                                                                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                                                                                    | *String*                                                                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                                                                      | The catalog category ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`. | $custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL                                                                                                                                                                       |
| `fieldsCatalogCategory`                                                                                                                                                                                                 | List\<[QueryParamFieldsCatalogCategory](../../models/operations/QueryParamFieldsCatalogCategory.md)>                                                                                                                    | :heavy_minus_sign:                                                                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                                                                                                 |                                                                                                                                                                                                                         |
| `revision`                                                                                                                                                                                                              | *String*                                                                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                                                                     |                                                                                                                                                                                                                         |

### Response

**[GetCatalogCategoryResponse](../../models/operations/GetCatalogCategoryResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## updateCatalogCategory

Update a catalog category with the given category ID.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`catalogs:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryUpdateQuery;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryUpdateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryUpdateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryUpdateQueryResourceObjectData;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryUpdateQueryResourceObjectItems;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryUpdateQueryResourceObjectRelationships;
import com.commercesystems.klaviyo_java.models.components.CatalogItemEnum;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.UpdateCatalogCategoryResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        UpdateCatalogCategoryResponse res = sdk.catalogs().updateCatalogCategory()
                .id("$custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL")
                .revision("2024-10-15")
                .catalogCategoryUpdateQuery(CatalogCategoryUpdateQuery.builder()
                    .data(CatalogCategoryUpdateQueryResourceObject.builder()
                        .type(CatalogCategoryEnum.CATALOG_CATEGORY)
                        .id("$custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL")
                        .attributes(CatalogCategoryUpdateQueryResourceObjectAttributes.builder()
                            .name("Sample Data Category Apparel")
                            .build())
                        .relationships(CatalogCategoryUpdateQueryResourceObjectRelationships.builder()
                            .items(CatalogCategoryUpdateQueryResourceObjectItems.builder()
                                .data(List.of(
                                    CatalogCategoryUpdateQueryResourceObjectData.builder()
                                        .type(CatalogItemEnum.CATALOG_ITEM)
                                        .id("$custom:::$default:::SAMPLE-DATA-ITEM-1")
                                        .build()))
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.patchCatalogCategoryResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                               | Type                                                                                                                                                                                                                    | Required                                                                                                                                                                                                                | Description                                                                                                                                                                                                             | Example                                                                                                                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                                                                                    | *String*                                                                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                                                                      | The catalog category ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`. | $custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL                                                                                                                                                                       |
| `revision`                                                                                                                                                                                                              | *String*                                                                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                                                                     |                                                                                                                                                                                                                         |
| `catalogCategoryUpdateQuery`                                                                                                                                                                                            | [CatalogCategoryUpdateQuery](../../models/components/CatalogCategoryUpdateQuery.md)                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                      | N/A                                                                                                                                                                                                                     |                                                                                                                                                                                                                         |

### Response

**[UpdateCatalogCategoryResponse](../../models/operations/UpdateCatalogCategoryResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## deleteCatalogCategory

Delete a catalog category using the given category ID.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`catalogs:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.DeleteCatalogCategoryResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        DeleteCatalogCategoryResponse res = sdk.catalogs().deleteCatalogCategory()
                .id("$custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL")
                .revision("2024-10-15")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                               | Type                                                                                                                                                                                                                    | Required                                                                                                                                                                                                                | Description                                                                                                                                                                                                             | Example                                                                                                                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                                                                                    | *String*                                                                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                                                                      | The catalog category ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`. | $custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL                                                                                                                                                                       |
| `revision`                                                                                                                                                                                                              | *String*                                                                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                                                                     |                                                                                                                                                                                                                         |

### Response

**[DeleteCatalogCategoryResponse](../../models/operations/DeleteCatalogCategoryResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getBulkCreateCatalogItemsJobs

Get all catalog item bulk create jobs.

Returns a maximum of 100 jobs per request.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.FieldsCatalogItemBulkCreateJob;
import com.commercesystems.klaviyo_java.models.operations.GetBulkCreateCatalogItemsJobsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetBulkCreateCatalogItemsJobsResponse res = sdk.catalogs().getBulkCreateCatalogItemsJobs()
                .fieldsCatalogItemBulkCreateJob(List.of(
                    FieldsCatalogItemBulkCreateJob.ERRORS))
                .filter("<value>")
                .pageCursor("<value>")
                .revision("2024-10-15")
                .call();

        if (res.getCatalogItemCreateJobResponseCollectionCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                               | Type                                                                                                                                                                    | Required                                                                                                                                                                | Description                                                                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `fieldsCatalogItemBulkCreateJob`                                                                                                                                        | List\<[FieldsCatalogItemBulkCreateJob](../../models/operations/FieldsCatalogItemBulkCreateJob.md)>                                                                      | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                                                 |
| `filter`                                                                                                                                                                | *Optional\<String>*                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals` |
| `pageCursor`                                                                                                                                                            | *Optional\<String>*                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination                                                       |
| `revision`                                                                                                                                                              | *String*                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                     |

### Response

**[GetBulkCreateCatalogItemsJobsResponse](../../models/operations/GetBulkCreateCatalogItemsJobsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## bulkCreateCatalogItems

Create a catalog item bulk create job to create a batch of catalog items.

Accepts up to 100 catalog items per request. The maximum allowed payload size is 5MB.
The maximum number of jobs in progress at one time is 500.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`catalogs:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogItemBulkCreateJobEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogItemCreateJobCreateQuery;
import com.commercesystems.klaviyo_java.models.components.CatalogItemCreateJobCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CatalogItemCreateJobCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CatalogItemCreateJobCreateQueryResourceObjectItems;
import com.commercesystems.klaviyo_java.models.components.CatalogItemCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CatalogItemCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CatalogItemCreateQueryResourceObjectCustomMetadata;
import com.commercesystems.klaviyo_java.models.components.CatalogItemCreateQueryResourceObjectData;
import com.commercesystems.klaviyo_java.models.components.CatalogItemCreateQueryResourceObjectRelationships;
import com.commercesystems.klaviyo_java.models.components.CatalogItemEnum;
import com.commercesystems.klaviyo_java.models.components.Categories;
import com.commercesystems.klaviyo_java.models.components.IntegrationType;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.BulkCreateCatalogItemsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        BulkCreateCatalogItemsResponse res = sdk.catalogs().bulkCreateCatalogItems()
                .revision("2024-10-15")
                .catalogItemCreateJobCreateQuery(CatalogItemCreateJobCreateQuery.builder()
                    .data(CatalogItemCreateJobCreateQueryResourceObject.builder()
                        .type(CatalogItemBulkCreateJobEnum.CATALOG_ITEM_BULK_CREATE_JOB)
                        .attributes(CatalogItemCreateJobCreateQueryResourceObjectAttributes.builder()
                            .items(CatalogItemCreateJobCreateQueryResourceObjectItems.builder()
                                .data(List.of(
                                    CatalogItemCreateQueryResourceObject.builder()
                                        .type(CatalogItemEnum.CATALOG_ITEM)
                                        .attributes(CatalogItemCreateQueryResourceObjectAttributes.builder()
                                            .externalId("SAMPLE-DATA-ITEM-1")
                                            .title("Ocean Blue Shirt (Sample)")
                                            .description("Ocean blue cotton shirt with a narrow collar and buttons down the front and long sleeves. Comfortable fit and titled kaleidoscope patterns.")
                                            .url("https://via.placeholder.com/150")
                                            .integrationType(IntegrationType.DOLLAR_CUSTOM)
                                            .price(42d)
                                            .catalogType("$default")
                                            .imageFullUrl("https://via.placeholder.com/300")
                                            .imageThumbnailUrl("https://via.placeholder.com/150")
                                            .images(List.of(
                                                "https://via.placeholder.com/150"))
                                            .customMetadata(CatalogItemCreateQueryResourceObjectCustomMetadata.builder()
                                                .build())
                                            .published(true)
                                            .build())
                                        .relationships(CatalogItemCreateQueryResourceObjectRelationships.builder()
                                            .categories(Categories.builder()
                                                .data(List.of(
                                                    CatalogItemCreateQueryResourceObjectData.builder()
                                                        .type(CatalogCategoryEnum.CATALOG_CATEGORY)
                                                        .id("$custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL")
                                                        .build()))
                                                .build())
                                            .build())
                                        .build()))
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postCatalogItemCreateJobResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `revision`                                                                                    | *String*                                                                                      | :heavy_check_mark:                                                                            | API endpoint revision (format: YYYY-MM-DD[.suffix])                                           |
| `catalogItemCreateJobCreateQuery`                                                             | [CatalogItemCreateJobCreateQuery](../../models/components/CatalogItemCreateJobCreateQuery.md) | :heavy_check_mark:                                                                            | N/A                                                                                           |

### Response

**[BulkCreateCatalogItemsResponse](../../models/operations/BulkCreateCatalogItemsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getBulkCreateCatalogItemsJob

Get a catalog item bulk create job with the given job ID.

An `include` parameter can be provided to get the following related resource data: `items`.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetBulkCreateCatalogItemsJobRequest;
import com.commercesystems.klaviyo_java.models.operations.GetBulkCreateCatalogItemsJobResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetBulkCreateCatalogItemsJobRequest req = GetBulkCreateCatalogItemsJobRequest.builder()
                .jobId("01GSQPBF74KQ5YTDEPP41T1BZH")
                .revision("2024-10-15")
                .build();

        GetBulkCreateCatalogItemsJobResponse res = sdk.catalogs().getBulkCreateCatalogItemsJob()
                .request(req)
                .call();

        if (res.getCatalogItemCreateJobResponseCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [GetBulkCreateCatalogItemsJobRequest](../../models/operations/GetBulkCreateCatalogItemsJobRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[GetBulkCreateCatalogItemsJobResponse](../../models/operations/GetBulkCreateCatalogItemsJobResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getBulkUpdateCatalogItemsJobs

Get all catalog item bulk update jobs.

Returns a maximum of 100 jobs per request.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.FieldsCatalogItemBulkUpdateJob;
import com.commercesystems.klaviyo_java.models.operations.GetBulkUpdateCatalogItemsJobsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetBulkUpdateCatalogItemsJobsResponse res = sdk.catalogs().getBulkUpdateCatalogItemsJobs()
                .fieldsCatalogItemBulkUpdateJob(List.of(
                    FieldsCatalogItemBulkUpdateJob.CREATED_AT))
                .filter("<value>")
                .pageCursor("<value>")
                .revision("2024-10-15")
                .call();

        if (res.getCatalogItemUpdateJobResponseCollectionCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                               | Type                                                                                                                                                                    | Required                                                                                                                                                                | Description                                                                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `fieldsCatalogItemBulkUpdateJob`                                                                                                                                        | List\<[FieldsCatalogItemBulkUpdateJob](../../models/operations/FieldsCatalogItemBulkUpdateJob.md)>                                                                      | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                                                 |
| `filter`                                                                                                                                                                | *Optional\<String>*                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals` |
| `pageCursor`                                                                                                                                                            | *Optional\<String>*                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination                                                       |
| `revision`                                                                                                                                                              | *String*                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                     |

### Response

**[GetBulkUpdateCatalogItemsJobsResponse](../../models/operations/GetBulkUpdateCatalogItemsJobsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## bulkUpdateCatalogItems

Create a catalog item bulk update job to update a batch of catalog items.

Accepts up to 100 catalog items per request. The maximum allowed payload size is 5MB.
The maximum number of jobs in progress at one time is 500.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`catalogs:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogItemBulkUpdateJobEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogItemEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogItemUpdateJobCreateQuery;
import com.commercesystems.klaviyo_java.models.components.CatalogItemUpdateJobCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CatalogItemUpdateJobCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CatalogItemUpdateJobCreateQueryResourceObjectItems;
import com.commercesystems.klaviyo_java.models.components.CatalogItemUpdateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CatalogItemUpdateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CatalogItemUpdateQueryResourceObjectCategories;
import com.commercesystems.klaviyo_java.models.components.CatalogItemUpdateQueryResourceObjectCustomMetadata;
import com.commercesystems.klaviyo_java.models.components.CatalogItemUpdateQueryResourceObjectData;
import com.commercesystems.klaviyo_java.models.components.CatalogItemUpdateQueryResourceObjectRelationships;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.BulkUpdateCatalogItemsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        BulkUpdateCatalogItemsResponse res = sdk.catalogs().bulkUpdateCatalogItems()
                .revision("2024-10-15")
                .catalogItemUpdateJobCreateQuery(CatalogItemUpdateJobCreateQuery.builder()
                    .data(CatalogItemUpdateJobCreateQueryResourceObject.builder()
                        .type(CatalogItemBulkUpdateJobEnum.CATALOG_ITEM_BULK_UPDATE_JOB)
                        .attributes(CatalogItemUpdateJobCreateQueryResourceObjectAttributes.builder()
                            .items(CatalogItemUpdateJobCreateQueryResourceObjectItems.builder()
                                .data(List.of(
                                    CatalogItemUpdateQueryResourceObject.builder()
                                        .type(CatalogItemEnum.CATALOG_ITEM)
                                        .id("$custom:::$default:::SAMPLE-DATA-ITEM-1")
                                        .attributes(CatalogItemUpdateQueryResourceObjectAttributes.builder()
                                            .title("Ocean Blue Shirt (Sample)")
                                            .price(42d)
                                            .description("A description of the catalog item.")
                                            .url("https://via.placeholder.com/150")
                                            .imageFullUrl("https://via.placeholder.com/300")
                                            .imageThumbnailUrl("https://via.placeholder.com/150")
                                            .images(List.of(
                                                "https://via.placeholder.com/150"))
                                            .customMetadata(CatalogItemUpdateQueryResourceObjectCustomMetadata.builder()
                                                .build())
                                            .published(true)
                                            .build())
                                        .relationships(CatalogItemUpdateQueryResourceObjectRelationships.builder()
                                            .categories(CatalogItemUpdateQueryResourceObjectCategories.builder()
                                                .data(List.of(
                                                    CatalogItemUpdateQueryResourceObjectData.builder()
                                                        .type(CatalogCategoryEnum.CATALOG_CATEGORY)
                                                        .id("$custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL")
                                                        .build()))
                                                .build())
                                            .build())
                                        .build()))
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postCatalogItemUpdateJobResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `revision`                                                                                    | *String*                                                                                      | :heavy_check_mark:                                                                            | API endpoint revision (format: YYYY-MM-DD[.suffix])                                           |
| `catalogItemUpdateJobCreateQuery`                                                             | [CatalogItemUpdateJobCreateQuery](../../models/components/CatalogItemUpdateJobCreateQuery.md) | :heavy_check_mark:                                                                            | N/A                                                                                           |

### Response

**[BulkUpdateCatalogItemsResponse](../../models/operations/BulkUpdateCatalogItemsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getBulkUpdateCatalogItemsJob

Get a catalog item bulk update job with the given job ID.

An `include` parameter can be provided to get the following related resource data: `items`.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetBulkUpdateCatalogItemsJobRequest;
import com.commercesystems.klaviyo_java.models.operations.GetBulkUpdateCatalogItemsJobResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetBulkUpdateCatalogItemsJobRequest req = GetBulkUpdateCatalogItemsJobRequest.builder()
                .jobId("01GSQPBF74KQ5YTDEPP41T1BZH")
                .revision("2024-10-15")
                .build();

        GetBulkUpdateCatalogItemsJobResponse res = sdk.catalogs().getBulkUpdateCatalogItemsJob()
                .request(req)
                .call();

        if (res.getCatalogItemUpdateJobResponseCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [GetBulkUpdateCatalogItemsJobRequest](../../models/operations/GetBulkUpdateCatalogItemsJobRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[GetBulkUpdateCatalogItemsJobResponse](../../models/operations/GetBulkUpdateCatalogItemsJobResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getBulkDeleteCatalogItemsJobs

Get all catalog item bulk delete jobs.

Returns a maximum of 100 jobs per request.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.FieldsCatalogItemBulkDeleteJob;
import com.commercesystems.klaviyo_java.models.operations.GetBulkDeleteCatalogItemsJobsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetBulkDeleteCatalogItemsJobsResponse res = sdk.catalogs().getBulkDeleteCatalogItemsJobs()
                .fieldsCatalogItemBulkDeleteJob(List.of(
                    FieldsCatalogItemBulkDeleteJob.CREATED_AT))
                .filter("<value>")
                .pageCursor("<value>")
                .revision("2024-10-15")
                .call();

        if (res.getCatalogItemDeleteJobResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                               | Type                                                                                                                                                                    | Required                                                                                                                                                                | Description                                                                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `fieldsCatalogItemBulkDeleteJob`                                                                                                                                        | List\<[FieldsCatalogItemBulkDeleteJob](../../models/operations/FieldsCatalogItemBulkDeleteJob.md)>                                                                      | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                                                 |
| `filter`                                                                                                                                                                | *Optional\<String>*                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals` |
| `pageCursor`                                                                                                                                                            | *Optional\<String>*                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination                                                       |
| `revision`                                                                                                                                                              | *String*                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                     |

### Response

**[GetBulkDeleteCatalogItemsJobsResponse](../../models/operations/GetBulkDeleteCatalogItemsJobsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## bulkDeleteCatalogItems

Create a catalog item bulk delete job to delete a batch of catalog items.

Accepts up to 100 catalog items per request. The maximum allowed payload size is 5MB.
The maximum number of jobs in progress at one time is 500.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`catalogs:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CatalogItemBulkDeleteJobEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogItemDeleteJobCreateQuery;
import com.commercesystems.klaviyo_java.models.components.CatalogItemDeleteJobCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CatalogItemDeleteJobCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CatalogItemDeleteJobCreateQueryResourceObjectItems;
import com.commercesystems.klaviyo_java.models.components.CatalogItemDeleteQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CatalogItemEnum;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.BulkDeleteCatalogItemsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        BulkDeleteCatalogItemsResponse res = sdk.catalogs().bulkDeleteCatalogItems()
                .revision("2024-10-15")
                .catalogItemDeleteJobCreateQuery(CatalogItemDeleteJobCreateQuery.builder()
                    .data(CatalogItemDeleteJobCreateQueryResourceObject.builder()
                        .type(CatalogItemBulkDeleteJobEnum.CATALOG_ITEM_BULK_DELETE_JOB)
                        .attributes(CatalogItemDeleteJobCreateQueryResourceObjectAttributes.builder()
                            .items(CatalogItemDeleteJobCreateQueryResourceObjectItems.builder()
                                .data(List.of(
                                    CatalogItemDeleteQueryResourceObject.builder()
                                        .type(CatalogItemEnum.CATALOG_ITEM)
                                        .id("$custom:::$default:::SAMPLE-DATA-ITEM-1")
                                        .build()))
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postCatalogItemDeleteJobResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `revision`                                                                                    | *String*                                                                                      | :heavy_check_mark:                                                                            | API endpoint revision (format: YYYY-MM-DD[.suffix])                                           |
| `catalogItemDeleteJobCreateQuery`                                                             | [CatalogItemDeleteJobCreateQuery](../../models/components/CatalogItemDeleteJobCreateQuery.md) | :heavy_check_mark:                                                                            | N/A                                                                                           |

### Response

**[BulkDeleteCatalogItemsResponse](../../models/operations/BulkDeleteCatalogItemsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getBulkDeleteCatalogItemsJob

Get a catalog item bulk delete job with the given job ID.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetBulkDeleteCatalogItemsJobResponse;
import com.commercesystems.klaviyo_java.models.operations.QueryParamFieldsCatalogItemBulkDeleteJob;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetBulkDeleteCatalogItemsJobResponse res = sdk.catalogs().getBulkDeleteCatalogItemsJob()
                .jobId("01GSQPBF74KQ5YTDEPP41T1BZH")
                .fieldsCatalogItemBulkDeleteJob(List.of(
                    QueryParamFieldsCatalogItemBulkDeleteJob.COMPLETED_COUNT))
                .revision("2024-10-15")
                .call();

        if (res.getCatalogItemDeleteJobResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             | Example                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `jobId`                                                                                                                 | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | ID of the job to retrieve.                                                                                              | 01GSQPBF74KQ5YTDEPP41T1BZH                                                                                              |
| `fieldsCatalogItemBulkDeleteJob`                                                                                        | List\<[QueryParamFieldsCatalogItemBulkDeleteJob](../../models/operations/QueryParamFieldsCatalogItemBulkDeleteJob.md)>  | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets |                                                                                                                         |
| `revision`                                                                                                              | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                     |                                                                                                                         |

### Response

**[GetBulkDeleteCatalogItemsJobResponse](../../models/operations/GetBulkDeleteCatalogItemsJobResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getCreateVariantsJobs

Get all catalog variant bulk create jobs.

Returns a maximum of 100 jobs per request.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.FieldsCatalogVariantBulkCreateJob;
import com.commercesystems.klaviyo_java.models.operations.GetCreateVariantsJobsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCreateVariantsJobsResponse res = sdk.catalogs().getCreateVariantsJobs()
                .fieldsCatalogVariantBulkCreateJob(List.of(
                    FieldsCatalogVariantBulkCreateJob.ERRORS))
                .filter("<value>")
                .pageCursor("<value>")
                .revision("2024-10-15")
                .call();

        if (res.getCatalogVariantCreateJobResponseCollectionCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                               | Type                                                                                                                                                                    | Required                                                                                                                                                                | Description                                                                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `fieldsCatalogVariantBulkCreateJob`                                                                                                                                     | List\<[FieldsCatalogVariantBulkCreateJob](../../models/operations/FieldsCatalogVariantBulkCreateJob.md)>                                                                | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                                                 |
| `filter`                                                                                                                                                                | *Optional\<String>*                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals` |
| `pageCursor`                                                                                                                                                            | *Optional\<String>*                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination                                                       |
| `revision`                                                                                                                                                              | *String*                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                     |

### Response

**[GetCreateVariantsJobsResponse](../../models/operations/GetCreateVariantsJobsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## bulkCreateCatalogVariants

Create a catalog variant bulk create job to create a batch of catalog variants.

Accepts up to 100 catalog variants per request. The maximum allowed payload size is 5MB.
The maximum number of jobs in progress at one time is 500.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`catalogs:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CatalogItemEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantBulkCreateJobEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantCreateJobCreateQuery;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantCreateJobCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantCreateJobCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantCreateQueryResourceObjectCustomMetadata;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantCreateQueryResourceObjectData;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantCreateQueryResourceObjectIntegrationType;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantCreateQueryResourceObjectInventoryPolicy;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantCreateQueryResourceObjectRelationships;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantEnum;
import com.commercesystems.klaviyo_java.models.components.Item;
import com.commercesystems.klaviyo_java.models.components.Variants;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.BulkCreateCatalogVariantsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        BulkCreateCatalogVariantsResponse res = sdk.catalogs().bulkCreateCatalogVariants()
                .revision("2024-10-15")
                .catalogVariantCreateJobCreateQuery(CatalogVariantCreateJobCreateQuery.builder()
                    .data(CatalogVariantCreateJobCreateQueryResourceObject.builder()
                        .type(CatalogVariantBulkCreateJobEnum.CATALOG_VARIANT_BULK_CREATE_JOB)
                        .attributes(CatalogVariantCreateJobCreateQueryResourceObjectAttributes.builder()
                            .variants(Variants.builder()
                                .data(List.of(
                                    CatalogVariantCreateQueryResourceObject.builder()
                                        .type(CatalogVariantEnum.CATALOG_VARIANT)
                                        .attributes(CatalogVariantCreateQueryResourceObjectAttributes.builder()
                                            .externalId("SAMPLE-DATA-ITEM-1-VARIANT-MEDIUM")
                                            .title("Ocean Blue Shirt (Sample) Variant Medium")
                                            .description("Ocean blue cotton shirt with a narrow collar and buttons down the front and long sleeves. Comfortable fit and titled kaleidoscope patterns.")
                                            .sku("OBS-MD")
                                            .inventoryQuantity(25d)
                                            .price(42d)
                                            .url("https://via.placeholder.com/150")
                                            .catalogType("$default")
                                            .integrationType(CatalogVariantCreateQueryResourceObjectIntegrationType.DOLLAR_CUSTOM)
                                            .inventoryPolicy(CatalogVariantCreateQueryResourceObjectInventoryPolicy.TWO)
                                            .imageFullUrl("https://via.placeholder.com/300")
                                            .imageThumbnailUrl("https://via.placeholder.com/150")
                                            .images(List.of(
                                                "https://via.placeholder.com/150"))
                                            .customMetadata(CatalogVariantCreateQueryResourceObjectCustomMetadata.builder()
                                                .build())
                                            .published(true)
                                            .build())
                                        .relationships(CatalogVariantCreateQueryResourceObjectRelationships.builder()
                                            .item(Item.builder()
                                                .data(CatalogVariantCreateQueryResourceObjectData.builder()
                                                    .type(CatalogItemEnum.CATALOG_ITEM)
                                                    .id("$custom:::$default:::SAMPLE-DATA-ITEM-1")
                                                    .build())
                                                .build())
                                            .build())
                                        .build()))
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postCatalogVariantCreateJobResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `revision`                                                                                          | *String*                                                                                            | :heavy_check_mark:                                                                                  | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                 |
| `catalogVariantCreateJobCreateQuery`                                                                | [CatalogVariantCreateJobCreateQuery](../../models/components/CatalogVariantCreateJobCreateQuery.md) | :heavy_check_mark:                                                                                  | N/A                                                                                                 |

### Response

**[BulkCreateCatalogVariantsResponse](../../models/operations/BulkCreateCatalogVariantsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getCreateVariantsJob

Get a catalog variant bulk create job with the given job ID.

An `include` parameter can be provided to get the following related resource data: `variants`.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetCreateVariantsJobRequest;
import com.commercesystems.klaviyo_java.models.operations.GetCreateVariantsJobResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCreateVariantsJobRequest req = GetCreateVariantsJobRequest.builder()
                .jobId("01GSQPBF74KQ5YTDEPP41T1BZH")
                .revision("2024-10-15")
                .build();

        GetCreateVariantsJobResponse res = sdk.catalogs().getCreateVariantsJob()
                .request(req)
                .call();

        if (res.getCatalogVariantCreateJobResponseCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetCreateVariantsJobRequest](../../models/operations/GetCreateVariantsJobRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetCreateVariantsJobResponse](../../models/operations/GetCreateVariantsJobResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getUpdateVariantsJobs

Get all catalog variant bulk update jobs.

Returns a maximum of 100 jobs per request.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.FieldsCatalogVariantBulkUpdateJob;
import com.commercesystems.klaviyo_java.models.operations.GetUpdateVariantsJobsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetUpdateVariantsJobsResponse res = sdk.catalogs().getUpdateVariantsJobs()
                .fieldsCatalogVariantBulkUpdateJob(List.of(
                    FieldsCatalogVariantBulkUpdateJob.EXPIRES_AT))
                .filter("<value>")
                .pageCursor("<value>")
                .revision("2024-10-15")
                .call();

        if (res.getCatalogVariantUpdateJobResponseCollectionCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                               | Type                                                                                                                                                                    | Required                                                                                                                                                                | Description                                                                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `fieldsCatalogVariantBulkUpdateJob`                                                                                                                                     | List\<[FieldsCatalogVariantBulkUpdateJob](../../models/operations/FieldsCatalogVariantBulkUpdateJob.md)>                                                                | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                                                 |
| `filter`                                                                                                                                                                | *Optional\<String>*                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals` |
| `pageCursor`                                                                                                                                                            | *Optional\<String>*                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination                                                       |
| `revision`                                                                                                                                                              | *String*                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                     |

### Response

**[GetUpdateVariantsJobsResponse](../../models/operations/GetUpdateVariantsJobsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## bulkUpdateCatalogVariants

Create a catalog variant bulk update job to update a batch of catalog variants.

Accepts up to 100 catalog variants per request. The maximum allowed payload size is 5MB.
The maximum number of jobs in progress at one time is 500.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`catalogs:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantBulkUpdateJobEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantUpdateJobCreateQuery;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantUpdateJobCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantUpdateJobCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantUpdateJobCreateQueryResourceObjectVariants;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantUpdateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantUpdateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantUpdateQueryResourceObjectCustomMetadata;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantUpdateQueryResourceObjectInventoryPolicy;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.BulkUpdateCatalogVariantsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        BulkUpdateCatalogVariantsResponse res = sdk.catalogs().bulkUpdateCatalogVariants()
                .revision("2024-10-15")
                .catalogVariantUpdateJobCreateQuery(CatalogVariantUpdateJobCreateQuery.builder()
                    .data(CatalogVariantUpdateJobCreateQueryResourceObject.builder()
                        .type(CatalogVariantBulkUpdateJobEnum.CATALOG_VARIANT_BULK_UPDATE_JOB)
                        .attributes(CatalogVariantUpdateJobCreateQueryResourceObjectAttributes.builder()
                            .variants(CatalogVariantUpdateJobCreateQueryResourceObjectVariants.builder()
                                .data(List.of(
                                    CatalogVariantUpdateQueryResourceObject.builder()
                                        .type(CatalogVariantEnum.CATALOG_VARIANT)
                                        .id("$custom:::$default:::SAMPLE-DATA-ITEM-1-VARIANT-MEDIUM")
                                        .attributes(CatalogVariantUpdateQueryResourceObjectAttributes.builder()
                                            .title("Ocean Blue Shirt (Sample) Variant Medium")
                                            .description("Ocean blue cotton shirt with a narrow collar and buttons down the front and long sleeves. Comfortable fit and titled kaleidoscope patterns.")
                                            .sku("OBS-MD")
                                            .inventoryPolicy(CatalogVariantUpdateQueryResourceObjectInventoryPolicy.TWO)
                                            .inventoryQuantity(25d)
                                            .price(42d)
                                            .url("https://via.placeholder.com/150")
                                            .imageFullUrl("https://via.placeholder.com/300")
                                            .imageThumbnailUrl("https://via.placeholder.com/150")
                                            .images(List.of(
                                                "https://via.placeholder.com/150"))
                                            .customMetadata(CatalogVariantUpdateQueryResourceObjectCustomMetadata.builder()
                                                .build())
                                            .published(true)
                                            .build())
                                        .build()))
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postCatalogVariantUpdateJobResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `revision`                                                                                          | *String*                                                                                            | :heavy_check_mark:                                                                                  | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                 |
| `catalogVariantUpdateJobCreateQuery`                                                                | [CatalogVariantUpdateJobCreateQuery](../../models/components/CatalogVariantUpdateJobCreateQuery.md) | :heavy_check_mark:                                                                                  | N/A                                                                                                 |

### Response

**[BulkUpdateCatalogVariantsResponse](../../models/operations/BulkUpdateCatalogVariantsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getUpdateVariantsJob

Get a catalog variate bulk update job with the given job ID.

An `include` parameter can be provided to get the following related resource data: `variants`.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetUpdateVariantsJobRequest;
import com.commercesystems.klaviyo_java.models.operations.GetUpdateVariantsJobResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetUpdateVariantsJobRequest req = GetUpdateVariantsJobRequest.builder()
                .jobId("01GSQPBF74KQ5YTDEPP41T1BZH")
                .revision("2024-10-15")
                .build();

        GetUpdateVariantsJobResponse res = sdk.catalogs().getUpdateVariantsJob()
                .request(req)
                .call();

        if (res.getCatalogVariantUpdateJobResponseCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetUpdateVariantsJobRequest](../../models/operations/GetUpdateVariantsJobRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetUpdateVariantsJobResponse](../../models/operations/GetUpdateVariantsJobResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getDeleteVariantsJobs

Get all catalog variant bulk delete jobs.

Returns a maximum of 100 jobs per request.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.FieldsCatalogVariantBulkDeleteJob;
import com.commercesystems.klaviyo_java.models.operations.GetDeleteVariantsJobsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetDeleteVariantsJobsResponse res = sdk.catalogs().getDeleteVariantsJobs()
                .fieldsCatalogVariantBulkDeleteJob(List.of(
                    FieldsCatalogVariantBulkDeleteJob.ERRORS))
                .filter("<value>")
                .pageCursor("<value>")
                .revision("2024-10-15")
                .call();

        if (res.getCatalogVariantDeleteJobResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                               | Type                                                                                                                                                                    | Required                                                                                                                                                                | Description                                                                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `fieldsCatalogVariantBulkDeleteJob`                                                                                                                                     | List\<[FieldsCatalogVariantBulkDeleteJob](../../models/operations/FieldsCatalogVariantBulkDeleteJob.md)>                                                                | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                                                 |
| `filter`                                                                                                                                                                | *Optional\<String>*                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals` |
| `pageCursor`                                                                                                                                                            | *Optional\<String>*                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination                                                       |
| `revision`                                                                                                                                                              | *String*                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                     |

### Response

**[GetDeleteVariantsJobsResponse](../../models/operations/GetDeleteVariantsJobsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## bulkDeleteCatalogVariants

Create a catalog variant bulk delete job to delete a batch of catalog variants.

Accepts up to 100 catalog variants per request. The maximum allowed payload size is 5MB.
The maximum number of jobs in progress at one time is 500.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`catalogs:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantBulkDeleteJobEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantDeleteJobCreateQuery;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantDeleteJobCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantDeleteJobCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantDeleteJobCreateQueryResourceObjectVariants;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantDeleteQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantEnum;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.BulkDeleteCatalogVariantsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        BulkDeleteCatalogVariantsResponse res = sdk.catalogs().bulkDeleteCatalogVariants()
                .revision("2024-10-15")
                .catalogVariantDeleteJobCreateQuery(CatalogVariantDeleteJobCreateQuery.builder()
                    .data(CatalogVariantDeleteJobCreateQueryResourceObject.builder()
                        .type(CatalogVariantBulkDeleteJobEnum.CATALOG_VARIANT_BULK_DELETE_JOB)
                        .attributes(CatalogVariantDeleteJobCreateQueryResourceObjectAttributes.builder()
                            .variants(CatalogVariantDeleteJobCreateQueryResourceObjectVariants.builder()
                                .data(List.of(
                                    CatalogVariantDeleteQueryResourceObject.builder()
                                        .type(CatalogVariantEnum.CATALOG_VARIANT)
                                        .id("$custom:::$default:::SAMPLE-DATA-ITEM-1-VARIANT-MEDIUM")
                                        .build()))
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postCatalogVariantDeleteJobResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `revision`                                                                                          | *String*                                                                                            | :heavy_check_mark:                                                                                  | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                 |
| `catalogVariantDeleteJobCreateQuery`                                                                | [CatalogVariantDeleteJobCreateQuery](../../models/components/CatalogVariantDeleteJobCreateQuery.md) | :heavy_check_mark:                                                                                  | N/A                                                                                                 |

### Response

**[BulkDeleteCatalogVariantsResponse](../../models/operations/BulkDeleteCatalogVariantsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getDeleteVariantsJob

Get a catalog variant bulk delete job with the given job ID.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetDeleteVariantsJobResponse;
import com.commercesystems.klaviyo_java.models.operations.QueryParamFieldsCatalogVariantBulkDeleteJob;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetDeleteVariantsJobResponse res = sdk.catalogs().getDeleteVariantsJob()
                .jobId("01GSQPBF74KQ5YTDEPP41T1BZH")
                .fieldsCatalogVariantBulkDeleteJob(List.of(
                    QueryParamFieldsCatalogVariantBulkDeleteJob.CREATED_AT))
                .revision("2024-10-15")
                .call();

        if (res.getCatalogVariantDeleteJobResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  | Example                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `jobId`                                                                                                                      | *String*                                                                                                                     | :heavy_check_mark:                                                                                                           | ID of the job to retrieve.                                                                                                   | 01GSQPBF74KQ5YTDEPP41T1BZH                                                                                                   |
| `fieldsCatalogVariantBulkDeleteJob`                                                                                          | List\<[QueryParamFieldsCatalogVariantBulkDeleteJob](../../models/operations/QueryParamFieldsCatalogVariantBulkDeleteJob.md)> | :heavy_minus_sign:                                                                                                           | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets      |                                                                                                                              |
| `revision`                                                                                                                   | *String*                                                                                                                     | :heavy_check_mark:                                                                                                           | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                          |                                                                                                                              |

### Response

**[GetDeleteVariantsJobResponse](../../models/operations/GetDeleteVariantsJobResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getCreateCategoriesJobs

Get all catalog category bulk create jobs.

Returns a maximum of 100 jobs per request.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.FieldsCatalogCategoryBulkCreateJob;
import com.commercesystems.klaviyo_java.models.operations.GetCreateCategoriesJobsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCreateCategoriesJobsResponse res = sdk.catalogs().getCreateCategoriesJobs()
                .fieldsCatalogCategoryBulkCreateJob(List.of(
                    FieldsCatalogCategoryBulkCreateJob.EXPIRES_AT))
                .filter("<value>")
                .pageCursor("<value>")
                .revision("2024-10-15")
                .call();

        if (res.getCatalogCategoryCreateJobResponseCollectionCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                               | Type                                                                                                                                                                    | Required                                                                                                                                                                | Description                                                                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `fieldsCatalogCategoryBulkCreateJob`                                                                                                                                    | List\<[FieldsCatalogCategoryBulkCreateJob](../../models/operations/FieldsCatalogCategoryBulkCreateJob.md)>                                                              | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                                                 |
| `filter`                                                                                                                                                                | *Optional\<String>*                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals` |
| `pageCursor`                                                                                                                                                            | *Optional\<String>*                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination                                                       |
| `revision`                                                                                                                                                              | *String*                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                     |

### Response

**[GetCreateCategoriesJobsResponse](../../models/operations/GetCreateCategoriesJobsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## bulkCreateCatalogCategories

Create a catalog category bulk create job to create a batch of catalog categories.

Accepts up to 100 catalog categories per request. The maximum allowed payload size is 5MB.
The maximum number of jobs in progress at one time is 500.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`catalogs:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryBulkCreateJobEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryCreateJobCreateQuery;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryCreateJobCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryCreateJobCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryCreateJobCreateQueryResourceObjectCategories;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryCreateQueryResourceObjectData;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryCreateQueryResourceObjectIntegrationType;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryCreateQueryResourceObjectRelationships;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogItemEnum;
import com.commercesystems.klaviyo_java.models.components.Items;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.BulkCreateCatalogCategoriesResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        BulkCreateCatalogCategoriesResponse res = sdk.catalogs().bulkCreateCatalogCategories()
                .revision("2024-10-15")
                .catalogCategoryCreateJobCreateQuery(CatalogCategoryCreateJobCreateQuery.builder()
                    .data(CatalogCategoryCreateJobCreateQueryResourceObject.builder()
                        .type(CatalogCategoryBulkCreateJobEnum.CATALOG_CATEGORY_BULK_CREATE_JOB)
                        .attributes(CatalogCategoryCreateJobCreateQueryResourceObjectAttributes.builder()
                            .categories(CatalogCategoryCreateJobCreateQueryResourceObjectCategories.builder()
                                .data(List.of(
                                    CatalogCategoryCreateQueryResourceObject.builder()
                                        .type(CatalogCategoryEnum.CATALOG_CATEGORY)
                                        .attributes(CatalogCategoryCreateQueryResourceObjectAttributes.builder()
                                            .externalId("SAMPLE-DATA-CATEGORY-APPAREL")
                                            .name("Sample Data Category Apparel")
                                            .integrationType(CatalogCategoryCreateQueryResourceObjectIntegrationType.DOLLAR_CUSTOM)
                                            .catalogType("$default")
                                            .build())
                                        .relationships(CatalogCategoryCreateQueryResourceObjectRelationships.builder()
                                            .items(Items.builder()
                                                .data(List.of(
                                                    CatalogCategoryCreateQueryResourceObjectData.builder()
                                                        .type(CatalogItemEnum.CATALOG_ITEM)
                                                        .id("$custom:::$default:::SAMPLE-DATA-ITEM-1")
                                                        .build()))
                                                .build())
                                            .build())
                                        .build()))
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postCatalogCategoryCreateJobResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `revision`                                                                                            | *String*                                                                                              | :heavy_check_mark:                                                                                    | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                   |
| `catalogCategoryCreateJobCreateQuery`                                                                 | [CatalogCategoryCreateJobCreateQuery](../../models/components/CatalogCategoryCreateJobCreateQuery.md) | :heavy_check_mark:                                                                                    | N/A                                                                                                   |

### Response

**[BulkCreateCatalogCategoriesResponse](../../models/operations/BulkCreateCatalogCategoriesResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getCreateCategoriesJob

Get a catalog category bulk create job with the given job ID.

An `include` parameter can be provided to get the following related resource data: `categories`.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetCreateCategoriesJobRequest;
import com.commercesystems.klaviyo_java.models.operations.GetCreateCategoriesJobResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCreateCategoriesJobRequest req = GetCreateCategoriesJobRequest.builder()
                .jobId("01GSQPBF74KQ5YTDEPP41T1BZH")
                .revision("2024-10-15")
                .build();

        GetCreateCategoriesJobResponse res = sdk.catalogs().getCreateCategoriesJob()
                .request(req)
                .call();

        if (res.getCatalogCategoryCreateJobResponseCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetCreateCategoriesJobRequest](../../models/operations/GetCreateCategoriesJobRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetCreateCategoriesJobResponse](../../models/operations/GetCreateCategoriesJobResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getUpdateCategoriesJobs

Get all catalog category bulk update jobs.

Returns a maximum of 100 jobs per request.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.FieldsCatalogCategoryBulkUpdateJob;
import com.commercesystems.klaviyo_java.models.operations.GetUpdateCategoriesJobsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetUpdateCategoriesJobsResponse res = sdk.catalogs().getUpdateCategoriesJobs()
                .fieldsCatalogCategoryBulkUpdateJob(List.of(
                    FieldsCatalogCategoryBulkUpdateJob.STATUS))
                .filter("<value>")
                .pageCursor("<value>")
                .revision("2024-10-15")
                .call();

        if (res.getCatalogCategoryUpdateJobResponseCollectionCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                               | Type                                                                                                                                                                    | Required                                                                                                                                                                | Description                                                                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `fieldsCatalogCategoryBulkUpdateJob`                                                                                                                                    | List\<[FieldsCatalogCategoryBulkUpdateJob](../../models/operations/FieldsCatalogCategoryBulkUpdateJob.md)>                                                              | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                                                 |
| `filter`                                                                                                                                                                | *Optional\<String>*                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals` |
| `pageCursor`                                                                                                                                                            | *Optional\<String>*                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination                                                       |
| `revision`                                                                                                                                                              | *String*                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                     |

### Response

**[GetUpdateCategoriesJobsResponse](../../models/operations/GetUpdateCategoriesJobsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## bulkUpdateCatalogCategories

Create a catalog category bulk update job to update a batch of catalog categories.

Accepts up to 100 catalog categories per request. The maximum allowed payload size is 5MB.
The maximum number of jobs in progress at one time is 500.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`catalogs:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryBulkUpdateJobEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryUpdateJobCreateQuery;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryUpdateJobCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryUpdateJobCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryUpdateJobCreateQueryResourceObjectCategories;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryUpdateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryUpdateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryUpdateQueryResourceObjectData;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryUpdateQueryResourceObjectItems;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryUpdateQueryResourceObjectRelationships;
import com.commercesystems.klaviyo_java.models.components.CatalogItemEnum;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.BulkUpdateCatalogCategoriesResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        BulkUpdateCatalogCategoriesResponse res = sdk.catalogs().bulkUpdateCatalogCategories()
                .revision("2024-10-15")
                .catalogCategoryUpdateJobCreateQuery(CatalogCategoryUpdateJobCreateQuery.builder()
                    .data(CatalogCategoryUpdateJobCreateQueryResourceObject.builder()
                        .type(CatalogCategoryBulkUpdateJobEnum.CATALOG_CATEGORY_BULK_UPDATE_JOB)
                        .attributes(CatalogCategoryUpdateJobCreateQueryResourceObjectAttributes.builder()
                            .categories(CatalogCategoryUpdateJobCreateQueryResourceObjectCategories.builder()
                                .data(List.of(
                                    CatalogCategoryUpdateQueryResourceObject.builder()
                                        .type(CatalogCategoryEnum.CATALOG_CATEGORY)
                                        .id("$custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL")
                                        .attributes(CatalogCategoryUpdateQueryResourceObjectAttributes.builder()
                                            .name("Sample Data Category Apparel")
                                            .build())
                                        .relationships(CatalogCategoryUpdateQueryResourceObjectRelationships.builder()
                                            .items(CatalogCategoryUpdateQueryResourceObjectItems.builder()
                                                .data(List.of(
                                                    CatalogCategoryUpdateQueryResourceObjectData.builder()
                                                        .type(CatalogItemEnum.CATALOG_ITEM)
                                                        .id("$custom:::$default:::SAMPLE-DATA-ITEM-1")
                                                        .build()))
                                                .build())
                                            .build())
                                        .build()))
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postCatalogCategoryUpdateJobResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `revision`                                                                                            | *String*                                                                                              | :heavy_check_mark:                                                                                    | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                   |
| `catalogCategoryUpdateJobCreateQuery`                                                                 | [CatalogCategoryUpdateJobCreateQuery](../../models/components/CatalogCategoryUpdateJobCreateQuery.md) | :heavy_check_mark:                                                                                    | N/A                                                                                                   |

### Response

**[BulkUpdateCatalogCategoriesResponse](../../models/operations/BulkUpdateCatalogCategoriesResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getUpdateCategoriesJob

Get a catalog category bulk update job with the given job ID.

An `include` parameter can be provided to get the following related resource data: `categories`.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetUpdateCategoriesJobRequest;
import com.commercesystems.klaviyo_java.models.operations.GetUpdateCategoriesJobResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetUpdateCategoriesJobRequest req = GetUpdateCategoriesJobRequest.builder()
                .jobId("01GSQPBF74KQ5YTDEPP41T1BZH")
                .revision("2024-10-15")
                .build();

        GetUpdateCategoriesJobResponse res = sdk.catalogs().getUpdateCategoriesJob()
                .request(req)
                .call();

        if (res.getCatalogCategoryUpdateJobResponseCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetUpdateCategoriesJobRequest](../../models/operations/GetUpdateCategoriesJobRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetUpdateCategoriesJobResponse](../../models/operations/GetUpdateCategoriesJobResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getDeleteCategoriesJobs

Get all catalog category bulk delete jobs.

Returns a maximum of 100 jobs per request.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.FieldsCatalogCategoryBulkDeleteJob;
import com.commercesystems.klaviyo_java.models.operations.GetDeleteCategoriesJobsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetDeleteCategoriesJobsResponse res = sdk.catalogs().getDeleteCategoriesJobs()
                .fieldsCatalogCategoryBulkDeleteJob(List.of(
                    FieldsCatalogCategoryBulkDeleteJob.ERRORS))
                .filter("<value>")
                .pageCursor("<value>")
                .revision("2024-10-15")
                .call();

        if (res.getCatalogCategoryDeleteJobResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                               | Type                                                                                                                                                                    | Required                                                                                                                                                                | Description                                                                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `fieldsCatalogCategoryBulkDeleteJob`                                                                                                                                    | List\<[FieldsCatalogCategoryBulkDeleteJob](../../models/operations/FieldsCatalogCategoryBulkDeleteJob.md)>                                                              | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                                                 |
| `filter`                                                                                                                                                                | *Optional\<String>*                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals` |
| `pageCursor`                                                                                                                                                            | *Optional\<String>*                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination                                                       |
| `revision`                                                                                                                                                              | *String*                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                     |

### Response

**[GetDeleteCategoriesJobsResponse](../../models/operations/GetDeleteCategoriesJobsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## bulkDeleteCatalogCategories

Create a catalog category bulk delete job to delete a batch of catalog categories.

Accepts up to 100 catalog categories per request. The maximum allowed payload size is 5MB.
The maximum number of jobs in progress at one time is 500.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`catalogs:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryBulkDeleteJobEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryDeleteJobCreateQuery;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryDeleteJobCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryDeleteJobCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryDeleteJobCreateQueryResourceObjectCategories;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryDeleteQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryEnum;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.BulkDeleteCatalogCategoriesResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        BulkDeleteCatalogCategoriesResponse res = sdk.catalogs().bulkDeleteCatalogCategories()
                .revision("2024-10-15")
                .catalogCategoryDeleteJobCreateQuery(CatalogCategoryDeleteJobCreateQuery.builder()
                    .data(CatalogCategoryDeleteJobCreateQueryResourceObject.builder()
                        .type(CatalogCategoryBulkDeleteJobEnum.CATALOG_CATEGORY_BULK_DELETE_JOB)
                        .attributes(CatalogCategoryDeleteJobCreateQueryResourceObjectAttributes.builder()
                            .categories(CatalogCategoryDeleteJobCreateQueryResourceObjectCategories.builder()
                                .data(List.of(
                                    CatalogCategoryDeleteQueryResourceObject.builder()
                                        .type(CatalogCategoryEnum.CATALOG_CATEGORY)
                                        .id("$custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL")
                                        .build()))
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postCatalogCategoryDeleteJobResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `revision`                                                                                            | *String*                                                                                              | :heavy_check_mark:                                                                                    | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                   |
| `catalogCategoryDeleteJobCreateQuery`                                                                 | [CatalogCategoryDeleteJobCreateQuery](../../models/components/CatalogCategoryDeleteJobCreateQuery.md) | :heavy_check_mark:                                                                                    | N/A                                                                                                   |

### Response

**[BulkDeleteCatalogCategoriesResponse](../../models/operations/BulkDeleteCatalogCategoriesResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getDeleteCategoriesJob

Get a catalog category bulk delete job with the given job ID.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetDeleteCategoriesJobResponse;
import com.commercesystems.klaviyo_java.models.operations.QueryParamFieldsCatalogCategoryBulkDeleteJob;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetDeleteCategoriesJobResponse res = sdk.catalogs().getDeleteCategoriesJob()
                .jobId("01GSQPBF74KQ5YTDEPP41T1BZH")
                .fieldsCatalogCategoryBulkDeleteJob(List.of(
                    QueryParamFieldsCatalogCategoryBulkDeleteJob.COMPLETED_AT))
                .revision("2024-10-15")
                .call();

        if (res.getCatalogCategoryDeleteJobResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    | Example                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `jobId`                                                                                                                        | *String*                                                                                                                       | :heavy_check_mark:                                                                                                             | ID of the job to retrieve.                                                                                                     | 01GSQPBF74KQ5YTDEPP41T1BZH                                                                                                     |
| `fieldsCatalogCategoryBulkDeleteJob`                                                                                           | List\<[QueryParamFieldsCatalogCategoryBulkDeleteJob](../../models/operations/QueryParamFieldsCatalogCategoryBulkDeleteJob.md)> | :heavy_minus_sign:                                                                                                             | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets        |                                                                                                                                |
| `revision`                                                                                                                     | *String*                                                                                                                       | :heavy_check_mark:                                                                                                             | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                            |                                                                                                                                |

### Response

**[GetDeleteCategoriesJobResponse](../../models/operations/GetDeleteCategoriesJobResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## createBackInStockSubscription

Subscribe a profile to receive back in stock notifications. Check out [our Back in Stock API guide](https://developers.klaviyo.com/en/docs/how_to_set_up_custom_back_in_stock) for more details.

This endpoint is specifically designed to be called from server-side applications. To create subscriptions from client-side contexts, use [POST /client/back-in-stock-subscriptions](https://developers.klaviyo.com/en/reference/create_client_back_in_stock_subscription).<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:write`
`profiles:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.BackInStockSubscriptionEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantEnum;
import com.commercesystems.klaviyo_java.models.components.Channels;
import com.commercesystems.klaviyo_java.models.components.Profile;
import com.commercesystems.klaviyo_java.models.components.ProfileEnum;
import com.commercesystems.klaviyo_java.models.components.ProfileIdentifierDTOResourceObject;
import com.commercesystems.klaviyo_java.models.components.ProfileIdentifierDTOResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.ServerBISSubscriptionCreateQuery;
import com.commercesystems.klaviyo_java.models.components.ServerBISSubscriptionCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.ServerBISSubscriptionCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.ServerBISSubscriptionCreateQueryResourceObjectData;
import com.commercesystems.klaviyo_java.models.components.ServerBISSubscriptionCreateQueryResourceObjectRelationships;
import com.commercesystems.klaviyo_java.models.components.Variant;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.CreateBackInStockSubscriptionResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        CreateBackInStockSubscriptionResponse res = sdk.catalogs().createBackInStockSubscription()
                .revision("2024-10-15")
                .serverBISSubscriptionCreateQuery(ServerBISSubscriptionCreateQuery.builder()
                    .data(ServerBISSubscriptionCreateQueryResourceObject.builder()
                        .type(BackInStockSubscriptionEnum.BACK_IN_STOCK_SUBSCRIPTION)
                        .attributes(ServerBISSubscriptionCreateQueryResourceObjectAttributes.builder()
                            .channels(List.of(
                                Channels.EMAIL,
                                Channels.SMS))
                            .profile(Profile.builder()
                                .data(ProfileIdentifierDTOResourceObject.builder()
                                    .type(ProfileEnum.PROFILE)
                                    .attributes(ProfileIdentifierDTOResourceObjectAttributes.builder()
                                        .email("sarah.mason@klaviyo-demo.com")
                                        .phoneNumber("+15005550006")
                                        .build())
                                    .id("01GDDKASAP8TKDDA2GRZDSVP4H")
                                    .build())
                                .build())
                            .build())
                        .relationships(ServerBISSubscriptionCreateQueryResourceObjectRelationships.builder()
                            .variant(Variant.builder()
                                .data(ServerBISSubscriptionCreateQueryResourceObjectData.builder()
                                    .type(CatalogVariantEnum.CATALOG_VARIANT)
                                    .id("$custom:::$default:::SAMPLE-DATA-ITEM-1-VARIANT-MEDIUM")
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

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `revision`                                                                                      | *String*                                                                                        | :heavy_check_mark:                                                                              | API endpoint revision (format: YYYY-MM-DD[.suffix])                                             |
| `serverBISSubscriptionCreateQuery`                                                              | [ServerBISSubscriptionCreateQuery](../../models/components/ServerBISSubscriptionCreateQuery.md) | :heavy_check_mark:                                                                              | N/A                                                                                             |

### Response

**[CreateBackInStockSubscriptionResponse](../../models/operations/CreateBackInStockSubscriptionResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getItemsForCatalogCategory

Get all items in a category with the given category ID.

Items can be sorted by the following fields, in ascending and descending order:
`created`

Returns a maximum of 100 items per request.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetItemsForCatalogCategoryRequest;
import com.commercesystems.klaviyo_java.models.operations.GetItemsForCatalogCategoryResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetItemsForCatalogCategoryRequest req = GetItemsForCatalogCategoryRequest.builder()
                .id("$custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL")
                .revision("2024-10-15")
                .build();

        GetItemsForCatalogCategoryResponse res = sdk.catalogs().getItemsForCatalogCategory()
                .request(req)
                .call();

        if (res.getCatalogItemResponseCollectionCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetItemsForCatalogCategoryRequest](../../models/operations/GetItemsForCatalogCategoryRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetItemsForCatalogCategoryResponse](../../models/operations/GetItemsForCatalogCategoryResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getVariantsForCatalogItem

Get all variants related to the given item ID.

Variants can be sorted by the following fields, in ascending and descending order:
`created`

Returns a maximum of 100 variants per request.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetVariantsForCatalogItemRequest;
import com.commercesystems.klaviyo_java.models.operations.GetVariantsForCatalogItemResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetVariantsForCatalogItemRequest req = GetVariantsForCatalogItemRequest.builder()
                .id("$custom:::$default:::SAMPLE-DATA-ITEM-1")
                .revision("2024-10-15")
                .build();

        GetVariantsForCatalogItemResponse res = sdk.catalogs().getVariantsForCatalogItem()
                .request(req)
                .call();

        if (res.getCatalogVariantResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetVariantsForCatalogItemRequest](../../models/operations/GetVariantsForCatalogItemRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetVariantsForCatalogItemResponse](../../models/operations/GetVariantsForCatalogItemResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getCategoriesForCatalogItem

Get all catalog categories that an item with the given item ID is in.

Catalog categories can be sorted by the following fields, in ascending and descending order:
`created`

Returns a maximum of 100 categories per request.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetCategoriesForCatalogItemRequest;
import com.commercesystems.klaviyo_java.models.operations.GetCategoriesForCatalogItemResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCategoriesForCatalogItemRequest req = GetCategoriesForCatalogItemRequest.builder()
                .id("$custom:::$default:::SAMPLE-DATA-ITEM-1")
                .revision("2024-10-15")
                .build();

        GetCategoriesForCatalogItemResponse res = sdk.catalogs().getCategoriesForCatalogItem()
                .request(req)
                .call();

        if (res.getCatalogCategoryResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [GetCategoriesForCatalogItemRequest](../../models/operations/GetCategoriesForCatalogItemRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[GetCategoriesForCatalogItemResponse](../../models/operations/GetCategoriesForCatalogItemResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getItemIdsForCatalogCategory

Get all items in the given category ID.

Returns a maximum of 100 items per request.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetItemIdsForCatalogCategoryResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetItemIdsForCatalogCategoryResponse res = sdk.catalogs().getItemIdsForCatalogCategory()
                .id("$custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL")
                .pageCursor("<value>")
                .revision("2024-10-15")
                .call();

        if (res.getCatalogCategoryItemListResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                               | Type                                                                                                                                                                                                                    | Required                                                                                                                                                                                                                | Description                                                                                                                                                                                                             | Example                                                                                                                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                                                                                    | *String*                                                                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                                                                      | The catalog category ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`. | $custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL                                                                                                                                                                       |
| `pageCursor`                                                                                                                                                                                                            | *Optional\<String>*                                                                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination                                                                                                       |                                                                                                                                                                                                                         |
| `revision`                                                                                                                                                                                                              | *String*                                                                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                                                                     |                                                                                                                                                                                                                         |

### Response

**[GetItemIdsForCatalogCategoryResponse](../../models/operations/GetItemIdsForCatalogCategoryResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## addItemsToCatalogCategory

Create a new item relationship for the given category ID.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`catalogs:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryItemOp;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryItemOpData;
import com.commercesystems.klaviyo_java.models.components.CatalogItemEnum;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.AddItemsToCatalogCategoryResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        AddItemsToCatalogCategoryResponse res = sdk.catalogs().addItemsToCatalogCategory()
                .id("$custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL")
                .revision("2024-10-15")
                .catalogCategoryItemOp(CatalogCategoryItemOp.builder()
                    .data(List.of(
                        CatalogCategoryItemOpData.builder()
                            .type(CatalogItemEnum.CATALOG_ITEM)
                            .id("$custom:::$default:::SAMPLE-DATA-ITEM-1")
                            .build()))
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                               | Type                                                                                                                                                                                                                    | Required                                                                                                                                                                                                                | Description                                                                                                                                                                                                             | Example                                                                                                                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                                                                                    | *String*                                                                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                                                                      | The catalog category ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`. | $custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL                                                                                                                                                                       |
| `revision`                                                                                                                                                                                                              | *String*                                                                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                                                                     |                                                                                                                                                                                                                         |
| `catalogCategoryItemOp`                                                                                                                                                                                                 | [CatalogCategoryItemOp](../../models/components/CatalogCategoryItemOp.md)                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                                                      | N/A                                                                                                                                                                                                                     |                                                                                                                                                                                                                         |

### Response

**[AddItemsToCatalogCategoryResponse](../../models/operations/AddItemsToCatalogCategoryResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## updateItemsForCatalogCategory

Update item relationships for the given category ID.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`catalogs:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryItemOp;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryItemOpData;
import com.commercesystems.klaviyo_java.models.components.CatalogItemEnum;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.UpdateItemsForCatalogCategoryResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        UpdateItemsForCatalogCategoryResponse res = sdk.catalogs().updateItemsForCatalogCategory()
                .id("$custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL")
                .revision("2024-10-15")
                .catalogCategoryItemOp(CatalogCategoryItemOp.builder()
                    .data(List.of(
                        CatalogCategoryItemOpData.builder()
                            .type(CatalogItemEnum.CATALOG_ITEM)
                            .id("$custom:::$default:::SAMPLE-DATA-ITEM-1")
                            .build()))
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                               | Type                                                                                                                                                                                                                    | Required                                                                                                                                                                                                                | Description                                                                                                                                                                                                             | Example                                                                                                                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                                                                                    | *String*                                                                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                                                                      | The catalog category ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`. | $custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL                                                                                                                                                                       |
| `revision`                                                                                                                                                                                                              | *String*                                                                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                                                                     |                                                                                                                                                                                                                         |
| `catalogCategoryItemOp`                                                                                                                                                                                                 | [CatalogCategoryItemOp](../../models/components/CatalogCategoryItemOp.md)                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                                                      | N/A                                                                                                                                                                                                                     |                                                                                                                                                                                                                         |

### Response

**[UpdateItemsForCatalogCategoryResponse](../../models/operations/UpdateItemsForCatalogCategoryResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## removeItemsFromCatalogCategory

Delete item relationships for the given category ID.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`catalogs:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryItemOp;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryItemOpData;
import com.commercesystems.klaviyo_java.models.components.CatalogItemEnum;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.RemoveItemsFromCatalogCategoryResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        RemoveItemsFromCatalogCategoryResponse res = sdk.catalogs().removeItemsFromCatalogCategory()
                .id("$custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL")
                .revision("2024-10-15")
                .catalogCategoryItemOp(CatalogCategoryItemOp.builder()
                    .data(List.of(
                        CatalogCategoryItemOpData.builder()
                            .type(CatalogItemEnum.CATALOG_ITEM)
                            .id("$custom:::$default:::SAMPLE-DATA-ITEM-1")
                            .build()))
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                               | Type                                                                                                                                                                                                                    | Required                                                                                                                                                                                                                | Description                                                                                                                                                                                                             | Example                                                                                                                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                                                                                    | *String*                                                                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                                                                      | The catalog category ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`. | $custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL                                                                                                                                                                       |
| `revision`                                                                                                                                                                                                              | *String*                                                                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                                                                     |                                                                                                                                                                                                                         |
| `catalogCategoryItemOp`                                                                                                                                                                                                 | [CatalogCategoryItemOp](../../models/components/CatalogCategoryItemOp.md)                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                                                      | N/A                                                                                                                                                                                                                     |                                                                                                                                                                                                                         |

### Response

**[RemoveItemsFromCatalogCategoryResponse](../../models/operations/RemoveItemsFromCatalogCategoryResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getCategoryIdsForCatalogItem

Get all catalog categories that a particular item is in.

Returns a maximum of 100 categories per request.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetCategoryIdsForCatalogItemResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCategoryIdsForCatalogItemResponse res = sdk.catalogs().getCategoryIdsForCatalogItem()
                .id("$custom:::$default:::SAMPLE-DATA-ITEM-1")
                .pageCursor("<value>")
                .revision("2024-10-15")
                .call();

        if (res.getCatalogItemCategoryListResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                           | Type                                                                                                                                                                                                                | Required                                                                                                                                                                                                            | Description                                                                                                                                                                                                         | Example                                                                                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                                                  | The catalog item ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`. | $custom:::$default:::SAMPLE-DATA-ITEM-1                                                                                                                                                                             |
| `pageCursor`                                                                                                                                                                                                        | *Optional\<String>*                                                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                                                                  | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination                                                                                                   |                                                                                                                                                                                                                     |
| `revision`                                                                                                                                                                                                          | *String*                                                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                                                  | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                                                                 |                                                                                                                                                                                                                     |

### Response

**[GetCategoryIdsForCatalogItemResponse](../../models/operations/GetCategoryIdsForCatalogItemResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## addCategoryToCatalogItem

Create a new catalog category relationship for the given item ID.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`catalogs:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogItemCategoryOp;
import com.commercesystems.klaviyo_java.models.components.CatalogItemCategoryOpData;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.AddCategoryToCatalogItemResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        AddCategoryToCatalogItemResponse res = sdk.catalogs().addCategoryToCatalogItem()
                .id("$custom:::$default:::SAMPLE-DATA-ITEM-1")
                .revision("2024-10-15")
                .catalogItemCategoryOp(CatalogItemCategoryOp.builder()
                    .data(List.of(
                        CatalogItemCategoryOpData.builder()
                            .type(CatalogCategoryEnum.CATALOG_CATEGORY)
                            .id("$custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL")
                            .build()))
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                           | Type                                                                                                                                                                                                                | Required                                                                                                                                                                                                            | Description                                                                                                                                                                                                         | Example                                                                                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                                                  | The catalog item ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`. | $custom:::$default:::SAMPLE-DATA-ITEM-1                                                                                                                                                                             |
| `revision`                                                                                                                                                                                                          | *String*                                                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                                                  | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                                                                 |                                                                                                                                                                                                                     |
| `catalogItemCategoryOp`                                                                                                                                                                                             | [CatalogItemCategoryOp](../../models/components/CatalogItemCategoryOp.md)                                                                                                                                           | :heavy_check_mark:                                                                                                                                                                                                  | N/A                                                                                                                                                                                                                 |                                                                                                                                                                                                                     |

### Response

**[AddCategoryToCatalogItemResponse](../../models/operations/AddCategoryToCatalogItemResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## updateCategoriesForCatalogItem

Update catalog category relationships for the given item ID.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`catalogs:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogItemCategoryOp;
import com.commercesystems.klaviyo_java.models.components.CatalogItemCategoryOpData;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.UpdateCategoriesForCatalogItemResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        UpdateCategoriesForCatalogItemResponse res = sdk.catalogs().updateCategoriesForCatalogItem()
                .id("$custom:::$default:::SAMPLE-DATA-ITEM-1")
                .revision("2024-10-15")
                .catalogItemCategoryOp(CatalogItemCategoryOp.builder()
                    .data(List.of(
                        CatalogItemCategoryOpData.builder()
                            .type(CatalogCategoryEnum.CATALOG_CATEGORY)
                            .id("$custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL")
                            .build()))
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                           | Type                                                                                                                                                                                                                | Required                                                                                                                                                                                                            | Description                                                                                                                                                                                                         | Example                                                                                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                                                  | The catalog item ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`. | $custom:::$default:::SAMPLE-DATA-ITEM-1                                                                                                                                                                             |
| `revision`                                                                                                                                                                                                          | *String*                                                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                                                  | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                                                                 |                                                                                                                                                                                                                     |
| `catalogItemCategoryOp`                                                                                                                                                                                             | [CatalogItemCategoryOp](../../models/components/CatalogItemCategoryOp.md)                                                                                                                                           | :heavy_check_mark:                                                                                                                                                                                                  | N/A                                                                                                                                                                                                                 |                                                                                                                                                                                                                     |

### Response

**[UpdateCategoriesForCatalogItemResponse](../../models/operations/UpdateCategoriesForCatalogItemResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## removeCategoriesFromCatalogItem

Delete catalog category relationships for the given item ID.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`catalogs:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CatalogCategoryEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogItemCategoryOp;
import com.commercesystems.klaviyo_java.models.components.CatalogItemCategoryOpData;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.RemoveCategoriesFromCatalogItemResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        RemoveCategoriesFromCatalogItemResponse res = sdk.catalogs().removeCategoriesFromCatalogItem()
                .id("$custom:::$default:::SAMPLE-DATA-ITEM-1")
                .revision("2024-10-15")
                .catalogItemCategoryOp(CatalogItemCategoryOp.builder()
                    .data(List.of(
                        CatalogItemCategoryOpData.builder()
                            .type(CatalogCategoryEnum.CATALOG_CATEGORY)
                            .id("$custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL")
                            .build()))
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                           | Type                                                                                                                                                                                                                | Required                                                                                                                                                                                                            | Description                                                                                                                                                                                                         | Example                                                                                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                                                  | The catalog item ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`. | $custom:::$default:::SAMPLE-DATA-ITEM-1                                                                                                                                                                             |
| `revision`                                                                                                                                                                                                          | *String*                                                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                                                  | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                                                                 |                                                                                                                                                                                                                     |
| `catalogItemCategoryOp`                                                                                                                                                                                             | [CatalogItemCategoryOp](../../models/components/CatalogItemCategoryOp.md)                                                                                                                                           | :heavy_check_mark:                                                                                                                                                                                                  | N/A                                                                                                                                                                                                                 |                                                                                                                                                                                                                     |

### Response

**[RemoveCategoriesFromCatalogItemResponse](../../models/operations/RemoveCategoriesFromCatalogItemResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |