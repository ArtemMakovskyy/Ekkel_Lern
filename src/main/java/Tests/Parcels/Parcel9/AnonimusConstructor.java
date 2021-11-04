package Tests.Parcels.Parcel9;

public class AnonimusConstructor {
    public static Base getBase(int i){
        return new Base(i) {
            {
                System.out.println("in iniciator exeplars");
            }

            @Override
            public void f() {
                System.out.println("in anonnimus f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}
