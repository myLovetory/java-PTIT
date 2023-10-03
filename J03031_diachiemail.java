import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class J03031_diachiemail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<String> dem = new ArrayList<>();
        while(t-- >0)
        {
            String[] ar = sc.nextLine().trim().toLowerCase().split("\\s+");
            String s = ar[ar.length - 1];
            for (int i = 0; i < ar.length - 1; i++) {
                s += ar[i].charAt(0);
            }
            dem.add(s);
            int count = Collections.frequency(dem, s);
            s += (count == 1 ? "" : count) + "@ptit.edu.vn";
            System.out.println(s);
        }
    }
}
