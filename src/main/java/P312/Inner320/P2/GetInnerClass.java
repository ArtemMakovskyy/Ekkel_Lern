package P312.Inner320.P2;

import P312.Inner320.Counter;

public class GetInnerClass {
private int counter = 0;
Counter getIt(String name){
    class GoIn implements Counter{

        public GoIn() {
            System.out.println("class GoIn implements Counter");
        }

        @Override
        public int next() {
            System.out.print(name);
            return counter++;
        }
    }
    return new GoIn();
}
Counter getIt2(String name){
    return new Counter() {
        {
            System.out.println("anoninim ");
        }
        @Override
        public int next() {
            System.out.print(name);
            return counter++;
        }
    };
}

    public static void main(String[] args) {
GetInnerClass gi = new GetInnerClass();
Counter c1 = gi.getIt("first");
Counter c2 = gi.getIt("sec");
        for (int i = 0; i < 5; i++) {
            System.out.println(c1.next());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(c2.next());
        }

    }
}
