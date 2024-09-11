package Array;

import java.util.HashMap;
import java.util.Map;

class SubarraySumEqualK {
    public static int subarraySum(int[] nums, int k) {

        Map<Integer,Integer> sumCountMap = new HashMap<>();
        sumCountMap.put(0,1);
        int res = 0;
        int sum = 0;
        for(int i = 0; i< nums.length; i++){
            sum += nums[i];
            if(sumCountMap.containsKey(sum-k)){
                res += sumCountMap.get(sum-k);
            }
            sumCountMap.put(sum,sumCountMap.getOrDefault(sum,0)+1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("res: " + subarraySum(new int []{-1,0,1},0));
    }
}