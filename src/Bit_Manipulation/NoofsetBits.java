package Bit_Manipulation;

import java.util.Scanner;

public class NoofsetBits {
    public static void Brute(int no) {
        int cnt = 0;
        while (no!=0){
            int rem = no%2;
            cnt+=rem;
            no/=2;
        }

        System.out.println("The Total Set Bit is "+cnt);
    }

    public static void BIT_Manipulation(int no) {
        int cnt = 0;
        while(no!=0){
            cnt = cnt + (no&1);
            no = no>>1;
        }

        System.out.println("The Total Set Bits is "+cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int no = sc.nextInt();
        Brute(no);
        BIT_Manipulation(no);
    }
}
