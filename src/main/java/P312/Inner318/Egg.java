package P312.Inner318;

public class Egg {
    private Yolk y;

    protected class Yolk {
        public Yolk() {
            System.out.println("Egg.Yolk()");
        }
    }

    public Egg() {
        System.out.println("new EGG");
        y = new Yolk();
    }
}
