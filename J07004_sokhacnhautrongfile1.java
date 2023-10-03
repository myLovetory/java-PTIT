
/**
 *
 * @author TGDD
 */
import java.io.*;
import java.util.*;
public class J07004_sokhacnhautrongfile1 {
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(new File("DATA.in"));
        int[] dd = new int[1005];
        while (sc.hasNextInt())
            ++dd[sc.nextInt()];
        for (int i = 0; i <= 1000; ++i)
            if (dd[i] > 0)
                System.out.println(i + " " + dd[i]);
    }
}
