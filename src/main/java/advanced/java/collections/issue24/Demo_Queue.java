package advanced.java.collections.issue24;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Demo_Queue {
    public static void main(String[] args) {

        Queue<String> namesQueue = new LinkedList<>();
        Deque<Integer> numbersDeque = new ArrayDeque<>();
        BlockingQueue<String> waitingCustomers = new ArrayBlockingQueue<>(100);

        List<String> listNames = Arrays.asList("Alice", "Bob", "Cole", "Dale", "Eric", "Frank");
        Queue<String> queueNames = new LinkedList<>(listNames);
        queueNames.add("Mary");
        queueNames.add("John");
        System.out.println(queueNames);

        Queue<Integer> queueNumbers = new ArrayBlockingQueue<>(3);

        System.out.println(queueNumbers.offer(1));
        System.out.println(queueNumbers.offer(2));
        System.out.println(queueNumbers.offer(3));
        System.out.println(queueNumbers.offer(4));
//        queueNumbers.add(4);    // this line throws exception

        Deque<String> dequeNames = new ArrayDeque<>();

        dequeNames.offer("Katherine");
        dequeNames.offer("Bob");

        dequeNames.addFirst("Jim");
        dequeNames.addLast("Tom");

        System.out.println(dequeNames);

        BlockingQueue<Integer> blockQ = new ArrayBlockingQueue<>(100);

        try {
            blockQ.put(2000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        Queue<String> queueCustomers = new LinkedList<>();
        queueCustomers.offer("Jack");

        System.out.println("next: " + queueCustomers.poll());
        System.out.println("next: " + queueCustomers.poll());

        Deque<String> dequeCustomers = new ArrayDeque<>();

        dequeCustomers.offer("Bill");
        dequeCustomers.offer("Kim");
        dequeCustomers.offer("Lee");
        dequeCustomers.offer("Peter");
        dequeCustomers.offer("Sam");

        System.out.println("Queue before: " + dequeCustomers);
        System.out.println("First comes: " + dequeCustomers.pollFirst());
        System.out.println("Last comes: " + dequeCustomers.pollLast());
        System.out.println("Queue after: " + dequeCustomers);

        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(100);

        blockingQueue.offer("Kathe");

        try {
            String nextCustomer = blockingQueue.take();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        Queue<String> prioCustomers = new PriorityQueue<>();

        prioCustomers.offer("Jack");

        System.out.println("who's next: " + prioCustomers.poll());

// this returns null in case the queue is empty
        System.out.println("who's next: " + prioCustomers.peek());

// this throws exception in case the queue is empty
        /* System.out.println("who's next: " + prioCustomers.element()); THROWS EXCEPTION */

        Deque<Integer> dequeNumbers = new ArrayDeque<>();

        dequeNumbers.add(10);
        dequeNumbers.add(20);
        dequeNumbers.add(30);
        dequeNumbers.add(40);

        System.out.println("first: " + dequeNumbers.getFirst());
        System.out.println("last: " + dequeNumbers.peekLast());

        queueNames.add("Dale");
        queueNames.add("Bob");
        queueNames.add("Frank");
        queueNames.add("Alice");
        queueNames.add("Eric");
        queueNames.add("Cole");
        queueNames.add("John");
        System.out.println();

        for (String name : queueNames) {
            System.out.println(name);
        }
        System.out.println();
        Queue<String> prioNames = new PriorityQueue<>(queueNames);
        prioNames.forEach(s -> System.out.println(s));
    }
}
