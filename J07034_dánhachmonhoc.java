import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Arrays;

class monhoc implements Comparable<monhoc>
{
    private String id;
    private String name;
    private int tinchi;
    
    public monhoc(String id,String name,int tinchi)
    {
        this.id = id;
        this.name = name;
        this.tinchi = tinchi;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString()
    {
        return id +" "+name+" "+tinchi;
    }
    @Override
    public int compareTo(monhoc a)
    {
        return name.compareTo(a.getName());
    }
}

public class J07034_dánhachmonhoc {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        monhoc[] monhocs = new monhoc[n];
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            int stc = Integer.parseInt(sc.nextLine());
            monhocs[i] = new monhoc(id, name, stc);
        }
        Arrays.sort(monhocs);
        for (monhoc i : monhocs) {
            System.out.println(i);
        }
    }
}
