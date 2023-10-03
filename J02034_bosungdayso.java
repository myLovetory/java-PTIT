
package j02034_bosungdayso;
import java.util.Scanner;

public class J02034_bosungdayso {
    public static Scanner sc = new Scanner(System.in);
    public static int n;
    public static int[] a = new int[205];
    public static int[] duỵet = new int[205];
    public static void check()
    {
        n = sc.nextInt();
        int max = 0;
        for(int i = 0;i<n;i++)
        {
            a[i] = sc.nextInt();
            max = Math.max(a[i],max);
            duỵet[a[i]] = 1;
        }
        boolean ex = true;
        for(int i = 1;i<=max;i++)
        {
            if(duỵet[i] == 0)
            {
                System.out.println(i);
                ex = false;
            }
        }
        if(ex){
            System.out.println("Excellent!");
        }
    }
    public static void main(String[] args) {
        check();
    }
    
}
