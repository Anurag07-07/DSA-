package NeetCode;

import java.util.*;

public class FrequentElement {
    public static int[] Brute(int[] nums,int k) {
        //First create a Hashmap  and store all element with Occurance
        HashMap<Integer,Integer> count = new HashMap<>();
        for (int num:nums){
            count.put(num,count.getOrDefault(num,0)+1);
        }

        //Now Create Arraylist which store the array which has Element and it Occurance
        //For That we have ITERATE over Hashmap
        ArrayList<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry:count.entrySet()){
            arr.add(new int[]{entry.getValue(),entry.getKey()});
        }

        //Now Sort the Array According to the Occurance of element
        arr.sort((a,b)->b[0]-a[0]);

        //Now I have to return the Array of element which is max occured
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr.get(i)[1];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr ={1,1,1,2,2,3};
        int[] ans = Brute(arr,2);
        System.out.println(Arrays.toString(ans));
    }
}
