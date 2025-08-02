package Strings;

public class StringFunctions {
    // Program always starts from the main method
    public static void main(String[] args) {
        // Initializing the strings
        String str1 = "Infoys Limited";
        String str2 = "Mysore DC";

        // Function 01 : "length()"
        int len1 = str1.length();
        int len2 = str2.length();
        System.out.println("Length of String1: " + len1);
        System.out.println("Length of String2: " + len2);

        // Function 02 : "Conversion Cases - toUpperCase(), toLowerCase()"
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        System.out.println("\nAfter converting to UPPER CASE:");
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        System.out.println("\nAfter converting to LOWER CASE:");
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);

        // Function 03 : contains()
        System.out.println();
        if (str1.contains("foys")) {
            System.out.println("str1 contains the sequence 'foys'");
        } else {
            System.out.println("str1 does NOT contain the sequence 'foys'");
        }

        // Function 04 : equals() and equalsIgnoreCase()
        System.out.println();
        String s1 = "Java";
        String s2 = "java";
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // false
        System.out.println("s1.equalsIgnoreCase(s2): " + s1.equalsIgnoreCase(s2)); // true

        // Function 05 : charAt()
        System.out.println();
        System.out.println("Character at index 2 in str1: " + str1.charAt(2));

        // Function 06 : indexOf()
        System.out.println("Index of 'y' in str1: " + str1.indexOf('y'));

        // Function 07 : substring()
        System.out.println();
        System.out.println("Substring of str2 from index 2: " + str2.substring(2));
        System.out.println("Substring of str2 from index 0 to 6: " + str2.substring(0, 6));

        // Function 08 : replace()
        System.out.println();
        String replaced = str1.replace("infoys", "infosys");
        System.out.println("After replace: " + replaced);

        // Function 09 : trim()
        String withSpaces = "   Welcome to Infosys   ";
        System.out.println("\nBefore trim: '" + withSpaces + "'");
        System.out.println("After trim: '" + withSpaces.trim() + "'");

        // Function 10 : startsWith() and endsWith()
        System.out.println();
        System.out.println("str2 starts with 'mys': " + str2.startsWith("mys")); // true
        System.out.println("str2 ends with 'DC': " + str2.endsWith("DC")); // false (since it's in lowercase)

        // Function 11 : isEmpty()
        System.out.println();
        String emptyStr = "";
        System.out.println("Is emptyStr empty? " + emptyStr.isEmpty());

        // Function 12 : split()
        System.out.println();
        String sentence = "Welcome to Infosys Mysore DC";
        String[] words = sentence.split(" ");
        System.out.println("Splitting sentence into words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
