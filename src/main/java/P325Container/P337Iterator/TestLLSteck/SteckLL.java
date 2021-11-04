package P325Container.P337Iterator.TestLLSteck;

import java.util.LinkedList;

public class SteckLL {
    protected LinkedList<String> llStekString = new LinkedList<>();
    public int i = 0;

    public void putOn(String str) {
        llStekString.addLast(str);
    }

    public void getAndDelLast() {
        if (llStekString.isEmpty()) {
            System.out.println("seck is empty");
            return;
        }
        System.out.println(llStekString.removeLast());
    }

    public boolean isData() {
        if (llStekString.isEmpty()) {
            return false;
        }
        return true;
    }

}
