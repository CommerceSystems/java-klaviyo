# RelativeDateOperatorBaseFilter


## Fields

| Field                                                                                                       | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `type`                                                                                                      | [DateEnum](../../models/components/DateEnum.md)                                                             | :heavy_check_mark:                                                                                          | N/A                                                                                                         |
| `operator`                                                                                                  | [RelativeDateOperatorBaseFilterOperator](../../models/components/RelativeDateOperatorBaseFilterOperator.md) | :heavy_check_mark:                                                                                          | Operators for relative date filters.<br/><br/>e.g. "in the last 10 days"                                    |
| `unit`                                                                                                      | [Unit](../../models/components/Unit.md)                                                                     | :heavy_check_mark:                                                                                          | Units for relative date filters.                                                                            |
| `quantity`                                                                                                  | *long*                                                                                                      | :heavy_check_mark:                                                                                          | N/A                                                                                                         |