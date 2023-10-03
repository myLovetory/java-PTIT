
import java.util.Scanner;


/**
 *
 * @author TGDD
 */
public class J01014_uocngtolonnhat {
    public static Scanner sc = new Scanner(System.in);
    public static boolean isprime(long n)
    {
        for(int i = 2;i<= Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return n>1;
    }
    
    public static void testCase() {
        long n = sc.nextLong();
        long res = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (isprime(n / i)) {
                    System.out.println(n / i);
                    return;
                }
                if (isprime(i)) {
                    res = i;
                }
            }
        }
        System.out.println(res);
    }
    
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-- >0)
        {
            testCase();
        }
    }
}
