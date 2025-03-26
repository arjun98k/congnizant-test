package Matrix;

import java.util.Scanner;

public class Matrix1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       while (true){

           System.out.println("Enter rows and columns of the matrix (or type 'exit' to quit):");

           // Check if the user wants to exit before taking integer input
           if (!sc.hasNextInt()) {
               String exitCommand = sc.next().trim();
               if (exitCommand.equalsIgnoreCase("exit") || exitCommand.equalsIgnoreCase("Y")) {
                   System.out.println("Thank you! Exiting...");
                   break;
               } else {
                   System.out.println("Invalid input! Please enter a valid number or type 'exit' to quit.");
                   continue;  // Skip this loop iteration and ask again
               }
           }

           System.out.println("enter rows and column matrix  you want");
           int row = sc.nextInt();
           int col = sc.nextInt();
           int arr [][]= new int[row][col];
           for (int i = 0; i < row; i++) {
               for (int j = 0; j <col ; j++) {
                   arr[i][j] = sc.nextInt();
               }
           }
           for (int i = 0; i <arr.length ; i++) {
               for (int j = 0; j <arr[i].length ; j++) {
                   System.out.print(arr[i][j] + " ");
               }
               System.out.println();
           }

       }
    }
}
