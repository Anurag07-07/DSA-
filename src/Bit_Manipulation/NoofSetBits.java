package Bit_Manipulation;

import java.util.Scanner;

public class NoofSetBits {


    public static void Brute(int n) {
        int ans = 0;
        while(n!=0){
            int rem = n%2;
            ans += rem;
            n/=2;
        }

        System.out.println(ans);
    }

    public static void Bit_Brute(int n) {
        int ans = 0;
        while(n!=0){
            int rem = n&1;
            ans += rem;
            n=n>>1;
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Brute(n);
        Bit_Brute(n);
    }
}
