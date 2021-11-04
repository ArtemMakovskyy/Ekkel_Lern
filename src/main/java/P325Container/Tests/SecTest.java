package P325Container.Tests;

import DatesFromArray.SomeArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SecTest {
    public static void main(String[] args) {
        SomeArrays sa = new SomeArrays();
        List<String> list = new ArrayList<>(sa.haveStrCollection_Animals());

//       Iterator<String>it =  list.iterator();
//       while (it.hasNext()){
//           String s = it.next();
//           System.out.println(s);
//       }
        System.out.println();
        ListIterator<String> ss =  list.listIterator(5);
        System.out.println(ss.next());

        ListIterator<String> it_l = list.listIterator();
       while (it_l.hasPrevious()){
           System.out.print(it_l.previous() + " ");
       }

    }
}
