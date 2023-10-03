
import java.util.Scanner;
public class J08012_hinhsao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] duyet = new int[n+1];
        for(int i = 1;i < n ;i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            duyet[x]++;
            duyet[y]++;
        }
        for(int i = 1;i<=n;i++)
        {
            if(duyet[i] != 1 && duyet[i] != n - 1)
            {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
                  
    }
}
