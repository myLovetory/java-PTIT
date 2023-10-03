
import java.util.Scanner;


/**
 *
 * @author TGDD
 */
public class J01010_catdoi {
    public static Scanner sc = new Scanner(System.in);

    public static long testcase(String str)
    {
        long kqua = 0;
        for(int i = 0;i<str.length();i++)
        {
            char c = str.charAt(i);
            switch (c) {
                case '0':
                case '8':
                case '9':
                    kqua = kqua * 10;
                    break;
                case '1': 
                    kqua = kqua * 10 + 1;
                    break;
                default:
                    return 0;
            }
        }
        return kqua;
    }
    public static void check0()
    {
        String str = sc.next();
        long res = testcase(str);
        if(res == 0 )
        {
            System.out.println("INVALID");
        }else{
            System.out.println(res);
        }
    }
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-- >0)
        {
            
            check0();
        }
    }
}
