package Easy;

public class equilibrium {

    public static int FindEquil(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            int leftsum = 0;
            for (int j = 0; j < i; j++) {
                leftsum+=arr[j];
            }
            int rightsum = 0;
            for (int j = i+1; j < arr.length ; j++) {
                rightsum +=arr[j];
            }
            if (leftsum == rightsum){
                return i;
            }
        } return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(FindEquil(arr));
    }
}
