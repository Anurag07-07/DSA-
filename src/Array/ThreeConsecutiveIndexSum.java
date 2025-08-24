package Array;

public class ThreeConsecutiveIndexSum {
    public static void main(String[] args) {
        int[] arr = {7,3,2,-1,6,8,2,5};

        for (int i = 0; i <= arr.length-3; i++) {
            int sum = 0;
            for (int j = i; j <=i+2 ; j++) {
                sum += arr[j];
            }
            System.out.println("The Sum is "+sum);
        }
    }
}
