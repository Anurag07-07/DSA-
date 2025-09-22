public class BitwiseOr {

    public static  int Brute(int[] nums) {
        int ans = 0;
        for(int  i = 0;i<nums.length;i++){
            if(nums[i]%2==0){
                ans = ans | nums[i];
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int ans = Brute(arr);
        System.out.println(ans);
    }
}
