package Enum;
// p 183
public class SpacinessOrder {
    public static void main(String[] args) {
        for (Spiciness s: Spiciness.values()){
            System.out.println(s + " " + s.ordinal());
        }
    }
}
