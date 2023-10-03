
import java.util.Scanner;


/**
 *
 * @author TGDD
 */
public class J01017_solienke {
    public static Scanner sc = new Scanner(System.in);
    public static boolean ketiep(char a, char b)
    {
        int A = a - '0';
        int B = b - '0';
        return Math.abs(A - B) == 1;
    }
    public static void testcase()
    {
        String s = sc.next();
        for(int i = 1;i<s.length();i++)
        {
            if(!ketiep(s.charAt(i),s.charAt(i-1)))
            {
                System.out.println("NO");
                return;
            }
        }  
        System.out.println("YES");
        
    }
    
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-- >0)
        {
            testcase();
        }
    }
}
