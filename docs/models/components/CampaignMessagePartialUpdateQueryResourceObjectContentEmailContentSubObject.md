# CampaignMessagePartialUpdateQueryResourceObjectContentEmailContentSubObject


## Fields

| Field                                     | Type                                      | Required                                  | Description                               | Example                                   |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| `subject`                                 | *JsonNullable\<String>*                   | :heavy_minus_sign:                        | The subject of the message                | Buy our product!                          |
| `previewText`                             | *JsonNullable\<String>*                   | :heavy_minus_sign:                        | Preview text associated with the message  | My preview text                           |
| `fromEmail`                               | *JsonNullable\<String>*                   | :heavy_minus_sign:                        | The email the message should be sent from | store@my-company.com                      |
| `fromLabel`                               | *JsonNullable\<String>*                   | :heavy_minus_sign:                        | The label associated with the from_email  | My Company                                |
| `replyToEmail`                            | *JsonNullable\<String>*                   | :heavy_minus_sign:                        | Optional Reply-To email address           | reply-to@my-company.com                   |
| `ccEmail`                                 | *JsonNullable\<String>*                   | :heavy_minus_sign:                        | Optional CC email address                 | cc@my-company.com                         |
| `bccEmail`                                | *JsonNullable\<String>*                   | :heavy_minus_sign:                        | Optional BCC email address                | bcc@my-company.com                        |