import model.Stack;

public class QueueWithTwoStacks {
    public static class MyQueue<T> {
        private Stack stackNewestOnTop = new Stack();
        private Stack stackOldestOnTop = new Stack();

        public void enqueue(int value) { //Add item
            stackNewestOnTop.push(value);
        }

        public int peek() { //Get "oldest" item
            // moeve elements from stackNewest to stackOldest
            shiftStacks();
            return stackOldestOnTop.peek();
        }

        public void shiftStacks() {
            if(stackOldestOnTop.isEmpty()) {
                while (!stackNewestOnTop.isEmpty()) {
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                }
            }
        }

        public int dequeue() { //Get "oldest" item and remove it
            // moeve elements from stackNewest to stackOldest
            shiftStacks();
            return stackOldestOnTop.pop();
        }
    }

    public static void main(String... args) {

    }
}
