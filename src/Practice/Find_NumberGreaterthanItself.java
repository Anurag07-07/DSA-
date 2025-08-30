package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Find_NumberGreaterthanItself {
    public static void Brute(int[] arr) {
        int count = 0;
//        TC = O(n^2)
//         SC = O(1)
//        {-3,2,5,8,6,7,8,10,-2,10,10};
        for(int i = 0; i <= arr.length-1; i++) {
           int value = arr[i];
            for (int j = 0; j <= arr.length-1; j++) {
                if (arr[j]>value){
                    count++;
                    break;
                }
            }
        }
//        Arrays.sort(arr);
//        -3 -2 2 5 6 7 8 8 10 10 10
//        O(nlogn) //sorting + O(n) + (1)
//        O(nlogn//SC = O(1) //
//          Max =  10
//           Max_Count = 3
//            ans = 11 -3 = 8

        System.out.println("The Number Greater than themself "+ count);
    }

    public static void Optimal(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }  //O(n)
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==max){
                count++;
            }
        } //O(n)

        int ans = arr.length-count; //O(1)
//        TC= O(n)
        System.out.println("The Number greater than themself is " + ans);


    }
    public static void main(String[] args) {
        int[] arr = {-3,2,5,8,6,7,8,10,-2,10,10};
        Brute(arr);
        Optimal(arr);
    }
}
