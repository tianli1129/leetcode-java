package Array;

import Util.Util;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        int [] res = new int [nums.length];
        for(int i = 0; i<nums.length; i++){
            int newIndex = (i+k)%nums.length;
            res[newIndex] = nums[i];
        }
        for(int i = 0; i<nums.length; i++){
            nums[i] = res[i];
        }
    }

    public static void main(String[] args) {
        int [] nums = new int []{1,2,3,4,5,6,7};
        rotate(nums,3);
        Util.print1DArray(nums);
    }
}
