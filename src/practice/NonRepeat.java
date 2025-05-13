package practice;

public class NonRepeat {
    public static int nonrepeatele(int arr[] , int n ){
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
    public static int repeate(int arr[] , int n ){
        for (int i = 0; i < n ; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < n ; j++) {
                if (i !=j  && arr[i] == arr[j]){
                   return arr[i];
                }

            }

        }
        return  -1;


    }

    public static void main(String[] args) {
        int arr[] = {0, 2, 0, 3, 0};
        int n = arr.length;

        System.out.println(nonrepeatele(arr,n));
        System.out.println(repeate(arr,n));
    }
}
