package Basic;

public class Secondlargest {
    public static void main(String[] args) {
        int[] arr= {5,3,4,8,9,1};
        int max = Integer.MIN_VALUE;
        int s_max = Integer.MIN_VALUE;
        for (int x:arr){
            if (x>max){
                s_max = max;
                max = x;
            } else if (x<max && x> s_max) {
                s_max = x;
            }
        }
        System.out.println(s_max);
    }
}
