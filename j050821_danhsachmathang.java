import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Mathang implements Comparable<Mathang>
{
    private static int mamh = 1;
    private String id,name,donvitinh;
    private int buy,sell,profit;
    
    public Mathang(String name,String donvitinh,int buy,int sell)
    {
        this.id = "MH"+String.format("%03d", mamh++);
        this.name = name;
        this.donvitinh = donvitinh;
        this.buy = buy;
        this.sell = sell;
        profit  = sell-buy;
    }
    public int getProfit()
    {
        return profit;
    }
    @Override
    public String toString()
    {
        return id+" "+name+" "+donvitinh+" "+buy+" "+sell+" "+profit;
    }
    @Override
    public int compareTo(Mathang o) {
        return o.getProfit() - this.profit;
    }
}
public class j050821_danhsachmathang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Mathang> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String donvitinh = sc.nextLine();
            int buy= Integer.parseInt(sc.nextLine());
            int sell = Integer.parseInt(sc.nextLine());
            Mathang p = new Mathang(name, donvitinh, buy, sell);
            list.add(p);
        }
        Collections.sort(list);
        for (Mathang i : list) {
            System.out.println(i);
        }
    }
}
