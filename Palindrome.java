
public class Palindrome {

    // Main method – program starts here
    public static void main(String[] args) {

        String str = "Dheeraj"; // Initializing the string to 'str'
        String res = "";        // Creating an empty string to store the reversed string

        // Loop runs from the end of the string to the beginning
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i); // Extracting each letter from the string (starting from the last)
            res += ch;               // Adding the character to the reversed string
        }

        // Checking if both strings are equal ignoring case
        if (str.equalsIgnoreCase(res)) {
            System.out.println("String is a Palindrome: " + str);
        } else {
            System.out.println("String is not a Palindrome: " + str + " | Reversed: " + res);
        }
    }
}


// equalsIgnoreCase is a function that checks whether two strings are equal, ignoring case.
// charAt(i) returns the character present at index i in the string.

// LOOP Iterations (for str = "Dheeraj")

// Iteration 1:
// i = 6 --> str.charAt(6) = 'j'
// res = "" + 'j' = "j"

// Iteration 2:
// i = 5 --> str.charAt(5) = 'a'
// res = "j" + 'a' = "ja"

// Iteration 3:
// i = 4 --> str.charAt(4) = 'r'
// res = "ja" + 'r' = "jar"

// Iteration 4:
// i = 3 --> str.charAt(3) = 'e'
// res = "jar" + 'e' = "jare"

// Iteration 5:
// i = 2 --> str.charAt(2) = 'e'
// res = "jare" + 'e' = "jaree"

// Iteration 6:
// i = 1 --> str.charAt(1) = 'h'
// res = "jaree" + 'h' = "jareeh"

// Iteration 7:
// i = 0 --> str.charAt(0) = 'D'
// res = "jareeh" + 'D' = "jareehD"

// Final Result:
// Original string: "Dheeraj"
// Reversed string: "jareehD"
// Since they are not the same, it's NOT a palindrome.
