public class LinkedList {
    private ListNode head;
    private int size;  // Track the size of the linked list

    // Constructor to initialize an empty list
    public LinkedList() {
        head = null;
        size = 0;
    }

    // Inner class to represent a node in the linked list
    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }

    // 1. Checking if the linked list is empty or not
    public boolean isEmpty() {
        return head == null;
    }

    // 2. Return the head of the linked list
    public int headOfTheLinkedList() {
        if (this.isEmpty()) {
            System.out.println("The list is empty.");
            return -1;  // Return -1 if the list is empty
        } else {
            return head.data; // Access data directly since ListNode is an inner class
        }
    }

    // 3. Add the element to the head of the linked list
    public void addElementToTheHeadOfLinkedList(int value) {
        ListNode newNode = new ListNode(value, head);

        head = newNode;  // Move the head to point to the new node
        size++;  // Increment size
    }

    // 4. Shift the head of the LinkedList to the next (right)
    public void shiftToNext() {
        if (isEmpty()) return;
        head = head.next;  // Move head to the next node
        size--;  // Decrease size
    }

    // 5. Add an element to the tail (end) of the linked list
    public void addElementToTheTail(int value) {
        ListNode newNode = new ListNode(value, null);

        if (isEmpty()) {
            head = newNode;  // If list is empty, head becomes the new node
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;  // Traverse to the last node
            }
            current.next = newNode;  // Set new node as the next of the last node
        }
        size++;  // Increment size
    }

    // 6. Remove the element from the head
    public void removeHeadElement() {
        if (!isEmpty()) {
            head = head.next;  // Move head to the next node
            size--;  // Decrease size
        }
    }

    // 7. Get the size of the linked list
    public int size() {
        return size;
    }

    // 8. Print all elements of the linked list
    public void printList() {
        if (isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }

        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " "); // Access data directly
            current = current.next;
        }
        System.out.println();  // Move to the next line after printing the list
    }

    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        myList.addElementToTheHeadOfLinkedList(5);
        myList.addElementToTheHeadOfLinkedList(10);
        myList.addElementToTheTail(15);
        myList.printList(); // Output: 10 5 15
        System.out.println("Size: " + myList.size()); // Output: Size: 3

        myList.removeHeadElement();
        myList.printList(); // Output: 5 15
        System.out.println("Head of the list: " + myList.headOfTheLinkedList()); // Output: Head of the list: 5

        myList.shiftToNext();
        myList.printList(); // Output: 15
        System.out.println("Size after shift: " + myList.size()); // Output: Size after shift: 1

        myList.shiftToNext();
        myList.printList(); // Output: The list is empty.
        System.out.println("Is empty? " + myList.isEmpty()); // Output: Is empty? true
        System.out.println("Head of empty list: " + myList.headOfTheLinkedList()); // Output: The list is empty. -1
    }
} // Ensure this closing brace is present and is the last character
