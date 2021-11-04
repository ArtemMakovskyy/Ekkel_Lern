package P325Container.P347Map;

import java.util.HashMap;
import java.util.Map;

public class T {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,10);
        map.put(2,20);
        map.put(3,30);
        map.put(4,40);
        map.put(5,50);
        map.put(6,60);
        map.put(0,11);
        for (int i = 0; i < map.size(); i++) {
            System.out.println(map.get(i));
        }
        System.out.println(map);
        System.out.println(map.containsValue(10));
        System.out.println(map.containsKey(6));
    }
}
