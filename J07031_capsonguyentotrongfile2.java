
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


/**
 *
 * @author TGDD
 */
public class J07031_capsonguyentotrongfile2 {
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n >= 2;
    }
    public static void main(String[] args) throws FileNotFoundException,IOException, ClassNotFoundException
    {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> arr1 = (ArrayList<Integer>) sc1.readObject();
        Set<Integer> st1 = new TreeSet<>();
        for(int i : arr1)
        {
            if(isPrime(i))
            {
                st1.add(i);
            }
        }
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> arr2 = (ArrayList<Integer>) sc2.readObject();
        Set<Integer> st2 = new TreeSet<>();
        for(int i : arr2)
        {
            if(isPrime(i))
            {
                st2.add(i);
            }
        }
        final int sum = 1000000;
        for (Integer i : st1) {
            Integer j = sum - i;
            if(i >= j) break;
            if(st1.contains(j) && !st2.contains(i) && !st2.contains(j))
            {
                System.out.println(i+" "+(sum - i));
            }
            
        }
    }
}

