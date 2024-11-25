# GetUpdateVariantsJobRequest


## Fields

| Field                                                                                                                                      | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                | Example                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `jobId`                                                                                                                                    | *String*                                                                                                                                   | :heavy_check_mark:                                                                                                                         | ID of the job to retrieve.                                                                                                                 | 01GSQPBF74KQ5YTDEPP41T1BZH                                                                                                                 |
| `fieldsCatalogVariantBulkUpdateJob`                                                                                                        | List\<[QueryParamFieldsCatalogVariantBulkUpdateJob](../../models/operations/QueryParamFieldsCatalogVariantBulkUpdateJob.md)>               | :heavy_minus_sign:                                                                                                                         | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                    |                                                                                                                                            |
| `fieldsCatalogVariant`                                                                                                                     | List\<[GetUpdateVariantsJobQueryParamFieldsCatalogVariant](../../models/operations/GetUpdateVariantsJobQueryParamFieldsCatalogVariant.md)> | :heavy_minus_sign:                                                                                                                         | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                    |                                                                                                                                            |
| `include`                                                                                                                                  | List\<[GetUpdateVariantsJobQueryParamInclude](../../models/operations/GetUpdateVariantsJobQueryParamInclude.md)>                           | :heavy_minus_sign:                                                                                                                         | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships                       |                                                                                                                                            |
| `revision`                                                                                                                                 | *String*                                                                                                                                   | :heavy_check_mark:                                                                                                                         | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                        |                                                                                                                                            |