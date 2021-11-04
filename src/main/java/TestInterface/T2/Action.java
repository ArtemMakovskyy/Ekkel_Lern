package TestInterface.T2;

public class Action implements Flight,Fight,Swim{
    @Override
    public void fight() {
        System.out.println(1);
    }

    @Override
    public void flight() {
        System.out.println(2);
    }

    @Override
    public void swim() {
        System.out.println(3);
    }
}
