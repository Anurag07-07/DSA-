package Bit_Manipulation;

import java.util.Scanner;

public class BitsatXandY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the X");
        int X  = sc.nextInt();
        System.out.println("Enter the Y");
        int Y = sc.nextInt();
        System.out.println("The Answer is "+((1<<X)|(1<<Y)));
    }
}
