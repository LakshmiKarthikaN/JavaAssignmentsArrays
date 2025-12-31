class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class CreateDoublyLinkedList {
    Node head;
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;
    }


    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }


    public void printForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void printBackward() {
        Node current = head;
        if (current == null) return;


        while (current.next != null) {
            current = current.next;
        }
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        CreateDoublyLinkedList dll = new CreateDoublyLinkedList();

        dll.append(10);
        dll.append(20);
        dll.append(30);

       // dll.insertAt(1, 15); // Insert 15 at index 1

        dll.printForward();   // Output: 10 <-> 15 <-> 20 <-> 30 <-> null
        dll.printBackward();  // Output: 30 <-> 20 <-> 15 <-> 10 <-> null
    }
}
