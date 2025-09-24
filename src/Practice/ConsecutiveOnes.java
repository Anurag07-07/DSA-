package Practice;

public class ConsecutiveOnes {
    public static int Brute(int[] nums) {
        int  i = 0;
        int n = nums.length;
        int maxi = 0;
        int cnt = 0;
        while(i<n){
            if(nums[i]==1){
                cnt++;
            }
            if(nums[i]==0){
                maxi = Math.max(maxi,cnt);
                cnt = 0;
            }
            i++;
        }
        maxi = Math.max(maxi,cnt);
        return maxi;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        int ans = Brute(arr);
        System.out.println(ans);
    }
}
