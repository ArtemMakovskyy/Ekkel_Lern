package P325Container.P350QueUe;

import java.util.*;

public class p352priprytyQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        Random r = new Random(47);
        for (int i = 0; i < 10; i++)            p.offer(r.nextInt(i + 10));
        System.out.println(p);

        List<Integer> ints = Arrays.asList(25,22,20,18,14,9,3,1,1,2,3,9,14,2,3,18,21,23,25);
        p = new PriorityQueue<>(ints);
        System.out.println(p);
        p = new PriorityQueue<>(ints.size(), Collections.reverseOrder());
        p.addAll(ints);
        System.out.println(p);

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String>strings = Arrays.asList(fact.split(""));
        PriorityQueue<String> stringsPQ = new PriorityQueue<>(strings);
        System.out.println(stringsPQ);
        stringsPQ = new PriorityQueue<>(strings.size(),Collections.reverseOrder());
        System.out.println(stringsPQ);
        stringsPQ.addAll(strings);
        System.out.println(stringsPQ);

        Set<Character>characterSet = new HashSet<>();
        for (char c: fact.toCharArray())
        characterSet.add(c);
        PriorityQueue<Character> characterPQ = new PriorityQueue<>(characterSet);
        System.out.println(characterPQ);
    }
}
