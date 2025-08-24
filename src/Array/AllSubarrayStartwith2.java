package Array;

public class AllSubarrayStartwith2 {
    public static void Brute(int[] arr) {
        for (int i = 2; i < arr.length; i++) {
            int sum = 0;
            for (int j = 2; j <= i ; j++) {
                sum+= arr[j];
            }
            System.out.println("The Sum is "+sum);
        }
    }

    public static void Better(int[] arr) {
        int sum = 0;
        for (int i = 2; i < arr.length; i++) {
            sum+= arr[i];
            System.out.println("The Sum is "+sum);
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,3,2,-1,6,8,2,5};
        Brute(arr);
        Better(arr);
    }
}
