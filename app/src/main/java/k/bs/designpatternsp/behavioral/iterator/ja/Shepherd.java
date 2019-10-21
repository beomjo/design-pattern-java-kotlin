package k.bs.designpatternsp.behavioral.iterator.ja;

import java.util.Iterator;

public class Shepherd {


    public static final int MAX_SHEEP = 100;
    private int sheepNum = 0;
    public static final Sheep[] SHEEPS = new Sheep[MAX_SHEEP];

    public Shepherd() {
        super();
        int i;
        for (i = 0; i < 30; ++i) {
            SHEEPS[i] = new Sheep();

        }
        sheepNum = i;
    }

    public void addGoat() {
        SHEEPS[++sheepNum] = new Sheep();
    }

    public void removeGoat() {
        SHEEPS[sheepNum--] = null;
    }


    public Iterator<Sheep> createIterator() {
        return new SheepIterator(SHEEPS);
    }
    public int getSheepNum() {
        return sheepNum;
    }

}
