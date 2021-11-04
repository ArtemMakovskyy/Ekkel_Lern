package OOP.vid;

public class Engin {
    String name;

    public Engin(String name) {
        this.name = name;
    }

    void drive(){
        System.out.println("двигатель |"+ this.name +" работает");
    }
}
