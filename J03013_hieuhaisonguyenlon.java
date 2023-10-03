
package j03013_hieuhaisonguyenlon;
import java.util.Scanner;
import java.math.BigInteger;

public class J03013_hieuhaisonguyenlon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0)
        {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            //tru 2 so nguyen lon dung subtract
            BigInteger c =  a.subtract(b).abs();
            //check length
            StringBuilder str = new StringBuilder(c.toString());
            int maxL = Math.max(a.toString().length(),b.toString().length());
            while(str.length() < maxL)
            {
                str.insert(0,'0');
            }
            System.out.println(str.toString());
        }
    }

}
