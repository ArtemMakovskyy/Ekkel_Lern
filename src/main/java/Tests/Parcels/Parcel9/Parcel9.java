package Tests.Parcels.Parcel9;

import Tests.Parcels.Destination;

public class Parcel9 {
    public Destination destination (final String dest){
      return new Destination() {
          private String label = dest;
          @Override
          public String readLAbel() {
              return label;
          }
      }  ;
    }

    public static void main(String[] args) {
        Destination d = new Parcel9().destination("ohohoho");
        System.out.println(d.readLAbel());
    }
}
