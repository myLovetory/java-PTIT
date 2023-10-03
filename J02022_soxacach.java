
package j02022_soxacach;
import java.util.Scanner;


public class J02022_soxacach {
    public static Scanner sc = new Scanner(System.in);
    public static int n;
    public static boolean[] duyet;
    public static int[] a;
    public static void checkvain()
    {
        for(int i = 1;i<n;i++)
        {
            if(Math.abs(a[i] - a[i+1]) == 1)
            {
                return;
            }
        }
        for(int i = 1;i<=n;i++)
        {
            System.out.print(a[i]);
        }
        System.out.println();
    }
    //sinh hoan vi
    public static void Try(int i)
    {
        for(int j = 1;j<=n;j++)
        {
            if (duyet[j] == false) {
                duyet[j] = true;
                a[i] = j;
                if (i == n) {
                    checkvain();
                } else {
                    Try(i + 1);
                }
                duyet[j] = false;
            }
        }
    }    
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-- >0)
        {
            n = sc.nextInt();
            a = new int[n+5];
            duyet = new boolean[n+5];
            Try(1);
        }
    }
    
}
