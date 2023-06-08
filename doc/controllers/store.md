# Store

Access to Petstore orders

Find out more about our store: [http://swagger.io](http://swagger.io)

```java
StoreController storeController = client.getStoreController();
```

## Class Name

`StoreController`

## Methods

* [Get Inventory](../../doc/controllers/store.md#get-inventory)
* [Place Order](../../doc/controllers/store.md#place-order)
* [Get Order by Id](../../doc/controllers/store.md#get-order-by-id)
* [Delete Order](../../doc/controllers/store.md#delete-order)


# Get Inventory

Returns a map of status codes to quantities

```java
CompletableFuture<Map<String, Integer>> getInventoryAsync()
```

## Response Type

`Map<String, Integer>`

## Example Usage

```java
storeController.getInventoryAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Place Order

Place a new order in the store

```java
CompletableFuture<Order> placeOrderAsync(
    final Long id,
    final Long petId,
    final Integer quantity,
    final LocalDateTime shipDate,
    final OrderStatusEnum orderStatus,
    final Boolean complete)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `Long` | Form, Optional | - |
| `petId` | `Long` | Form, Optional | - |
| `quantity` | `Integer` | Form, Optional | - |
| `shipDate` | `LocalDateTime` | Form, Optional | - |
| `orderStatus` | [`OrderStatusEnum`](../../doc/models/order-status-enum.md) | Form, Optional | Order Status<br>**Default**: `OrderStatusEnum.APPROVED` |
| `complete` | `Boolean` | Form, Optional | - |

## Response Type

[`Order`](../../doc/models/order.md)

## Example Usage

```java
Long id = 10L;
Long petId = 198772L;
Integer quantity = 7;
LocalDateTime shipDate = DateTimeHelper.fromRfc8601DateTime("05/31/2023 00:00:00");
OrderStatusEnum orderStatus = OrderStatusEnum.APPROVED;
Boolean complete = true;

storeController.placeOrderAsync(id, petId, quantity, shipDate, orderStatus, complete).thenAccept(result -> {
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
| 405 | Invalid input | `ApiException` |


# Get Order by Id

For valid response try integer IDs with value <= 5 or > 10. Other values will generate exceptions.

```java
CompletableFuture<Order> getOrderByIdAsync(
    final long orderId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `long` | Template, Required | ID of order that needs to be fetched |

## Response Type

[`Order`](../../doc/models/order.md)

## Example Usage

```java
long orderId = 62L;

storeController.getOrderByIdAsync(orderId).thenAccept(result -> {
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
| 400 | Invalid ID supplied | `ApiException` |
| 404 | Order not found | `ApiException` |


# Delete Order

For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors

```java
CompletableFuture<Void> deleteOrderAsync(
    final long orderId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `long` | Template, Required | ID of the order that needs to be deleted |

## Response Type

`void`

## Example Usage

```java
long orderId = 62L;

storeController.deleteOrderAsync(orderId).thenAccept(result -> {
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
| 400 | Invalid ID supplied | `ApiException` |
| 404 | Order not found | `ApiException` |

