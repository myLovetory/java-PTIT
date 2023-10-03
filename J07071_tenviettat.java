
/**
 *
 * @author TGDD
 */
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

class DanhSach implements Comparable<DanhSach>{
    
    private String full_Name, first_Name, last_Name;

    public DanhSach(String full_Name) {
        this.full_Name = full_Name;
        String [] words = full_Name.trim().split("\\s+");
        this.first_Name = words[words.length-1];
        this.last_Name = full_Name.substring(0, this.full_Name.length() - this.first_Name.length());
    }
    //đam bao tinh dong goi
    public String getfull_Name(){
        return this.full_Name;
    }
    
    @Override
    public int compareTo(DanhSach o){
        if(this.first_Name.compareTo(o.first_Name) == 0){
            return this.last_Name.compareTo(o.last_Name);
        }
        return this.first_Name.compareTo(o.first_Name);
    }
    
    @Override
    public String toString(){
        return this.full_Name;
    }
}
public class J07071_tenviettat {
    public static String viet_Tat(String s){
        String res = "";
        String [] words = s.trim().split("\\s+");
        for(String word : words) res += word.charAt(0);
        return res;
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList <DanhSach> arr = new ArrayList <>();
        
        int n = Integer.parseInt(sc.nextLine());
        while(n -- >0){
            arr.add(new DanhSach(sc.nextLine()));
        }
        
        Collections.sort(arr);
        
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String s = sc.nextLine();
            String tmp = "";
            for(int i=0; i<s.length(); ++i) if(s.charAt(i) != '.') tmp += s.charAt(i);
            boolean check;
            
            for(DanhSach ds : arr){
                check = true;
                String test = viet_Tat(ds.getfull_Name());
                int length = test.length();
                if(tmp.length() != length) continue;
                for(int i=0; i<tmp.length(); ++i){
                    if(tmp.charAt(i) != test.charAt(i) && tmp.charAt(i) != '*'){
                          check = false;
                          continue;
                        }
                }
                if(check == true) System.out.println(ds);
            }
        }
    }
}
