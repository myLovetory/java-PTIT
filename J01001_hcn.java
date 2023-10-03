
import java.util.Scanner;


/**
 *
 * @author TGDD
 */
public class J01001_hcn {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int w = ip.nextInt();
        int h = ip.nextInt();

        if (w <= 0 || h <= 0) {
            System.out.println(0);
        } else {
            System.out.println(2 * (w + h) + " " + w * h);
            
        }
    }
    
}
