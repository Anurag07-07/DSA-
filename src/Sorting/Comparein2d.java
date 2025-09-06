package Sorting;

import java.util.Arrays;

public class Comparein2d {
    public static void main(String[] args) {
        int[][] coordinates = {{1,2},{3,4},{0,2},{1,4}};
        //Sort According to the x values
        Arrays.sort(coordinates,(int[] o1,int[] o2)->(o1[0]-o2[0]));
        //Print 2d Array
        System.out.println(Arrays.deepToString(coordinates));

        Arrays.sort(coordinates, (int[] o1, int[] o2) -> {
            int d1 = o1[0]*o1[0] + o1[1]*o1[1];
            int d2 = o2[0]*o2[0] + o2[1]*o2[1];
            return d1 - d2;
        });

    }
}
