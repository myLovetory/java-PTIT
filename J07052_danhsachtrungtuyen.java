import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.*;


class Student implements Comparable<Student>
{
    private String id;
    private String name;
    private double toan;
    private double ly;
    private double hoa;
    private double tong;
    private double bonus;
    private String status;
    
    public Student(String id, String name,double toan,double ly,double hoa)
    {
        this.id = id;
        name = name.trim().toLowerCase();
        String[] s = name.split("\\s+");
        this.name = "";
        for(String i : s)
        {
            this.name += String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1) + " ";
        }
        this.name = this.name.trim();
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        
        if(id.charAt(2) == '1')
            bonus = 0.5;
        else if(id.charAt(2) == '2')
            bonus = 1;
        else 
            bonus = 2.5;
        
        tong = toan * 2 + ly + hoa + bonus;
    }
    
    public void setStatus(String status)
    {
        this.status = status;
    }
    
    public double getTong()
    {
        return tong;
    }
    @Override
    public String toString()
    {
        return id + " " + name + " " + (new DecimalFormat().format(bonus))+ " " + (new DecimalFormat().format(tong)) + " " + status;
    }
    @Override
    public int compareTo(Student o)
    {
        if (tong > o.tong)
            return -1;
        else if (tong < o.tong)
            return 1;
        return id.compareTo(o.id);
    }
}

public class J07052_danhsachtrungtuyen {
     public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> a = new ArrayList<>();
        while (n-- > 0)
            a.add(new Student(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        int chiTieu = Integer.parseInt(sc.nextLine());
        Collections.sort(a);
        if (chiTieu > a.size())
            chiTieu = a.size();
        double diemChuan = a.get(chiTieu - 1).getTong();
        System.out.printf("%.1f\n", diemChuan);
        for (Student i : a)
        {
            if (i.getTong() >= diemChuan)
                i.setStatus("TRUNG TUYEN");
            else
                i.setStatus("TRUOT");
            System.out.println(i);
        }
    }
}
