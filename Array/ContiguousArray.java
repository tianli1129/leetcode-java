package Array;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

    public static int findMaxLength(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        int maxLen = 0;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            if(map.containsKey(sum)){
                maxLen = Math.max(maxLen,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println("res: " + findMaxLength(new int []{0,0,1}));
    }
}
