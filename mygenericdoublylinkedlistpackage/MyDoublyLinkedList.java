package mygenericdoublylinkedlistpackage;

/**

 * Generic Doubly Linked List
 * @param <T>
 */
public class MyDoublyLinkedList<T> {
    private Node head;
    private Node tail;
    private int size;

    /**

     * class Node
     */
//--------------------------------------------------
    public class Node{
        private T data;
        private Node next;
        private Node prev;

        Node(){
            data = null;
            next = null;
        }

        Node(T data){
            this.data = data;
            next = null;
        }

        /**
         * @return the next
         */
        public Node getNext() {
            return next;
        }

        /**
         * @param next the next to set
         */
        public void setNext(Node next) {
            this.next = next;
        }

        /**
         * @return the data
         */
        public T getData() {
            return data;
        }

        /**
         * @param data the data to set
         */
        public void setData(T data) {
            this.data = data;
        }

        /**
         * @return the prev
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * @param prev the prev to set
         */
        public void setPrev(Node prev) {
            this.prev = prev;
        }
//-----------------------------------------------------------
    }

    public MyDoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * @param data
     *  Inserts at the front
     */
    public void insertFront(T data){
        Node newNode = new Node(data);

        if (head != null) {
            newNode.next = head;
        }

        head = newNode;
        size++;
        return;
    }

    /**
     * @param data
     *  Inserts at the end
     */
    public void insertEnd(T data){
        Node newNode = new Node(data);

//Empty List
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        newNode.setPrev(tail);
        tail = newNode;
        tail.next=head;
        head.setPrev(tail);


        size++;
        return;
    }

    /**
     * Prints the list
     *  For data of Object type, To String method will be printed
     */
    public void printList(){
        if (this.isEmpty()) {
            return;
        }

        Node curr = head;
        int i = 0;
        while(curr != null) {
            i++;
            System.out.println(" \t\t"+i+". "+curr.getData());
            curr = curr.next;
        }
    }

    /**
     * @return Object data deleted
     *  Deletes from front
     */
    public T deleteFront() {
        if (head == null) {
            System.out.println("Empty List");
            return null; //This can raise null pointer exception
        }

        Node x = head;
        head = head.next;
        size--;
        return x.data; //return data deleted

//System.out.println("Element deleted");
    }

    /**
     * @return Object data deleted
     *  Deletes from end
     */
    public T deleteEnd () {

        if (head == null) {
            System.out.println("Empty List");
            return null; //This can raise null pointer exception
        }

        T deletedData = tail.getData();
        tail = tail.getPrev();
        tail.setNext(null);

        size--;
        return deletedData;

    }

    /**
     * @param pos
     * @return deleted data
     * Deletes node from position pos
     */
    public T deletePos(int pos) {
        if (head == null) {
            System.out.println("Empty List");
            return null; //This can raise null pointer exception
        }

        if (pos > size) {
            System.out.println("Invalid position");
            return null;
        }

        Node curr = head;

        for(int i=1; i<pos+1;i++) {
            curr=curr.next;
        }
//now curr is at pos

        curr.prev=curr.next;
        curr.next.prev=curr.prev;
        curr.prev = null;
        curr.next = null;

        return curr.getData();
    }


    /**
     * @return true if empty list
     */
    public boolean isEmpty() {
        return (head == null);
    }

    /**
     * @return the head
     */
    public Node getHead() {
        return head;
    }

    /**
     * @return the tail
     */
    public Node getTail() {
        return tail;
    }

    /**
     * @param tail the tail to set
     */
    public void setTail(Node tail) {
        this.tail = tail;
    }

    /**
     * @param head the head to set
     */
    public void setHead(Node head) {
        this.head = head;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
}