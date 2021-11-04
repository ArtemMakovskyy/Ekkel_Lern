package P325Container.P347Map;

public class Pet {
    String breed;
    public   int id = 0;

    public int id() {
        return id;
    }

}

class Cat extends Pet {
    String name;
    public   int id = 1;

    Cat(String name) {
        this.name = name;
    }
    public int id() {
        return id;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + name;
    }


}

class Dog extends Pet {
    String name;



    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + name;
    }
}

class Hamster extends Pet {
    String name;

    public Hamster(String name) {
        this.name = name;

    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + name;
    }
}

class Cymric extends Pet {
    String name;

    public Cymric(String name) {
        this.name = name;

    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + name;
    }
}

class Mutt extends Pet {
    String name;

    public Mutt(String name) {
        this.name = name;

    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + name;
    }
}


class Pug extends Pet {
    String name;

    public Pug(String name) {

        this.name = name;
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + name;
    }
}

class Rat extends Pet {
    String name;

    public Rat(String name) {
        this.name = name;

    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + name;
    }
}