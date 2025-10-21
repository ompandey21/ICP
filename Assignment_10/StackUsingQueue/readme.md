# Implement Stack using Queues — README

## Problem Description
Design a stack (LIFO — Last In First Out) using **two queues**.  
You need to implement the following operations:
- `push(x)` → Push element `x` onto the stack.
- `pop()` → Removes the element on top of the stack.
- `top()` → Get the top element.
- `empty()` → Returns whether the stack is empty.

---

## Approach

We use **two queues** (`q1` and `q2`) to simulate stack behavior.

### Push Operation — O(n)
1. Move all elements from `q1` to `q2`.
2. Add the new element `x` to `q1`.
3. Move all elements back from `q2` to `q1`.
   
This ensures the **newest element is always at the front** of `q1`, allowing `pop()` and `top()` to be O(1).

### Pop Operation — O(1)
- Simply `poll()` from `q1`, which removes the front element (top of the stack).

### Top Operation — O(1)
- Return `peek()` from `q1`, which gives the front element (top of the stack).

### Empty Operation — O(1)
- Return `q1.isEmpty()`.


---

## Time Complexity
| Operation | Time Complexity |
|------------|----------------|
| push(x) | O(n) |
| pop() | O(1) |
| top() | O(1) |
| empty() | O(1) |

## Space Complexity
- **O(n)** — for storing elements in the queues.


