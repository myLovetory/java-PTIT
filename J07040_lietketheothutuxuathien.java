import java.util.Scanner;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
public class J07040_lietketheothutuxuathien {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ObjectInputStream sc1 =  new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        List<String> str = (ArrayList<String>) sc1.readObject();
        // khoi tao tree set
        Set<String> st = new TreeSet<>();
        for(String i : str)
        {
            String[] kytu = i.trim().toLowerCase().split("\\s+");
            st.addAll(Arrays.asList(kytu));
        }
        Scanner sc2 = new Scanner(new File("VANBAN.in"));
        while (sc2.hasNext()) {
            String s = sc2.next().toLowerCase();
            if (st.contains(s)) {
                System.out.println(s);
                st.remove(s);
            }
        }
    }
}
