# Minimum Number of Arrows to Burst Balloons (LeetCode 452)

This solution finds the minimum number of arrows required to burst all balloons represented as intervals on a number line.

## Approach
1. Sort the balloons by their end coordinates (if ends are equal, sort by start).
2. Initialize the first arrow at the end of the first balloon.
3. Traverse through the balloons:
   - If the current balloon starts **before or at** the last arrow, it is already covered.
   - Otherwise, shoot a new arrow at the end of the current balloon.
4. Return the total number of arrows used.

## Example

**Input:**  
[[10,16], [2,8], [1,6], [7,12]]

**Output:** 2


**Explanation:**  
- Shoot the first arrow at `6` to burst `[2,8]` and `[1,6]`.  
- Shoot the second arrow at `16` to burst `[10,16]` and `[7,12]`.

## Complexity
- **Time Complexity:** `O(n log n)`  
  Sorting the balloons takes `O(n log n)` and scanning takes `O(n)`.  
- **Space Complexity:** `O(1)`  
  Only constant extra variables are used (ignores sorting overhead).
