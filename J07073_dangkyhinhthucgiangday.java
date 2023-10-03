import java.util.*;
import java.io.*;
import java.text.ParseException;

class MonHoc
{
    String id;
    String name;
    int tinchi = 0;
    String lythuyet = "";
    String thuchanh = "";
    
    public MonHoc(String id,String name,int tinchi,String lythuyet,String thuchanh)
    {
        this.id = id;
        this.name = name;
        this.tinchi = tinchi;
        this.lythuyet = lythuyet;
        this.thuchanh = thuchanh;
    }
    @Override
    public String toString()
    {
        return id + " " + name + " " + tinchi + " " + lythuyet + " " + thuchanh;
    }
}
        
public class J07073_dangkyhinhthucgiangday {
    public static void main(String[] args) throws FileNotFoundException,ParseException
    {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        Vector<MonHoc> monHocs = new Vector<>();

        int n = sc.nextInt();
        sc.nextLine();

        while (n-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            int num = Integer.parseInt(sc.nextLine());
            String lythuyet = sc.nextLine();
            String thuchanh = sc.nextLine();

            monHocs.add(new MonHoc(id, name, num, lythuyet, thuchanh));
        }

        monHocs.sort(new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.id.compareTo(o2.id);
            }
        });

        monHocs.forEach((item) -> {
                    if (!item.thuchanh.equals("Truc tiep"))
                        System.out.println(item.toString());
                }
        );
    }
}
