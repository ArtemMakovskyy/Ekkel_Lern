package TestInterface;

public class Applay {
    public static void process(Processor p, Object s){
        System.out.println(p.name());
        System.out.println(p.process(s));
    }
    public static String s = "Disagrement with belifs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(),s);
        process(new Downcase(),s);
        process(new Splitter(),s);
    }
}
