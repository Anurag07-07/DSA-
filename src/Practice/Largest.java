package Practice;

import Array.LinearSearch;

public class Largest {

    public static boolean LinearSearch(int[] arr,int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return true;
            }
        }
        return false;
    }

    public static void Largest_Value(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for(int i = 0;i<n;i++){
            sum += nums[i];
        }

        int average = sum/(n);
        int cnt = average+1;

        while(true){
            boolean ans = LinearSearch(nums,cnt);
            if (!ans && cnt>0){
                System.out.println(cnt);
                break;
            }
            cnt++;
        }

    }

    public static void main(String[] args) {
        int[] arr = {-34};
        Largest_Value(arr);
    }
}
