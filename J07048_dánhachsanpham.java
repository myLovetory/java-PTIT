import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;

class Sanpham implements Comparable<Sanpham>
{
    private String id,name;
    private int gia,hanbaohanh;
    
    public Sanpham(String id,String name,int gia,int hanbaohanh)
    {
        this.id = id;
        this.name = name;
        this.gia = gia;
        this.hanbaohanh = hanbaohanh;
    }
    public String getID()
    {
        return id;
    }
    public int getGia()
    {
        return gia;
    }
    @Override
    public String toString()
    {
        return id + " " + name + " " + gia + " " + hanbaohanh;
    }
    @Override
    public int compareTo(Sanpham a)
    {
        if (this.gia == a.getGia()) {
            return id.compareTo(a.getID());
        }
        return -(this.gia - a.getGia());
    }
}
public class J07048_dánhachsanpham {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(sc.nextLine());
        Sanpham[] many = new Sanpham[n];
        for(int i = 0;i<n;i++)
        {
            String id = sc.nextLine();
            String name = sc.nextLine();
            int gia = Integer.parseInt(sc.nextLine());
            int hanbaohanh = Integer.parseInt(sc.nextLine());
            many[i] = new Sanpham(id, name, gia, hanbaohanh);
        }
        Arrays.sort(many);
        for(Sanpham i : many)
        {
            System.out.println(i);
        }
    }
}
