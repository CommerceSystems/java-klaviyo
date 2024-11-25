# CampaignValuesRequestDTOResourceObjectAttributes


## Fields

| Field                                                                                                                                                                                                                                                                                                                                                   | Type                                                                                                                                                                                                                                                                                                                                                    | Required                                                                                                                                                                                                                                                                                                                                                | Description                                                                                                                                                                                                                                                                                                                                             | Example                                                                                                                                                                                                                                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `statistics`                                                                                                                                                                                                                                                                                                                                            | List\<[CampaignValuesRequestDTOResourceObjectStatistics](../../models/components/CampaignValuesRequestDTOResourceObjectStatistics.md)>                                                                                                                                                                                                                  | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                      | List of statistics to query for. All rate statistics will be returned in fractional form [0.0, 1.0]                                                                                                                                                                                                                                                     | [<br/>"opens",<br/>"open_rate"<br/>]                                                                                                                                                                                                                                                                                                                    |
| `timeframe`                                                                                                                                                                                                                                                                                                                                             | [CampaignValuesRequestDTOResourceObjectTimeframe](../../models/components/CampaignValuesRequestDTOResourceObjectTimeframe.md)                                                                                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                      | The timeframe to query for data within. The max length a timeframe can be is 1 year                                                                                                                                                                                                                                                                     |                                                                                                                                                                                                                                                                                                                                                         |
| `conversionMetricId`                                                                                                                                                                                                                                                                                                                                    | *String*                                                                                                                                                                                                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                      | ID of the metric to be used for conversion statistics                                                                                                                                                                                                                                                                                                   | RESQ6t                                                                                                                                                                                                                                                                                                                                                  |
| `filter`                                                                                                                                                                                                                                                                                                                                                | *JsonNullable\<String>*                                                                                                                                                                                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                      | API filter string used to filter the query.<br/>Allowed filters are send_channel, campaign_id.<br/>Allowed operators are equals, contains-any.<br/>Only one filter can be used per attribute, only AND can be used as a combination operator.<br/>Max of 100 messages per ANY filter.<br/>When filtering on send_channel, allowed values are email, push-notification, sms. | and(equals(campaign_id,"abc123"),contains-any(send_channel,["email","sms"]))                                                                                                                                                                                                                                                                            |