
package j02021_lietketohop2;
import java.util.Scanner;
public class J02021_lietketohop2 {
    public static Scanner sc = new Scanner(System.in);
    public static int n,k,dem = 0;
    public static int[] a = new int[10];
    
    public static void in()
    {
        dem++;
        for(int i = 1;i<=k;i++)
        {
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }
    public static void Try(int i)
    {
        for(int j = a[i-1] + 1; j <= n-k+i;j++)
        {
            a[i] = j;
            if(i==k)
            {
                in();
            }else{
                Try(i+1);
            }
        }
    }
    public static void main(String[] args) {
        
        n = sc.nextInt();
        k = sc.nextInt();
        Try(1);
        System.out.println();
        System.out.printf("Tong cong co %d to hop", dem);
    }
    
}
