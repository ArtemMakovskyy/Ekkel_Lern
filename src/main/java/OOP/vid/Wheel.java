package OOP.vid;

public class Wheel {
    String name;

    public Wheel(String name) {
        this.name = name;
    }

    void drive(){
        System.out.println("колёса |"+ this.name +" крутятся");
    }
}
