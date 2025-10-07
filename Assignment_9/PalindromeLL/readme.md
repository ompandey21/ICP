# Palindrome Linked List

## Overview
This program checks if a singly linked list is a palindrome — meaning the sequence of node values reads the same forward and backward.

### Example
    Input: 1 -> 2 -> 2 -> 1
    Output: true

    Input: 1 -> 2 -> 3
    Output: false


---

## How It Works
1. Find the middle of the linked list using the fast–slow pointer approach.  
2. Reverse the second half of the list.  
3. Compare the first half with the reversed second half node by node.  
4. If all corresponding nodes match, the list is a palindrome.

---

## Key Methods
- `isPalindrome(ListNode head)` — main method to check if the list is a palindrome.  
- `reverse(ListNode rev)` — helper method that reverses a linked list starting from a given node.

---

## Time Complexity
**O(n)** — each node is visited a constant number of times (to find the middle, reverse, and compare).

---

## Space Complexity
**O(1)** — operations are done in-place without using any extra data structures.
