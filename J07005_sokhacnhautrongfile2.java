import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class J07005_sokhacnhautrongfile2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataInputStream sc = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] d = new int[1000];
        for (int i = 0; i < 100000; i++) {
            d[sc.readInt()]++;
        }
        for (int i = 0; i < 1000; i++) {
            if (d[i] > 0) {
                System.out.println(i + " " + d[i]);
            }
        }
    }
}    

