package P325Container.P331;

import java.util.*;

public class HomeWork3 {
    public static int position = 0;
    public static int step = 0;
    static List list_l = null;
    static ArrayList<String> list_al = null;
    static LinkedList list_ll;
    static HashSet list_hs;
    static LinkedHashSet list_lhs;

    public static Collection<String> collection(Collection<String> collect) {
        collect.addAll(Arrays.asList("Bob", "Ana", "Delat", "Tor", "Fos", "Sof"));
        return collect;
    }

    static void next(Collection<String> callection) {
        if (callection.size() == position) {
            position = 0;
            System.out.println("   <= next line ");
        }
        List<String> list_l = new ArrayList<>(callection);
        ArrayList<String> list_al = new ArrayList<>(callection);
        LinkedList<String> list_ll = new LinkedList<>(callection);
        HashSet<String> list_hs = new HashSet<>(callection);
        LinkedHashSet<String> list_lhs = new LinkedHashSet<>(callection);


        list_l.addAll(callection);

        list_al.addAll(callection);
        list_al.get(0);
        list_ll.addAll(callection);
        list_hs.addAll(callection);
        list_lhs.addAll(callection);

        System.out.println(list_l.get(position));
        position++;
    }


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(collection(new ArrayList<>()));


        for (int i = 0; i < 10; i++) {
            next(list);
//            list_al.set(i,list.get(i));
//            list_hs.add(list.get(i));
//            list_lhs.add(list.get(i));
//            list_ll.set(i,list.get(i));
        }

        System.out.println(list + " list ");
        System.out.println(list_al + " list_al ");
        System.out.println(list_hs + " list_hs ");
        System.out.println(list_lhs + " list_lhs ");
        System.out.println(list_ll + " list_ll ");

    }
}
