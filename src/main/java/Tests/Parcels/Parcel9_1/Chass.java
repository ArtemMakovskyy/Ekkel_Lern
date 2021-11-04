package Tests.Parcels.Parcel9_1;

public class Chass implements Game{
    private Chass (){};
    private  int mooves = 0;
    private static final int MOVES = 4;

    @Override
    public boolean moove() {
        System.out.println("Ckhass" + mooves);
        return ++mooves != MOVES;
    }
   public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGameFactory() {
            return new Chass();
        }
    };
}
