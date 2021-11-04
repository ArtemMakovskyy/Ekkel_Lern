package Quastion.Fabrica.Patterns.AbstractFactory.webSight;

import Quastion.Fabrica.Patterns.AbstractFactory.Developer;
import Quastion.Fabrica.Patterns.AbstractFactory.ProjMAn;
import Quastion.Fabrica.Patterns.AbstractFactory.ProjectTeamFactory;
import Quastion.Fabrica.Patterns.AbstractFactory.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjMAn getPM() {
        return new WebSitePM();
    }
}
