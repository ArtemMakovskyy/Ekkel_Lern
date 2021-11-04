package Tests.Parcels.PArcel10.Parcel10_Factory.Another;

import Tests.Parcels.PArcel10.Parcel10_Factory.Service;

public class One implements Service {
    @Override
    public void method1() {
        System.out.println("first");
    }

    @Override
    public void method2() {
        System.out.println("second");
    }
static void getIt(One one){
        one.method1();
        one.method2();
}
    public static void main(String[] args) {
        getIt(new One());

    }
}
