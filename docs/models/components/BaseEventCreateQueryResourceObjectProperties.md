# BaseEventCreateQueryResourceObjectProperties

Properties of this event. Any top level property (that are not objects) can be
used to create segments. The $extra property is a special property. This records any
non-segmentable values that can be referenced later. For example, HTML templates are
useful on a segment but are not used to create a segment. There are limits
placed onto the size of the data present. This must not exceed 5 MB. This must not
exceed 300 event properties. A single string cannot be larger than 100 KB. Each array
must not exceed 4000 elements. The properties cannot contain more than 10 nested levels.


## Fields

| Field       | Type        | Required    | Description |
| ----------- | ----------- | ----------- | ----------- |