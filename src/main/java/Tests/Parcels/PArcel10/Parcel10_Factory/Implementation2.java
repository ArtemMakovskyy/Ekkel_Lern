package Tests.Parcels.PArcel10.Parcel10_Factory;

public class Implementation2 implements Service{
    @Override
    public void method1() {
        System.out.println("im2 m1");
    }

    @Override
    public void method2() {
        System.out.println("im2 m2");
    }
    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation2();
        }
    };
}
