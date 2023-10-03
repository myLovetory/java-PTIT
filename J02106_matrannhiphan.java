
package j02106_matrannhiphan;
import java.util.Scanner;
public class J02106_matrannhiphan {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int kqua = 0;
        int ptu;
        for(int i = 0;i<n;i++)
        {
            int dem1 = 0;
            for(int j = 0;j<3;j++)
            {
                ptu = sc.nextInt();
                if(ptu == 1) 
                {
                    dem1++;
                }
            }
            if(dem1 > 1)
            {
                kqua++;
            }
        }
        System.out.println(kqua);
    }
}
