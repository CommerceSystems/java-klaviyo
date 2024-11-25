# GetCouponCodesRequest


## Fields

| Field                                                                                                                                                                                                                                                                                                                      | Type                                                                                                                                                                                                                                                                                                                       | Required                                                                                                                                                                                                                                                                                                                   | Description                                                                                                                                                                                                                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `fieldsCouponCode`                                                                                                                                                                                                                                                                                                         | List\<[FieldsCouponCode](../../models/operations/FieldsCouponCode.md)>                                                                                                                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                         | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                                                                                                                                                                                                    |
| `fieldsCoupon`                                                                                                                                                                                                                                                                                                             | List\<[GetCouponCodesQueryParamFieldsCoupon](../../models/operations/GetCouponCodesQueryParamFieldsCoupon.md)>                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                         | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                                                                                                                                                                                                    |
| `filter`                                                                                                                                                                                                                                                                                                                   | *Optional\<String>*                                                                                                                                                                                                                                                                                                        | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                         | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`expires_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`status`: `equals`<br>`coupon.id`: `any`, `equals`<br>`profile.id`: `any`, `equals` |
| `include`                                                                                                                                                                                                                                                                                                                  | List\<[GetCouponCodesQueryParamInclude](../../models/operations/GetCouponCodesQueryParamInclude.md)>                                                                                                                                                                                                                       | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                         | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships                                                                                                                                                                                                       |
| `pageCursor`                                                                                                                                                                                                                                                                                                               | *Optional\<String>*                                                                                                                                                                                                                                                                                                        | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                         | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination                                                                                                                                                                                                          |
| `revision`                                                                                                                                                                                                                                                                                                                 | *String*                                                                                                                                                                                                                                                                                                                   | :heavy_check_mark:                                                                                                                                                                                                                                                                                                         | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                                                                                                                                                                        |