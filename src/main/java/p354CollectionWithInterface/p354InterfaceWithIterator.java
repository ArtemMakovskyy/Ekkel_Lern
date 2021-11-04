package p354CollectionWithInterface;

import DatesFromArray.Pets;
import DatesFromArray.SomeArrays;

import java.util.*;

public class p354InterfaceWithIterator {
    public static void display(Iterator<Pets> it) {
        while (it.hasNext()) {
            Pets p = it.next();
            System.out.println(p.id() + ":" + p + " ");
        }
        System.out.println();
    }

    public static void display(Collection<Pets> pets) {
        for (Pets p : pets) System.out.println(p.id() + ":" + p + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        SomeArrays sa = new SomeArrays();
        ArrayList<Pets> petsList = new ArrayList<>(sa.haveAllPets());
        display(petsList);
        display(petsList.iterator());
        Set<Pets> petsSet = new HashSet<>(sa.haveAllPets());
        display(petsSet);
        display(petsSet.iterator());

        Map<String, Pets> petsMap = new LinkedHashMap<>();
        String name[] = ("Ralph, Eric, Robin, Lacey, Brithney, Sam, Spot").split(", ");
        for (int i = 0; i < name.length; i++) petsMap.put(name[i], petsList.get(i));
        System.out.println(petsMap);
        System.out.println(petsMap.keySet());
        display(petsMap.values());
        display(petsMap.values().iterator());

    }
}




