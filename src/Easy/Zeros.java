package Easy;

public class Zeros {
    public static void main(String[] args) {
        int count_zero = 0;

        int arr[] = {1,0,0,1,0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                count_zero += 1;
            }
        }
        System.out.println(count_zero);
    }

}
