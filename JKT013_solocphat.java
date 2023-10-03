import java.util.*;
public class JKT013_solocphat {
    public static int n;
    static Vector<String> vt = new Vector<>();
    public static void Try(String s, int k)
    {
        if(s.length() == k)
        {
            vt.add(s);
            return;
        }
        Try(s + "6" , k);
        Try(s + "8" , k);
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            vt.clear();
            n = sc.nextInt();
            for (int i = 1; i <= n; i++)
                Try("", i);
            System.out.println(vt.size());
            for (int i = vt.size() - 1; i >= 0; i--)
                System.out.print(vt.get(i) + " ");
            System.out.println();
        }
        
    }
}
