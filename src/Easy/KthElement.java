package Easy;

public class KthElement {
public static void kelement(int arr[],int k){
    if (k < 1 || k > arr.length){
        System.out.println("invalid k value");
        return ;
    }
    // calculate position of the kth element from the end
    int n =arr.length;
    int kthfromend = n-k;

    int temp = arr[k-1];
    arr[k-1] = arr[kthfromend];
    arr[kthfromend] = temp;


    for (int i = 0; i < arr.length ; i++) {
        System.out.print( " " + arr[i]);
    }

}

    public static void main(String[] args) {
      int arr[] = {1,2,3,4};
       kelement(arr,2);
    }
}
