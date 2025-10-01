# Lemonade Change (LeetCode 860)

This solution determines if it is possible to give correct change to every customer in a lemonade stand, given the bills they pay with.

## Approach
1. Keep counters for `$5` and `$10` bills.
2. Iterate through each customer's bill:
   - If the bill is `$5`, just increase the `$5` counter.
   - If the bill is `$10`, give one `$5` as change if available.
   - If the bill is `$20`, try to give one `$10` and one `$5` as change if possible; otherwise give three `$5` bills.
3. If at any point the required change cannot be given, return `false`.
4. If all customers are served correctly, return `true`.

## Example

**Input:**  
[5,5,5,10,20]

**Output:**  
true

**Explanation:**  
- Customer 1 pays `$5` → no change needed.  
- Customer 2 pays `$5` → no change needed.  
- Customer 3 pays `$5` → no change needed.  
- Customer 4 pays `$10` → give one `$5` as change.  
- Customer 5 pays `$20` → give one `$10` and one `$5` as change.

## Complexity
- **Time Complexity:** `O(n)`  
  Single pass through the array of bills.  
- **Space Complexity:** `O(1)`  
  Only counters for `$5` and `$10` bills are used.
