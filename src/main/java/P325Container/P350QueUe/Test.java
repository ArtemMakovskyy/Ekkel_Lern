package P325Container.P350QueUe;

import DatesFromArray.SomeArrays;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        SomeArrays someArrays = new SomeArrays();
//FIFo
        Queue<String> queue = new LinkedList<>(someArrays.haveStrCollection_Animals());
        queue.offer("gorbunok");
        queue.add("Koniok");
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        queue.clear();
        System.out.println(queue);

        Deque<String> deque = new LinkedList<>(someArrays.haveStrCollection_Animals());
        System.out.println(deque + " deque ");
        deque.add("olala");
        deque.offer("fffff");
        deque.addLast("last");
        deque.addFirst("first");
        deque.push("push");
        System.out.println(deque.element());
        System.out.println(deque.peek());
        System.out.println(deque.poll());
        System.out.println(deque);
        deque.pop();
        deque.pop();
        System.out.println(deque);

    }
}
