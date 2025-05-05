package practice;

public class RotateArray {

    static void righro(int rotarr[],int k){
        int n = rotarr.length;
        k = k % n;
        for (int i = 0; i < k ; i++) {
            int lastele = rotarr[n-1];
            for (int j = n-1; j > 0; j--) {
                rotarr[j] = rotarr[j-1];
            }
            rotarr[0] = lastele;
        }
    }

    public static void main(String[] args) {
        int rotarr [] = {3,24,5,6,7};
        int k=1;


       righro(rotarr,k);
        for (int j : rotarr){
            System.out.print(j + " ");
        }


    }
}
