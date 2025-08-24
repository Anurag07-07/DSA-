package Array;

import java.util.Arrays;

public class SmallestSubarraytobesorted {

    public static void Brute(int[] arr) {
//        TC = O(nlogn) for sorting and O(n) for iteration
//        SC = O(n) for storing sorted array

        //Create a Sorted Array First
        int[] brr = Arrays.copyOf(arr,arr.length);
        Arrays.sort(brr);

        //Now Take i and iterate over array and return the index Who's value are not same
        int i = 0;
        while(arr[i]==brr[i]){
            i++;
        }

        //Same for Last Index
        int j = arr.length-1;
        while (arr[j]==brr[j]){
            j--;
        }

        System.out.println("The Indexes are "+i+" "+j);
    }

    public static boolean OutofOrder(int[] arr , int i) {
        if (i==0){
            return arr[i]>arr[i+1];
        } else if (i== arr.length-1) {
            return arr[i]<arr[i-1];
        }else {
            return  arr[i]>arr[i+1] || arr[i]<arr[i-1];
        }
    }

    public static void Optimal(int[] arr) {
        //So the approcah is find the smallest and largest element that is not at its correct postion
        //and return the index
        //Two Variable th Store the maximum and minimum value
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            //Check if that element is at its correct position or not
            //Create a function
            boolean ans = OutofOrder(arr,i);
            if (ans){
                //Store the Max and Min Value
                max = Math.max(max,arr[i]);
                min = Math.min(min,arr[i]);
            }
        }

        //Now We have to find the Index of Both the Element

        int i = 0;
        while (arr[i]<=min) i++;
        int j = arr.length-1;
        while (arr[j]>=max) j--;

        System.out.println(i+" "+j);

    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,7,10,11,7,12,7,7,16,18,19};
        Brute(arr);
        Optimal(arr);
    }
}
