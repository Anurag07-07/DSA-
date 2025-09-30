package NeetCode;

public class IsSubSequence {
    public static boolean Brute(String s,String t) {
        int  i = 0,j = 0;
        while(j<t.length() && i<s.length()){
            if (s.charAt(i)==t.charAt(j)){
                i++;j++;
            }else {
                j++;
            }
        }

        if (s.length()-i!=0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abc",t = "ahbgdc";
        Brute(s,t);
    }
}
