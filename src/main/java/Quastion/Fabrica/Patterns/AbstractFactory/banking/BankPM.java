package Quastion.Fabrica.Patterns.AbstractFactory.banking;

import Quastion.Fabrica.Patterns.AbstractFactory.ProjMAn;

public class BankPM implements ProjMAn {
    @Override
    public void manageProject() {
        System.out.println(" Bamnking PM manags PM proj...");
    }
}
