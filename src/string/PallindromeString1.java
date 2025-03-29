package string;

import java.util.Scanner;

public class PallindromeString1 {
    public static void main(String[] args) {
        String original ="";
        String reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string to identity that is plaindrome");
        original = sc.next();
        for (int i = original.length()-1; i >=0  ; i--) {
            reverse += original.charAt(i);
        }
        if (original.equalsIgnoreCase(reverse)){
            System.out.println("given string is palindrome");
        } else {
            System.out.println("given string not palindrome");
        }
    }
}
