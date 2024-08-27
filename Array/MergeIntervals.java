package Array;

import Util.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
     public static int[][] merge(int[][] intervals) {
         Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
         List<int[]> res = new ArrayList<>();
         int [] newInterval = intervals[0];
         for(int i = 1; i<intervals.length; i++){
            if(newInterval[1]>=intervals[i][0]){
                newInterval = new int []{Math.min(intervals[i][0],newInterval[0]),Math.max(intervals[i][1],newInterval[1])};
            }else {
                res.add(newInterval);
                newInterval = intervals[i];
            }
         }
         res.add(newInterval);
         return res.toArray(new int [res.size()][2]);
     }

    public static void main(String[] args) {
        int [][] res = merge(new int [][]{{1,3},{2,6},{8,10},{15,18}});
        Util.print2DArray(res);
    }
}
