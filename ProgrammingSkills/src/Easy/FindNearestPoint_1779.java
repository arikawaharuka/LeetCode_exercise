package Easy;

public class FindNearestPoint_1779 {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minIndex=-1;
        int minDistance=Integer.MAX_VALUE;
        for (int i=0;i<points.length;i++){
            if (x==points[i][0]||y==points[i][1]){
                int result=Math.abs(x-points[i][0])+Math.abs(y-points[i][1]);
                if (result<minDistance){
                    minDistance=result;
                    minIndex=i;
                }
            }
        }
        return minIndex;
    }
}
