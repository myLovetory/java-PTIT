import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class khach implements Comparable<khach>
{
    public static int stt = 1;
    private String id,ten,phong;
    private Long songay;
    
    public khach(String ten,String phong,Long songay)
    {
        this.id = "KH" + String.format("%02d", stt++);
        this.ten = ten;
        this.phong = phong;
        this.songay = songay;
    }
    
    public Long getSongay()
    {
        return songay;
    }
    
    @Override
    public String toString()
    {
        return id +" "+ten+ " "+phong+" "+songay;
    }
    
     @Override
    public int compareTo(khach other) {
        return -songay.compareTo(other.getSongay());
    }
}


public class J07046_dánhachluutru {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        int n = Integer.parseInt(sc.nextLine());
        List<khach> danhsach = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String phong = sc.nextLine();
            Date startDay = date.parse(sc.nextLine());
            Date lastDay = date.parse(sc.nextLine());
            Long songay = (lastDay.getTime() - startDay.getTime()) / (1000L * 60 * 60 * 24); // convert second -> day
            danhsach.add(new khach(ten, phong, songay));
        }
        Collections.sort(danhsach);
        danhsach.forEach(System.out::println);
    }
}
    

