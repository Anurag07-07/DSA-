package Bit_Manipulation;

import java.util.Scanner;

public class SetIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int i = sc.nextInt();
        int mask = 1<<i;
        int ans = no|mask;
        System.out.println("The Value is "+ans);
    }
}
