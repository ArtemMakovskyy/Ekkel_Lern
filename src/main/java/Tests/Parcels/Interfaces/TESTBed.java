package Tests.Parcels.Interfaces;

public class TESTBed {
    public void f(){
        System.out.println("f()");
    }
    public static class TEster{
        public static void main(String[] args) {
            TESTBed t = new TESTBed();
            t.f();
        }
    }
}
