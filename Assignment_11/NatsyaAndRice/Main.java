package Assignment_11.NatsyaAndRice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int minPossible = (a - b)*n;
            int maxPossible = (a + b)*n;
            boolean ans = maxPossible >= (c - d) && minPossible <= (c + d);

            System.out.println(ans);
        }
        sc.close();
    }
    
}
