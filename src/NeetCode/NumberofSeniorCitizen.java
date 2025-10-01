package NeetCode;

public class NumberofSeniorCitizen {
    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int count = 0;
        for (int i = 0; i < details.length; i++) {
            String s = details[i];
            int n = s.length();
            String age = "";

            age = age+s.charAt(n-4)+s.charAt(n-3);

            if (Integer.parseInt(age)>60){
                count++;
            }
        }

        System.out.println(count);
    }
}
