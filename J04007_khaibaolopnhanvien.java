import java.util.Scanner;
class NhanVien
{
    private String mnv, name, sex, dob, address, tax, date;

    public NhanVien() {
        this("00001", "", "", "", "", "", "");
    }

    public NhanVien(String mnv, String name, String sex, String dob, String address, String tax, String date) {
        this.mnv = mnv;
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.address = address;
        this.tax = tax;
        this.date = date;
    }


    @Override
    public String toString() {
        return mnv + " " + name + " " + sex + " " + dob + " " + address + " " + tax + " " + date;
    }
}

public class J04007_khaibaolopnhanvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String sex = sc.nextLine();
        String dob = sc.nextLine();
        String address = sc.nextLine();
        String tax = sc.nextLine();
        String date = sc.nextLine();
        NhanVien sta = new NhanVien("00001", name, sex, dob, address, tax, date);
        System.out.println(sta);
    }
}

