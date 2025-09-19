package String;

import java.sql.Array;
import java.util.Arrays;

public class toogle {
    public static void Brute(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>= 'A' && arr[i]<='Z'){
                arr[i] = (char)(arr[i]+32);
            }else {
                arr[i] = (char)(arr[i]-32);
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        char[] arr = {'S','n','A','k','e'};
        Brute(arr);
    }
}
