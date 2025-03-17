package Easy;

public class SumofAlllarray {
    public static void main(String[] args) {
        int arr[] = {11,22,33};
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum +=arr[i];
        }
        System.out.println("sum of all element in array  " + sum);
    }
}
