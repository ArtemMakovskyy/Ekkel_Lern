package Tests.Parcels.PArcel10.Parcel10_Factory;

public class Factoryes {
    static void consumer(ServiceFactory factory){
        Service s = factory.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        consumer(Implementation1.factory);
        consumer(Implementation2.factory);




    }

}
