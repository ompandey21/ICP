# README

## Description
This Java program determines whether it’s possible to transform a number **A** into another number **B** using the following operations:

1. Multiply the current number by **2**  
2. Append **1** to the end of the current number (e.g., 23 → 231)

If the transformation is possible, the program prints:
- `"YES"`
- The total count of numbers in the transformation sequence
- The entire transformation sequence from **A** to **B**

Otherwise, it prints `"NO"`.

---

## Example

**Input:**

    2 162

**Output:**
   
    YES
    5
    2 4 8 81 162

**Explanation:**
- Start with 2  
- Multiply by 2 → 4  
- Multiply by 2 → 8  
- Append 1 → 81  
- Multiply by 2 → 162  

---

## How It Works

- The function `fun()` uses **recursion** and **backtracking** to explore both possible operations at each step:
  - `a * 2`
  - `a * 10 + 1`
- If the current value exceeds `b`, it backtracks.
- If it reaches exactly `b`, it stores the successful transformation sequence in the list `res`.

---

## Time Complexity (TC)

- In the **worst case**, each recursive call branches into two new calls, but since values grow exponentially, the recursion depth is limited by how quickly `a` exceeds `b`.
- Roughly: **O(log₁₀(b))** in practice, but conceptually **O(2^k)** in the worst case for deep recursion.

---

## Space Complexity (SC)

- The main space usage comes from the recursive call stack and temporary lists.
- Maximum recursion depth ≈ number of digits or transformations.
- **SC = O(k)** where `k` is the number of steps in the successful path.

---

## Notes

- Works with large numbers using `long`.
- Backtracking ensures only valid transformation paths are stored.
- Order of operations matters—recursion explores `a*10 + 1` first, then `2*a`.
