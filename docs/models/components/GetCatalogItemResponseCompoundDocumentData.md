# GetCatalogItemResponseCompoundDocumentData


## Fields

| Field                                                                                                                                                                                                               | Type                                                                                                                                                                                                                | Required                                                                                                                                                                                                            | Description                                                                                                                                                                                                         | Example                                                                                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `type`                                                                                                                                                                                                              | [CatalogItemEnum](../../models/components/CatalogItemEnum.md)                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                                                                  | N/A                                                                                                                                                                                                                 |                                                                                                                                                                                                                     |
| `id`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                                                  | The catalog item ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`. | $custom:::$default:::SAMPLE-DATA-ITEM-1                                                                                                                                                                             |
| `attributes`                                                                                                                                                                                                        | [GetCatalogItemResponseCompoundDocumentAttributes](../../models/components/GetCatalogItemResponseCompoundDocumentAttributes.md)                                                                                     | :heavy_check_mark:                                                                                                                                                                                                  | N/A                                                                                                                                                                                                                 |                                                                                                                                                                                                                     |
| `links`                                                                                                                                                                                                             | [ObjectLinks](../../models/components/ObjectLinks.md)                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                                                  | N/A                                                                                                                                                                                                                 |                                                                                                                                                                                                                     |
| `relationships`                                                                                                                                                                                                     | [Optional\<GetCatalogItemResponseCompoundDocumentRelationships>](../../models/components/GetCatalogItemResponseCompoundDocumentRelationships.md)                                                                    | :heavy_minus_sign:                                                                                                                                                                                                  | N/A                                                                                                                                                                                                                 |                                                                                                                                                                                                                     |