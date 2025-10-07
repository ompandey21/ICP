# Reorder Linked List

## Overview
This program reorders a singly linked list in a specific pattern:

    Given: L0 → L1 → L2 → ... → Ln-1 → Ln
    Output: L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → ...


### Example

    Input: 1 -> 2 -> 3 -> 4 -> 5
    Output: 1 -> 5 -> 2 -> 4 -> 3


---

## How It Works
1. **Find the length** of the list.  
2. **Reverse the second half** of the list starting from the midpoint.  
3. **Merge both halves** by alternating nodes from the first and reversed second halves.

---

## Key Methods
- `len(ListNode head)` — returns the length of the linked list.  
- `reverse(ListNode head, int l)` — reverses the second half of the list starting from the midpoint.  
- `reorderList(ListNode head)` — main method that performs the reordering operation.

---

## Time Complexity
**O(n)** — each node is visited a constant number of times during traversal, reversal, and merging.

---

## Space Complexity
**O(1)** — operations are performed in-place without using extra data structures.
