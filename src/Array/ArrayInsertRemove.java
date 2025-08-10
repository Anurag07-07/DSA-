package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertRemove {

    public static void AddElement(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Element to be Inserted");
        int element = sc.nextInt();
        System.out.println("Enter The Position Where to Insert from start from 1 ");
        int pos = sc.nextInt();

        System.out.println(arr.length);

        if (pos==1){
            arr[0] = element;
        } else if (pos== arr.length) {
            arr[arr.length-1] = pos;
        }else {

            //Shift Each Element to one position left
            for (int i = arr.length - 2; i >= pos; i--) {
                arr[i + 1] = arr[i];
            }

            //Insert Element at Given Position
            arr[pos] = element;

        }


        System.out.println(Arrays.toString(arr));
    }

    public static void DeleteElement(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position to Delete Element");
        int pos = sc.nextInt();

        for (int i = pos; i < arr.length-1 ; i++) {
            arr[i] = arr[i+1];
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();

        int[] arr = new int[n+1];

        //Insert The Value
        for (int i = 0; i < arr.length-2; i++) {
            arr[i] = sc.nextInt();
        }

//        AddElement(arr);
        DeleteElement(arr);
    }
}
