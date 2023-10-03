
package j03021_dienthoaicucgach;
import java.util.Scanner;
public class J03021_dienthoaicucgach {

    public static char check(char c)
    {
        switch (c) {
            case 'a':
            case 'b':
            case 'c':
                return '2';
            case 'd':
            case 'e':
            case 'f':
                return '3';
            case 'g':
            case 'h':
            case 'i':
                return '4';
            case 'j':
            case 'k':
            case 'l':
                return '5';
            case 'm':
            case 'n':
            case 'o':
                return '6';
            case 'p':
            case 'q':
            case 'r':
            case 's':
                return '7';
            case 't':
            case 'u':
            case 'v':
                return '8';
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                return '9';
        }
        return 'a';
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            String s = sc.next().toLowerCase();
            String kqua = "";
            for(int i = 0;i<s.length();i++)
            {
                kqua += check(s.charAt(i));
            }
            if(kqua.equals(new StringBuilder(kqua).reverse().toString()))
            {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
            
        }
    }
    
}
