public class Queue {
    private Node head;
    private Node tail; // To efficiently add to the rear

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Queue() {
        this.head = null;
        this.tail = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void delete() {
        if (isEmpty()) {
            System.out.println("The queue is empty.");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null; // If the queue becomes empty, reset tail
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The queue is empty.");
            return -1; // Or throw an exception
        }
        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("The queue is empty.");
            return;
        }
        Node current = head;
        System.out.print("Queue elements: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue myQueue = new Queue();
        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);
        myQueue.printQueue(); // Output: Queue elements: 10 20 30

        System.out.println("Peek: " + myQueue.peek()); // Output: Peek: 10

        myQueue.delete();
        myQueue.printQueue(); // Output: Queue elements: 20 30

        System.out.println("Is empty? " + myQueue.isEmpty()); // Output: Is empty? false

        myQueue.delete();
        myQueue.delete();
        System.out.println("Is empty? " + myQueue.isEmpty()); // Output: Is empty? true

        myQueue.delete(); // Output: The queue is empty.
    }
}
