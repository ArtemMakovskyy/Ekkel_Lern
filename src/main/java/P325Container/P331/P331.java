package P325Container.P331;

import java.util.*;

public class P331 {
    static Collection collec(Collection<String> collection) {
        collection.addAll(Arrays.asList("rat", "dog", "cat", "mouse", "dog"));
        collection.add("bird");
        return collection;
    }

    static Map collect(Map<String, String> map) {
        map.put("rat", "Anfisa");
        map.put("cat", "Murka");
        map.put("dog", "Sharik");
        map.put("dog", "Bobik");
        map.put("mouse", "Mikky");
        map.put("bird", "Kukuha");
        return map;
    }

    public static void main(String[] args) {
        System.out.println(collec(new ArrayList<>()) + " new ArrayList<>()");
        System.out.println();
        System.out.println(collec(new ArrayList<String>()) + " new ArrayList<String>()");
        System.out.println(collec(new LinkedList<String>()) + " new LinkedList<String>()");
        System.out.println(collec(new HashSet<>()) + " HashSet");
        System.out.println(collec(new TreeSet<>()) + " TreeSet");
        System.out.println(collec(new LinkedHashSet<>()) + " LinkedHashSet");
        System.out.println();
        System.out.println(collect(new HashMap<>()) + "new HashMap<>");
        System.out.println(collect(new TreeMap<>()) + "new TreeMap<>");
        System.out.println(collect(new LinkedHashMap<>()) + "new LinkedHashMap<>");


    }
}
