package Basic;

public class MaxandMin {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i],max);
            min = Math.min(arr[i],min);
        }

        System.out.println(max+" "+min);
    }
}
