import java.util.LinkedList;
import java.util.Queue;


public class QueueEx {
    static void queue_add(Queue<Integer> q) {

        for (int i = 0; i < 5; i++)
            q.add(i);

        System.out.println("Elements of queue "
                + q);
    }

    static void queue_delete(Queue<Integer> q) {

        int delete = q.remove();
        System.out.println("removed element: "+ delete);
        System.out.println("removed element: " +q.poll());
        System.out.println("Elements of queue: "+q);
    }

    static void queue_head(Queue<Integer> q) {
        int head = q.peek();
        System.out.println("head of queue:" + head);

    }

    static void queue_size(Queue<Integer> q) {
        int size = q.size();
        System.out.println("Size of queue:" + size);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        queue_add(q);
        queue_delete(q);
        queue_head(q);
        queue_size(q);
    }
}

