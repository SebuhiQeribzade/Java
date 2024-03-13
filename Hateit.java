package Canser;

public class Hateit {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        // Calculate the total weight that can be achieved with the given big and small bags
        int totalWeight = bigCount * 5 + smallCount;

        // If the total weight is less than the goal, return false
        if (totalWeight < goal) {
            return false;
        }

        // If the goal is evenly divisible by 5 (the weight of a big bag), or
        // if the goal is less than the weight of a big bag, return true
        if (goal % 5 == 0 || goal <= bigCount * 5) {
            return true;
        }

        // Otherwise, check if it's possible to achieve the goal using both big and small bags
        // without exceeding the goal weight
        return (goal - bigCount * 5) <= smallCount;
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println(canPack(2, 0, 9));  // Output: false
        System.out.println(canPack(1, 5, 9));  // Output: true
        System.out.println(canPack(0, 5, 9));  // Output: false
        System.out.println(canPack(1, 0, 4));  // Output: false
        System.out.println(canPack(2, 2, 12)); // Output: true
    }
}