package practice;

public class SumTotalNum {

    public  static int SumTotal(int num){
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum+=i;
        }
        return sum;

    }
    public static void main(String[] args) {
        System.out.println(SumTotal(3));
        System.out.println(SumTotal(5));
    }
}
