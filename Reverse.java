package Strings;

public class Reverse {
    public static void main(String[] args) {
        String str="Dheeraj";
        String res="";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            res+=ch;
        }
        System.out.println("Reverse of the String : "+ res);
    }
}
