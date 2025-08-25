package Bit_Manipulation;

import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        int ans = 0,power = 1;
        while (no!=0){
            //Find the Remainder
            int rem = no%2;
            //add rem to the ans by multiplying with the power of 10 on each step
            ans = ans + rem*power;
            //Increase the power of power
            power = power*10;
            no/=2;
        }

        System.out.println("The Binary Value is "+ans);
    }
}
