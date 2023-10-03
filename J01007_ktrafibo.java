
import java.util.Scanner;


/**
 *
 * @author TGDD
 */
public class J01007_ktrafibo {
    public static Scanner ip = new Scanner(System.in);
    public static long[] fibo = new long[100];

    public static void perpare() {
        fibo[0] = 0L;
        fibo[1] = 1L;
        for (int i = 2; i < 100; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }
    public static boolean isfibo(long n)
    {
        for(long i : fibo)
        {
            if(i==n)
            {
                return true;
                
            }else if(i>n)
            {
                return false;
            }
        }
        return false;
    }
    public static void testcase()
    {
        long n = ip.nextLong();
        if (isfibo(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        perpare();
        int T = ip.nextInt();
        while (T-- > 0) {
            testcase();
        }
    }
}
