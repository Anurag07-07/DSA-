package Array;

import java.util.Scanner;

public class GCD {
    public static int gcd(int a,int b) {
        while(a!=0){
           int a_ =  b%a;
           int b_ =  a;
           a = a_;
           b= b_;
        }
        return b;
    }

    public static void lcm(int a,int b) {
        //The Logic is gcd*lcm = a*b
        int lcm = a*b/(gcd(a,b));
        System.out.println("The LCM is "+lcm);
    }

    public static void GcdofMultiple() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Number");
        int n = sc.nextInt();
        System.out.println("Enter First Number");
        int ans = sc.nextInt();
        for (int i = 1; i <=n-1 ; i++) {
            System.out.println("Enter The Next Number");
            int next_no = sc.nextInt();
            ans = gcd(ans,next_no);
        }

        System.out.println("The Final GCD is "+ans);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter First Number");
//        int a = sc.nextInt();
//        System.out.println("Enter Second Number");
//        int b = sc.nextInt();
//
//        int ans = gcd(a,b);
//        System.out.println("The GCD is "+ans);
//        lcm(a,b);
        GcdofMultiple();
    }
}
