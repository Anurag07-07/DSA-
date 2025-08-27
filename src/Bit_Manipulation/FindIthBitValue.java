package Bit_Manipulation;

import java.util.Scanner;

public class FindIthBitValue {
    public static void Brute(int no,int i) {
        System.out.println("The Bit is "+((no>>i)&1));
    }

    public static void Using_leftShift(int no,int i) {

        int mask = 1 << i;
        int ans = no & mask;
        if (ans != 0)
            System.out.println("The Bit is 1");
        else
            System.out.println("The Bit is 0");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int no = sc.nextInt();
        System.out.println("Enter The Index");
        int i = sc.nextInt();
        Brute(no,i);
        Using_leftShift(no,i);
    }
}
