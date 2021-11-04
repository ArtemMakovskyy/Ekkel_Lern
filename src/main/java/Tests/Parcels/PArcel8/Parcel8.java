package Tests.Parcels.PArcel8;

public class Parcel8 {
    public Wrapping wrapping(int x){
        return new Wrapping(x){
            public int value(){
                return super.value()*47;
            }
        };
    }

    public static void main(String[] args) {
        Wrapping w = new Parcel8().wrapping(10);
        System.out.println(w.value());
    }
}
