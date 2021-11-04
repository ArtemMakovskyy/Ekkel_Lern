package Quastion.Fabrica.Patterns.AbstractFactory.Fabric285;

public class FactSer2 implements Fac{
    @Override
    public Ser getSer() {
        return new Im2();
    }
}
