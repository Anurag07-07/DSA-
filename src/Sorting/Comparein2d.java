package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class Comparein2d {
    public static void main(String[] args) {
        int[][] coordinates = {{1,2},{3,4},{0,2},{1,4}};
        //Sort According to the x values
        Arrays.sort(coordinates,(int[] o1,int[] o2)->(o1[0]-o2[0]));
        //So Bascially Comparator convert array into object and we pass key on which basis the array is compared here it o[0]
        Arrays.sort(coordinates,Comparator.comparingInt((int[] o)-> o[0]));
        //Print 2d Array
        System.out.println(Arrays.deepToString(coordinates));

        Arrays.sort(coordinates, (int[] o1, int[] o2) -> {
            int d1 = o1[0]*o1[0] + o1[1]*o1[1];
            int d2 = o2[0]*o2[0] + o2[1]*o2[1];
            return d1 - d2;
        });

    }
}
