package j03009_tepturiengcuahaixau;

import java.util.*;
public class J03009_tepturiengcuahaixau {

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0)
        {
            String[] a = sc.nextLine().split("\\s+");
            String b = sc.nextLine();
            HashSet<String> kqua = new HashSet<>();
            for (String i : a) {
                if (!b.contains(i)) {
                    kqua.add(i);
                }
            }
            for (String i : kqua) {
                System.out.print(i + " ");
            }
            System.out.println();

            }
    }
    
}
