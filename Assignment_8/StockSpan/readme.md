# Stock Spanner

## Problem
Design a class to calculate the **stock span**: the number of consecutive days before today where the stock price was **less than or equal** to today's price.

## Approach
- Use a **stack** to store pairs `[price, span]`.
- For each new price:
  - Pop all stack elements with price ≤ current price and add their spans.
  - Push `[price, span]` back onto the stack.
- Return the span for the current price.

## Example
```java
StockSpanner spanner = new StockSpanner();
System.out.println(spanner.next(100)); // Output: 1
System.out.println(spanner.next(80));  // Output: 1
```
## Time Complexity (TC)

Amortized O(1) per call. Each price is pushed and popped at most once.

## Space Complexity (SC)

O(n), for the stack storing prices and spans.
