package Practice;

/*
*
*
*  a b c d e
*  a  i = 0 j = 0
*  a b i = 0 j = 1
*  a b c i = 0 j = 2
*  a b c d
*  a b c d e
*  b
*  b c
*  b c d
*  b c d e
*  c
*  c d
*  c d e
*
*  a c
*  c e
*  a e
* */



public class FindLargestSum {
    public static void Brute(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum>largest){
                    largest = sum;
                }
            }
        }

        System.out.println("The Largest Value is " +  largest);
//        TC= O(n^3)
//        SC=O(1)
//        0 1 2 3 4 5 6 7
//        5-3 2-7 6 5 8 -4
//        5 2 4-3 3 8 16 12
    }

    public static void Better(int[] arr) {
        int[] psum = new int[arr.length];
        psum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            psum[i] = arr[i]+psum[i-1];
        }

        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                if (i==0) sum = psum[j];
                else sum =  psum[j] - psum[i-1];
                if (sum>largest) largest = sum;
            }
        }
//        TC = O(n^2)
//          SC = O(n)

//        5,-3,2,-7,6,5,8,-4,11,-10,-15
//sum     5  2 4  0 6 11 19 15 26 16 1
//largest 5  5 5  5 6 11 19 19 26 26 26

        System.out.println("The Largest Sum is "+ largest);
    }

    public static void Optimal(int[] arr) {
        int sum = 0;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum<0) sum = 0;
            if (sum>largest) largest = sum;
        }
//        TC = O(n)
//                Sc = O(1)

        System.out.println("The Largest Subarray Sum  is "+largest);
    }
    public static void main(String[] args) {
        int[] arr = {5,-3,2,-7,6,5,8,-4,11,-10,-15};
        Brute(arr);
        Better(arr);
        Optimal(arr);
    }
}
