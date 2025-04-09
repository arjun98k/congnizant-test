package Sort;

public class LinearSort {
    public static  int linear(int[] arr ,int x){
        for (int i = 0; i <arr.length ; i++) {
            if (x == arr[i]){
                System.out.println("given element found");
                System.out.println(i);
            }
        }
        System.out.println("-1");
        return -1;
    }
    public static void main(String[] args) {
     linear(new int[]{11, 22, 33, 11, 33, 14},0);
    }
}
