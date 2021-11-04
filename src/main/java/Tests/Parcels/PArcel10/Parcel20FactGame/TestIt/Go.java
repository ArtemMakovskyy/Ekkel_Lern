package Tests.Parcels.PArcel10.Parcel20FactGame.TestIt;

import Tests.Parcels.PArcel10.Parcel20FactGame.FactGme;
import Tests.Parcels.PArcel10.Parcel20FactGame.Gme;

public class Go {
    public static void getFact(FactGme factGme){
        Gme g= factGme.getFyGme();
        while (g.moove()){

        }

    }
    public static void main(String[] args) {
getFact(StepperOne.f);
getFact(StepperTwo.f);

    }
}
