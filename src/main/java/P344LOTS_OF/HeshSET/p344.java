package P344LOTS_OF.HeshSET;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class p344 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            set.add(random.nextInt(10));
        }
        System.out.println(set);
        System.out.println(set.contains(5));
        set.addAll(Arrays.asList(99,55,22,1,002,258,2));
        System.out.println(set);
    }

}
