package Easy;

public class LeftandRight {

    public static  int Sol(int[] arr){

        for (int i = 0; i < arr.length ; i++) {
            // find  max element in right side

            int left = Integer.MIN_VALUE;
            for (int j = 0; j < i ; j++) {
                left = Math.max(left,arr[j]);
            }
            // find min element on right side
            int right = Integer.MAX_VALUE;
            for (int j = i+1; j < arr.length ; j++) {
                right = Math.min(right, arr[j]);
            }
            // the condition left small and then right side greater
            if (arr[i] >= left && arr[i] <= right){
               return arr[i];
            }

        }  return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 3, 6, 8, 10, 7, 9};
        System.out.println(Sol(arr));
    }
}
