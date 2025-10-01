# Boats to Save People (LeetCode 881)

This solution calculates the minimum number of boats needed to save all people, where each boat can carry at most two people without exceeding the weight limit.

## Approach
1. Sort the people by weight.
2. Use two pointers:
   - `left` starts at the lightest person.
   - `right` starts at the heaviest person.
3. If the lightest and heaviest person can share a boat (`people[left] + people[right] <= limit`), move both pointers.
4. Otherwise, place only the heaviest person (`right--`) in a boat.
5. Count each boat used and continue until all people are placed.

## Example

**Input:**  
people = [3,5,3,4], limit = 5

**Output:**  
4

**Explanation:**  
- Person with weight `3` and `5` cannot share → boat 1.  
- Person with weight `3` and `4` cannot share → boats 2 and 3.  
- Leftover person → boat 4.  

Total = 4 boats.

## Complexity
- **Time Complexity:** `O(n log n)`  
  Sorting takes `O(n log n)`; the two-pointer scan takes `O(n)`.  
- **Space Complexity:** `O(1)`  
  Only pointers and counters are used.
