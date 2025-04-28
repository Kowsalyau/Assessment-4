public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.printStack();
        stack.pop();
        stack.printStack();

        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.delete();


    }
