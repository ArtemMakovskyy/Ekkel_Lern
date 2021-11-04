package Tests.Parcels.Parcel6.Pack2;

public class TestInner {
    public void start(boolean a) {
        if (a) {
            class InnerDoIf {
                String text;
                public InnerDoIf(String text) {
                    this.text = text;
                    System.out.println(getText());
                }
                InnerDoIf in = new InnerDoIf("abcc");
                String getText() {
                    System.out.println(text);
                    return text;
                }
                InnerDoIf id = new InnerDoIf("a");

            }
        }

//==================
        if (a) {
            System.out.println("abc");
        }
    }

    void getOn() {
        start(true);
    }

    public static void main(String[] args) {
        TestInner t = new TestInner();
        t.getOn();
    }

}
