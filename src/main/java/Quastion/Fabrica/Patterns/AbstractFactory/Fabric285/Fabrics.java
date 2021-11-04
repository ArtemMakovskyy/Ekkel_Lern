package Quastion.Fabrica.Patterns.AbstractFactory.Fabric285;

public class Fabrics {
    public static void potrebitely(Fac fac){
        Ser s = fac.getSer();
        s.m1();
        s.m2();

    }

    public static void main(String[] args) {
        potrebitely(new FactSer1());
        potrebitely(new FactSer2());
    }
}
