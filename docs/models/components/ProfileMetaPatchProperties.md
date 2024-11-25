# ProfileMetaPatchProperties


## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        | Example                                                            |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `append`                                                           | [JsonNullable\<Append>](../../models/components/Append.md)         | :heavy_minus_sign:                                                 | Append a simple value or values to this property array             | {<br/>"skus": "92538"<br/>}                                        |
| `unappend`                                                         | [JsonNullable\<Unappend>](../../models/components/Unappend.md)     | :heavy_minus_sign:                                                 | Remove a simple value or values from this property array           | {<br/>"skus": "40571"<br/>}                                        |
| `unset`                                                            | [JsonNullable\<Unset>](../../models/components/Unset.md)           | :heavy_minus_sign:                                                 | Remove a key or keys (and their values) completely from properties | skus                                                               |