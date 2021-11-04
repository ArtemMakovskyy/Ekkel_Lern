package DatesFromArray;

public class Pets {
    String breed;
    public int id = 0;

    public int id() {
        return id;
    }
}


class Cats extends Pets {
    String name;
    public int id = 1;

    Cats(String name) {
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

class Dogs extends Pets {
    String name;
    public int id = 2;


    public Dogs(String name) {
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

class Hamsters extends Pets {
    String name;
    public int id = 3;

    public Hamsters(String name) {
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

class Cymrics extends Pets {
    String name;
    public int id = 4;

    public Cymrics(String name) {
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

class Mutts extends Pets {
    String name;
    public int id = 5;

    public Mutts(String name) {
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


class Pugs extends Pets {
    String name;
    public int id = 6;

    public Pugs(String name) {

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

class Rats extends Pets {
    String name;
    public int id = 7;

    public Rats(String name) {
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