package Easy;

public class Plandronicarray {
    public static boolean isPalindrome(int n){
       String strnum = Integer.toString(n);

       String revstr = new StringBuilder(strnum).reverse().toString();
       return strnum.equals(revstr);

    }

    public static boolean Allarraycheck(int arr[]) {
        for (int num: arr) {
            if (!isPalindrome(num)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
  int arr[] = {111, 121, 222, 333, 441};
        System.out.println(Allarraycheck(arr));
    }
}
