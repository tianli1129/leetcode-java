package Array;

import Util.Util;

public class SortColors {
    public static void sortColors(int[] nums) {
        int [] freq = new int [3];
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                freq[0]++;
            }else if(nums[i] == 1){
                freq[1]++;
            }else{
                freq[2]++;
            }
        }
        int index = 0;
        for(int i = 0; i<freq[0]; i++){
            nums[index] = 0;
            index++;
        }
        for(int i = 0; i<freq[1]; i++){
            nums[index] = 1;
            index++;
        }
        for(int i = 0; i<freq[2]; i++){
            nums[index] = 2;
            index++;
        }
    }

    public static void main(String[] args) {
        int [] nums = new int []{2,0,2,1,1,0};
        sortColors(nums);
        Util.print1DArray(nums);
    }
}
