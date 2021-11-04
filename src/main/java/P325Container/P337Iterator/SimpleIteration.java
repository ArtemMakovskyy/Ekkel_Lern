package P325Container.P337Iterator;

import DatesFromArray.SomeArrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleIteration {
    public static void main(String[] args) {
        SomeArrays sa = new SomeArrays();
        List<String> pets = new ArrayList<>(sa.haveStrCollection_Animals());
//forEach===============
        for (String s : pets) {
            System.out.print(s+" ");
        }
        System.out.println();
//iterator ===============
        Iterator<String> iterator = pets.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.print(s);
            iterator.remove();

        }
        System.out.println();
        System.out.println(pets);
//ListIterator============

    }
}
