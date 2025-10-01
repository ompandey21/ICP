# Non-Overlapping Intervals (LeetCode 435)

This solution finds the minimum number of intervals to remove so that the rest are non-overlapping.

## Approach
1. Sort the intervals by their start time.
2. Traverse through intervals and check for overlaps:
   - If an interval overlaps with the previous one, increment the removal count.
   - Keep the interval with the smaller end time (greedy choice).
3. Return the total count of removed intervals.


## Example

**Input:** 
[[1,2], [2,3], [3,4], [1,3]]

**Output: 1**


**Explanation:**  
Removing interval `[1,3]` makes the remaining intervals non-overlapping: `[1,2], [2,3], [3,4]`.

## Complexity
- **Time Complexity:** `O(n log n)`  
  Sorting takes `O(n log n)` and scanning the intervals takes `O(n)`.  
- **Space Complexity:** `O(1)`  
  Only constant extra variables are used (ignores sorting overhead).
