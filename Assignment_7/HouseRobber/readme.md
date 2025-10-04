# House Robber (Recursion + Memoization)

This program solves the **House Robber Problem**:  
A robber wants to maximize the amount of money stolen from a row of houses.  
Constraint: The robber **cannot rob two adjacent houses**.

---

## Algorithm Explanation

1. Use recursion with memoization (`dp[]`) to store intermediate results.
2. At each index `start`:
   - **Rob current house** → money = `arr[start] + maxRob(start+2)`.
   - **Skip current house** → money = `maxRob(start+1)`.
3. Store the maximum of both choices in `dp[start]`.
4. Final result = `maxRob(0, n-1)`.




## Time Complexity

`O(n)` → Each house index is computed once due to memoization.

## Space Complexity
`O(n)` → For the DP array.

`O(n)` → Recursion stack depth in worst case.


---

## Example Walkthrough

Input:
```java
nums = [2, 7, 9, 3, 1]
Choices:

Rob house 0 → money = 2 + maxRob(2…4)

Skip house 0 → money = maxRob(1…4)

Exploring gives:

Path: Rob (2) + Rob (9) + Rob (1) = 12

Output:

12