# Unique Paths (Dynamic Programming with Memoization)

This program solves the **Unique Paths Problem**:  
Given an `m x n` grid, a robot can move either **down** or **right** at any step. The goal is to count the total number of unique paths from the **top-left corner** `(0,0)` to the **bottom-right corner** `(m-1,n-1)`.

---

## Algorithm Explanation

1. Use a **DP (memoization) table** `dp[m][n]` to store intermediate results.
2. Starting at `(0,0)`:
   - If the robot goes **right** → `(row, col+1)`
   - If the robot goes **down** → `(row+1, col)`
3. Base cases:
   - If outside the grid → return `0`.
   - If at the bottom-right corner `(m-1,n-1)` → return `1`.
   - If already computed in `dp[row][col]` → return stored value.
4. Recurrence relation:  
dp[row][col] = paths to the right + paths downward
5. Final result is stored at `dp[0][0]`.

---

## Example Walkthrough

Input:  
```java
m = 3, n = 2
S → . 
↓   ↓
. → .
↓   ↓
. → E

Steps:

- Start (0,0). Two choices: right or down.
- Recursively count paths until reaching (2,1) (the end).
- Memoize results to avoid recomputation.

Output:

3

There are 3 unique paths:
Right → Down → Down
Down → Right → Down
Down → Down → Right

Time Complexity

O(m × n) → Each cell (row,col) is computed once and stored in dp.

Space Complexity

O(m × n) for the DP table.

O(m + n) recursion stack depth (worst case).