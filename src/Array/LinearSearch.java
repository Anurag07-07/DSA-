package Array;

public class LinearSearch {

    public static boolean LinearSearch(int[] arr,int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int target = 10;

        if (LinearSearch(arr,target)){
            System.out.println("Element Found");
        }else {
            System.out.println("Element not Found");
        }
    }
}
