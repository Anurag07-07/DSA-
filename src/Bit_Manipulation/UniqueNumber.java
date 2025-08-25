package Bit_Manipulation;

import java.util.Scanner;

public class UniqueNumber {

    public static void main(String[] args) {
        int[] arr = {5,6,6,2,7,7,5};
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans^arr[i];
        }

        System.out.println("The Unique Number is "+ans);
    }
}
