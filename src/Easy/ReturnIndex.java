package Easy;

public class ReturnIndex {
    public static void main(String[] args) {
        int arr[] = {1,12,13,45,76};
        int element = 76;
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]){
                System.out.println("return index is " + i);
            }
        }
    }
}
