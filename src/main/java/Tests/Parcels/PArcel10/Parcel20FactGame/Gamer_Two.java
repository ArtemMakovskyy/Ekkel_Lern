package Tests.Parcels.PArcel10.Parcel20FactGame;

public class Gamer_Two implements Gme{
    private int step = 0;
    private int steps = 4;
    @Override
    public boolean moove() {
        System.out.println("Gamer_Two step is " + step);
        return ++step != steps;
    }
  public   static FactGme fact = new FactGme() {
        @Override
        public Gme getFyGme() {
            return new Gamer_Two();
        }
    };
}
