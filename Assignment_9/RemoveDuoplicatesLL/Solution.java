package Assignment_9.RemoveDuoplicatesLL;

class Solution {
    class ListNode{
        int val;
        ListNode next;
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ans = head;
        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next; // skip duplicate
            } else {
                head = head.next; // move forward
            }
        }
        return ans;
    }
}
