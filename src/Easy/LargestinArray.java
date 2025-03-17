package Easy;

public class LargestinArray {
    public static void main(String[] args) {
        int arr[] = {10,20,80,30,40};
        int largestarr = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] > largestarr){
                largestarr = arr[i];
            }


        }  System.out.println(largestarr);

    }
}
