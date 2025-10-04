package NeetCode;

public class ValidPalindrone2 {

    public static boolean Brute(String s) {
        int start = 0,end = s.length()-1;
        int count = 1;
        while (start<end){
            if (s.charAt(start)!=s.charAt(end)){
                if (count==0 || s.length()<=3){
                    return false;
                }
                count--;
            }
            start++;end--;
        }
        return  true;
    }

    public static void main(String[] args) {
        String s = "eedede";
        boolean a = Brute(s);
        System.out.println(a);
    }
}
