package Easy;

public class ReshapeMatrix_0566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (r*c!=mat.length*mat[0].length){
            return mat;
        }
        int[][] reshapeMatrix=new int[r][c];
        int count=0;
        int row=0,column=0,i=0,j=0;
        while (count!=(r*c)){
            if (c==column){
                row++;
                column=0;
            }
            if (j==mat[i].length){
                j=0;
                i++;
            }
            reshapeMatrix[row][column]=mat[i][j];
            j++;
            column++;
            count++;
        }
        return reshapeMatrix;
    }
    //
   /* public int[][] matrixReshape_2(int[][] mat, int r, int c) {
        if (r*c!=mat.length*mat[0].length){
            return mat;
        }
        int[][] reshapeMatrix=new int[r][c];
        int n=mat[0].length;
        for (int count=0;count<r*c;count++){
            reshapeMatrix[count/c][count%c]=mat[count/n][count%n];
        }
        return reshapeMatrix;
    }*/

}
