package Easy;

public class MatrixDiagonalSum_1572 {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for (int i = 0,j=mat.length-1; i < mat.length; i++,j--) {
            if (i==j){
                sum+=mat[i][j];
            }else {
                sum=sum+mat[i][i]+mat[i][j];
            }
        }
        return sum;
    }
}
