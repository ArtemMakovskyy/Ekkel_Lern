package Quastion.Fabrica.Patterns.AbstractFactory.webSight;

import Quastion.Fabrica.Patterns.AbstractFactory.ProjMAn;

public class WebSitePM implements ProjMAn {
    @Override
    public void manageProject() {
        System.out.println(" Website PM manages WSProo...");
    }
}
