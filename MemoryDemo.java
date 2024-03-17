package StackvsHeap;
public class MemoryDemo {

    public void stackVsHeap() {
        // Stack memory example
        int stackVar1 = 10;
        int stackVar2 = stackVar1;
        stackVar2 = 20;

        System.out.println("Stack Memory Example:");
        System.out.println("stackVar1: " + stackVar1); // Output: 10
        System.out.println("stackVar2: " + stackVar2); // Output: 20

        // Heap memory example
        StringBuilder heapObj1 = new StringBuilder("Hello");
        StringBuilder heapObj2 = heapObj1;
        heapObj2.append(" World");

        System.out.println("\nHeap Memory Example:");
        System.out.println("heapObj1: " + heapObj1); // Output: Hello World
        System.out.println("heapObj2: " + heapObj2); // Output: Hello World
    }

    public static void main(String[] args) {
        MemoryDemo demo = new MemoryDemo();
        demo.stackVsHeap();
    }
}
