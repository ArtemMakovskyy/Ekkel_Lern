package Quastion.Fabrica.Patterns.AbstractFactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjMAn getPM();
}
