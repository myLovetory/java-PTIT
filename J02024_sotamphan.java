
package j02024_sotamphan;

import java.util.Scanner;
public class J02024_sotamphan {
    public static Scanner sc = new Scanner(System.in);
    
    public static boolean check(char c)
    {
        return c>='0' && c<='2';
    }
    public static void testcase()
    {
        String s = sc.next();
        for(int i = 0;i<s.length();i++)
        {
            if(!check(s.charAt(i)))
            {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- >0)
        {
            testcase();
        }
    }
    
}
