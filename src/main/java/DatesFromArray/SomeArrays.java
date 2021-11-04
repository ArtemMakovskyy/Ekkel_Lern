package DatesFromArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

public class SomeArrays {
    public Collection<Integer> haveIntCollection_11to99() {
        //    Collection  ->  =  >->
        //    List
        //    ArrayList
        //    LinkedList
        //    HashSet
        //    TreeSet
        //    LinkedHashSet
        //    Queue
        Collection<Integer> collection = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 00);
        System.out.println(collection);
        return collection;
    }

    public Collection<String> haveStrCollection_Animals() {
        Collection<String> collection = Arrays.asList("Dog", "Cat", "Rat", "Mouse", "Horse", "Cow", "Goat", "Hen", "Bird", "Snake");
        System.out.println(collection);
        return collection;
    }

    public Collection<Pets> haveAllPets() {
        Collection<Pets> pets = new ArrayList<>();
        pets.addAll(Arrays.asList(
                new Cats("Musy"), new Dogs("Dogsy"), new Cymrics("Cymrics"), new Mutts("Mutts"),
                new Pugs("Pugs"), new Rats("Rats"),new Hamsters("Hamster")));
        return pets;
    }

    public Map<String, String> haveStrMap_Animals() {
//        Map ->  =  >->
//        HashMap
//        TreeMap
//        LinkedHashMap

        Map<String, String> mapCol = null;
        mapCol.put("Dog", "Bobik");
        mapCol.put("Cat", "Murka");
        mapCol.put("Rat", "Ratatuy");
        mapCol.put("Mouse", "Mikki");
        mapCol.put("Bird", "Pechushka");
        System.out.println(mapCol);
        return mapCol;
    }

}
