package Matrix;

public class EquallMatrix {
    public static void main(String[] args) {
        int mat1[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int mat2[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int row1 = mat1.length;
        int col1 = mat1[0].length;
        int row2 = mat2.length;
        int col2 = mat2[0].length;
        boolean flag = true;
        if (row1 == row2 && col1 == col2){
            for (int i = 0; i < mat1.length ; i++) {
                for (int j = 0; j < mat2[0].length ; j++) {

                    if (mat1[i][j] != mat2[i][j]){
                         flag = false;
                         break;


                    }
                }
            }if (flag == true){
                System.out.println("matrix is equal");
            } else {
                System.out.println("matrix not equal");
            }
        }

  }
}
