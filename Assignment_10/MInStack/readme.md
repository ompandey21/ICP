# Min Stack — README

## Problem Description
Design a stack that supports the following operations **in constant time (O(1))**:
- `push(val)` → Push an element onto the stack.
- `pop()` → Remove the element on top of the stack.
- `top()` → Get the top element.
- `getMin()` → Retrieve the minimum element in the stack.

---

## Approach

We use a **stack of pairs** where each element stores:
- `val` → the actual value pushed.
- `min` → the minimum value **at the time this element was pushed**.

This ensures that at any point, the **top element’s `min`** represents the **minimum value of the entire stack** up to that point.

### Operations

#### 1. `push(val)`
- Compare `val` with the current `min`.
- Store both the value and the new minimum in a `Pair`.
- Push the `Pair` onto the stack.

#### 2. `pop()`
- Remove the top `Pair` from the stack.
- Update `min` to the next available minimum (from the new top or reset if empty).

#### 3. `top()`
- Return the `val` from the top `Pair`.

#### 4. `getMin()`
- Return the `min` from the top `Pair`.

---

## Time Complexity
| Operation | Time Complexity |
|------------|----------------|
| push(val) | O(1) |
| pop() | O(1) |
| top() | O(1) |
| getMin() | O(1) |

## Space Complexity
- **O(n)** → Each element stores both its value and the current minimum.



