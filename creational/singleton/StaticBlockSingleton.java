public class StaticBlockSingleton {
    
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {
        // Private constructor to prevent instantiation
    }

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}