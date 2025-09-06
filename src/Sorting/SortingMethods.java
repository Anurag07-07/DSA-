package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingMethods {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,1,5,4};
//
////        Method 1
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        //Method 2 for Array List
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,5,5,1,3));
        Collections.sort(arr);
        System.out.println(arr);
    }
}
