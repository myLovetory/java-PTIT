
package j02104_danhsachcanh;
import java.util.Scanner;
public class J02104_danhsachcanh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        byte[][] a = new byte[n][n];
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                a[i][j] = sc.nextByte();
            }
        }
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(i<j && a[i][j]==1)
                {
                    System.out.printf("(%d,%d)\n", i + 1, j + 1);
                }
            }
        }
    }
}
