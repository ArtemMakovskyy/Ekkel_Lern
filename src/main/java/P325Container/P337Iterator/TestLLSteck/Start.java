package P325Container.P337Iterator.TestLLSteck;

import P325Container.P337Iterator.Stack__;

public class Start {
    public static void main(String[] args) {
        SteckLL s = new SteckLL();
        s.putOn("one");
        s.putOn("two");
        s.putOn("tthree");
        s.putOn("four");
        s.putOn("five");
        s.putOn("five6");
        s.putOn("five7");
        s.putOn("five8");
        while (s.isData()) {
            s.getAndDelLast();
        }
        System.out.println();
        Stack__ stack = new Stack__<Integer>();
        stack.push("first");
        stack.push("second");
        stack.push("therd");
        stack.push("forth");
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }


}
