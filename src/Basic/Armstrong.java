package Basic;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //First Find the digit count
        int count = 0;
        while(n!=0){
            int last = n%10;
            count++;
            n/=10;
        }

        //Find the sum
        double sum = 0;
        while(n!=0){
            int last = n%10;
            sum = sum + Math.pow(last,count);
            n/=10;
        }

        if (sum == n){
            System.out.println("Armstrong");
        }else {
            System.out.println("Not Armstrong");
        }
    }
}
