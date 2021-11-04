package Tests.Parcels.Parcel7;

import Tests.Parcels.Contents;

public class Par7_2 {
    Contents contents(int i) {
        int nums = i;
        {
            if (nums > 100) System.out.println("ok");
        }
        return new Contents() {
            @Override
            public int value() {
                return nums;
            }
        };
    }

    public static void main(String[] args) {
        Contents c = new Par7_2().contents(150);
        System.out.println(c.value());
    }
}
