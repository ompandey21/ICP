# Queue Reconstruction by Height (LeetCode 406)

This solution reconstructs a queue given a list of people, where each person is described by `[h, k]`:
- `h` = person's height  
- `k` = number of people in front of this person who have height ≥ `h`

## Approach
1. **Sort the people**:
   - By height in descending order.
   - If heights are equal, by `k` in ascending order.
2. **Insert into a list**:
   - For each person in the sorted array, insert them at index `k`.  
   - This works because taller people are placed first and shorter ones don’t affect their positions.
3. Convert the list back into a 2D array.

## Example

**Input:**  
[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]   

**Output:**  
[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]

**Explanation:**  
- Place `[7,0]` first → `[ [7,0] ]`  
- Insert `[7,1]` at index 1 → `[ [7,0], [7,1] ]`  
- Insert `[6,1]` at index 1 → `[ [7,0], [6,1], [7,1] ]`  
- Insert `[5,0]` at index 0 → `[ [5,0], [7,0], [6,1], [7,1] ]`  
- Insert `[5,2]` at index 2 → `[ [5,0], [7,0], [5,2], [6,1], [7,1] ]`  
- Insert `[4,4]` at index 4 → `[ [5,0], [7,0], [5,2], [6,1], [4,4], [7,1] ]`

Final queue matches the required conditions.

## Complexity
- **Time Complexity:** `O(n^2)`  
  Sorting takes `O(n log n)` and inserting into the list (which may shift elements) takes `O(n)` per insertion, giving overall `O(n^2)`.  
- **Space Complexity:** `O(n)`  
  An extra list is used to build the queue.
