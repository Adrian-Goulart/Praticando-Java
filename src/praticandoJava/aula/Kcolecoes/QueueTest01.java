package praticandoJava.aula.Kcolecoes;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Brand");
        queue.add("New");
        queue.add("Animal");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
