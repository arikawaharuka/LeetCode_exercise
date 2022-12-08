package Easy;

public class CheckStraightLine_1232 {
    public boolean checkStraightLine(int[][] coordinates) {
        int x0=coordinates[0][0];
        int y0=coordinates[0][1];
        int x1=coordinates[1][0];
        int y1=coordinates[1][1];
        for (int i = 2; i < coordinates.length; i++) {
            if ((coordinates[i][0]-x0)*(y1-y0)!=(coordinates[i][1]-y0)*(x1-x0)){
                return false;
            }
        }
        return true;
    }
}
