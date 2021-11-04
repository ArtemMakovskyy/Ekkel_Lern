package Quastion.Fabrica.Patterns.AbstractFactory.Fabric285;

public class FactSer1 implements Fac{
    @Override
    public Ser getSer() {
        return new Im1();
    }
}
