package practice;

public class SumNum {
    public static int Sumnumm(int n){
        int sum = 0;
        while (n != 0){
            // get last digit
            int last = n%10;

            sum = sum + last;

            // remove last digit
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(Sumnumm(1234));
    }
}
