public class PrintLinkedList {
        public static void main(String[] args) {
        // Create a sample linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Call the function to print the linked list
        printLinkedList(head);
    }

    // Define a Node class for the linked list
    public static class Node {
        int val;
        Node next;

        Node(int v1) {
            val=v1;
            

        }
    }

    // Function to print the linked list
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }


}
