package Tests.Parcels.Parcel7;

import Tests.Parcels.Contents;

public class Parcel7 {
    public Contents contents() {
        return new Contents() {
            private int i = 11;

            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 parcel7 = new Parcel7();
        Contents c = parcel7.contents();
        System.out.println(c.value());
        Contents f = new Parcel7().contents();
        System.out.println(f.value());
    }
}
