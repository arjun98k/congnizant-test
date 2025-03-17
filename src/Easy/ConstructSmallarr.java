package Easy;

public class ConstructSmallarr {
    public static void main(String[] args) {
        int arr[] = {12, 1,2,3,0,11,4};
        int countsmall[] = new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    count++;
                }
            }

            countsmall[i] = count;
        }
            for(int num : countsmall){
                System.out.println(num);
            }
        }
    }



