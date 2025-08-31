package Practice;

public class Max_Product {

    public static boolean NotEqualBits(int value1,int value2) {
        while(value1!=0 || value2!=0){
            int ans1 = value1&1;
            int ans2 = value2&1;
            if ((ans1 ==1 || ans2 ==1) && ans1 == ans2) return false;
            value1 = value1>>1;
            value2 = value2>>1;
        }
        return true;
    }

    public static void Brute(int[] arr) {
        long max_product =0;

        long a;
        long b;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int value1 = arr[i];
                int value2 = arr[j];
                boolean check =  NotEqualBits(value1,value2);
                if (check){
                    long ans = (long)value1*value2;
                    if (ans>max_product) max_product = ans;
                }
                }
            }
        System.out.println(max_product);
    }
    public static void main(String[] args) {
        int[] arr = {64,8,32};
        Brute(arr);

    }
}
