package Matrix;

import java.util.Scanner;

public class MultiMatrix {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter matrix rows and column for mat1");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int [][] one = new int[r1][c1];
        for (int i = 0; i < one.length ; i++) {
            for (int j = 0; j <one[i].length ; j++) {
                one[i][j]= sc.nextInt();
            }
        }
        System.out.println("enter matrix rows and column for mat2");


        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int [][] two = new int[r2][c2];
        for (int i = 0; i < two.length ; i++) {
            for (int j = 0; j <two[i].length ; j++) {
                two[i][j]= sc.nextInt();
            }
        }
        if ( c1 != r2){
            System.out.println("invalid"); return;
        }
        int[][] prod = new int[r1][c2];
        for (int i = 0; i < prod.length ; i++) {
            for (int j = 0; j < prod[i].length ; j++) {
                for (int k = 0; k < c1 ; k++) {
                    prod[i][j] += one[i][k] * two[k][j];
                } 
            }
        }
        for (int i = 0; i < prod.length ; i++) {
            for (int j = 0; j < prod[i].length ; j++) {
                System.out.print(prod[i][j] + " ");
            }
            System.out.println();
        }
    }
}
