package Tests.Parcels.Parcel9_1;

public class Games {
    public static void playGame(GameFactory factory){
      Game g =   factory.getGameFactory();

      while (  g.moove()){
          ;
      };
    }

    public static void main(String[] args) {
        playGame(Chakers.factory);
        playGame(Chass.factory);
    }
}
