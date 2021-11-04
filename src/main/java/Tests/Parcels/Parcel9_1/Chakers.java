package Tests.Parcels.Parcel9_1;

public class Chakers implements Game{
    private Chakers(){};
    private int moves = 0;
    private static  final int MOVES = 3;
    @Override
    public boolean moove() {
        System.out.println("Chalers moove " + moves);
        return ++moves !=MOVES;
    }
    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGameFactory() {
            return new Chakers();
        }
    };
}
