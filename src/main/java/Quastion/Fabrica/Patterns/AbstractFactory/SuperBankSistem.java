package Quastion.Fabrica.Patterns.AbstractFactory;

import Quastion.Fabrica.Patterns.AbstractFactory.banking.BankingTeamFactory;

public class SuperBankSistem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjMAn projMAn = projectTeamFactory.getPM();

        System.out.println("Create bank sysy");
        developer.wrightCode();
        tester.testCode();
        projMAn.manageProject();
    }
}
