package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        /*prevent the same combination from being added*/
        HashSet<List<Integer>> res = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            /*prevent the same number from being used as the first element*/
            if(i>0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    res.add(temp);
                    left++;
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return new ArrayList<>(res);
    }

    public static void main(String[] args) {

        System.out.println("res: " + threeSum(new int []{1,-1,-1,0}));

    }
}
