package Numbers;

import java.util.Scanner;

public class PositiveAndNegative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number you want to check ");
        int num = sc.nextInt();

        if (num > 0){
            System.out.println("Given number is positive:  " + num);
        } else if (num < 0) {
            System.out.println("Given number is negative:  " + num );
        } else {
            System.out.println("Given number is zero");
        }
        sc.close();
    }
}
