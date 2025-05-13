package practice;

public class NonRepeat {
    public static int repeatele(int arr[] , int n ){
        for (int i = 0; i < n ; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < n ; j++) {
                if (i !=j  && arr[i] == arr[j]){
                    isDuplicate = true;
                    break;
                }

            }
            if (!isDuplicate){
                return arr[i];
            }
        }
        return  -1;


    }

    public static void main(String[] args) {
        int arr[] = {-1, 2, -1, 3, 0};
        int n = arr.length;

        System.out.print(repeatele(arr,n));
    }
}
