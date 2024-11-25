# CatalogVariantResponseObjectResource


## Fields

| Field                                                                                                                                                                                                                  | Type                                                                                                                                                                                                                   | Required                                                                                                                                                                                                               | Description                                                                                                                                                                                                            | Example                                                                                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `type`                                                                                                                                                                                                                 | [CatalogVariantEnum](../../models/components/CatalogVariantEnum.md)                                                                                                                                                    | :heavy_check_mark:                                                                                                                                                                                                     | N/A                                                                                                                                                                                                                    |                                                                                                                                                                                                                        |
| `id`                                                                                                                                                                                                                   | *String*                                                                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                                                     | The catalog variant ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`. | $custom:::$default:::SAMPLE-DATA-ITEM-1-VARIANT-MEDIUM                                                                                                                                                                 |
| `attributes`                                                                                                                                                                                                           | [CatalogVariantResponseObjectResourceAttributes](../../models/components/CatalogVariantResponseObjectResourceAttributes.md)                                                                                            | :heavy_check_mark:                                                                                                                                                                                                     | N/A                                                                                                                                                                                                                    |                                                                                                                                                                                                                        |
| `links`                                                                                                                                                                                                                | [ObjectLinks](../../models/components/ObjectLinks.md)                                                                                                                                                                  | :heavy_check_mark:                                                                                                                                                                                                     | N/A                                                                                                                                                                                                                    |                                                                                                                                                                                                                        |