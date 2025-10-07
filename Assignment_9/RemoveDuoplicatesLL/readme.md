#  Remove Duplicates from Sorted Linked List

##  Overview
This program removes duplicate elements from a **sorted singly linked list**.  
For example:

    Input: 1 -> 1 -> 2 -> 3 -> 3    

    Output: 1 -> 2 -> 3

It works **in-place**, modifying the existing list without creating a new one.

---

##  How It Works
- Traverse the linked list using a pointer (`head`).
- If the current node’s value equals the next node’s value → skip the next node.
- Otherwise → move the pointer forward.
- Continue until the end of the list.

---

##  Time Complexity
**O(n)** — Each node is visited once.

##  Space Complexity
**O(1)** — Only constant extra space is used (no additional data structures).
