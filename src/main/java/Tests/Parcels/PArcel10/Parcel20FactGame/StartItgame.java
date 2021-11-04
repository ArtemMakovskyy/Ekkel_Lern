package Tests.Parcels.PArcel10.Parcel20FactGame;

public class StartItgame {
public static void stepGamer(FactGme f){
    Gme g  = f.getFyGme();
    while (g.moove()){

    }
}
    public static void main(String[] args) {
    stepGamer(Gamer_One.fact);
    stepGamer(Gamer_Two.fact);

    }
}
