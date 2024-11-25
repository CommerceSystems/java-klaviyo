# PostCatalogVariantCreateJobResponseData


## Fields

| Field                                                                                                                                      | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `type`                                                                                                                                     | [CatalogVariantBulkCreateJobEnum](../../models/components/CatalogVariantBulkCreateJobEnum.md)                                              | :heavy_check_mark:                                                                                                                         | N/A                                                                                                                                        |
| `id`                                                                                                                                       | *String*                                                                                                                                   | :heavy_check_mark:                                                                                                                         | Unique identifier for retrieving the job. Generated by Klaviyo.                                                                            |
| `attributes`                                                                                                                               | [PostCatalogVariantCreateJobResponseAttributes](../../models/components/PostCatalogVariantCreateJobResponseAttributes.md)                  | :heavy_check_mark:                                                                                                                         | N/A                                                                                                                                        |
| `relationships`                                                                                                                            | [Optional\<PostCatalogVariantCreateJobResponseRelationships>](../../models/components/PostCatalogVariantCreateJobResponseRelationships.md) | :heavy_minus_sign:                                                                                                                         | N/A                                                                                                                                        |
| `links`                                                                                                                                    | [ObjectLinks](../../models/components/ObjectLinks.md)                                                                                      | :heavy_check_mark:                                                                                                                         | N/A                                                                                                                                        |