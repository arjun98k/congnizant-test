package Easy;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {11,22,1,56,12};
        int largarr = Integer.MIN_VALUE;
        int secondlag = Integer.MIN_VALUE;
        int thirdlarg = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // first largest
            if (arr[i] > largarr ){
                thirdlarg = secondlag;
                secondlag = largarr;
                largarr = arr[i];

            } else if (arr[i] > secondlag && arr[i]!= largarr) {
               thirdlarg = secondlag;
               secondlag = arr[i];
            } else if (arr[i] > thirdlarg && arr[i]!=secondlag  && arr[i] != largarr) {
                thirdlarg = arr[i];
            }


        }
        System.out.println(secondlag);
        System.out.println(thirdlarg);
    }
}
