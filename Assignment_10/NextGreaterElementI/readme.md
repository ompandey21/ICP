# Next Greater Element — README

## Problem Description
Given two arrays `nums1` and `nums2`, where all elements in `nums1` are **unique** and present in `nums2`, find the **next greater element** for each element in `nums1` from `nums2`.

The **next greater element** of a number `x` in `nums2` is the **first greater number to the right** of `x` in `nums2`.  
If no such number exists, the result is `-1`.

---

## Approach

### Step 1 — Preprocessing `nums2`
- Use a **stack** to compute the next greater element for each number in `nums2`.
- Traverse `nums2` from **right to left**:
  - While the stack is not empty and the top of the stack is **less than or equal to** the current number, pop it.
  - If the stack is empty, there’s no greater element → store `-1`.
  - Otherwise, the top of the stack is the next greater element.
  - Push the current element onto the stack.

This gives an array `res` where `res[i]` is the next greater element of `nums2[i]`.

### Step 2 — Map Elements
- Use a **HashMap** to store the index of each number in `nums2`.
- For each number in `nums1`, find its index in `nums2` using the map and replace it with the precomputed value from the `res` array.

---

## Dry Run Example

### Input:
    nums1 = [4, 1, 2]
    nums2 = [1, 3, 4, 2]


### Step 1: Find Next Greater in `nums2`
Traverse from right to left:

| i | nums2[i] | Stack (top → bottom) | Next Greater |
|---|-----------|----------------------|---------------|
| 3 | 2         | [2]                 | -1            |
| 2 | 4         | [4, 2]              | -1            |
| 1 | 3         | [3, 4, 2]           | 4             |
| 0 | 1         | [1, 3, 4, 2]        | 3             |

So, `nextGreater(nums2)` = `[3, 4, -1, -1]`

### Step 2: Map and Build Output
Mapping using `nums2` indices:

    1 -> 0
    3 -> 1
    4 -> 2
    2 -> 3


Now replace for `nums1`:

    nums1 = [4, 1, 2]
    => [res[2], res[0], res[3]]
    => [-1, 3, -1]


### Output:

    [-1, 3, -1] 


---

## Time Complexity
- **O(n)** to compute next greater elements for `nums2` (each element is pushed and popped once from the stack)
- **O(m)** to map results for `nums1`
- **Total:** `O(n + m)`

## Space Complexity
- **O(n)** for the stack and result array
- **O(n)** for the HashMap  
- **Total:** `O(n)`
