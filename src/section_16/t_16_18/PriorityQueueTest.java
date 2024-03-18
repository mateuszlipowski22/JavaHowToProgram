package section_16.t_16_18;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(3.2);
        queue.offer(9.8);
        queue.offer(5.4);
        queue.offer(4.3);

        System.out.printf("Pobieranie elementów kolejki: ");

        while(queue.size()>0){
            System.out.printf("%.1f ",queue.peek());
            queue.poll();
        }
    }
}
