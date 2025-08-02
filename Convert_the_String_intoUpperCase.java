package Strings;

public class Convert_the_String_intoUpperCase {
    //Program always start with the Main method
    public static void main(String[] args) {
        String str = "git-hub";
        str.toUpperCase(); // This has no effect since strings are immutable and the result is not assigned
        String str2=str.toUpperCase();
        System.out.println("Before "+str);// it gives "git-hub"
        System.out.println("After "+str2); // it gives "GIT_HUB"
    }
}
