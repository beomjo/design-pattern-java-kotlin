package k.bs.designpatternsp.behavioral.iterator.ja;

import java.util.Iterator;

public class SheepIterator implements Iterator<Sheep> {
 
    private Sheep[] sheeps;
    int position = 0;
 
    public SheepIterator(Sheep[] sheeps) {
        super();
        this.sheeps = sheeps;
 
    }
 
    @Override
    public boolean hasNext() {
        if (position >= sheeps.length || sheeps[position] == null) {
            return false;
 
        } else {
            return true;
        }
    }
 
    @Override
    public Sheep next() {
        Sheep tempSheep = sheeps[position];
        position++;
        return tempSheep;
    }
}