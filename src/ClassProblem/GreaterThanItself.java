package ClassProblem;

public class GreaterThanItself {
    public static void Brute(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (nums[j]>value){
                    count++;
                    break;
                }
            }
        }
//        Time Complexity = O(n^2)
//        Space Complexity = O(1)
        System.out.println(count);
    }


    public static void Better(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i],max);
        }


        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==max){
                count++;
            }
        }

//        Time Complexity = O(n)+O(n)+O(1)
//        Space Complexity = O(1)
        int ans = arr.length-count;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] arr = {-3,2,5,8,6,7,8,10,-2,10,10};
        Brute(arr);
        Better(arr);
    }
}
