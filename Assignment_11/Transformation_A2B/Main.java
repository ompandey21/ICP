package Assignment_11.Transformation_A2B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long target = sc.nextLong();
        List<Long> res = new ArrayList<>();
        boolean ans = fun(new ArrayList<>(), res, n, target);

        if(ans){
            System.out.println("YES");
            System.out.println(res.size());

            for(long a : res){
                System.out.print(a+" ");
            }
            return;
        }
        System.out.println("NO");

    }
    public static boolean fun(List<Long> temp, List<Long> res, long a, long b){
        if(a > b) return false;
        temp.add(a);
        if(a == b){
            
            for(long n : temp) res.add(n);

            return true;
        }
        
        boolean x = fun(temp, res, a*10 + 1, b);
        boolean y = fun(temp, res, 2 * a, b);
        temp.remove(temp.size() - 1);
        return x || y;
    }
}