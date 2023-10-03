package j03026_xaukhacnhaudainhat;
import java.util.Scanner;
public class J03026_xaukhacnhaudainhat {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String a =sc.next();
            String b= sc.next();
            if(a.equals(b))
            {
                System.out.println(-1);
            }else{
                int maxL = Math.max(a.length(), b.length());
                System.out.println(maxL);
            }
        }
    }
    
}
