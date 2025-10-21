package Assignment_10.CarFleet;

import java.util.*;
class Solution {
    public int calculate(String s) {
        Stack<Integer> sp = new Stack<>();
        char prev = ' ';
        int num = 0;
        int i = 0;
        while(i < s.length()) {
            char c = s.charAt(i);
            if(Character.isDigit(c)) {
                num = num * 10 + Integer.parseInt(s.substring(i,i+1));
            }
            else if(c == '+' || c == '-' || c == '*' || c == '/') {
                if(prev == '*') {
                    int val = sp.pop() * (num );
                    sp.push(val);
                }
                else if(prev == '/') {
                    sp.push(sp.pop() / num);
                }
                else if(prev == '-'){
                    sp.push(-num);
                }
                else {
                    sp.push(num);
                }
                num = 0;
                prev = c;
            }
            i++;
        }
        // System.out.print(num);
        if(prev == '*') {
            int val = sp.pop() * num ;
            sp.push(val);
        }
        else if(prev == '/') {
            sp.push(sp.pop() / num);
        }
        else if(prev == '-'){
            sp.push(-num);
        }
        else {
            sp.push(num);
        }
        
        int j = 0;
        int len = sp.size();
        int out = 0;
        while(j < len) {
            out = out + sp.pop();
            j++;
        }

        return out;

    }
}