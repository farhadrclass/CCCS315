public class MyLinkedListTu {
    // Linked list node
    static class Node{
        int item;  //Element 
        Node next; // pointer to the next
        // TODO add constructors...
    }

    // Pointer to the head
    static Node head = null;// create a linkedlist which is empty now


    // methods for adding

    /**
     * Add item to the head of the list
     * 
     * @param item int, added to the list
     *             It has no return
     */
    static void add(int item) {

        Node newNode = new Node();
        // add the item to the head of our linked list [since no constructor]
        newNode.item = item; //Element in the book !
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
        newNode.item = item;
        newNode.next = null;
        Node buffer;
        // add the item to the head of our linked list
        if (head == null) { // check if the head is null
            head = newNode;
        }else {
            // while(head.next!=null){
            // head=head.next;
            // } // ISSSUE -- is that when I do this way, I lose the connection to the
            // place...before
            // From here
            buffer = head;
            while (buffer.next != null) {// this goes through our linkedlist till it reach the end of it
                buffer = buffer.next;
            }
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
    // OR  these 2 are identical 
    // static void printer(Node buffer) {
    //     while (buffer != null) {
    //         System.out.print(buffer.item + "-->");
    //         buffer = buffer.next;
    //     }
    //     System.out.println();
    // }
     /**
     * This method prints a linked list WITH deleting it (this does it in loop ,
     * Not good way since I lost EVERYTHING!!!
     * 
     */
    static void printerDel() {//BAD!!!!!!
        while (head != null) {
            System.out.print(head.item + "->");
            head = head.next;
        }
        System.out.println();
    }
    //With the code fixed,m I needed a buffer
    static void printerWithOutDel() {
        Node buff= head;
        while (buff != null) {
            System.out.print(buff.item + "->");
            buff = buff.next;
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

        // TODO if not static and main is in outside
        // Then you need to create linked list
        // MyLinkedList testList= new MyLinkedList();
        // head = testList.head;
        //create myList = new MylinkedListTu();
        //myList.add()
        //myList.myPrint( )

        add(123);
        printer(head);

        add(114);
        printer(head);
        add(1212);
        printer(head);
        add(222);
        printer(head);
        add(17);
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

        // System.out.print("\nMaximum item is: ");
        // System.out.println(bigVal(head));

        // // printer(head);
        System.out.println("Printing a lot");
        // printerDel();
        printerWithOutDel();
        printer(head);
        printer(head);
        printer(head);

        System.out.println("end of the code,");

        System.out.print("\nMaximum item is: ");
        System.out.println(bigVal(head));

    }
}
