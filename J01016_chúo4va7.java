
import java.util.Scanner;


/**
 *
 * @author TGDD
 */
public class J01016_chúo4va7 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = sc.next();
        int dem4 = 0;
        int dem7 = 0;
        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i) == '4')
            {
                dem4++;
            }
            if(s.charAt(i)=='7')
            {
                dem7++;
            }
        }
        
        if(dem4 + dem7 == 4 || dem4 + dem7 == 7)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
