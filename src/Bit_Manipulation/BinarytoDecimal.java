package Bit_Manipulation;

import java.util.Scanner;

public class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();

        int ans = 0,power = 1;
        while (binary!=0){
            //Find the Last Digit
            int last = binary%10;
            ans = ans + last*power;
            power = power*2;
            binary/=10;
        }

        System.out.println("the Decimal Value is "+ans);
    }
}
