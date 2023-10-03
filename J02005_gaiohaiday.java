

import java.util.Scanner;
import java.util.Arrays;
public class J02005_gaiohaiday {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        
        int[] dem = new int[1005];
        for(int i = 0;i <n;i++)
        {
            a[i] = sc.nextInt();
            //dem so lan xh trong a
            dem[a[i]] = 1;
        }
        for(int i = 0;i<m;i++)
        {
            b[i]  = sc.nextInt();
        }
        //xep mang b
        Arrays.sort(b);
        //xem b[i] da xuat hien trong dem chua
        for(int i = 0;i<m;i++)
        {
            if(dem[b[i]] == 1 )
            {
                System.out.print(b[i] + " ");
                dem[b[i]] = 2;
            }
        }
        
             
    }
    
}
