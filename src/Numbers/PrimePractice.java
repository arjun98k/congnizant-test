package Numbers;

import java.util.Scanner;

public class PrimePractice {
    public static boolean checknum(int num){
        if (num <= 1){
           return false;
        } else {
            for (int i = 2; i <=Math.sqrt(num) ; i++) {
                 if (num%i == 0){
                     return false;
                 }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter the prime number to check  " );
        int num = ac.nextInt();
        System.out.println(checknum(num));


    }
}
