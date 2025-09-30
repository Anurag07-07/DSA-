package NeetCode;

public class ScoreofString {

    public static void Brute(String s) {
        int sum = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length()-1; i++) {
            sum = sum +Math.abs(arr[i]-arr[i+1]);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        String s = "hello";
        Brute(s);
    }
}
