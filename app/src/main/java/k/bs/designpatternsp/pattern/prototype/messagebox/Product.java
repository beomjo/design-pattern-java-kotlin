package k.bs.designpatternsp.pattern.prototype.messagebox;

import java.util.HashMap;
import java.util.Map;

public interface Product extends Cloneable {
    Map<String, String> maps = new HashMap<>();

    String use(String use);

    Product createClone();
}
