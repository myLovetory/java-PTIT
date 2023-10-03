import java.util.*;
import java.io.*;
import java.util.Comparator;
public class J07072_chuanhoavasapxep {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<String> ls = new ArrayList<>();
        while(sc.hasNextLine())
        {
            ls.add(sc.nextLine());
        }
        for(int i = 0;i<ls.size();i++)
        {
            String[] tmp = ls.get(i).trim().toLowerCase().split("\\s+");
            for(int j= 0;j<tmp.length;j++)
            {
                tmp[j]=tmp[j].substring(0,1).toUpperCase() + tmp[j].substring(1);
            }
            ls.set(i, String.join(" ", tmp));
        }
        
        ls.sort(new Comparator<String>()
        {
            @Override
            public int compare(String o1, String o2) {
                String ten1 = o1.substring(o1.lastIndexOf(" ") + 1);
                String ten2 = o2.substring(o2.lastIndexOf(" ") + 1);
                String ho1 = o1.substring(0, o1.lastIndexOf(" "));
                String ho2 = o2.substring(0, o2.lastIndexOf(" "));
                if (ten1.compareTo(ten2) == 0) {
                    return ho1.compareTo(ho2);
                }
                return ten1.compareTo(ten2);
            }
        });
        for(String i : ls)
        {
            System.out.println(i);
        }
        
    }
}
