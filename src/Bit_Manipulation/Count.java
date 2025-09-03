package Bit_Manipulation;

public class Count {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int count = 0;
        for (int x:arr){
            if (x ==4) count++;
        }
        System.out.println(count);
    }
}
