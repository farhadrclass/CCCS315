import java.util.LinkedList;

public class MyLinkedList { // this linkedlist expectd int type
    // Linked list node
    static class Node {
        int item; // Value
        Node next; // pointer to the next
    }

    static Node head = null;
    // static int size=0;
    // Function that add the element in linked list.

    /**
     * Add to the head
     * 
     * @param item
     */
    static void add(int item) {
        // Allocate dynamic memory for newNode.
        Node newNode = new Node();
        // add the item to the head of our linked list
        newNode.item = item;
        newNode.next = head;
        head = newNode;

    }

    /**
     * Add new item to the tail
     * 
     * @param item
     */
    static void addTail(int item) {
        // Allocate dynamic memory for newNode.
        Node newNode = new Node();
        Node buffer;
        newNode.item = item;
        // add the item to the head of our linked list

        if (head == null) { // check if the head is null
            newNode.next = (head);
            (head) = newNode;
        } else {
            buffer = head;
            while (buffer.next != null) {// this goes through our linkedlist till it reach the end of it
                buffer = buffer.next;
            }
            newNode.next = null;
            buffer.next = newNode;
        }
    }

    // Next two methods are identical, however when useing a local variable name
    // that matches the name in class
    // attributes, the local value takes priority over so at the end we do not
    // actually change the class level head but a local copy of it
    static void printer(Node head) {
        while (head != null) {
            System.out.print(head.item + "->");
            head = head.next;
        }
        System.out.println();
    }
    // static void printer(Node Buffer) {
    // while (Buffer != null) {
    // System.out.print(Buffer.item + "->");
    // Buffer = Buffer.next;
    // }
    // }

    // Function that returns the largest element
    public static int bigVal(Node head) {
        // small value or the first value of the head
        int max = Integer.MIN_VALUE;

        // Check loop while head not equal to NULL
        while (head != null) {
            if (max < head.item)
                max = head.item;
            head = head.next;
        }
        return max;
    }

    // TODO remove from head
    // TODO remove from tail
    // TODO remove if the value matches something like 222 (Kinda like removing from
    // middle)
    public static void main(String[] args) {
        // Add to the head
        add(125);
        printer(head);

        add(114);
        printer(head);

        add(1212);
        printer(head);

        add(222);
        printer(head);

        add(17);
        // printer(head);
        printer(head);

        // Add to the tail
        addTail(1000);
        printer(head);

        addTail(1100);
        printer(head);
        addTail(2000);
        printer(head);
        addTail(3000);
        printer(head);
        addTail(4000);
        printer(head);

        System.out.print("\nMaximum item is: ");
        System.out.println(bigVal(head));
        printer(head);
        System.out.println("end of the code,");

    }

}
