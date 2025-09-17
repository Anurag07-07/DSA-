package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
    public static void Brute(int[] arr ,int val) {
        //Using List
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=val){
                temp.add(arr[i]);
            }
        }

        //Store temp in the original Array
        for (int i = 0; i < temp.size(); i++) {
            arr[i] = temp.get(i);
        }

        System.out.println(Arrays.toString(arr));
    }

//    public static void Better(int[] arr,int val) {
//        int k = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]!=val){
//                arr[k++] = arr[i];
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        Brute(arr,2);
        Better(arr,2);
    }
}
