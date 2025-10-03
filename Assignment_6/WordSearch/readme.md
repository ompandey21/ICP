# Word Search (`exist(board, word)`)

This program determines if a given word can be formed in a 2D grid of characters.  
The word must be constructed from sequentially adjacent cells (up, down, left, right), and each cell can only be used once.

---

## Example  

**Input:**  
board = [
['A','B','C','E'],
['S','F','C','S'],
['A','D','E','E']
]
word = "ABCCED"

**Output:**  

Explanation: The word `"ABCCED"` can be traced in the board following adjacent cells.

---

## Approach  

1. Iterate over every cell in the board.  
2. When the first character matches, recursively search in all four directions.  
3. Mark visited cells temporarily to avoid reuse.  
4. Backtrack by restoring the cell value after exploring.  
5. If the full word is matched, return `true`.  

---

## Time & Space Complexity  

- **Time Complexity:**  
  - Each cell `(m * n)` can be a starting point.  
  - From each start, DFS explores up to 4 directions for each character in the word (length = `L`).  
  - Worst case: `O(m * n * 4^L)`  

- **Space Complexity:**  
  - Recursion depth = `O(L)` (length of word).  
  - No extra structures besides recursion stack.  
  - Overall: `O(L)`  

---


