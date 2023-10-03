import java.util.*;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
public class J07085_tongchuso {
    public static int tcs(String s){
        int sum = 0;
        for(int i=0; i<s.length(); ++i) if(Character.isDigit(s.charAt(i))) sum += Integer.parseInt(Character.toString(s.charAt(i)));
        return sum;
    }
    public static String convert(String s){
        String res = "";
        int cnt = 0, l = 0;
        for(int i=0; i<s.length(); ++i){
            if(Character.isDigit(s.charAt(i))) res += s.charAt(i);
        }
        if(res.charAt(0) == '0'){
            while(res.charAt(l) == '0') {
                ++cnt;
                ++l;
            }
        }
        return res.substring(l);
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream oib = new ObjectInputStream(new FileInputStream("DATA.txt"));
        ArrayList <String> arr = (ArrayList <String>) oib.readObject();
        for(String str : arr){
            System.out.println(convert(str) + " " + tcs(str));
        }
    }
}