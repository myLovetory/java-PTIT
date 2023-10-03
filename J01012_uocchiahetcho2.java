
import java.util.Scanner;


/**
 *
 * @author TGDD
 */
public class J01012_uocchiahetcho2 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void testcase()
    {
        int n = sc.nextInt();
        int dem = 0;
        for(int i = 1;i <= Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                if(i%2==0)
                {
                    dem++;
                }
                if((n / i) %2 == 0 && i != Math.sqrt(n))
                {
                    dem++;
                }
            }
        }
        System.out.println(dem);
    }
    
    
    public static void main(String[] args) {
        int Test = sc.nextInt();
        while(Test-- >0)
        {
            testcase();
        }
    }
}
