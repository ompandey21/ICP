# README

## Description
This Java program reads an integer `n` from user input and prints numbers in the following order:

- First, it prints the number `n`.
- Then, it prints all integers from `1` to `n-1`, separated by spaces.

### Example
**Input:**

    5   


**Output:**

    5 1 2 3 4


---

## How It Works
1. The program uses a `Scanner` to read an integer `n`.
2. It immediately prints `n` followed by a space.
3. Then it runs a `for` loop from `1` to `n-1`, printing each value separated by spaces.

---

## Time Complexity (TC)
- The loop runs `(n-1)` times.
- Each iteration performs a constant-time print operation.
- **TC = O(n)**

---

## Space Complexity (SC)
- The program uses a fixed amount of extra space (`Scanner` and loop variables).
- **SC = O(1)**

---

## Notes
- Input must be a positive integer.
- Output is printed on a single line with trailing space at the end.
