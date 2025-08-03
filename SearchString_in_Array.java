package Strings;

import java.util.Scanner;

public class SearchString_in_Array {
    public static void main(String[] args) {
        int size = 5;
        Scanner s=new Scanner(System.in);
        String []sarray=new String[size];
        System.out.println("Enter the Elements in Array : ");
        for (int i = 0; i < size; i++) {
            sarray[i]=s.next();
        }
        System.out.println("Enter the Search Word ");
        String search=s.next();
        int index=0;
        boolean istrue= false;
        for (int j = 0; j < size; j++) {
            if(search.equalsIgnoreCase(sarray[j])){
                istrue=true;
                index=j;
                break;
            }
        }
        if(istrue){
            System.out.println("Element Found at index : "+index);
        }else {
            System.out.println("Element not Found : "+search);
        }
    }
}
