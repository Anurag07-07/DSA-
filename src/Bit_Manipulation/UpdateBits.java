package Bit_Manipulation;

import java.util.Scanner;

public class UpdateBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int value = sc.nextInt();

        int clearBit = (~(1<<i))&n;
        int update = (value<<i) | clearBit;

        System.out.println(update);
    }
}
