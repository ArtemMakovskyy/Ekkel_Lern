package Quastion.Fabrica.Patterns.AbstractFactory.webSight;

import Quastion.Fabrica.Patterns.AbstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void wrightCode() {
        System.out.println("PHP dev wr code...");
    }
}
