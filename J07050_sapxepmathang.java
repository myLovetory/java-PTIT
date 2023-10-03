import java.util.Scanner;
import java.io.File;
import java.util.Arrays;

import java.io.FileNotFoundException;

class mathang implements Comparable<mathang>
{
    public static int MA = 1;
    private String id,name,group;
    private float mua,ban;
    private float loinhuan;
    public mathang(String name,String group,float mua,float ban)
    {
        this.id = "MH" + String.format("%02d",MA++);
        this.name = name;
        this.group = group;
        this.mua = mua;
        this.ban = ban;
        this.loinhuan = ban - mua;
    }
    public float getloinhuan()
    {
        return loinhuan;
    }
    @Override
    public String toString()
    {
        return id + " " + name + " " + group + " " + String.format("%.2f", loinhuan);
    }
    @Override
    public int compareTo(mathang a)
    {
        return (int) -(this.loinhuan - a.getloinhuan());
    }
}
public class J07050_sapxepmathang {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        mathang[] products = new mathang[n];
        for(int i = 0;i<n;i++)
        {
            String name = sc.nextLine();
            String group = sc.nextLine();
            float mua = Float.parseFloat(sc.nextLine());
            float ban = Float.parseFloat(sc.nextLine());
            float loinhuan = ban - mua;
            products[i] = new mathang( name, group, mua, ban);
        }
        Arrays.sort(products);
        for(mathang i : products)
        {
            System.out.println(i);
        }
    }
}
