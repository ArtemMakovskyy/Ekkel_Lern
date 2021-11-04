package P325Container.P337Iterator;

import DatesFromArray.SomeArrays;

import java.util.LinkedList;

public class LinListFeauture {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>(new SomeArrays().haveStrCollection_Animals());
        System.out.println(ll.get(1));

        System.out.println(ll.getLast());
        System.out.println(ll.lastIndexOf("Rat"));
        System.out.println(ll.lastIndexOf("rat"));
        System.out.println(ll.getFirst());
        System.out.println(ll.element());
        System.out.println(ll.peek());
        ll.addFirst("frog");
        System.out.println(ll.element());
        ll.addLast("elephant");
        System.out.println(ll);
        ll.remove();
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        ll.add("Horse");
        System.out.println(ll);
        System.out.println(ll.peek());
        System.out.println(ll);
    }
}
