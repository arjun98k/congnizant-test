package Numbers;


import java.util.Scanner;

public class Lcmj {

    public static int lcm(int a, int b){
        int max = Math.max(a,b);
        while (true){
            if (max %a == 0 && max %b ==0){
                return max;
            } max = max + Math.max(a,b);
        }
    }
    public static void main(String[] args) {
       int a = 5;
       int b = 4;
        System.out.println(lcm(a,b));

    }
}
