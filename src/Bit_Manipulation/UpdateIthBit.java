package Bit_Manipulation;

import java.util.Scanner;

public class UpdateIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int i = sc.nextInt();
        int value = sc.nextInt();

        //Make the bit at i as zero whatever it is
        int mask = ~(1<<i);
        int ans = no & mask;

        //Now I have to Update the Value at Ith position
        ans = ans | (value<<i);

        System.out.println("The Answer is "+ans);
    }
}
