package string;

import java.util.Scanner;

public class StringDivdeN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String str = sc.nextLine();
        System.out.println("enter the n value divide");
        int N = sc.nextInt();

        int length = str.length();

        if (length%N != 0){
            System.out.println("cannot divide into" + N + "equal part");
            return;
        }
        int dividesize = length/N;
        for (int i = 0; i < length ; i+=dividesize) {
            String btr = str.substring(i,i+dividesize);
            System.out.println(btr);
            System.out.println(str.substring(i,i+dividesize));
        }
        sc.close();
    }
}
