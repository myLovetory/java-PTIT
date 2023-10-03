package j03033_bosochungnhonhat;

import java.util.Scanner;
import java.math.BigInteger;
public class J03033_bosochungnhonhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            BigInteger tich = a.multiply(b);
            BigInteger gcd = a.gcd(b);
            BigInteger lcm = tich.divide(gcd);
            System.out.println(lcm);
        }
    }
    
}
