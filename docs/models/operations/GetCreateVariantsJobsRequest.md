# GetCreateVariantsJobsRequest


## Fields

| Field                                                                                                                                                                   | Type                                                                                                                                                                    | Required                                                                                                                                                                | Description                                                                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `fieldsCatalogVariantBulkCreateJob`                                                                                                                                     | List\<[FieldsCatalogVariantBulkCreateJob](../../models/operations/FieldsCatalogVariantBulkCreateJob.md)>                                                                | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                                                 |
| `filter`                                                                                                                                                                | *Optional\<String>*                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals` |
| `pageCursor`                                                                                                                                                            | *Optional\<String>*                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination                                                       |
| `revision`                                                                                                                                                              | *String*                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                     |