package Task;

public class Task1 {
        public static void main(String[] args) {
            // Creating an object of the String class
            String str1 = new String("Hello");

            // Assigning the reference of str1 to str2
            String str2 = str1;

            // Modifying the value through str2
            str2 = str2.concat(" World");

            // Printing both str1 and str2
            System.out.println("str1: " + str1); // Output: str1: Hello
            System.out.println("str2: " + str2); // Output: str2: Hello World
        }
    }

