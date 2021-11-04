package Tests.Parcels.Parcel11;

import Tests.Parcels.Contents;
import Tests.Parcels.Destination;

public class PArcel11 {
    private  class ParcelContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected static class ParcelDestination implements Destination {
        private String label;

        private ParcelDestination(String wereTo) {
            label = wereTo;
        }

        @Override
        public String readLAbel() {
            return label;
        }

        public static void fff() {
        }

        static int x;

        static class Anotherlavel {
            public static void f() {
            }
            static int x = 10;
        }
    }

    public static Destination destination(String s) {
        return new ParcelDestination(s);
    }

    public static Contents contents() {
        return new PArcel11().new ParcelContents();
    }

    public static void main(String[] args) {
        Contents c = contents();
        Destination d = destination("Tanzaniya");
        ParcelDestination p = new ParcelDestination("a");
        System.out.println(p.label);

    }
}
