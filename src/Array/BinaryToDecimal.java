package Array;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int no = sc.nextInt();
        int ans = 0,power = 1;
        while(no!=0){
            //Get The Last Number
            int last_digit = no%10;
            ans = ans + last_digit*power;
            power = power*2;
            no/=10;
        }

        System.out.println("The Binary Value is "+ans);
    }
}
