package k.bs.designpatternsp.creational.prototype.ja;

import java.util.HashMap;
import java.util.Map;

public interface Product extends Cloneable {
    Map<String, String> maps = new HashMap<>();

    String use(String use);

    Product createClone();
}
