package Tests.Parcels.Parcel1;

public class ClassFirst {
    int x = 5;

    public void prn() {
        System.out.println(x);
    }
}

class SecondClass {



    public static void main(String[] args) {

        ClassFirst classFirst = new ClassFirst(){
            public void prn(){
                System.out.println(5);
            }
        };

    }
}