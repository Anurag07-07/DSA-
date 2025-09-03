package Bit_Manipulation;

import java.util.Scanner;

public class BitatXandY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        System.out.println((1<<X)|(1<<Y));
    }
}
