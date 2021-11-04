package LogicOperations;

class LO1 {


    void lo1() {
        int c = 1;
        int e = 98;
        int d = 0;

        if (c == 1 & e++ < 100) d = 100;
        System.out.println(d);
//        ===========
//        ? -> (if-then-else)
        int ratio = 0;

        ratio = c == 2 ? 1 : e;
        System.out.println(ratio);
        System.out.println("================");
    }

    int standartIfElse(int i) {
        if (i < 10)
            return i * 100;
        else return i * 10;
    }
    int ternaryIfElse(int i) {
        return i < 10 ? i * 100 : i * 10;
    }
}

public class LogicOp {
    public static void main(String[] args) {
        LO1 logicOp = new LO1();
        logicOp.lo1();
        System.out.println(logicOp.ternaryIfElse(9));
        System.out.println(logicOp.standartIfElse(11));


    }
}
