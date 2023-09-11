public class LinkedListDeleteNode {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        deleteLinkedList(head);

        // Print the linked list to verify the deletion
        printLinkedList(head);
    }

    public static class Node {
        int val;
        Node next = null;

        Node(int v1) {
            val = v1;
        }
    }

    public static void deleteLinkedList(Node head) {
        if (head == null) {
            return; // Nothing to delete if the list is empty
        }

        if (head.next == null) {
            head = null; // If there's only one node, set head to null
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null; // Delete the last node
        }
    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
