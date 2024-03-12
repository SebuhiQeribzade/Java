package ADSIZ1;
public class ders15 {
    public static void main(String[] args) {
        // Define and initialize variables of primitive types
        int intValue = 10;
        double doubleValue = 3.14;
        boolean booleanValue = true;
        char charValue = 'A';

        // Primitiv tipin dəyərlərini göstəririk
        System.out.println("Primitive Type Values:");
        System.out.println("int: " + intValue);
        System.out.println("double: " + doubleValue);
        System.out.println("boolean: " + booleanValue);
        System.out.println("char: " + charValue);
        System.out.println();

        // Referans tiplərindən(String) istifadə eden klas yaradırıq ve onun əməliyyatlarını göstəririk
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2; // Bir-biri ilə əlaqəli string-lər
        int strLength = str3.length(); // String-in uzunluğunu alrırq
        String upperCaseStr = str3.toUpperCase(); // Böyük hərfə çeviririk

        // string əməliyyatlarırını göstəririk
        System.out.println("String Operations:");
        System.out.println("Concatenated String: " + str3);
        System.out.println("String Length: " + strLength);
        System.out.println("Uppercase String: " + upperCaseStr);
    }
}
