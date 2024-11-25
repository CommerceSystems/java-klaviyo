# GetProfileImportJobResponseCollectionCompoundDocumentData


## Fields

| Field                                                                                                                                                                          | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `type`                                                                                                                                                                         | [ProfileBulkImportJobEnum](../../models/components/ProfileBulkImportJobEnum.md)                                                                                                | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            |
| `id`                                                                                                                                                                           | *String*                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                             | Unique identifier for retrieving the job. Generated by Klaviyo.                                                                                                                |
| `attributes`                                                                                                                                                                   | [GetProfileImportJobResponseCollectionCompoundDocumentAttributes](../../models/components/GetProfileImportJobResponseCollectionCompoundDocumentAttributes.md)                  | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            |
| `links`                                                                                                                                                                        | [ObjectLinks](../../models/components/ObjectLinks.md)                                                                                                                          | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            |
| `relationships`                                                                                                                                                                | [Optional\<GetProfileImportJobResponseCollectionCompoundDocumentRelationships>](../../models/components/GetProfileImportJobResponseCollectionCompoundDocumentRelationships.md) | :heavy_minus_sign:                                                                                                                                                             | N/A                                                                                                                                                                            |