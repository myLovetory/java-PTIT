
package j02003_chuanhoaxauhoten1;
import java.util.Scanner;
public class J02003_chuanhoaxauhoten1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- >0)
        {
            //trim de xoa dau cach thua
            String s = sc.nextLine().trim().toLowerCase();
            // tách string thành list khi có nhiều dấu space
            String[] kqua = s.split("\\s+"); 
            //chuan hoa cac string con
            for(String i : kqua)
            {
               
                System.out.print(String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1) + " " );
            }
            System.out.println();
        }
            
    }
    
}
