package Bit_Manipulation;

import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int ans = 0,power = 1;
        while (n!=0){
            int rem = n%2;
            ans = ans + rem*power;
            power = power*10;
            n/=2;
        }

        System.out.println("The Binary Value is "+ans);
    }
}
