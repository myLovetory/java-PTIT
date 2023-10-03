package j03008_sodep3;
import  java.util.Scanner;
public class J03008_sodep3 {
    
    public static boolean check(String s)
    {
            int l = s.length();
        for (int i = 0; i < l / 2; i++) {
            if (s.charAt(i) != s.charAt(l - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String s = sc.next();
            if(s.matches("[^014689]+") && check(s))
            {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    
}
