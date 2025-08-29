package Bit_Manipulation;

import java.util.Scanner;

public class ClearLastBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int i = sc.nextInt();
        System.out.println((no>>i)<<i);
    }
}
