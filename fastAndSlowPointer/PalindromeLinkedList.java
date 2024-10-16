package fastAndSlowPointer;

/*
Problem Statement: Given the head of a singly linked list, return true if it is a palindrome.

Approach:
First, use the fast and slow pointer technique to find the middle of the linked list.
Reverse the second half of the linked list.
Compare the first half with the reversed second half.
 */
public class PalindromeLinkedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        while(slow!=null){
            ListNode nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        ListNode left = head;
        ListNode right = prev;
        while(right!=null){
            if(left.val != right.val){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
}
