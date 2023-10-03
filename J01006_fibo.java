
import java.util.Scanner;


/**
 *
 * @author TGDD
 */
public class J01006_fibo {
    public static Scanner sc = new Scanner(System.in);
    public static long [] fibonaaci = new long[93];
    
    public static void nto()
    {
        fibonaaci[1] = fibonaaci[2] = 1L;
        for(int i = 3;i<=92;i++)
        {
            fibonaaci[i] = fibonaaci[i-1] + fibonaaci[i-2];
        }
    }
    
    public static void testcase()
    {
        int n = sc.nextInt();
        System.out.println(fibonaaci[n]);
    }
    public static void main(String[] args) {
        nto();
        int test = sc.nextInt();
        while(test -- >0)
        {
            testcase();
        }
    }
}
