# Natsya and Rice — README

## Overview
This Java program solves the **"Natsya and Rice"** problem.  
It determines whether a given range of rice weight per pack can satisfy a specific required range when multiplied by the number of packs.

---

## How It Works
1. The program reads multiple test cases (`t`).
2. For each test case:
   - It takes five integers:  
     `n` (number of packs), `a`, `b`, `c`, and `d`.
   - The rice weight per pack can vary between `(a - b)` and `(a + b)`.
   - The total acceptable rice weight can vary between `(c - d)` and `(c + d)`.
3. The program checks if these two ranges overlap:
   - If they do, it prints `true`.
   - Otherwise, it prints `false`.

---

## Example
### Input

    2
    5 10 2 50 3
    4 5 1 20 2


### Output

---

## Time Complexity (TC)
- **O(t)** — The program runs one constant-time calculation per test case.

## Space Complexity (SC)
- **O(1)** — Only a few integer variables are used, regardless of input size.

---

## Notes
- Uses `Scanner` for input.
- Closes the scanner after processing all test cases to prevent resource leaks.
