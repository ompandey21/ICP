# Maximal Rectangle — README

## Problem Description
Given a binary matrix filled with `'0'` and `'1'`, find the **area of the largest rectangle** containing only `'1'`.

---

## Approach

The solution converts the problem into a series of **largest rectangle in histogram** problems.

### Step 1 — Build Heights Using Prefix Sums
- Treat each row of the matrix as the **base of a histogram**.
- For each column, compute the **height of consecutive '1's** ending at that row.
- If a `'0'` is encountered, reset the height to `0`.

This gives a prefix matrix where `prefix[i][j]` represents the height of the histogram bar at `(i, j)`.

### Step 2 — Largest Rectangle in Each Row
- For each row in the prefix matrix, treat it as a histogram and find the **largest rectangle area** using a **stack-based approach**.
- Keep track of the maximum area found.

### Step 3 — Largest Rectangle in Histogram (Helper Function)
- Use a **monotonic stack** to find the **Previous Smaller Element (PSE)** and **Next Smaller Element (NSE)** for each bar.
- The area for each bar is calculated as:

`height * (NSE - PSE - 1)`

- Keep the maximum area encountered.

---

## Time Complexity
| Operation | Time Complexity |
|------------|----------------|
| Building prefix heights | O(n × m) |
| Calculating largest area per row | O(n × m) |
| **Total** | **O(n × m)** |

---

## Space Complexity
| Component | Space |
|------------|--------|
| Prefix matrix | O(n × m) |
| Stack | O(m) |
| **Total** | **O(n × m)** |



    