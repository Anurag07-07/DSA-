package Bit_Manipulation;

import java.util.Scanner;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {5,6,2,6,7,5,2};
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans^arr[i];
        }

        System.out.println("The Number is " + ans);
    }
}
