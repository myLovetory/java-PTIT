import java.io.*;
import java.util.*;

class ThiSinh
{
    public static int dem = 1;
    public static String MA = "PH";
    private String id;
    private String name;
    private int age;
    private float lythuyet;
    private float thuchanh;
    private float bonus;
    private int diemtong;
    private String xephang;
    
    public ThiSinh(String name,String dob,float lythuyet,float thuchanh)
    {
        this.id = String.format("%s%02d",MA, ++dem);
        String[] tmp = name.trim().toLowerCase().split("\\s+");
        this.name = tmp[0].substring(0, 1).toUpperCase() + tmp[0].substring(1);
        for (int i = 1; i < tmp.length; ++i)
            this.name += (" " + tmp[i].substring(0, 1).toUpperCase() + tmp[i].substring(1));
        this.age = 2021 - Integer.parseInt(dob.substring(dob.length() - 4));
        this.lythuyet = lythuyet;
        this.thuchanh = thuchanh;
        if (lythuyet >= 8 && thuchanh >= 8) this.bonus = 1f;
        else if (lythuyet >= 7.5 && thuchanh >= 7.5) this.bonus = 0.5f;
        
        this.diemtong = (int) Math.round((this.lythuyet + this.thuchanh) / 2 + this.bonus);
        if (this.diemtong > 10) this.diemtong = 10;
        if (this.diemtong < 5) this.xephang = "Truot";
        else if (this.diemtong < 7) this.xephang = "Trung binh";
        else if (this.diemtong < 8) this.xephang = "Kha";
        else if (this.diemtong < 9) this.xephang = "Gioi";
        else this.xephang = "Xuat sac";
    }
    //setter getter tràn bờ đê
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getdiemtong() {
        return diemtong;
    }

    public void setdiemtong(int diemtong) {
        this.diemtong = diemtong;
    }

    public float getLythuyet() {
        return lythuyet;
    }

    public void setLythuyet(float lythuyet) {
        this.lythuyet= lythuyet;
    }

    public float getThucHanh() {
        return thuchanh;
    }

    public void setPractice(float thuchanh) {
        this.thuchanh= thuchanh;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public String getXepHang() {
        return xephang;
    }

    public void setXephang(String xephang) {
        this.xephang = xephang;
    }
    @Override
    public String toString()
    {
        return String.format("%s %s %d %d %s", this.id, this.name, this.age, this.diemtong, this.xephang);
    }
}
public class J07053_xettuyen {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("XETTUYEN.in")).useLocale(Locale.getDefault());
        int n = sc.nextInt();
        ArrayList<ThiSinh> a = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            sc.nextLine();
            a.add(new ThiSinh(sc.nextLine(), sc.next(), sc.nextFloat(), sc.nextFloat()));
        }
        for (ThiSinh x : a) System.out.println(x);
    }
}
