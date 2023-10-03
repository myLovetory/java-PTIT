
package j03006_sodep1;

import java.util.Scanner;

public class J03006_sodep1 {
    public static Scanner sc = new Scanner(System.in);
    public static boolean check(String s)
    {
        for(int i = 0;i<s.length()/2;i++)
        {
            if (s.charAt(i) != s.charAt(s.length() - i - 1) || (s.charAt(i) - '0') % 2 == 1) 
            {
                return false;
            }
        }
        return true;
    }
    public static void in()
    {
        String s = sc.next();
        if(check(s))
        {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- >0)
        {
            in();
        }
    }
    
}
