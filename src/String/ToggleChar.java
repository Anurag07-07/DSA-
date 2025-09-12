package String;

import java.util.Arrays;

public class ToggleChar {
    public static void main(String[] args) {
        char[] s = {'S','n','A','k','E'};

        for (int i = 0; i < s.length; i++) {
            if (s[i]>='A' && s[i]<='Z'){
                s[i] = (char)(s[i]+32);
            }else {
                s[i] = (char)(s[i]-32);
            }
        }
        System.out.println(Arrays.toString(s));
    }
}