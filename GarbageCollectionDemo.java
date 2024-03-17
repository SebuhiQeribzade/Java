package GarbageCollectionDemo;

public class GarbageCollectionDemo {
    public static void runGarbageCollector() {
        System.out.println("Running garbage collector...");
        System.gc(); // Request garbage collection
    }

    public static void main(String[] args) {
        // Create an object
        GarbageCollectionDemo obj = new GarbageCollectionDemo();

        // Make the object unreachable
        obj = null;

        // Call runGarbageCollector to trigger garbage collection
        runGarbageCollector();

        // Message to show that the object has been collected
        System.out.println("Object collection may have occurred.");
    }
}
