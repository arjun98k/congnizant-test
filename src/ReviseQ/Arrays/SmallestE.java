package ReviseQ.Arrays;

import java.util.Arrays;

public class SmallestE {
    public static void main(String[] args) {
        int arr[] = {98 ,87,1,3,66};
        Arrays.stream(arr).sorted().forEach(System.out::println);

//        int small = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (small>arr[i]){
//                small = arr[i];
//            }
//        }
//        System.out.println(small);

    }
}
