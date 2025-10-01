package NeetCode;

public class LengthofLastWord {
    public static void main(String[] args) {
        String s = "a";
        int start = s.length()-1,count = 0;
        while (s.charAt(start)==' '){
            start--;
        }

        while (start>=0 && s.charAt(start)!=' '){
            start--;
            count++;
        }

        System.out.println(count);
    }
}
