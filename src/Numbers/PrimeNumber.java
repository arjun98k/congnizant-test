package Numbers;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numfin = sc.nextInt();
        boolean isPrime = true;
        if (numfin < 1) {
            System.out.println("not prime number");

        } else { for (int i = 0; i <= numfin/2; i++) {
           if (numfin %2 == 0){
               isPrime = false;
               break;
           }
        }  if (isPrime){
            System.out.println(" give num is prime");
        } else {
            System.out.println("not prime number");
        }
            
        }
    }
}
