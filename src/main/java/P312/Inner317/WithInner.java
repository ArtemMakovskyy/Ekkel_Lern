package P312.Inner317;

public class WithInner {
    public int y = 6;
    class Inner{
        public int x = 5;
    }
    public Inner inner(){
        return new Inner();
    }
}
