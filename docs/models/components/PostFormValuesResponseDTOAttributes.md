# PostFormValuesResponseDTOAttributes


## Fields

| Field                                                                                                                                                                                                                                                                                          | Type                                                                                                                                                                                                                                                                                           | Required                                                                                                                                                                                                                                                                                       | Description                                                                                                                                                                                                                                                                                    | Example                                                                                                                                                                                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `results`                                                                                                                                                                                                                                                                                      | List\<[ValuesData](../../models/components/ValuesData.md)>                                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                                                                                             | An array of all the returned values data.<br/>Each object in the array represents one unique grouping and the results for that grouping.                                                                                                                                                       | [<br/>{<br/>"groupings": {<br/>"form_id": "abc123",<br/>"form_version_id": "012tuy"<br/>},<br/>"statistics": {<br/>"viewed_form": 90,<br/>"submits": 9,<br/>"submit_rate": 0.1<br/>}<br/>},<br/>{<br/>"groupings": {<br/>"form_id": "abc123",<br/>"form_version_id": "756ghi"<br/>},<br/>"statistics": {<br/>"viewed_form": 10,<br/>"submits": 1,<br/>"submit_rate": 0.1<br/>}<br/>}<br/>] |