package Junior;
import java.util.PriorityQueue;

public class priorityQApp {
    public static void main(String[] args) {
        PriorityQueue<Integer> intq = new PriorityQueue<>();
        intq.add(5);
        intq.add(7);
        intq.add(6);
        intq.add(4);
        intq.add(3);
        for (int i = 0; i<5; i++){
            System.out.println(intq.remove());
        }
    }
}
