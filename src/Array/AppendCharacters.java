package Array;

public class AppendCharacters {
    public static void Brute(String s ,String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        int  i = 0, j = 0,cnt = 0;
        while(j<b.length && i<a.length){
            if (a[i]==b[j]){
                i++;j++;
            }
            else {
                i++;
            }
        }
        System.out.println("The Count is "+(t.length()-j));
    }
    public static void main(String[] args) {
        String s = "coaching",t = "coding";
        Brute(s,t);
    }
}
