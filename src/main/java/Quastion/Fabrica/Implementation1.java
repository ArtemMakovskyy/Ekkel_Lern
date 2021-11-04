package Quastion.Fabrica;

public class Implementation1 implements Service{
    @Override
    public void method1() {
        System.out.println("Implementation1 method1");
    }
    @Override
    public void method2() {
        System.out.println("Implementation1 method2");
    }
}
class ImplementationFactory implements ServiceFactory{
    @Override
    public Service getService() {
        return new Implementation1();
    }
}
 class Implementation2 implements Service{
    @Override
    public void method1() {
        System.out.println("Implementation2 method1");
    }
    @Override
    public void method2() {
        System.out.println("Implementation2 method2");
    }
}
class ImplementationFactory2 implements ServiceFactory{
    @Override
    public Service getService() {
        return new Implementation2();
    }
}
class Factories{
    public static void serviseConsumer(ServiceFactory fact){
        Service s = fact.getService();
        s.method1();
        s.method2();
    }
    public static void main(String[] args) {
        serviseConsumer(new ImplementationFactory());
        serviseConsumer(new ImplementationFactory2());
    }
}