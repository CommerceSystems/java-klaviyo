# Attributes


## Fields

| Field                                                                                                                                                                                                                                                 | Type                                                                                                                                                                                                                                                  | Required                                                                                                                                                                                                                                              | Description                                                                                                                                                                                                                                           | Example                                                                                                                                                                                                                                               |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `testAccount`                                                                                                                                                                                                                                         | *boolean*                                                                                                                                                                                                                                             | :heavy_check_mark:                                                                                                                                                                                                                                    | Indicates if the account is a test account. Test accounts are not a separate testing engineering environment. Test accounts use the same production environment as normal Klaviyo accounts. This feature is primarily UI based to reduce human errors |                                                                                                                                                                                                                                                       |
| `contactInformation`                                                                                                                                                                                                                                  | [ContactInformation](../../models/components/ContactInformation.md)                                                                                                                                                                                   | :heavy_check_mark:                                                                                                                                                                                                                                    | N/A                                                                                                                                                                                                                                                   |                                                                                                                                                                                                                                                       |
| `industry`                                                                                                                                                                                                                                            | *JsonNullable\<String>*                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                    | The kind of business and/or types of goods that the business sells. This is leveraged in Klaviyo analytics and guidance.                                                                                                                              | Software / SaaS                                                                                                                                                                                                                                       |
| `timezone`                                                                                                                                                                                                                                            | *String*                                                                                                                                                                                                                                              | :heavy_check_mark:                                                                                                                                                                                                                                    | The account's timezone is used when displaying dates and times. This is an IANA timezone. See [the full list here ](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).                                                                    | US/Eastern                                                                                                                                                                                                                                            |
| `preferredCurrency`                                                                                                                                                                                                                                   | *String*                                                                                                                                                                                                                                              | :heavy_check_mark:                                                                                                                                                                                                                                    | The preferred currency for the account. This is the currency used for currency-based metrics in dashboards, analytics, coupons, and templates.                                                                                                        | USD                                                                                                                                                                                                                                                   |
| `publicApiKey`                                                                                                                                                                                                                                        | *String*                                                                                                                                                                                                                                              | :heavy_check_mark:                                                                                                                                                                                                                                    | The Public API Key can be used for client-side API calls. [More info here](https://developers.klaviyo.com/en/docs/retrieve_api_credentials).                                                                                                          | AbC123                                                                                                                                                                                                                                                |
| `locale`                                                                                                                                                                                                                                              | *String*                                                                                                                                                                                                                                              | :heavy_check_mark:                                                                                                                                                                                                                                    | The account's locale is used to determine the region and language for the account.                                                                                                                                                                    | en-US                                                                                                                                                                                                                                                 |