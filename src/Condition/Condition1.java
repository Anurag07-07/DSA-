package Condition;

import java.util.Scanner;

public class Condition1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        //Largest of the Three
        if (A>B){
            if (A>C){
                System.out.println("A is Largest");
            }else {
                System.out.println("C is largest");
            }
        }else {
            if (B>C){
                System.out.println("B is largest");
            }else {
                System.out.println("C is largest");
            }
        }
    }
}
