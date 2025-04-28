public class Stack {
    private Node head;

    // Constructor to initialize the stack
    public Stack() {
        head = null; // Stack is empty initially
    }

    // 1. Push an element onto the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;  // New node points to the current head
        head = newNode;  // Move head to the new node
    }

    // 2. Pop an element from the stack
    public int pop() {
        if (head == null) {
            System.out.println("The stack is empty.");
            return -1;  // Return -1 if the stack is empty
        }
        int data = head.data;
        head = head.next;  // Move head to the next node
        return data;  // Return the popped data
    }

    // 3. Peek at the top element of the stack
    public void peek() {
        if (head == null) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("Top element: " + head.data);
        }
    }

    // 4. Check if the stack is empty
    public boolean isEmpty() {
        return head == null;
    }

    // 5. Print all elements in the stack
    public void printStack() {
        if (head == null) {
            System.out.println("The stack is empty.");
            return;
        }
        Node current = head;
        System.out.print("Stack elements: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();  // Newline for better formatting
    }

    // Node class to define the structure of each stack node
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Stack myStack = new Stack(); // Create an instance of the Stack class

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        myStack.printStack(); // Output: Stack elements: 30 20 10

        System.out.println("Popped element: " + myStack.pop()); // Output: Popped element: 30
        myStack.printStack(); // Output: Stack elements: 20 10

        myStack.peek(); // Output: Top element: 20

        System.out.println("Is stack empty? " + myStack.isEmpty()); // Output: Is stack empty? false

        myStack.pop();
        myStack.pop();

        System.out.println("Is stack empty? " + myStack.isEmpty()); // Output: Is stack empty? true

        myStack.pop(); // Output: The stack is empty.
        myStack.peek(); // Output: The stack is empty.
        myStack.printStack(); // Output: The stack is empty.
    }
}
