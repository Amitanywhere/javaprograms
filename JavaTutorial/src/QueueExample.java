import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> numberQueue = new LinkedList<>();
        numberQueue.add(43);
        numberQueue.add(56);
        numberQueue.add(12);
        numberQueue.add(26);

        System.out.println(numberQueue);

        System.out.println("head of the queue - " + numberQueue.peek());

        // remove the head of the queue
        System.out.println(numberQueue.remove());

        System.out.println(numberQueue);

        System.out.println("Size of queue - " + numberQueue.size());

        System.out.println("head of the queue - " + numberQueue.peek());

        for(Integer element : numberQueue){
            System.out.println(element);
        }

        // implementing priority queue class
        Queue<Integer> queue1 = new PriorityQueue<>();

        queue1.add(45);
        queue1.add(23);
        queue1.add(67);

        System.out.println(queue1);
        System.out.println("head of queue1 - " + queue1.peek());

        System.out.println("size of queue1 - " + queue1.size());
    }
}
