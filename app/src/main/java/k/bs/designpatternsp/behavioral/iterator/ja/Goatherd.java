package k.bs.designpatternsp.behavioral.iterator.ja;

import java.util.HashMap;
import java.util.Iterator;

public class Goatherd {
 
    public static final int MAX_GOATS = 100;
    private int goatNum = 0;
    public static final HashMap<Integer, Goat> GOATS = new HashMap<>();
 
    public Goatherd() {
        super();
        int i;
 
        for (i = 0; i < 30; ++i) {
            GOATS.put(i, new Goat());
 
        }
 
        goatNum = i;
    }
 
    public void addGoat() {
        if (GOATS.size() <= MAX_GOATS) GOATS.put(goatNum++, new Goat());
    }
 
    public void removeGoat() {
        GOATS.remove(goatNum--);
    }
    
    public Iterator<Integer> createIterator() {
        return GOATS.keySet().iterator();
    }

}
