
package j03011_gcd_cuahaisonguyenlin;

import java.util.Scanner;
import java.lang.Math;
import java.math.BigInteger;
public class J03011_gcd_cuahaisonguyenlin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            BigInteger a =sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println(a.gcd(b));
        }
    }
    
}
