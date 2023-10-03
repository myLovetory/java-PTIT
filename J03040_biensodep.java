package j03040_biensodep;

import java.util.Scanner;

public class J03040_biensodep {
    
    public static boolean check1(int [] a)
    {
        for(int i = 1;i<5;i++)
        {
            if(a[i] <= a[i-1])
            {
                return false;
            }
        }
        return true;
    }
    

    public static boolean check3(int [] a)
    {   
        //trương hợp 1 là con của trường hợp 3
        return (a[0] == a[1] && a[0] == a[2] && a[3] == a[4]);
    }
    public static boolean check4(int[] a) {
        for (int i : a) {
            if (i != 6 && i != 8) {
                return false;
            }
        }
        return true;
    }
    public static boolean oke(int[] a)
    {
        return (check1(a) || check3(a) || check4(a));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String s = sc.next();
            int[] a = new int[5];
            a[0] = s.charAt(5) - '0';
            a[1] = s.charAt(6) - '0';
            a[2] = s.charAt(7) - '0';
            a[3] = s.charAt(9) - '0';
            a[4] = s.charAt(10) - '0';
            System.out.println(oke(a) ? "YES" : "NO");
        }
    }
    
}
