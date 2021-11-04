package TestInterface;

public abstract class StringProcessor implements Processor{
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public abstract String process(Object input) ;
    public static String s = "If ...";

    public static void main(String[] args) {
        Applay.process(new Upcase(),s);
        Applay.process(new Downcase(),s);
        Applay.process(new Splitter(),s);
    }

}
