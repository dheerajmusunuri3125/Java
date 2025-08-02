package Strings;

public class Palindrome {

    public static void main(String[] args) {
        String str="Dheeraj";
        String res ="";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            res+=ch;
        }
        System.out.println(res);
        if(str.equalsIgnoreCase(res)){
            System.out.println("String is a Palindrome : "+str);
        }else{
            System.out.println("Stirng is not a palindrome : "+str+ " "+res);
        }
    }
}
