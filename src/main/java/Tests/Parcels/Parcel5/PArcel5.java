package Tests.Parcels.Parcel5;


import Tests.Parcels.Destination;

public class PArcel5 {
    public Destination destination(String s){
        class PDestination implements Destination{
            private String label;
            private PDestination(String wereTo){
                label = wereTo;
            }
            @Override
            public String readLAbel() {
                return label;
            }
        }
return new PDestination(s);
    };

    public static void main(String[] args) {
        PArcel5 p = new PArcel5();
        Destination d = p.destination("abc");
        System.out.println(d.readLAbel());
    }
}
