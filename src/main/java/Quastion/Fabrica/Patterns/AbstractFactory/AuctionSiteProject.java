package Quastion.Fabrica.Patterns.AbstractFactory;

import Quastion.Fabrica.Patterns.AbstractFactory.webSight.WebSiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjMAn projMAn = projectTeamFactory.getPM();

        System.out.println(" tests auction...");
        developer.wrightCode();
        tester.testCode();
        projMAn.manageProject();
    }



}
