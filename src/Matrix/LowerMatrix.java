package Matrix;

public class LowerMatrix {
    public static void main(String[] args) {
        int mat[][] = {
                {1,2,3},
                {8,5,6},
                {4,7,9}
        };
        int row = mat.length;
        int col = mat[0].length;
        if (row != col){
            System.out.println("given matrix not equal");
        } else {
            for (int i = 0; i <row ; i++) {
                for (int j = 0; j < col ; j++) {
                    if (i < j){
                        System.out.print("0 ");
                    } else {
                        System.out.print(mat[i][j] + " ");
                    }
                }
                System.out.println(" ");
            }
        }
    }
}
