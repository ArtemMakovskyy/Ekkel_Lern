package P325Container.P337Iterator;

import DatesFromArray.SomeArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StackTest {
    public static void main(String[] args) {
        Stack__<String> stack = new Stack__<>();
        for (String s : "My dog has fleas".split(" ")) {
            stack.push(s);
        }
        while (!stack.empty()) {
            System.out.println(stack.pop() + " ");
        }
        String text = "First second third";
        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words));
        ArrayList<String> al = new ArrayList<>(new SomeArrays().haveStrCollection_Animals());

        ArrayList<String> alE = new ArrayList<String>(List.of(words));
        System.out.println(alE+"alE");
    }
}

