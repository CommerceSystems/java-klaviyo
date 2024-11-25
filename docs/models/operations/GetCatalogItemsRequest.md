# GetCatalogItemsRequest


## Fields

| Field                                                                                                                                                                                                                                        | Type                                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `fieldsCatalogItem`                                                                                                                                                                                                                          | List\<[FieldsCatalogItem](../../models/operations/FieldsCatalogItem.md)>                                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                                                                                           | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                                                                                                                      |
| `fieldsCatalogVariant`                                                                                                                                                                                                                       | List\<[FieldsCatalogVariant](../../models/operations/FieldsCatalogVariant.md)>                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                           | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                                                                                                                      |
| `filter`                                                                                                                                                                                                                                     | *Optional\<String>*                                                                                                                                                                                                                          | :heavy_minus_sign:                                                                                                                                                                                                                           | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`ids`: `any`<br>`category.id`: `equals`<br>`title`: `contains`<br>`published`: `equals` |
| `include`                                                                                                                                                                                                                                    | List\<[GetCatalogItemsQueryParamInclude](../../models/operations/GetCatalogItemsQueryParamInclude.md)>                                                                                                                                       | :heavy_minus_sign:                                                                                                                                                                                                                           | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships                                                                                                                         |
| `pageCursor`                                                                                                                                                                                                                                 | *Optional\<String>*                                                                                                                                                                                                                          | :heavy_minus_sign:                                                                                                                                                                                                                           | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination                                                                                                                            |
| `sort`                                                                                                                                                                                                                                       | [Optional\<QueryParamSort>](../../models/operations/QueryParamSort.md)                                                                                                                                                                       | :heavy_minus_sign:                                                                                                                                                                                                                           | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sorting                                                                                                                               |
| `revision`                                                                                                                                                                                                                                   | *String*                                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                                           | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                                                                                          |