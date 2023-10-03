


import java.util.Scanner;
import java.lang.Math;
public class J02003_boisonhonhat {

    
    public static Scanner sc = new Scanner(System.in);
    public static long gcd(long a,long b)
    {
        if(b==0) return a;
        return gcd(b, a%b);
    }
    
    public static long lcm(long a,long b)
    {
        
        return a * b / gcd(a, b);
        
    }
    
    public static void duyet()
    {
        int n = sc.nextInt();
        long kqua = 1;
        for(int i = 2;i<=n;i++)
        {
            kqua = lcm(kqua,i);
        }
        System.out.println(kqua);
    }
    
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-- >0)
        {
            duyet();
        }    
    }
    
}
