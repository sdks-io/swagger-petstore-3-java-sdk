
# Customer

## Structure

`Customer`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Long` | Optional | - | Long getId() | setId(Long id) |
| `Username` | `String` | Optional | - | String getUsername() | setUsername(String username) |
| `Address` | [`List<Address>`](../../doc/models/address.md) | Optional | - | List<Address> getAddress() | setAddress(List<Address> address) |

## Example (as JSON)

```json
{
  "id": 100000,
  "username": "fehguy",
  "address": [
    {
      "street": "street4",
      "city": "city4",
      "state": "state0",
      "zip": "zip8"
    }
  ]
}
```

