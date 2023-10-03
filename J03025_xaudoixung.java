package j03025_xaudoixung;
import java.util.Scanner;
public class J03025_xaudoixung {
    
    public static void check(String s)
    {
        int l = s.length();
        int dem = 0;
        for(int i = 0;i<l/2;i++)
        {
            if(s.charAt(i) != s.charAt(l-i-1))
            {
                dem++;
            }
        }
        if((l%2==0 && dem == 1) ||(l%2==1 && dem <=1))
        {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            String s = sc.next();
            check(s);
        }
    }
    
}
