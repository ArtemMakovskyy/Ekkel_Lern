package P325Container.P331;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork2 {
    public static int position = 0;
    public static int allNames = 0;

    public static void next(List<String> list) {
        if (allNames == position) {
            position = 0;
            System.out.println();
            System.out.println("new cycle");
        }
        System.out.println(list.get(position)+" " + position);
        position++;
    }

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.addAll(Arrays.asList("Bob", "Ana", "Delat", "Tor", "Fos", "Sof"));
        allNames = name.size();

        for (int i = 0; i < 10; i++) {
            next(name);
        }
    }
}
