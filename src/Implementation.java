import model.Queue;

public class Implementation {

    private static Queue q;
    public static void main(String ...args){
        testQueue();
    }

    static void testQueue() {
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
}
