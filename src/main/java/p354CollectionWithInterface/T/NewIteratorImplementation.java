package p354CollectionWithInterface.T;

import java.util.Iterator;

public class NewIteratorImplementation implements Iterable {
    protected String[]names = "Artem, Lena, Sasha, Polina".split(" ");


    @Override
    public Iterator iterator() {
        return null;
    }
}
