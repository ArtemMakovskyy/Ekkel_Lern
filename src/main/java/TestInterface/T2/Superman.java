package TestInterface.T2;

public class Superman {
    static void fi(Fight x){x.fight();}
    static void fl(Flight x){x.flight();}
    static void s(Swim x){x.swim();}

    public static void main(String[] args) {
        Action a = new Action();
     fi(a);
     a.fight();
     fl(a);

     a.swim();
    }
}
