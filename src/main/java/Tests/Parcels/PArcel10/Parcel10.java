package Tests.Parcels.PArcel10;

import Tests.Parcels.Destination;

public class Parcel10 {
    public Destination destination(final String dest, final float price){
        return new Destination() {
            private int cost;
            {
                cost = Math.round(price);
                if (cost>100) System.out.println("Пreвышение бюджета");
            }
            private String label = dest;
            @Override
            public String readLAbel() {
                return label;
            }

        };
    }

    public static void main(String[] args) {
        Destination d = new Parcel10().destination("Tanzaniya", 101.395F);
    }
}
