package Basic;

import java.math.BigInteger;
import java.util.Scanner;

public class BigINT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creating Big Integer using String
        BigInteger b  = new BigInteger("44654546521212132212132131213546454");
        BigInteger b2  = new BigInteger("44654546521212132212132131213546454");
        System.out.println(b.add(b2));

        //Convert Integer into Big Integer
        System.out.println(b.add(BigInteger.valueOf(7)));
        //Create BigInteger from Integer
        BigInteger ten = BigInteger.valueOf(10);
        System.out.println(ten);
        System.out.println(ten.pow(100));

        int num = 50;
        BigInteger ans = BigInteger.valueOf(1);
        for (int i = 1; i <= num; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        System.out.println(ans);

        System.out.println(ans.gcd(BigInteger.valueOf(50)));
        System.out.println(ans.mod(BigInteger.valueOf(50)));
    }
}