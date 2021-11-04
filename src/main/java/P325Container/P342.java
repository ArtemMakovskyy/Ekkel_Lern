package P325Container;

import java.util.Stack;

public class P342 {
    public static void main(String[] a) {

        Stack<String> stack = new Stack<>();
        String str = "My dog has fleases";
        for (String s: str.split(" ")) stack.push(s);
        while (!stack.empty()) System.out.println(stack.pop());

    }
}
