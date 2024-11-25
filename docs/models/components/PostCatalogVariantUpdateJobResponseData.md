# PostCatalogVariantUpdateJobResponseData


## Fields

| Field                                                                                                                                      | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `type`                                                                                                                                     | [CatalogVariantBulkUpdateJobEnum](../../models/components/CatalogVariantBulkUpdateJobEnum.md)                                              | :heavy_check_mark:                                                                                                                         | N/A                                                                                                                                        |
| `id`                                                                                                                                       | *String*                                                                                                                                   | :heavy_check_mark:                                                                                                                         | Unique identifier for retrieving the job. Generated by Klaviyo.                                                                            |
| `attributes`                                                                                                                               | [PostCatalogVariantUpdateJobResponseAttributes](../../models/components/PostCatalogVariantUpdateJobResponseAttributes.md)                  | :heavy_check_mark:                                                                                                                         | N/A                                                                                                                                        |
| `relationships`                                                                                                                            | [Optional\<PostCatalogVariantUpdateJobResponseRelationships>](../../models/components/PostCatalogVariantUpdateJobResponseRelationships.md) | :heavy_minus_sign:                                                                                                                         | N/A                                                                                                                                        |
| `links`                                                                                                                                    | [ObjectLinks](../../models/components/ObjectLinks.md)                                                                                      | :heavy_check_mark:                                                                                                                         | N/A                                                                                                                                        |