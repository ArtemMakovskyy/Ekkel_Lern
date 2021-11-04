package P312.Inner317;

public class InheritInner extends WithInner.Inner{
    public InheritInner(WithInner wi) {
       wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
        int d = ii.x;
        System.out.println(wi.y);
        System.out.println(wi.inner().x);
    }
}
