package Quastion.Fabrica.Patterns.AbstractFactory.banking;

import Quastion.Fabrica.Patterns.AbstractFactory.Developer;
import Quastion.Fabrica.Patterns.AbstractFactory.ProjMAn;
import Quastion.Fabrica.Patterns.AbstractFactory.ProjectTeamFactory;
import Quastion.Fabrica.Patterns.AbstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjMAn getPM() {
        return new BankPM();
    }
}
