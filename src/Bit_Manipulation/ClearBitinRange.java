package Bit_Manipulation;

import java.util.Scanner;

public class ClearBitinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        int A = -1<<(i+1);
        int B = (1<<j)-1;
        int mask = (A | B)&no ;
        System.out.println("The Answer is "+mask);
    }
}
