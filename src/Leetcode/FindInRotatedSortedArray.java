package Leetcode;

public class FindInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
//        4 5 6 7 0 1 2 arr[mid] > arr[mid+1] pivot = mid;
//        4 5 6 7 0 1 2 arr[mid] < arr[mid-1]  pivot = mid-1;
//        start = mid + 1;
//        end = mid-1;
        int[] arr1 = {2,2,2,9,2};
//        2 2 2 2 9 2
//          arr[start] > arr[start+1] pivot = start;
//          start++;
//          arr[end] < aar[end-1] = pivot  = end-1;
//          end--;
//        4 5 6 7 0 1 2
//         arr[start] < arr[mid] || (arr[mid] == arr[start] && arr[mid] > arr[end] )   strat = mid+1
//         else end = mid-1;
    }
}
