package Array;

import Util.Util;

public class ProductOfArray {

    public static int[] productExceptSelf(int[] nums) {

        int [] left = new int [nums.length];
        left[0] = 1;
        for(int i = 1; i<nums.length; i++){
            left[i] = left[i-1]*nums[i-1];
        }
        int [] right = new int [nums.length];
        right[nums.length-1] = 1;
        for(int j = nums.length-2; j>=0; j--){
            right[j] = right[j+1]*nums[j+1];
        }
        int [] res = new int [nums.length];
        for(int k = 0; k<nums.length; k++){
            res[k] = left[k]*right[k];
        }
        return res;
    }

    public static void main(String[] args) {
        Util.print1DArray(productExceptSelf(new int []{1,2,3,4}));
    }

}


