package Strings;

public class Convert_the_String_intoLowerCase {
    //Program always start with the Main method
    public static void main(String[] args) {
        String str = "GIT-HUB";
        str.toLowerCase(); // This has no effect since strings are immutable and the result is not assigned
        String str2=str.toLowerCase();
        System.out.println("Before "+str);// it gives "GIT_HUB"
        System.out.println("After "+str2); // it gives "git-hub"
    }
}
