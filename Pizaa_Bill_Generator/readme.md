# Pizza Ordering System

This Java application simulates a pizza ordering system with pricing and options for additional features like extra cheese, extra toppings, and takeaway packaging. Prices are calculated in NPR (Nepalese Rupees).

## Features

- **Regular and Deluxe Pizzas**: Offers two pizza types with different base prices.
- **Optional Add-ons**:
  - **Extra Cheese**: Add extra cheese for an additional cost.
  - **Extra Topping**: Add extra topping for an additional cost.
  - **Takeaway**: Package the pizza for takeaway with an additional packaging cost.

## Pricing Structure (in NPR)

| Pizza Type | Base Price (NPR) |
| ---------- | ---------------- |
| Regular    | 200              |
| Deluxe     | 300              |

| Add-ons       | Extra Cost (NPR) |
| ------------- | ---------------- |
| Extra Cheese  | 20               |
| Extra Topping | 50               |
| Takeaway Bag  | 10               |

## Code Structure

### Class: `Pizza`

- **Attributes**:
  - `price` (int): Base price of the pizza, updated with each add-on.
  - `veg` (boolean): Indicates whether the pizza is vegetarian.
  - `extratopping`, `extracheese`, `takeaway` (int): Prices for each add-on.
- **Methods**:
  - `pizzaprice(boolean veg)`: Sets the base price based on pizza type.
  - `addtopping()`: Adds extra topping cost to the base price.
  - `extracheese()`: Adds extra cheese cost to the base price.
  - `takeaway()`: Adds takeaway bag cost to the base price.
