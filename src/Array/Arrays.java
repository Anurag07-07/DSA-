package Array;

import java.util.Scanner;

public class Arrays {
    public static void PrinttheArray(int[] arr) {
        //Print The Output
        System.out.println("Way 1");
        System.out.println(java.util.Arrays.toString(arr));



        System.out.println("Way 2");
        for (int x:arr){
            System.out.print(x+" ");
        }

        System.out.println();

        System.out.println("Way 3");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n = sc.nextInt();

        int[] arr = new int[n];  //Array Declaration

        //Read the array
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        //Update The Value
        arr[3] = 45;

        PrinttheArray(arr);
    }
}
