import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class J07021_chuanhoaxauhotentrongfile {

    public static String viethoas1(String s)
    {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
        
    }
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(true)
        {
            String str = sc.nextLine();
            if(str.equals("END"))
            {
                break;
            }    
            String[] s = str.trim().split("\\s+");
            String kqua = "";
            for (String i : s) {
                kqua += viethoas1(i) + " ";
            }
            System.out.println(kqua);
        }
    }
   
}
