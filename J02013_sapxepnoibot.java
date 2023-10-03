


import java.util.Scanner;
public class J02013_sapxepnoibot {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            boolean check = true;
            for(int j = 0;j<n-1;j++)
            {
                if(a[j] > a[j+1])
                {
                    check = false;
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j + 1] = tmp;
                }
            }
            if(check)
            {
                return;
            }
            System.out.printf("Buoc %d: ",i+1);
            for(int j = 0;j<n;j++)
            {
                System.out.print(a[j]+ " ");
            }
            System.out.println();
        }
    }
    
}
