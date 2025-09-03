package Basic;

import java.util.Scanner;



public class Sorted {


    public static boolean Brute(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]>arr[i]) return  false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        if (Brute(arr)) System.out.println("true");
        else System.out.println("false");
    }
}
