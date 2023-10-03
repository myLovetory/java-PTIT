
/**
 *
 * @author TGDD
 */
import java.util.Scanner;
import java.lang.Math;
class Phanso
{
    
    private long a,b;

    Phanso() {
        a = 0;
        b= 1;
    }
    Phanso(long a,long b)
    {
        this.a = a;
        this.b = b;
    }
    private long gcd(long a,long b)
    {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
    @Override
    public String toString()
    {
        long GCD = gcd(this.a, this.b);
        return a/GCD + "/" + b/GCD;       
    }
    
    
    
}
public class J04003_phanso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        Phanso f = new Phanso(a, b);
        System.out.println(f);
    }
}
