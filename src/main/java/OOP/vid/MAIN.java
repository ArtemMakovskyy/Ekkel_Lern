package OOP.vid;
//https://www.youtube.com/watch?v=-6DWwR_R4Xk&t=1633s
public class MAIN {
    public static void main(String[] args) {
        Car car1 = new Car(new Engin("sport"),new Wheel("fast"));
        car1.drive();
        System.out.println();

        Car car2 = new Car(new Engin("sity"),new Wheel("comfort"),new Frashiner("хвоя"));
        car2.drive();
    }
}
