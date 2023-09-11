public class ReverseLinkedList {
    public static void main(String[] args) {
        // Example usage
        // Create a linked list for testing
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // Print original linked list
        System.out.println("Original Linked List:");
        printList(head);

        // Reverse the linked list
        ListNode reversed = reverseLinkedList(head);

        // Print reversed linked list
        System.out.println("\nReversed Linked List:");
        printList(reversed);
    }

    public static ListNode reverseLinkedList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
