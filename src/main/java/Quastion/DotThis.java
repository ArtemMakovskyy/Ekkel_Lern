package Quastion;

public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }

    public class Innerr {
        public DotThis outer() {
            return  DotThis.this;
        }
    }

    public Innerr iner(){
        return new Innerr();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Innerr dti = dt.iner();
        dti.outer().f();
    }
}
