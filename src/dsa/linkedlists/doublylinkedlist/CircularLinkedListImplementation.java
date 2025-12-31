package dsa.linkedlists.doublylinkedlist;

public class CircularLinkedListImplementation {

     class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            newNode.next = newNode;
            head = newNode;
        } else {
            Node temp = head;

            // Traverse to the last node
            while (temp.next != head) {
                temp = temp.next;
            }

            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            newNode.next = newNode;
            head = newNode;
        } else {
            Node temp = head;

            // Traverse to the last node
            while (temp.next != head) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Delete from beginning
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == head) {
            head = null;
        } else {
            Node temp = head;

            // Go to last node
            while (temp.next != head) {
                temp = temp.next;
            }

            head = head.next;
            temp.next = head;
        }
    }

    // Delete from end
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == head) {
            head = null;
        } else {
            Node temp = head;
            Node prev = null;

            while (temp.next != head) {
                prev = temp;
                temp = temp.next;
            }

            prev.next = head;
        }
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        System.out.print("Circular List: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        CircularLinkedListImplementation cll = new CircularLinkedListImplementation();

        cll.insertAtEnd(10);
        cll.insertAtEnd(20);
        cll.insertAtBeginning(5);
        cll.insertAtEnd(30);

        cll.display(); // 5 10 20 30

        cll.deleteFromBeginning();
        cll.display(); // 10 20 30

        cll.deleteFromEnd();
        cll.display(); // 10 20
    }
}
