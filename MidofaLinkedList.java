import ReverseLinkedList.ListNode;

public class MidofaLinkedList{
    public static void main(String[] args) {
        
    }public class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }
    }
    
}