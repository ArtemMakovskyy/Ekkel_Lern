package P325Container.P328;

import java.util.*;

public class SimpleList {
     static Collection fill(Collection<String> collection){
        collection.add("rat");
        collection.addAll(Arrays.asList("крыса","кошка","собака","собака","конь"));
                return collection;
    }
    static Map fill(Map<String,String>map){

         return map;
    }

    public static void main(String[] args) {

        List<Integer> inList = new ArrayList<>(Arrays.asList(1, 2, 3));
        inList.add(5);
        List<Integer> inList2 = Arrays.asList(4, 5, 6);
//        inList2.add(7);
Collection<Integer>collection = new HashSet<>(Arrays.asList(123,456));
collection.addAll(Arrays.asList(124,455));
        System.out.println(collection);




    }
}
