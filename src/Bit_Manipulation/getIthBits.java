package Bit_Manipulation;

import java.util.Scanner;

public class getIthBits {

    public static void Brute_Right(int n,int i) {
        int ans = (n>>(i-1)&1);
        System.out.println(ans);
    }

    public static void Brute_Left(int n,int i) {
        int mask = 1<<(i-1);
        int ans = mask & n;
        if (ans !=0) System.out.println("1");
        else System.out.println("0");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
//        Brute_Right(n,i);
        Brute_Left(n,i);
    }
}
