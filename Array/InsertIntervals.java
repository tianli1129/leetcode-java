package Array;

import Util.Util;

import java.util.ArrayList;
import java.util.List;

public class InsertIntervals {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        for(int i = 0; i<intervals.length; i++){
            if (newInterval[1]<intervals[i][0]){
                res.add(newInterval);
                for (int j = i; j<intervals.length; j++){
                    res.add(intervals[j]);
                }
                return res.toArray(new int [res.size()][2]);
            }else if (intervals[i][1]>=newInterval[0]){
                newInterval = new int []{Math.min(intervals[i][0],newInterval[0]),Math.max(intervals[i][1],newInterval[1])};
            }else{
                res.add(intervals[i]);
            }
        }
        res.add(newInterval);
        return res.toArray(new int [res.size()][2]);
    }

    public static void main(String[] args) {
        int [][] res = InsertIntervals.insert(new int [][]{{1,3},{6,9}},new int []{2,5});
        Util.print2DArray(res);
    }
}
