import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
class SinhVien{
    private String msv = "B20DCCN001";
    private String name;
    private String malop;
    private String DOB;
    private float GPA;
    
    public SinhVien()
    {
        name = "";
        malop = "";
        DOB = "";
        GPA = 0;
    }
    
    public SinhVien(String name,String malop,String DOB,float GPA)
    {
        this.name = name;
        this.malop = malop;
        this.DOB = DOB;
        this.GPA = GPA;
    }
    public String formatDOB()
    {
        try {
            SimpleDateFormat dob = new SimpleDateFormat("dd/MM/yyyy");
            Date date = dob.parse(DOB);
            return dob.format(date);
        } catch (ParseException formatDob) {
            System.out.println(formatDob);
        }
        return "";
    }
    @Override
    public String toString(){
        return msv + " " + name + " " + malop + " " + formatDOB() + " " + String.format(("%.2f"), GPA);
    }
}
public class J04006_khaibaolopsinhvien {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String lop = sc.nextLine();
        String dob = sc.nextLine();
        float gpa = sc.nextFloat();
        SinhVien stu = new SinhVien(name, lop, dob, gpa);
        System.out.println(stu);
    }
}
