package k.bs.designpatternsp.creational.prototype.ja;

import java.util.HashMap;


public class PrototypeService {
    private HashMap showcase = new HashMap<>();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product clone(String protoName) {
        return ((Product) showcase.get(protoName)).createClone();
    }
}
