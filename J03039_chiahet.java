package j03039_chiahet;
import java.math.BigDecimal;
import java.util.Scanner;
import java.math.BigInteger;

public class J03039_chiahet {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            if (a.mod(b).toString().equals("0") || b.mod(a).toString().equals("0")) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    
}
