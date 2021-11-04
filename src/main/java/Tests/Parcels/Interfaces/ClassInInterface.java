package Tests.Parcels.Interfaces;

public interface ClassInInterface {
    void howdy();
    class Test implements ClassInInterface{

        @Override
        public void howdy() {
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        new Test().howdy();
    }
}
