# Combination Generator (`combine(n, k)`)

This program generates all possible combinations of `k` numbers chosen from the range `1` to `n`.  

---

## Example  

**Input:**  
n = 4, k = 2

**Output:**  
[[1, 2], [1, 3], [1, 4],
[2, 3], [2, 4],
[3, 4]] 

---

## Time & Space Complexity  

- **Time Complexity:**  
  - Number of valid combinations = **C(n, k)** (binomial coefficient).  
  - Current implementation rebuilds arrays in recursion → `O(C(n, k) * n)`  
  - Optimized version (using indices only) → `O(C(n, k) * k)`

- **Space Complexity:**  
  - Recursion depth = `O(k)`  
  - Temporary list size = `O(k)`  
  - Result storage = `O(C(n, k) * k)`  
  - With extra array copies in this code, effective SC ≈ `O(n * k)`  

---
 
