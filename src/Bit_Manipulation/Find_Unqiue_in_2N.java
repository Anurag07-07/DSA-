package Bit_Manipulation;

import java.util.Scanner;

public class Find_Unqiue_in_2N {
    public static int getBits(int no,int i) {
        int mask = 1<<i;
        return (mask & no)!= 0 ? 1:0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,5,7,7,9,5,3,2};

        //First Find the result
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res^arr[i];
        }

        //I got res = 9^3 but i got both combine as 10 which is res  I have to split it
//        So first find the position where first set bit occur in the 10 or res
        int  pos  = 0;
        int temp = res;
        while((temp&1)==0){
            pos++;
            temp = temp>>1;
        }

        //Now as finally get the position
        //I just have to found all the numbers who pos index value is 1
        int A = 0,B = 0;
        for (int i = 0; i < arr.length; i++) {
            if (getBits(arr[i],pos)==1){
                A = A^arr[i];
            }else {
                B = B^arr[i];
            }
        }

        System.out.println("The Two Unique Number is "+A+" "+B);
    }
}
