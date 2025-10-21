import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++)
            map.put(nums2[i], i);
        nums2 = nextGreater(nums2,  n);
   

        

        int i  =0;
        for(int a : nums1){
            nums1[i++] = nums2[map.get(a)];
        }
       
        return nums1;

    }
    public int[] nextGreater(int[] arr, int n){

        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        for(int i = n-1; i>= 0; i--){
            while( !st.isEmpty() && st.peek() < arr[i] ) st.pop();
            if(st.isEmpty()){
                res[i] = -1;
            }
            else{
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }
    

}