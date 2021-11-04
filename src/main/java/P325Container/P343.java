package P325Container;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class P343 {
    public static void main(String[] args) {
//        String expression = "+U+n+c---+e+r+t---+a-+i-+n+t+y-+n+t+y---+ -+r+u--+l+e+s---";
//        Stack<String> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();
        Random random = new Random(47);
        for (int i = 0; i < 100; i++) {
            int ii = random.nextInt(30);
            System.out.println(ii);;
            set.add(ii);}
        System.out.println(set);
    }
}
