package Assignment_6.CombinationSumII;

import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> li = new ArrayList<>();
        Arrays.sort(candidates);
        getCombinations(li, candidates, target, new ArrayList<>(), 0);
        return li;
    }

    public static void getCombinations(List<List<Integer>> li, 
    int[] arr, 
    int total, 
    List<Integer> temp, 
    int idx){
        if(total == 0){
            li.add(new ArrayList<>(temp));
            return;
        }
        for(int i = idx; i < arr.length; i++){

            if(i > idx && arr[i] == arr[i-1]) continue;
            if (arr[i] > total) break;
           
            temp.add(arr[i]);
            getCombinations(li, arr, total - arr[i], temp, i + 1);
            
             temp.remove(temp.size() - 1);
        }
       
    }

}
