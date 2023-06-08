
# Order

## Structure

`Order`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Long` | Optional | - | Long getId() | setId(Long id) |
| `PetId` | `Long` | Optional | - | Long getPetId() | setPetId(Long petId) |
| `Quantity` | `Integer` | Optional | - | Integer getQuantity() | setQuantity(Integer quantity) |
| `ShipDate` | `LocalDateTime` | Optional | - | LocalDateTime getShipDate() | setShipDate(LocalDateTime shipDate) |
| `OrderStatus` | [`OrderStatusEnum`](../../doc/models/order-status-enum.md) | Optional | Order Status<br>**Default**: `OrderStatusEnum.APPROVED` | OrderStatusEnum getOrderStatus() | setOrderStatus(OrderStatusEnum orderStatus) |
| `Complete` | `Boolean` | Optional | - | Boolean getComplete() | setComplete(Boolean complete) |

## Example (as JSON)

```json
{
  "id": 10,
  "petId": 198772,
  "quantity": 7,
  "shipDate": "05/31/2023 00:00:00",
  "orderStatus": "approved",
  "complete": true
}
```

