package ReviseQ.Arrays;

public class LargestE {
    public static void main(String[] args) {
        int arr[] = {22,34,98,1,2};
        int large = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> large){
                large = arr[i];
            }
        }
        System.out.println(large);
    }
}
