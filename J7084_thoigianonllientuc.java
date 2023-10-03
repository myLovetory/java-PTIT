import java.io.File;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Time{
    private String name;
    private Date begin, end;
    public Time(String name, String begin, String end) throws ParseException{
        this.name = name;
        this.begin = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(begin);
        this.end = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(end);
    }
    public long time(){
        long k = end.getTime() - begin.getTime();
        k = k /(60 * 1000);
        return k;
    }
    @Override
    public String toString(){
        return name + " " + time();
    }
    
}
public class J7084_thoigianonllientuc {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int t = sc.nextInt();
        sc.nextLine();
        List<Time> list = new ArrayList<>();
        while(t-- > 0){
            String name = sc.nextLine();
            String begin = sc.nextLine();
            String end = sc.nextLine();
            list.add(new Time(name, begin, end));
        }
        list.sort((s1, s2) -> Long.compare(s2.time(), s1.time()));
        for(Time s : list){
            System.out.println(s);
        }
    }
}
