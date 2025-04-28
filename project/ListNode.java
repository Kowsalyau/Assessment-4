public class Main {
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        first.next = second;

        System.out.println(first.data);  // Output: 10
        System.out.println(first.next.data);  // Output: 20
    }
}

// Define Node class below
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
