# TrackingSettingResponseObjectResourceAttributes


## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `autoAddParameters`                                                                | *boolean*                                                                          | :heavy_check_mark:                                                                 | Whether tracking parameters are automatically added to campaigns and flows.        |
| `utmSource`                                                                        | [TrackingParamDTO](../../models/components/TrackingParamDTO.md)                    | :heavy_check_mark:                                                                 | N/A                                                                                |
| `utmMedium`                                                                        | [TrackingParamDTO](../../models/components/TrackingParamDTO.md)                    | :heavy_check_mark:                                                                 | N/A                                                                                |
| `utmCampaign`                                                                      | [Optional\<TrackingParamDTO>](../../models/components/TrackingParamDTO.md)         | :heavy_minus_sign:                                                                 | N/A                                                                                |
| `utmId`                                                                            | [Optional\<TrackingParamDTO>](../../models/components/TrackingParamDTO.md)         | :heavy_minus_sign:                                                                 | N/A                                                                                |
| `utmTerm`                                                                          | [Optional\<TrackingParamDTO>](../../models/components/TrackingParamDTO.md)         | :heavy_minus_sign:                                                                 | N/A                                                                                |
| `customParameters`                                                                 | List\<[CustomTrackingParamDTO](../../models/components/CustomTrackingParamDTO.md)> | :heavy_minus_sign:                                                                 | Additional custom tracking parameters.                                             |