package Array;

public class ElementGreaterThanItself {
    public static void Brute(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]!=value && arr[j]>value){
                    count++;
                    break;
                }
            }
        }
        System.out.println("The element Greater than itself is  "+count);
    }

    public static void Optimal(int[] arr) {
        //Find the maximum and also count total Maximum
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }

        int max_count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==max){
                max_count++;
            }
        }

        int ans = arr.length-max_count;

        System.out.println("The element greater than itself is "+ans);
    }
    public static void main(String[] args) {
        int[] arr = {-3,2,5,8,6,7,8,10,-2,10,10};
        Brute(arr);
        Optimal(arr);
    }
}
