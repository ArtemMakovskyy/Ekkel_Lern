package OOP.vid;
//https://www.youtube.com/watch?v=-6DWwR_R4Xk
//26.40===>>>
public class Car {
    Engin engin;
    Wheel wheel;
    Frashiner frashiner;



    public Car(Engin engin, Wheel wheel) {
        this.engin = engin;
        this.wheel = wheel;
    }


    public Car(Engin engin, Wheel wheel, Frashiner frashiner) {
        this.engin = engin;
        this.wheel = wheel;
        this.frashiner = frashiner;
    }

    void drive(){
        engin.drive();
        wheel.drive();
        wheel.drive();
        wheel.drive();
        wheel.drive();
        System.out.println("запаска| " +wheel.name +" стоит");
//        frashiner.function();


    }

}
