package Basic;

public class Secondlargest {
    public static void main(String[] args) {
        int[] arr= {5,3,4,8,9,1};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i],max);
        }

        int s_max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=max && arr[i]>s_max) s_max = arr[i];
        }

        System.out.println(s_max);
    }
}
