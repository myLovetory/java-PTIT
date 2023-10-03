
import java.util.Scanner;


/**
 *
 * @author TGDD
 */
public class J01005_chiatamgiac {
    public static Scanner sc = new Scanner(System.in);
    public static void testcase()
    {
        int n = sc.nextInt();
        int h = sc.nextInt();
        for(double i = 1d;i<n;i++ )
        {
            System.out.printf("%.6f ", Math.sqrt(i / n) * h);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- >0)
        {
            testcase();
        }
        
    }
}
