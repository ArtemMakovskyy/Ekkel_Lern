package Tests.Parcels.PArcel10.Parcel20FactGame.TestIt;

import Tests.Parcels.PArcel10.Parcel20FactGame.FactGme;
import Tests.Parcels.PArcel10.Parcel20FactGame.Gamer_One;
import Tests.Parcels.PArcel10.Parcel20FactGame.Gme;

public class StepperOne implements Gme {
    private int step = 0;
    private final int STEPS = 4;
    @Override
    public boolean moove() {
        System.out.println("now is " + step);
        return step++ != STEPS;
    }
public static FactGme f = new FactGme() {
    @Override
    public Gme getFyGme() {
        return new Gamer_One();
    }
};
}
