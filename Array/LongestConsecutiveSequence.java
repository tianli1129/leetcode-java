package Array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int num: nums){
            set.add(num);
        }
        int longestCount = 0;

        for(int num: nums){
            int curCount = 1;
            if(!set.contains(num-1)){
                while (set.contains(num+1)){
                    num = num+1;
                    curCount ++;
                }
                longestCount = Math.max(curCount,longestCount);
            }
        }
        return longestCount;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int []{100,4,200,1,3,2}));
    }
}
