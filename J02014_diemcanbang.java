

import java.util.Scanner;
public class J02014_diemcanbang {
    
    public static Scanner sc = new Scanner(System.in);
    public static void testcase()
    {
        int n = sc.nextInt();
        int sum = 0;
        int[] a = new int[n];
        int[] tong = new int[n]; 
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
            if (i == 0) {
                tong[i] = a[i];
            } else {
                tong[i] = tong[i - 1] + a[i];
            }
        }
        for (int i = 1; i < n; i++) {
            if (tong[i - 1] == sum - tong[i]) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println("-1");
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            testcase();
        }
    }
}
