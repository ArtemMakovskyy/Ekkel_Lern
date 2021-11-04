package P325Container.P337Iterator;

import DatesFromArray.SomeArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorClass {
    public static void main(String[] args) {
        SomeArrays sa = new SomeArrays();
        List<String> pets = new ArrayList<>(sa.haveStrCollection_Animals());
        ListIterator<String> it = pets.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
            System.out.println(it.nextIndex());
            System.out.println(it.previousIndex());
            System.out.println();
        }
    }
}
