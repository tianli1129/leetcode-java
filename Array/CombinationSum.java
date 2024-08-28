package Array;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> res = new ArrayList<>();
         List<Integer> temp = new ArrayList<>();
         backtrack(res,temp,candidates,target,0);
         return res;
    }

    private static void backtrack(List<List<Integer>> res, List<Integer> temp, int [] candidates, int target, int startIndex){
        if(target < 0) {
            return;
        }
        if(target == 0){
            res.add(new ArrayList<>(temp));
        }else{
            for(int i = startIndex; i<candidates.length; i++){
                temp.add(candidates[i]);
                backtrack(res,temp,candidates,target-candidates[i],i);
                temp.remove(temp.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("res: " + combinationSum(new int []{2,3,6,7},8));
    }
}
