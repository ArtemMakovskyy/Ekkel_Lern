package P325Container.P347Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapOfListP348 {
    public static Map<Person, List<? extends Pet>> petPeople = new HashMap<>();

    static {
        petPeople.put(new Person("Dawn"), Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
        petPeople.put(new Person("Kate"), Arrays.asList(new Cat("Elsi May"), new Dog("Margrett")));
        petPeople.put(new Person("Marilyn"), Arrays.asList(new Pug("Loiika aka Lois SKJKL"), new Cat("Stanford aka dfgd'g"), new Cat("Pinkola")));
        petPeople.put(new Person("Luke"), Arrays.asList(new Rat("Fizzi"), new Mutt("Fuzzi")));
        petPeople.put(new Person("Isaak"), Arrays.asList(new Rat("Fracly")));
    }
    public static void main(String[] args) {
        System.out.println(petPeople.keySet());
        System.out.println(petPeople.values());
        System.out.println();
        for (Person person : petPeople.keySet()) {
            System.out.println(person + " has:");
            for (Pet pet : petPeople.get(person)) System.out.println(pet + " " + pet);
            System.out.println();
        }
    }
}
