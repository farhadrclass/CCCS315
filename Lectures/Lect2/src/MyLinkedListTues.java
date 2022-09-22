public class MyLinkedListTues {

    // Linked list node
    static class Node {
        int item; // Value
        Node next; // pointer to the next
    }

    // Pointer to the head
    static Node head = null;// create a linkedlist which is empty now

    // Methods for adding

    /**
     * Add item to the head of the list
     * 
     * @param item int, added to the list
     */
    static void add(int item) {
        Node newNode = new Node();
        // add the item to the head of our linked list
        newNode.item = item;
        newNode.next = head;
        head = newNode;
    }
    // TODO how to add in middle

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
            newNode.next = head;
            head = newNode;
        } else {
            buffer = head;
            while (buffer.next != null) {// this goes through our linkedlist till it reach the end of it
                buffer = buffer.next;
            }
            newNode.next = null;
            buffer.next = newNode;
        }

    }

    /**
     * This method prints a linked list without deleting it (this does it in loop ,
     * TODO can we do this in a recursive way)
     * 
     * @param Buffer: Node, a copy of the head
     */
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
    // static void printer(Node buffer) {
    // while (buffer != null) {
    // System.out.print(buffer.item + "->");
    // buffer = buffer.next;
    // }
    // System.out.println();
    // }

    /**
     * This method prints a linked list WITH deleting it (this does it in loop ,
     * Not good way since I lost EVERYTHING!!!
     * 
     */
    static void printerDel() {
        while (head != null) {
            System.out.print(head.item + "->");
            head = head.next;
        }
        System.out.println();
    }

    // Function that returns the largest element

    // the catch here I have an argument called head so it actually acts like a
    // buffer
    public static int bigVal(Node head) {
        // MyLinkedListTues.head // When you have a local valu and global value with
        // same name you need to differentiate them

        // small value or the first value of the head
        int max = Integer.MIN_VALUE;
        // Check loop while head not equal to NULL
        while (head != null) {
            if (max < head.item) { // only update the max when a value larger shows up
                max = head.item;
            }
            head = head.next;
        }

        return max;
    }

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

        printer(head);

        // printerDel(); // it deleted my whole LinkedList

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

        // printer(head);
        printerDel();
        printer(head);
        System.out.println("end of the code,");

    }

    // TODO remove from head
    // TODO remove from tail
    // TODO remove if the value matches something like 222 (Kinda like removing from
    // middle)
}
