package k.bs.designpatternsp.pattern.singleton.ja;

public class HolderSingleton {
    // Private constructor prevents instantiation from other classes
    private HolderSingleton() { }

    /**
     * SingletonHolder is loaded on the first execution of Singleton.getInstance()
     * or the first access to SingletonHolder.INSTANCE, not before.
     */
    private static class SingletonHolder {
        public static final HolderSingleton INSTANCE = new HolderSingleton();
    }
    public static HolderSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
