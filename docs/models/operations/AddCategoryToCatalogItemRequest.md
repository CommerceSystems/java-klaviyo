# AddCategoryToCatalogItemRequest


## Fields

| Field                                                                                                                                                                                                               | Type                                                                                                                                                                                                                | Required                                                                                                                                                                                                            | Description                                                                                                                                                                                                         | Example                                                                                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                                                  | The catalog item ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`. | $custom:::$default:::SAMPLE-DATA-ITEM-1                                                                                                                                                                             |
| `revision`                                                                                                                                                                                                          | *String*                                                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                                                  | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                                                                 |                                                                                                                                                                                                                     |
| `catalogItemCategoryOp`                                                                                                                                                                                             | [CatalogItemCategoryOp](../../models/components/CatalogItemCategoryOp.md)                                                                                                                                           | :heavy_check_mark:                                                                                                                                                                                                  | N/A                                                                                                                                                                                                                 |                                                                                                                                                                                                                     |