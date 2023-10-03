package j03038_danhdauchucai;
import java.util.Scanner;
public class J03038_danhdauchucai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] duyet = new int[128];
        for(int i = 0;i<str.length();i++)
        {
            duyet[str.charAt(i)]++;
        }
        int dem = 0;
        for(char i = 'a';i<='z';i++)
        {
            if(duyet[i] > 0)
            {
                dem++;
            }
        }
        System.out.println(dem);
    }
    
}
