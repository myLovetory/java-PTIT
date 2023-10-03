
package j03007_sodep2;
import  java.util.Scanner;
public class J03007_sodep2 {
     public static boolean check(String s) {
        int kqua=0;
        for(int i=0;i<s.length()/2;++i){
            if (s.charAt(i)!=s.charAt(s.length()-i-1))
            {
                return false;
            }
            kqua+=(s.charAt(i)-'0');
            if (i!=s.length()-i-1)
            {
                kqua+=(s.charAt(s.length()-i-1)-'0');
            }
        }
        return kqua%10==0;
    }
    public static boolean res(String s){
        if (s.charAt(0)!='8') 
        {
            return false;
        }
        if (s.charAt(s.length()-1)!='8')
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s = sc.next();
            if(res(s) && check(s))
            {
                System.out.println("YES");
            }else
            {
                System.out.println("NO");
            }
            
        }
    }
    
}
