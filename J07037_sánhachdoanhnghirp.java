import java.util.Scanner;
import java.io.File;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.io.FileNotFoundException;

class DN implements Comparable<DN>
{
    private String ma,ten;
    private int soluong;
    
    public DN(String ma,String ten,int soluong)
    {
        this.ma = ma;
        this.ten = ten;
        this.soluong = soluong;
    }
    public String getMA()
    {
        return ma;
    }
    @Override
    public String toString()
    {
        return ma+" "+ten+" "+soluong;
    }
    @Override
    public int compareTo(DN a)
    {
        return ma.compareTo(a.getMA());
    }
}

public class J07037_sánhachdoanhnghirp {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        DN[] companies = new DN[n];
        for(int i = 0;i<n;i++)
        {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int soluong = Integer.parseInt(sc.nextLine());
            companies[i] = new DN(ma,ten, soluong);
        }
        Arrays.sort(companies);
        for (DN i : companies) {
            System.out.println(i);
        }
    }
}
