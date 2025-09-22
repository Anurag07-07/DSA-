package Contest;

public class MaximumTotalSubarrayValue {

    public static void Brute(int[] nums,int k) {
        long ans = 0;
        for (long i = 1; i <= k; i++) {
            //Find the he Maximum nad Minimum
            long maxi = Long.MIN_VALUE;
            long mini  = Long.MAX_VALUE;
            for (int j = 0; j < nums.length; j++) {
                maxi = Math.max(maxi,nums[j]);
                mini = Math.min(mini,nums[j]);
            }
            ans = ans + (maxi-mini);
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] arr = {4,2,5,1};
        Brute(arr,3);
    }
}

