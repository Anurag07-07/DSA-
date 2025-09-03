package Bit_Manipulation;

import java.util.Scanner;

public class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0,power = 1;
        while (n!=0){
            int last = n%10;
            ans = ans + last*power;
            power = power*2;
            n /= 10;
        }

        System.out.println("the Number is " + ans);
    }
}
