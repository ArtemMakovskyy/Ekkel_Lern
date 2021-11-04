package P325Container.P324;

import java.util.ArrayList;

public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchacked")
    public static void main(String[] args) {
        ArrayList <Apple>apples = new ArrayList();
            apples.add(new Apple());
            apples.add(new Fuji());
            apples.add(new Gala());


        for (int i = 0; i < apples.size(); i++) {

            System.out.println(apples.get(i).id());
            System.out.println(apples.get(i));
        }
    }
}
