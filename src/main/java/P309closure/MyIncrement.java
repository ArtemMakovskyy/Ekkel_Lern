package P309closure;

public class MyIncrement {

    public MyIncrement increment(){
        System.out.println("Other operations");

        return null;
    }
    public static void f(MyIncrement mi){
        mi.increment();
    }

static MyIncrement f2(){
        return new MyIncrement().increment();
}
}
