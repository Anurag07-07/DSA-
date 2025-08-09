package Array;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int no = sc.nextInt();
        int power = 1; int ans = 0;
        while (no!=0){
            //Find The Remainder of the Number
            int rem = no%2;
            ans = ans +rem*power;
            power = power*10;
            no/=2;
        }

        System.out.println("The Binary Value is "+ans);
    }
}
