import java.util.*;
import java.io.*;
public class J07015_songuyentotrongfilenhiphan {
    public static int[] prime = new int[10005];
    public static void isPrime()
    {
        Arrays.fill(prime, 1);
        prime[0] = prime[1] = 0;
        for (int i = 2; i <= 100; i++) {
            if (prime[i] == 1) {
                for (int j = i * i; j < 10000; j += i) {
                    prime[j] = 0;
                }
            }
        }
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException,FileNotFoundException
    {
        isPrime();
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        List<Integer> ls = (List<Integer>) sc.readObject();
        int[] dem = new int[10005];
        for(Integer i : ls)
        {
            dem[i]++;
        }
        for(int i = 0;i<10000;i++)
        {
            if(dem[i] > 0)
            {
                System.out.println(i+ " " +dem[i]);
            }
        }
        
                
    }
}

