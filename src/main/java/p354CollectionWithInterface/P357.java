package p354CollectionWithInterface;

import java.util.Iterator;

public class P357 implements Iterable<String> {
    protected static String[] words = "And that is how we know the Earth to be banana-scharped".split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int next ;
            @Override
            public boolean hasNext() {
                return words.length>next;
            }

            @Override
            public String next() {
                return words[next++];
            }
        };
    }

    public static void main(String[] args) {
        for (String s: new P357()) System.out.print(s+" ");
        System.out.println();
        for (String s: words) System.out.print(s+" ");
    }
}
