package Matrix;

public class IdentityMatrix {
    public static boolean identity(int mat[][]  ){
        int n = mat.length;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j && mat[i][j] != 1 || i!=j && mat[i][j] != 0){
                    return  false;
                }
            }
        } return true;
    }

    public static void main(String[] args) {
        int mat[][] = {
                {1,0,0},
                {0,1,0},
                {0,0,1}
        };
        System.out.println(  identity(mat));
    }
}
