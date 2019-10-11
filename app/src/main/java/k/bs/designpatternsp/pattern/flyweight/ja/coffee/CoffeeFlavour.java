package k.bs.designpatternsp.pattern.flyweight.ja.coffee;

import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

import java.util.HashMap;

@RequiresApi(api = Build.VERSION_CODES.N)
public class CoffeeFlavour {
    private final String name;
    private static final HashMap<String, CoffeeFlavour> CACHE = new HashMap<>();

    public CoffeeFlavour(String name) {
        this.name = name;
    }

    @NonNull
    @Override
    public String toString() {
        return name;
    }

    public static CoffeeFlavour intern(String name) {
        synchronized (CACHE) {
            return CACHE.computeIfAbsent(name, CoffeeFlavour::new);
        }
    }

    public static int flavoursInCache() {
        synchronized (CACHE) {
            return CACHE.size();
        }
    }
}
