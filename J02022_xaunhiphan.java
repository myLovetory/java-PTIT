
package j02022_xaunhiphan;

import java.util.Scanner;
public class J02022_xaunhiphan {

    public static Scanner sc = new Scanner(System.in);
    public static long[] fb = new long[100];
    public static void fibo()
    {
        fb[1] = fb[2] = 1L;
        for(int i = 3;i<100;i++)
        {
            fb[i]=fb[i-1] + fb[i-2];
        }
    }
    public static char check(int n, long k)
    {
        if(n==1)
        {
            return '0';
        }
        if(n==2)
        {
            return '1';
        }
        //check xem k co nho hon gia tri fibo thu n - 2 hay ko
        if(k <=fb[n-2])
        {
            //neu co de quy den khi tra ve 0 hoac 1
            return check(n-2, k);
        }
        //neu lon hon thi cung de quy de xu ly nua sau
        return check(n-1, k - fb[n-2]);
    }
    public static void main(String[] args) {
        fibo();
        int t = sc.nextInt();
        while(t-- >0)
        {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(check(n,k));
        }
            
    }
}
