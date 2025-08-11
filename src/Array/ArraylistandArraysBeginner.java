package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraylistandArraysBeginner {
    public static void PairsumBrute(int[] arr,int target) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==target){
                    System.out.println(i+" "+j);
                    break;
                }
                break;
            }
        }
    }

    public static void PairsumBetter(int[] arr,int target) {
        //Two pointer
        int start =0,end = arr.length-1;
        while (start<end){
            int sum = arr[start]+arr[end];
            if (sum==target){
                System.out.println(start+" "+end);
                break;
            } else if (sum>target) {
                end--;
            }else {
                start++;
            }
        }
    }

    public static void Create2DwithVariablescols() {
        Scanner sc = new Scanner(System.in);
        //Create a array with n rows
        System.out.println("Enter the Number of rows");
        int rows = sc.nextInt();
        int[][] arr2D = new int[rows][];

        for (int i = 0; i < arr2D.length; i++) {
            System.out.println("Tell Cols in "+i+" row");
            int cols = sc.nextInt();
            //Store Cols array at particular position
            arr2D[i] = new int[cols];
            //Take Input
            for (int j = 0; j < cols; j++) {
                arr2D[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr2D.length; i++) {
            System.out.println(Arrays.toString(arr2D[i]));
        }
    }

    public static void WavePrint(int[][] arr) {
        for (int col = 0; col < arr[0].length; col++) {
            if (col%2==0){
                for (int row = 0; row < arr.length; row++) {
                    System.out.print(arr[row][col]+" ");
                }
            }else {
                for (int row = arr.length-1; row >=0 ; row--) {
                    System.out.print(arr[row][col]+" ");
                }
            }
        }
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = {2,5,8,10,13,11};
//        PairsumBrute(arr,15);
//        PairsumBetter(arr,15);

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
//        System.out.println(Arrays.toString(arr[1]));

//        Print the 2d array
//        Way 1

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//
////        Way 2
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }

//        arr[1][2] = 5;  //Update The Element

        WavePrint(arr);
//        Create2DwithVariablescols();
    }
}
