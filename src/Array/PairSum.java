package Array;

public class PairSum {
    public static void Brute(int[] arr,int target) {
//        TC = O(n^2)
//        SC = O(1)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==target){
                    System.out.println(i+" "+j);
                    break;
                }
            }
        }
    }

    public static void TwoPointer(int[] arr,int target) {
        //If you only want pair than the approach is good
//        TC = O(nlogn) for sorting + O(n) for iteration
//        SC = O(1)
        int start = 0,end = arr.length-1;
        while (start<end){
            int sum = arr[start]+arr[end];
            if (sum == target){
                System.out.println(arr[start]+" "+arr[end]);
                start++;
                end--;
            } else if (sum>target) {
                end--;
            }else {
                start++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,10,12,15};
        Brute(arr,11);
        TwoPointer(arr,11);
    }
}
