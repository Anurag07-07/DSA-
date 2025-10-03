package NeetCode;

public class ValidPalindrone {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String clean = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        int start = 0;
        int end = clean.length()-1;
        while (start<end){
            if (clean.charAt(start)!=clean.charAt(end)){
                System.out.println(false);
                break;
            }
            start++;end--;
        }
    }
}
