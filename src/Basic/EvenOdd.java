package Basic;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String n = sc.next();
            if (n.equals("No")) break;
            else {
                int val = sc.nextInt();
                if (val % 2 == 0) System.out.println("Even");
                else System.out.println("Odd");
            }
        }
    }
}
