
# User

## Structure

`User`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Long` | Optional | - | Long getId() | setId(Long id) |
| `Username` | `String` | Optional | - | String getUsername() | setUsername(String username) |
| `FirstName` | `String` | Optional | - | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | - | String getLastName() | setLastName(String lastName) |
| `Email` | `String` | Optional | - | String getEmail() | setEmail(String email) |
| `Password` | `String` | Optional | - | String getPassword() | setPassword(String password) |
| `Phone` | `String` | Optional | - | String getPhone() | setPhone(String phone) |
| `UserStatus` | `Integer` | Optional | User Status | Integer getUserStatus() | setUserStatus(Integer userStatus) |

## Example (as JSON)

```json
{
  "id": 10,
  "username": "theUser",
  "firstName": "John",
  "lastName": "James",
  "email": "john@email.com",
  "password": "12345",
  "phone": "12345",
  "userStatus": 1
}
```

