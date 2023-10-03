
import java.util.Scanner;


/**
 *
 * @author TGDD
 */
public class J01011_gcdbcd {
    public static Scanner sc = new Scanner(System.in);
    public static long USCLN(long a, long b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
    public static long BSCNN(long a, long b) {
        return (a * b) / USCLN(a, b);
    }
    
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-- >0)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println(BSCNN(a, b) + " " + USCLN(a, b));
        }
                
    }
}
