package p354CollectionWithInterface;

import DatesFromArray.SomeArrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EnvironmentVariables358 {
    public static void main(String[] args) {
        for (Map.Entry entry: System.getenv().entrySet()){
            System.out.println(entry.getKey()+": "+ entry.getValue());
        }
        SomeArrays sa = new SomeArrays();
        Map<String, String> hm = new HashMap<>();
        hm.put("a", "AA");
        hm.put("b", "BB");
        hm.put("c", "CC");
        hm.put("d", "DD");
        System.out.println(hm.values());
        System.out.println(hm.keySet());
        System.out.println(hm.entrySet());
        System.out.println(hm.entrySet().size());
        System.out.println(hm.size());
        for (Map.Entry entry : hm.entrySet()) System.out.println(entry);

        for (Map.Entry entry : hm.entrySet()) System.out.println(entry.getKey() +" : "+ entry.getValue());
        String[] Arr = "a b v c d s d".split(" ");
        System.out.println(Arrays.asList(Arr).toString());
        System.out.println(Arrays.asList("a b v c d s d".split(" ")).toString());


    }
}
