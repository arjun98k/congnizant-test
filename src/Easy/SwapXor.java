package Easy;

public class SwapXor {
    public static void main(String[] args) {
        int x = 11;
        int y = 98;
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("the value of x is "+x +" " +"the value of y  is"+y);

    }
}
