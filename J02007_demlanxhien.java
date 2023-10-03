


import java.util.Scanner;
import java.util.Arrays;
public class J02007_demlanxhien {

    public static Scanner sc = new Scanner(System.in);
    public static void count(int t)
    {
        int n  =sc.nextInt();
        int[] a = new int[n];
        int[] dem = new int[10005];
        for(int i = 0; i<n;i++)
        {
            a[i]=sc.nextInt();
            dem[a[i]]++;
        }
        
        System.out.printf("Test %d:\n", t);
        for(int i = 0;i<n;i++)
        {
            if(dem[a[i]] > 0)
            {
                System.out.printf("%d xuat hien %d lan\n", a[i], dem[a[i]]);
                dem[a[i]] = 0;
            }
        }
        
        
        
    }
    public static void main(String[] args) {
        
        int test = sc.nextInt();
        for(int i = 1; i<= test;i++)
        {
            count(i);
        }
        
    }
    
}
