package P325Container;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetOp {
    public static void main(String[] args) {
        Set<String>set1 = new HashSet<>();
        Collections.addAll(set1,"A B C D E F G H I J K L".split(" "));
        set1.add("M");
        System.out.println(set1.contains("H"));
        Set<String>set2 = new HashSet<>();
        Collections.addAll(set2,"H I J K L".split(" "));
        set1.remove("H");
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set1.containsAll(set2));
        set1.retainAll(set2);
        System.out.println(set1);
        Collections.addAll(set1,"X Y Z".split(" "));
        System.out.println(set1);
    }
}
