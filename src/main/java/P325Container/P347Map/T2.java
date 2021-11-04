package P325Container.P347Map;

import java.util.*;

public class T2 {
    public static Map<Person, List<? extends Pet>> peoplePet = new LinkedHashMap<>();

    static {
        peoplePet.put(new Person("Vasia"), Arrays.asList(new Cat("Murka"),new Dog("Bim")));
        peoplePet.put(new Person("Dasha"), Arrays.asList(new Rat("Lina"),new Dog("Bob"),new Hamster("Fufu")));
        peoplePet.put(new Person("Kolia"), Arrays.asList(new Pug("Pug-pug"),new Cat("Rigik")));
        peoplePet.put(new Person("Vova"), Arrays.asList(new Mutt("MMM")));
    }

    public static void main(String[] args) {

        System.out.println(peoplePet.keySet());
        System.out.println(peoplePet.values());

        for (Person person: peoplePet.keySet()){
            System.out.println(person.name);
            for (Pet pet: peoplePet.get(person))
                System.out.println(pet);
                System.out.println();

        }
    }
}
