package Basic;

import java.util.Scanner;

public class Prime {

    public static boolean Prime(int n) {
        for (int i = 2; i*i < n ; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if (Prime(n)) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}
