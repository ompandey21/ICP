# Maximum Subarray (Kadane’s Algorithm)

This program solves the **Maximum Subarray Problem** using **Kadane's Algorithm**.  
It finds the contiguous subarray within a one-dimensional array of numbers that has the largest sum.

---

## Algorithm Explanation

1. Initialize:
   - `ans` = smallest possible integer (`Integer.MIN_VALUE`) → stores the maximum sum found so far.
   - `sum` = 0 → stores the current running sum.

2. Iterate through each element:
   - Add current element to `sum`.
   - Update `ans = max(ans, sum)`.
   - If `sum` becomes negative, reset `sum = 0` (since starting fresh gives a better chance for a maximum sum).

3. Return `ans`.

---

## Example Walkthrough

Input:  
```java
nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

Steps:

Start with ans = -∞, sum = 0.

Add numbers one by one, resetting sum when it drops below 0:

[-2] → sum = -2 → ans = -2 → reset sum=0

[1] → sum = 1 → ans = 1

[-3] → sum = -2 → ans = 1 → reset sum=0

[4] → sum = 4 → ans = 4

[4,-1] → sum = 3 → ans = 4

[4,-1,2] → sum = 5 → ans = 5

[4,-1,2,1] → sum = 6 → ans = 6

[4,-1,2,1,-5] → sum = 1 → ans = 6

[4,-1,2,1,-5,4] → sum = 5 → ans = 6

Output:

6