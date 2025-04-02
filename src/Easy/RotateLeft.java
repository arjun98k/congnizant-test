package Easy;

public class RotateLeft {
    public static void rotatearr(int arr[], int d){
        int length = arr.length;
        for (int i = 0; i < d ; i++) {
        int temp = arr[0];
            for (int j = 0; j <length -1 ; j++) {
                arr[j] = arr[j+1];
            }
            arr[length -1]= temp;
        }
    }

    public static void main(String[] args) {
      int arr[] = {1,2,3,4,5,6};
      int d =2;
        System.out.println("before shift array");
      for (int n2: arr){
          System.out.print(n2 + " ");
      }
        System.out.println();
        rotatearr(arr ,d);
        System.out.println("after shift array");
        for (int n1 : arr){
            System.out.print(n1 + " ");
        }
    }
}
