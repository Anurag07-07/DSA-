package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatingElement {

    public static void Occurance(int[] arr) {
        int occ = 7;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==occ){
                count++;
            }
        }
        System.out.println("The Occurance of 7 is "+count);
    }

    public static int[] OccurancewithIndics(int[] arr,int no) {
        //Find The Occurance of the Number
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==no){
                count++;
            }
        }

        //Create A Array of Indics
        int[] indics = new int[count+1];
        int j  = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == no){
                indics[j] = i;
                j++;
            }
        }
        indics[j] = -1;
        return  indics;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,6,7,2,7,3,7,4};
        //Find All the Occurance of 7
        Occurance(arr);
        int[] ans = OccurancewithIndics(arr,7);

        //We use -1 logic beacuse of intially all element of aar is zero
        for (int i = 0; ans[i]!=-1; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
