package P325Container.Tests;

import DatesFromArray.SomeArrays;

import java.util.*;

public class FirsTest {
    public static void main(String[] args) {
        SomeArrays d = new SomeArrays();

        List<Integer> list = new ArrayList<>(d.haveIntCollection_11to99());
        System.out.println(list.contains(88));
        System.out.println(list.contains(8));
        System.out.println("list.indexOf(22) - "+ list.indexOf(22));
        System.out.println(list.remove(1));
        List <String> list_s = new ArrayList<>(d.haveStrCollection_Animals());
        List<String>sub = list_s.subList(2,5);
        System.out.println(sub+"            sub");
        System.out.println(list_s.containsAll(sub)+"   list_s.containsAll(sub)");
        System.out.println(sub+"            sub");
        ArrayList<String >subCopy = new ArrayList<>(sub);
        Collections.sort(list_s);
        System.out.println(list_s);
        Collections.shuffle(list_s);
        System.out.println(subCopy+" subCopy");
        list_s.retainAll(subCopy);
        System.out.println(list_s+" list_s.retainAll(subCopy)");
        Object [] ar  = list_s.toArray();
        String [] arS = new String[ar.length];
        list_s.toArray(arS);
        for (int i = 0; i < arS.length; i++) System.out.println(arS[i]);


    }
}
