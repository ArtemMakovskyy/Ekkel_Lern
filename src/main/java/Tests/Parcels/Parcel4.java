package Tests.Parcels;

public class Parcel4 {
    private class PContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination {
        private String label;

        private PDestination(String label) {
            this.label = label;
        }

        @Override
        public String readLAbel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }
}
class TestParcel{
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("tanzaniya");
        System.out.println(d.readLAbel());
        System.out.println(c.value());
    }

}
