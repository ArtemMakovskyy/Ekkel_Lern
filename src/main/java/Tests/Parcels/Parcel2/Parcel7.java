package Tests.Parcels.Parcel2;

public class Parcel7 {
    public Contents contents(){
        return new Contents(){
            private int i = 22;
            public int getI(){
                return i;
            }
        };
            }

    public static void main(String[] args) {
        Contents contents = new Parcel7().contents();
        System.out.println(contents.getI());
    }
}
