package Matrix;

public class UpperMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
      int  row = mat.length;
      int col = mat[0].length;
      if (row!=col){
          System.out.println("matrix not equal");
      }else {
          for (int i = 0; i < row; i++) {
              for (int j = 0; j < col ; j++) {
                  if (j< i) {
                      System.out.print("0 ");
                  } else {
                      System.out.print(mat[i][j] + " ");
                  }
              }
              System.out.println("");
          }
      }
    }
}
