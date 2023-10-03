import java.util.Scanner;
import java.io.File;
import java.util.List;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.Collections;

class monthi implements Comparable<monthi>
{
    private String mamon,tenmon,hinhthuc;
    
    public monthi(String mamon, String tenmon, String hinhthuc)
    {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.hinhthuc = hinhthuc;
    }

    public String getMa()
    {
        return mamon;
    }
    @Override
    public String toString()
    {
        return mamon + " " + tenmon + " " + hinhthuc;
    }
    @Override
    public int compareTo(monthi a)
    {
        return this.mamon.compareTo(a.getMa());
    }
}
public class J07058_danhsachmonthi {
    public static void main(String[] args) throws FileNotFoundException,ClassNotFoundException
    {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<monthi> list = new ArrayList<>();
        for(int i = 0;i < n ;i++)
        {
            String mamon = sc.nextLine();
            String tenmon = sc.nextLine();
            String hinhthuc = sc.nextLine();
            list.add(new monthi(mamon, tenmon, hinhthuc));
        }
        Collections.sort(list);
        for(monthi i : list)
        {
            System.out.println(i);
        }
         
    }
}
