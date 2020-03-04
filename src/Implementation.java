import model.Queue;
import model.Stack;

public class Implementation {

    private static Queue q;
    private static Stack s;

    public static void main(String ...args){
        //testQueue();
        testStack();
    }

    static void testQueue() { // First In First Out
        q = new Queue();
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        q.add(0);
        System.out.println("Action #1 Value: " + q.remove() + " was deleted");
        System.out.println("Action #2 Value: " + q.remove() + " was deleted");
        System.out.println("Action #3 Value: " + q.remove() + " was deleted");
        System.out.println("Action #4 Value: " + q.remove() + " was deleted");
        System.out.println("Action #5 Value: " + q.remove() + " was deleted");
        System.out.println("Action #6 Value: " + q.remove() + " was deleted");
        //Should pop an NPE
        //System.out.println("Action #7® Value: " + q.remove() + " was deleted");
    }

    static void testStack() { // Last In First Out
        s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        System.out.println("Action #1 Value: " + s.pop() + " was deleted");
        System.out.println("Action #2 Value: " + s.pop() + " was deleted");
        System.out.println("Action #3 Value: " + s.pop() + " was deleted");
        System.out.println("Action #4 Value: " + s.pop() + " was deleted");
        System.out.println("Action #5 Value: " + s.pop() + " was deleted");
        System.out.println("Action #6 Value: " + s.pop() + " was deleted");
        //Should pop out an NPE
        //System.out.println("Action #7® Value: " + s.pop() + " was deleted");
    }
}
