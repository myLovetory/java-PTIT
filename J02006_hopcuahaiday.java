

import java.util.Scanner;
import java.util.Arrays;
public class J02006_hopcuahaiday {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] hop = new int [1005];
        
        for(int i = 0;i<n;i++)
        {
            a[i] = sc.nextInt();
            hop[a[i]] = 1;
        }
        for(int i = 0;i < m ;i++)
        {
            b[i] = sc.nextInt();
            hop[b[i]] = 1;
        }
        for(int i = 0;i<1000;i++)
        {
            if(hop[i] == 1)
            {
                System.out.print(i + " ");
            }
        }
    }
    
}
