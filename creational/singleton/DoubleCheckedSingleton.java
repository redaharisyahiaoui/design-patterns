public class DoubleCheckedSingleton {
    
    private static volatile DoubleCheckedSingleton instance;

    private DoubleCheckedSingleton() {
        // Private constructor to prevent instantiation
    }

    public static DoubleCheckedSingleton getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (DoubleCheckedSingleton.class) {
                if (instance == null) { // Second check (with locking)
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        return instance;
    }
}
