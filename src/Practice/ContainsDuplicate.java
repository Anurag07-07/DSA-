package Practice;

import java.util.Arrays;

public class ContainsDuplicate {
    public static boolean ContainsDuplicateBrute(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]==value){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean ContainsDuplicateBetter(int[] arr) {
        //Sort The array
        Arrays.sort(arr);

        //Iterate over and check if the previous equal to next
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==arr[i+1]){
                return true;
            }
        }

        return  false;
    }

//    public static boolean ContainsDuplicateOptimal(int[] arr) {
//        //Using Hashmap
//        //Not learned Now
//    }



    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
//        boolean ans = ContainsDuplicateBrute(nums);
        boolean ans = ContainsDuplicateBetter(nums);

        if (ans){
            System.out.println("Contains Duplicate");
        }else {
            System.out.println("Not Contains Duplicate");
        }
    }
}
