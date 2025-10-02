package NeetCode;

public class MajorityElement {
    public static int Brute(int[] nums) {
        int maj = nums[0];
        int  count  = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==maj){
                count++;
            }
            if (nums[i]!=maj){
                count--;
            }
            if (count==0){
                maj = nums[i];
                count = 1;
            }
        }

        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==maj){
                cnt++;
            }
        }

        if (cnt>(nums.length)/2){
            return maj;
        }
        return  maj;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int ans = Brute(nums);
        System.out.println(ans);
    }
}
