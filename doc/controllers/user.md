# User

Operations about user

```java
UserController userController = client.getUserController();
```

## Class Name

`UserController`

## Methods

* [Create User](../../doc/controllers/user.md#create-user)
* [Create Users With List Input](../../doc/controllers/user.md#create-users-with-list-input)
* [Login User](../../doc/controllers/user.md#login-user)
* [Logout User](../../doc/controllers/user.md#logout-user)
* [Get User by Name](../../doc/controllers/user.md#get-user-by-name)
* [Update User](../../doc/controllers/user.md#update-user)
* [Delete User](../../doc/controllers/user.md#delete-user)


# Create User

This can only be done by the logged in user.

```java
CompletableFuture<User> createUserAsync(
    final Long id,
    final String username,
    final String firstName,
    final String lastName,
    final String email,
    final String password,
    final String phone,
    final Integer userStatus)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `Long` | Form, Optional | - |
| `username` | `String` | Form, Optional | - |
| `firstName` | `String` | Form, Optional | - |
| `lastName` | `String` | Form, Optional | - |
| `email` | `String` | Form, Optional | - |
| `password` | `String` | Form, Optional | - |
| `phone` | `String` | Form, Optional | - |
| `userStatus` | `Integer` | Form, Optional | User Status |

## Response Type

[`User`](../../doc/models/user.md)

## Example Usage

```java
Long id = 10L;
String username = "theUser";
String firstName = "John";
String lastName = "James";
String email = "john@email.com";
String password = "12345";
String phone = "12345";
Integer userStatus = 1;

userController.createUserAsync(id, username, firstName, lastName, email, password, phone, userStatus).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Create Users With List Input

Creates list of users with given input array

```java
CompletableFuture<User> createUsersWithListInputAsync(
    final List<User> body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`List<User>`](../../doc/models/user.md) | Body, Optional | - |

## Response Type

[`User`](../../doc/models/user.md)

## Example Usage

```java
userController.createUsersWithListInputAsync(null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | successful operation | `ApiException` |


# Login User

Logs user into the system

```java
CompletableFuture<String> loginUserAsync(
    final String username,
    final String password)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Query, Optional | The user name for login |
| `password` | `String` | Query, Optional | The password for login in clear text |

## Response Type

`String`

## Example Usage

```java
userController.loginUserAsync(null, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Invalid username/password supplied | `ApiException` |


# Logout User

Logs out current logged in user session

```java
CompletableFuture<Void> logoutUserAsync()
```

## Response Type

`void`

## Example Usage

```java
userController.logoutUserAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get User by Name

Get user by user name

```java
CompletableFuture<User> getUserByNameAsync(
    final String name)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Template, Required | The name that needs to be fetched. Use user1 for testing. |

## Response Type

[`User`](../../doc/models/user.md)

## Example Usage

```java
String name = "name0";

userController.getUserByNameAsync(name).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Invalid username supplied | `ApiException` |
| 404 | User not found | `ApiException` |


# Update User

This can only be done by the logged in user.

```java
CompletableFuture<Void> updateUserAsync(
    final String name,
    final Long id,
    final String username,
    final String firstName,
    final String lastName,
    final String email,
    final String password,
    final String phone,
    final Integer userStatus)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Template, Required | name that need to be deleted |
| `id` | `Long` | Form, Optional | - |
| `username` | `String` | Form, Optional | - |
| `firstName` | `String` | Form, Optional | - |
| `lastName` | `String` | Form, Optional | - |
| `email` | `String` | Form, Optional | - |
| `password` | `String` | Form, Optional | - |
| `phone` | `String` | Form, Optional | - |
| `userStatus` | `Integer` | Form, Optional | User Status |

## Response Type

`void`

## Example Usage

```java
String name = "name0";
Long id = 10L;
String username = "theUser";
String firstName = "John";
String lastName = "James";
String email = "john@email.com";
String password = "12345";
String phone = "12345";
Integer userStatus = 1;

userController.updateUserAsync(name, id, username, firstName, lastName, email, password, phone, userStatus).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Delete User

This can only be done by the logged in user.

```java
CompletableFuture<Void> deleteUserAsync(
    final String name)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Template, Required | The name that needs to be deleted |

## Response Type

`void`

## Example Usage

```java
String name = "name0";

userController.deleteUserAsync(name).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Invalid username supplied | `ApiException` |
| 404 | User not found | `ApiException` |

