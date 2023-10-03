import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
//khai bao comparable de dung phuong thuc compareto
class SinhVien implements Comparable<SinhVien>
{

    private String id;
    private String name;
    private String lop;
    private String email;
    
    public SinhVien(String id,String name,String lop,String email)
    {
        this.id = id;
        this.name = "";
        name = name.trim().toLowerCase();
        String[] s = name.split("\\s+");
        for (String i : s)
            this.name += String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1) + " ";
        this.lop = lop;
        this.email = email;
    }
    
    @Override
    public String toString()
    {
        return id+" "+name+" "+lop+" "+email;
    }
    @Override
    public int compareTo(SinhVien a)
    {
        return this.id.compareTo(a.id);
    }
    
}
public class J07033_danhsachsinhvientrongfile1 {
    public static  void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList<SinhVien> a = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0)
        {
            a.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(a);
        for(SinhVien i : a)
        {
            System.out.println(i);
        }
        
    }
}
