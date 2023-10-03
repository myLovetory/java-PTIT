import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class J07006_sokhacnhautrongfile3 {
    public static void main(String[] args) throws IOException,ClassNotFoundException
    {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> list = (ArrayList<Integer>) sc.readObject();
        int[] dem = new int[10005];
        for(Integer i : list)
        {
            dem[i]++;
        }
        for(int i = 0;i<1005;i++)
        {
            if(dem[i] > 0)
            {
                System.out.println(i+" "+dem[i]);
            }
        }
    }
}
