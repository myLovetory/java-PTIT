package j03032_daotu;

import java.util.*;

public class J03032_daotu {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- >0)
        {
            String s = sc.nextLine();
            s = s.replaceAll("\\s+"," ");
            String[] tach = s.split(" ");
            for(String i : tach)
            {
                i = new StringBuilder(i).reverse().toString();
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
    
}
