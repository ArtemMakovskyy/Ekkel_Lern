package Tests.Parcels.PArcel10.Parcel20FactGame.TestIt;

import Tests.Parcels.PArcel10.Parcel20FactGame.FactGme;
import Tests.Parcels.PArcel10.Parcel20FactGame.Gamer_Two;
import Tests.Parcels.PArcel10.Parcel20FactGame.Gme;

public class StepperTwo implements Gme {
    private int step = 0 ;
    private final int STEPS = 2;
    @Override
    public boolean moove() {
        return ++step != STEPS;
    }
    public static  FactGme f  = new FactGme() {
        @Override
        public Gme getFyGme() {
            return new Gamer_Two();
        }
    };
}
