private middle(){
    //calculate the size based on the list implementation first

    if ( size == null )
        throw new IllegaStateException ("List doesn't have any nodes");

    Node middle = new Node();
    //the head points to the first node in the list
    middle = head.next;

    Node partner = new Node();
    // the tail points to the last node in the list
    partner = tail.prev;

    while (middle != partner || middle.next != partner){
        middle = middle.next;
        partner = partner.prev;

    }

    return middle;

}
