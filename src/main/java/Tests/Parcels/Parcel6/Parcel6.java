package Tests.Parcels.Parcel6;

public class Parcel6 {
    private void internalTracking ( boolean b){
        if (b){
            class TrackingSlip {
                private String id;

                public TrackingSlip(String s) {
                    this.id = s;
                }
                String getSlip(){
                    System.out.println(id);
                    return id;
                }
                TrackingSlip ts = new TrackingSlip("slip");


            }
            Parcel6 p6 = new Parcel6();

        }
    }
    public void track(){
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel6 p6 = new Parcel6();
        p6.track();

    }
}
