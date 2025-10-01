package Assignment_5.BoatsToSavePeople;

import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int res = 0;
        while(left <= right){
            if(people[left] + people[right] <= limit) left++;
            right--;
            res++;
        }
        return res;
    }
}
