package Pattern;

/*
 * *****        12345         *            1                    1                *****
 * *****        12345         **           2 3                  0 1              ****
 * *****   and  12345   and   ***    and   4 5 6          and   0 1 0      and   ***
 * *****        12345         ****         7 8 9 10             1 0 1 0          **
 * *****        12345         *****        11 12 13 14 15       1 0 1 0 1        *
 * */


import java.util.Scanner;

public class Logical {

    public static void Square(int n){
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void SquareNumber(int n) {
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    public static void RightTriangle(int n) {
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void InvertedTriangle(int n) {
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <= n-row+1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void NumberTriangle(int n) {
        int value = 1;
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print((value++)+" ");
            }
            System.out.println();
        }
    }

    public static void ToogleNumber(int n) {
        int toogle = 1;
        for (int row = 0; row <= n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(toogle+" ");
                toogle = 1-toogle;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value of Rows");
        int rows = sc.nextInt();
//        Square(rows);
//        SquareNumber(rows);
//        RightTriangle(rows);
//        InvertedTriangle(rows);
//        NumberTriangle(rows);
        ToogleNumber(rows);
    }
}
