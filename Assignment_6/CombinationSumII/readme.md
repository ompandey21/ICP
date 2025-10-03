# Combination Sum II

This Java program finds all unique combinations of numbers from a given array that sum up to a target. Each number in the array can only be used **once** in a combination.

## Approach

1. **Sort the array** to handle duplicates easily.  
2. Use **backtracking** to explore all combinations.  
3. Skip duplicate numbers to avoid repeated combinations.  
4. Stop exploring a path if the remaining total becomes negative.

## Code Explanation

- `combinationSum2(int[] candidates, int target)`  
  Initializes the result list, sorts the array, and calls the recursive method.

- `getCombinations(...)`  
  Recursively builds combinations:  
  - If `total == 0`, add a copy of the current combination to the result.  
  - Loop through remaining numbers:  
    - Skip duplicates.  
    - If current number exceeds total, break (early stopping).  
    - Include number, recurse, then backtrack.

## Time Complexity (TC)

- **Worst case:** `O(2^n * n)`  
  - `2^n` possible subsets.  
  - `n` is for copying combinations to the result list.

## Space Complexity (SC)

- **Auxiliary space:** `O(n)` for recursion stack + temporary list.  
- **Result space:** Depends on the number of valid combinations.

## Example

```java
Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
  [1,1,6],
  [1,2,5],
  [1,7],
  [2,6]
]
