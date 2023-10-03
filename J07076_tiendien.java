import java.util.*;
import java.io.*;

class TienDien implements Comparable<TienDien> {
    
    private String ID, ho_ten;
    private char loai_GD;
    private int dau, cuoi;
    private int so_dien;
    private int tien_trong_dm, tien_vuot_dm, tong_tien, VAT;
    
    public int getdm(){
        if(this.loai_GD == 'A') return 100;
        else if(this.loai_GD == 'B') return 500;
        else return 200;
    }
    
    public String chuanhoa(String s){
        String res = "";
        String [] words = s.trim().split("\\s+");
        for(String word : words)
        {
            res += word.toUpperCase().charAt(0) + word.toLowerCase().substring(1) + " ";
        }
        return res.trim();
     }
    
    public TienDien(int ID, String ho_ten, String thong_tin) {
        this.ID = String.format("KH%02d", ID);
        this.ho_ten = chuanhoa(ho_ten);
        String [] words = thong_tin.trim().split("\\s+");
        this.loai_GD = words[0].charAt(0);
        this.dau = Integer.parseInt(words[1]);
        this.cuoi = Integer.parseInt(words[2]);
        this.so_dien = this.cuoi - this.dau;
        
        if(this.so_dien < this.getdm()){
            this.tien_trong_dm = 450 * this.so_dien;
            this.tien_vuot_dm = 0;
            this.tong_tien = this.tien_trong_dm;
            this.VAT = 0;
        }
        
        else 
        {
            this.tien_trong_dm = this.getdm() * 450;
            this.tien_vuot_dm = (this.so_dien - this.getdm()) * 1000;
            this.VAT = this.tien_vuot_dm * 5 / 100;
            this.tong_tien = this.tien_trong_dm + this.tien_vuot_dm + this.VAT;
        }
    }
    @Override
    public int compareTo(TienDien o){
        return o.tong_tien - this.tong_tien;
    }
    
    @Override
    public String toString(){
        return this.ID + " " + this.ho_ten + " " + this.tien_trong_dm + " " + this.tien_vuot_dm + " " + this.VAT + " " + this.tong_tien;
    }
}

public class J07076_tiendien {
        public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        ArrayList <TienDien> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=n; ++i){
            arr.add(new TienDien(i, sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        for(TienDien kh : arr){
            System.out.println(kh);
        }
    }
}
