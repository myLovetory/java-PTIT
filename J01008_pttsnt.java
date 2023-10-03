
import java.util.Scanner;


/**
 *
 * @author TGDD
 */
public class J01008_pttsnt {
    public static Scanner sc = new Scanner(System.in);
    
    public static void phantich(int test)
    {
        int N =sc.nextInt();
        int n = N;
        System.out.printf("Test %d: ", test);
        for(int i = 2;i<=Math.sqrt(N);i++)
        {
            int cnt = 0;
            while(n%i==0)
            {
                cnt++;
                n/=i;
            }
            if(cnt!=0)
            {
                System.out.printf("%d(%d) ",i,cnt);
            }
        }
        if(n!=1)
        {
            System.out.printf("%d(%d) ",n,1);
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
       int T = sc.nextInt();
       for(int i = 1;i<=T;i++)
       {
           phantich(i);
       }
    }
}
