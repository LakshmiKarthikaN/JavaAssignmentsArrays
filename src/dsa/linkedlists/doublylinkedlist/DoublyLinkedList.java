package dsa.linkedlists.doublylinkedlist;
class DoublyLinkedList{
     class Node {
        int data;
        Node prev;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }


    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    public void deleteFromFront() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
        if (head != null) {
            head.prev = null;
        }
    }

    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
    }

    public void displayForward() {
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtFront(10);
        list.insertAtFront(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.displayForward();    // Forward: 20 10 30 40
        list.displayBackward();   // Backward: 40 30 10 20

        list.deleteFromFront();
        list.deleteFromEnd();

        list.displayForward();    // Forward: 10 30
        list.displayBackward();   // Backward: 30 10
    }
}

