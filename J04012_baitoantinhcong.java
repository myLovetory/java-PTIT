
import java.util.*;

class TinhCong
{
    public static int ma = 1;
    private String id,name;
    private int luong,thuongthem,phucap;
    
    public TinhCong(String name,int coban,int ngay,String chucvu)
    {
        this.id = "NV" + String.format("%02d", ma);
        this.name = name;
        this.luong = coban * ngay;
      
        if(ngay >= 25)
        {
            this.thuongthem = (int) (luong * 0.2f);
        }else if(ngay >= 22)
        {
            this.thuongthem = (int) (luong * 0.1f);
        }else{
            this.thuongthem = 0;
        }
        
        switch (chucvu) {
            case "GD":
                phucap = 250000;
                break;
            case "PGD":
                phucap = 200000;
                break;
            case "TP":
                phucap = 180000;
                break;
            case "NV":
                phucap = 150000;
                break;
        }
    }
    public int getTong()
    {
        return luong + thuongthem + phucap;
    }
    @Override
    public String toString()
    {
        return id + " " + name + " " + luong + " " + thuongthem + " " + phucap + " " + getTong();
    }
}

public class J04012_baitoantinhcong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int luong = Integer.parseInt(sc.nextLine());
        int ngay = Integer.parseInt(sc.nextLine());
        String chucvu = sc.nextLine();
        TinhCong officer = new TinhCong(name, luong, ngay, chucvu);
        System.out.println(officer);
    }
}
