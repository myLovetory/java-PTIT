import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class J07032_sothuannghichtrongfile {
     public static boolean thuannghich(String s) {
        StringBuilder sb = new StringBuilder(s).reverse();
        if (!sb.toString().equals(s)) {
            return false;
        }

        if (s.length() % 2 == 0 || s.length() == 1) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) - '0') % 2 == 0) {
                return false;
            }
        }
        return true;
    }
     public static void main(String[] args) throws FileNotFoundException,IOException, ClassNotFoundException {
        int[] duyet = new int[1000000];
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> ls1 = (ArrayList<Integer>) sc1.readObject();
        
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> ls2 = (ArrayList<Integer>) sc2.readObject();
        
        for (Integer i : ls1) {
            if (thuannghich(i.toString()) && ls2.contains(i)) {
                duyet[i]++;
            }
        }

        for (Integer i : ls2) {
            if (thuannghich(i.toString()) && duyet[i] != 0) {
                duyet[i]++;
            }
        }
        
        int dem = 0;
        for (int i = 0; i <= 1000000; i++) {
            if (duyet[i] > 0) {
                System.out.println(i + " " + duyet[i]);
                dem++;
            }
            if (dem == 10) {
                break;
            }
        }
    }
}
