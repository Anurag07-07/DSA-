package Array;

public class EquilibriumIndex {

    public static int Sum(int[] arr,int start,int end) {
        int sum = 0;
        for (int i = start; i <=end ; i++) {
            sum+= arr[i];
        }
        return sum;
    }

    public static void Brute(int[] arr) {

//        TC = O(n^2)
//        SC = O(1)

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int right_sum = 0;
            int left_sum = 0;
            //Edges Cases
            if (i==0){
                left_sum = 0;
            }

            if (i== arr.length-1){
                right_sum = 0;
            }

            //Now Sum for Remaining Index
             right_sum = Sum(arr,0,i-1);
             left_sum = Sum(arr,i+1, arr.length-1);

             if (right_sum == left_sum){
                 count++;
             }
        }
        System.out.println("The Total Equilibrium Index is "+count);
    }

    public static void Better(int[] arr) {

//        TC = O(n)
//        SC = O(n)

        int count = 0;

        int[] psum = new int[arr.length];

        psum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            psum[i] = psum[i-1]+arr[i];
        }

        //Now I Will Use Only One Loop To Find The Equilibrium Index
        for (int i = 0; i < arr.length; i++) {
            int right_sum = 0;
            int left_sum = 0;
            if (i == 0) {
                left_sum = 0;
            }else {
                left_sum = psum[i-1];
            }

            right_sum = psum[arr.length-1]-psum[i];

            if (right_sum == left_sum) count++;
        }

        System.out.println("The Total Equilibrium Index is "+count);
    }
    public static void main(String[] args) {
        int[] arr = {-7,1,5,2,-4,3,0};
        Brute(arr);
        Better(arr);
    }
}
