package P325Container.P331;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork {
    static int position = 0;
    public static void main(String[] args) {
        ArrayList<String>listName = new ArrayList<>();
        listName.addAll(Arrays.asList("Bob","Ana","Delat","Tor","Fos","Sof"));
        System.out.println(listName);

        for (int i = 0; i < 20; i++) {
            if (position == listName.size()){
                position=0;
                System.out.println("=========");
                System.out.println("next cycle");
            }
            System.out.println(listName.get(position));
            position++;
        }

    }
}
